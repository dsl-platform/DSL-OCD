package com.dslplatform.ocd
package staging

import java.util.regex.Pattern
import scala.concurrent.ExecutionContext
import sys.process._

object EntryPoint
    extends App {

  val now = DateTime.now.toString("YYMMdd-HHmmss")

//  Mvn.clean()

  Git("ngs-doo", "dsl-json", "master")
  Git("ngs-doo", "dsl-client-java", "master")
  Git("ngs-doo", "revenj", "master")
  Git("mentat-labs", "DSL-OCD", "master")

  val dslJsonVersion = Sed("dsl-json", "library/pom.xml",
    None -> "(<version>)([^<]+)(</version>)" -> s"$$1$$2-$now$$3"
  )
  val dslJsonJava8Version = Sed("dsl-json", "java8/pom.xml",
    None -> "(<version>)([^<]+)(</version>)" -> s"$$1$$2-$now$$3"
  , Some(dslJsonVersion) -> ("""(<dependency>\s+<groupId>com.dslplatform</groupId>\s+<artifactId>dsl-json</artifactId>\s+""" +
      "<version>)([^<]+)(</version>)") -> s"$$1${dslJsonVersion}-$now$$3"
  )
  val dslClientJavaVersion = Sed("dsl-client-java", "build.sbt",
    None -> """(version in ThisBuild\s+:= ")([^"]+)(")""" -> s"$$1$$2-$now$$3"
  )
  Sed("dsl-client-java", "project/Build.scala",
    Some(dslJsonVersion) -> """(val dslJson = "com.dslplatform" % "dsl-json" % ")([^"]+)(")""" ->
    s"$$1${dslJsonVersion}-$now$$3"
  )
  val revenjCoreVersion = Sed("revenj", "java/revenj-core/pom.xml",
    None -> "(<version>)([^<]+)(</version>)" -> s"$$1$$2-$now$$3"
  , Some(dslJsonJava8Version) -> ("""(<dependency>\s+<groupId>com.dslplatform</groupId>\s+<artifactId>dsl-json-java8</artifactId>\s+""" +
      "<version>)([^<]+)(</version>)") -> s"$$1${dslJsonJava8Version}-$now$$3"
  )
  val revenjServletVersion = Sed("revenj", "java/revenj-servlet/pom.xml",
    None -> "(<version>)([^<]+)(</version>)" -> s"$$1$$2-$now$$3"
  , Some(revenjCoreVersion) -> ("""(<dependency>\s+<groupId>org.revenj</groupId>\s+<artifactId>revenj-core</artifactId>\s+""" +
      "<version>)([^<]+)(</version>)") -> s"$$1${revenjCoreVersion}-$now$$3"
  )

  private implicit val executionContext =
    ExecutionContext.fromExecutor(
      java.util.concurrent.Executors.newFixedThreadPool(
        Runtime.getRuntime.availableProcessors()))

  Mvn("dsl-json", "library", "clean", "install")
  Mvn("dsl-json", "java8", "clean", "install")
  Mvn("revenj", "java/revenj-core", "clean", "install")
  Mvn("revenj", "java/revenj-servlet", "clean", "install", "war:war")
  Sbt("dsl-client-java", "", "clean", "publishM2")
}

object Git {
  def apply(username: String, project: String, branch: String): Unit = {
    val target = Path("repositories") / project
    if (target.exists) {
      target.deleteRecursively(force = true, continueOnFailure = false)
    }
    Seq("git", "clone", "-b", branch, "--depth", "1", "--single-branch", s"git@github.com:/${username}/${project}.git", s"repositories/${project}")!
  }
}

object Sed {
  def apply(
      project: String, path: String
    , replacements: ((Option[String], String), String)*): String = {

    val target = Path(s"repositories/${project}/${path}", '/')
    val backup = Path(s"repositories/${project}/${path}.backup", '/')

    if (backup.exists) {
      backup.copyTo(target = target, replaceExisting = true)
    } else {
      target.copyTo(target = backup)
    }

    var origBody = target.string
    val ((firstCheck, firstPattern), firstReplacement) = replacements.head

    val firstMatcher = Pattern.compile(firstPattern).matcher(origBody)
    assert(firstMatcher.find(), s"Could not find $firstPattern in ${target.path}")

    val origVersion = firstMatcher.group(2)
    for (check <- firstCheck) {
      assert(origVersion == check, s"Version of $project/$path dependency ${origVersion} differs from expected: ${check}")
    }
    println(s"Original version of $project/$path was: $origVersion")

    val sb = new StringBuffer
    firstMatcher.appendReplacement(sb, firstReplacement)
    val nextBody = firstMatcher.appendTail(sb).toString

    val body = replacements.tail.foldLeft(nextBody) { case (acc, ((nextCheck, nextPattern), nextReplacement)) =>
      val nextMatcher = Pattern.compile(nextPattern).matcher(acc)
      assert(nextMatcher.find(), s"Could not find $nextPattern in ${target.path}")

      val nextVersion = nextMatcher.group(2)
      for (check <- nextCheck) {
        assert(nextVersion == check, s"Version of $project/$path dependency ${nextVersion} differs from expected: ${check}")
      }
      acc.replaceFirst(nextPattern, nextReplacement)
    }

    target write body
    origVersion
  }
}

object Mvn {
  private val userHome = Path("repositories") / ".home" toAbsolute
  private val mavenLocal = Path("repositories") / ".m2" toAbsolute

  def clean(): Unit = {
    if (mavenLocal.exists) {
      mavenLocal.deleteRecursively(force = true, continueOnFailure = false)
    }
  }

  def apply(project: String, path: String, commands: String*): Unit = {
    val target = Path(s"repositories/${project}/${path}", '/')

    Process((Seq(
      "cmd", "/c", "mvn"
    , "-Dmaven.test.skip=true"
    , s"-Duser.home=${userHome.path}"
    , s"-Dmaven.repo.local=${mavenLocal.path}"
    ) ++ commands), target.jfile)!
  }
}

object Sbt {
  private val userHome = Path("repositories") / ".home" toAbsolute
  private val ivy2Local = Path("repositories") / ".ivy2" toAbsolute
  private val sbtLocal = Path("repositories") / ".sbt" toAbsolute
  private val mavenLocal = Path("repositories") / ".m2" toAbsolute

  def clean(): Unit = {
    if (ivy2Local.exists) {
      ivy2Local.deleteRecursively(force = true, continueOnFailure = false)
    }
    if (sbtLocal.exists) {
      sbtLocal.deleteRecursively(force = true, continueOnFailure = false)
    }
  }

  def apply(project: String, path: String, commands: String*): Unit = {
    val target = Path(s"repositories/${project}/${path}", '/')

    Process((Seq(
      "java"
    , s"-Duser.home=${userHome.path}"
    , s"-Divy.home=${ivy2Local.path}"
    , s"-Dsbt.ivy.home=${sbtLocal.path}"
    , s"-Dmaven.repo.local=${mavenLocal.path}"
    , "-jar", "project/strap/gruj_vs_sbt-launch-0.13.x.jar"
    ) ++ commands), target.jfile)!
  }
}