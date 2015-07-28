val NGSNexus            = "NGS Nexus"             at "http://ngs.hr/nexus/content/groups/public/"
val NGSPrivateReleases  = "NGS Private Releases"  at "http://ngs.hr/nexus/content/repositories/releases-private/"
val NGSPrivateSnapshots = "NGS Private Snapshots" at "http://ngs.hr/nexus/content/repositories/snapshots-private/"

// ### BASIC SETTINGS ### //

organization := "com.dslplatform.ocd"
name := "DSL-OCD-Test-Generator"
version := "0.1.0-SNAPSHOT"

unmanagedSourceDirectories in Compile :=
  Seq("interfaces", "services", "turtles").map {
    sourceDirectory.value / _ / "scala"
  } :+ (scalaSource in Compile).value

unmanagedResourceDirectories in Compile := Seq(
  sourceDirectory.value / "main" / "resources"
)

unmanagedSourceDirectories in Test := Nil

// ### DEPENDENCIES ### //

libraryDependencies ++= Seq(
  "com.dslplatform.ocd" %% "dsl-ocd-model-dsls" % "0.1.0-SNAPSHOT"
, "com.dslplatform.ocd" %% "dsl-ocd-model-javas" % "0.1.0-SNAPSHOT"
, "com.dslplatform.ocd" %% "dsl-ocd-model-scalas" % "0.1.0-SNAPSHOT"
, "com.dslplatform" % "dsl-compiler-client-cmdline" % "0.8.13"
, "hr.element.etb" %% "etb-util" % "0.2.23"
, "io.jvm" %% "scala-uuid" % "0.1.3"
, "ch.qos.logback" % "logback-classic" % "1.1.3" % "compile->default"
, "commons-io" % "commons-io" % "2.4"
, "commons-lang" % "commons-lang" % "2.6"
, "hr.ngs" %% "dsl-server-core" % "0.4.3" excludeAll(
    ExclusionRule("org.pgscala")
  , ExclusionRule("com.fasterxml.jackson.module")
  , ExclusionRule("com.fasterxml.jackson.core")
  , ExclusionRule("com.thoughtworks.paranamer")
  )
)

// ### RESOLVERS ### //

resolvers := Seq(NGSNexus, NGSPrivateReleases, NGSPrivateSnapshots)
externalResolvers := Resolver.withDefaultResolvers(resolvers.value, mavenCentral = false)

credentials in ThisBuild ++= {
  val creds = Path.userHome / ".config" / "DSL-OCD" / "nexus.config"
  if (creds.exists) Some(Credentials(creds)) else None
}.toSeq

// ### COMPILE SETTINGS ### //

crossScalaVersions := Seq("2.11.7")
scalaVersion := crossScalaVersions.value.head

scalacOptions := Seq(
  "-deprecation"
, "-encoding", "UTF-8"
, "-feature"
, "-language:postfixOps"
, "-language:reflectiveCalls"
, "-language:implicitConversions"
, "-language:existentials"
, "-language:dynamics"
, "-optimise"
, "-unchecked"
, "-Xcheckinit"
, "-Xlint"
, "-Xmax-classfile-name", "72"
, "-Xverify"
, "-Yclosure-elim"
, "-Yconst-opt"
, "-Ydead-code"
, "-Yinline-warnings"
, "-Yinline"
, "-Yrepl-sync"
, "-Ywarn-adapted-args"
, "-Ywarn-dead-code"
, "-Ywarn-inaccessible"
, "-Ywarn-infer-any"
, "-Ywarn-nullary-override"
, "-Ywarn-nullary-unit"
, "-Ywarn-numeric-widen"
, "-Ywarn-unused"
)

javacOptions in doc := Seq(
  "-encoding", "UTF-8"
, "-source", "1.7"
)

javacOptions := Seq(
  "-deprecation"
, "-Xlint"
, "-target", "1.7"
) ++ (javacOptions in doc).value

graphSettings

// ### ECLIPSE ### //

EclipseKeys.executionEnvironment := Some(EclipseExecutionEnvironment.JavaSE18)
EclipseKeys.createSrc := EclipseCreateSrc.Default + EclipseCreateSrc.Resource
EclipseKeys.eclipseOutput := Some(".target")
