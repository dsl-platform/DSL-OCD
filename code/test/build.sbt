val NGSNexus            = "NGS Nexus"             at "http://ngs.hr/nexus/content/groups/public/"
val NGSPrivateReleases  = "NGS Private Releases"  at "http://ngs.hr/nexus/content/repositories/releases-private/"
val NGSPrivateSnapshots = "NGS Private Snapshots" at "http://ngs.hr/nexus/content/repositories/snapshots-private/"

// ### BASIC SETTINGS ### //

organization := "com.dslplatform.ocd"

name := "DSL-OCD-Test-Generator"

version := "0.0.0-SNAPSHOT"

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
  "com.dslplatform.ocd" %% "dsl-ocd-model-dsls" % "0.0.0-SNAPSHOT"
, "com.dslplatform.ocd" %% "dsl-ocd-model-javas" % "0.0.0-SNAPSHOT"
, "com.dslplatform.ocd" %% "dsl-ocd-model-scalas" % "0.0.0-SNAPSHOT"
, "com.dslplatform" % "dsl-compiler-client-cmdline" % "0.8.13"
, "hr.element.etb" %% "etb-util" % "0.2.20"
, "ch.qos.logback" % "logback-classic" % "1.1.1" % "compile->default"
, "commons-io" % "commons-io" % "2.4"
, "hr.ngs" %% "ngs-core" % "0.3.19" excludeAll(
    ExclusionRule("org.pgscala")
  , ExclusionRule("com.fasterxml.jackson.module")
  , ExclusionRule("com.fasterxml.jackson.core")
  , ExclusionRule("com.thoughtworks.paranamer")
  )
)

// ### RESOLVERS ### //

resolvers := Seq(NGSNexus, NGSPrivateReleases, NGSPrivateSnapshots)

externalResolvers := Resolver.withDefaultResolvers(resolvers.value, mavenCentral = false)

publishTo := Some(
  if (version.value endsWith "SNAPSHOT") NGSPrivateSnapshots else NGSPrivateReleases
)

credentials += Credentials(Path.userHome / ".config" / "DSL-OCD" / "nexus.config")

publishArtifact in (Compile, packageDoc) := false

// ### COMPILE SETTINGS ### //

crossScalaVersions := Seq("2.10.4")

scalaVersion := crossScalaVersions.value.head

scalacOptions := Seq(
  "-encoding", "UTF-8"
, "-deprecation"
, "-optimise"
, "-unchecked"
, "-Xcheckinit"
, "-Xlint"
, "-Xmax-classfile-name", "72"
, "-Xverify"
, "-Yclosure-elim"
, "-Ydead-code"
, "-Yinline"
, "-Yrepl-sync"
, "-Ywarn-adapted-args"
, "-Ywarn-dead-code"
, "-Ywarn-inaccessible"
, "-Ywarn-nullary-override"
, "-Ywarn-nullary-unit"
, "-Ywarn-numeric-widen"
, "-Ywarn-value-discard"
, "-feature"
, "-language:postfixOps"
, "-language:reflectiveCalls"
, "-language:implicitConversions"
, "-language:existentials"
, "-language:dynamics"
)

javacOptions in doc := Seq(
  "-encoding", "UTF-8"
, "-source", "1.6"
) ++ (sys.env.get("JDK16_HOME") match {
  case Some(jdk16Home) => Seq("-bootclasspath", jdk16Home + "/jre/lib/rt.jar")
  case _ => Nil
})

javacOptions := Seq(
  "-deprecation"
, "-Xlint"
, "-target", "1.6"
) ++ (javacOptions in doc).value

net.virtualvoid.sbt.graph.Plugin.graphSettings

// ### ECLIPSE ### //

EclipseKeys.executionEnvironment := Some(EclipseExecutionEnvironment.JavaSE16)

EclipseKeys.createSrc := EclipseCreateSrc.Default + EclipseCreateSrc.Resource

EclipseKeys.eclipseOutput := Some(".target")
