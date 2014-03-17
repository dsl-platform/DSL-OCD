val NGSNexus            = "NGS Nexus"             at "http://ngs.hr/nexus/content/groups/public/"
val NGSPrivateReleases  = "NGS Private Releases"  at "http://ngs.hr/nexus/content/repositories/releases-private/"
val NGSPrivateSnapshots = "NGS Private Snapshots" at "http://ngs.hr/nexus/content/repositories/snapshots-private/"

// ### BASIC SETTINGS ### //

organization := "com.dslplatform.ocd"

name := "DSL-OCD-Test-Generator"

version := "0.0.0-SNAPSHOT"

unmanagedSourceDirectories in Compile :=
  Seq("interfaces", "services").map {
    baseDirectory.value / "src" / _ / "scala"
  } :+ (scalaSource in Compile).value

unmanagedSourceDirectories in Test := Seq(
  (scalaSource in Test).value
)

// ### DEPENDENCIES ### //

libraryDependencies ++= Seq(
  "com.dslplatform.ocd" %% "dsl-ocd-model" % "0.0.0-SNAPSHOT"
, "com.dslplatform" % "dsl-compiler-client-cmdline" % "0.8.13"
, "hr.element.etb" %% "etb-util" % "0.2.20"
, "ch.qos.logback" % "logback-classic" % "1.0.13" % "compile->default"
, "hr.ngs" %% "ngs-core" % "0.3.19" excludeAll(
    ExclusionRule("org.pgscala")
  , ExclusionRule("com.fasterxml.jackson.module")
  , ExclusionRule("com.fasterxml.jackson.core")
  , ExclusionRule("com.thoughtworks.paranamer")
  )
, "junit" % "junit" % "4.11" % "test"
, "org.scalatest" %% "scalatest" % "2.0" % "test"
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

crossScalaVersions := Seq("2.10.4-RC3")

scalaVersion := crossScalaVersions.value.head

scalacOptions := Seq(
  "-unchecked"
, "-deprecation"
, "-optimise"
, "-encoding", "UTF-8"
, "-Xcheckinit"
, "-Yclosure-elim"
, "-Ydead-code"
, "-Yinline"
, "-Xmax-classfile-name", "72"
, "-Yrepl-sync"
, "-Xlint"
, "-Xverify"
, "-Ywarn-all"
, "-feature"
, "-language:postfixOps"
, "-language:reflectiveCalls"
, "-language:implicitConversions"
, "-language:existentials"
, "-language:dynamics"
)

javaHome := sys.env.get("JDK16_HOME").map(file(_))

javacOptions := Seq(
  "-deprecation"
, "-encoding", "UTF-8"
, "-Xlint:unchecked"
, "-source", "1.6"
, "-target", "1.6"
)

net.virtualvoid.sbt.graph.Plugin.graphSettings

// ### ECLIPSE ### //

EclipseKeys.executionEnvironment := Some(EclipseExecutionEnvironment.JavaSE16)

EclipseKeys.createSrc := EclipseCreateSrc.Default + EclipseCreateSrc.Resource

EclipseKeys.eclipseOutput := Some(".target")
