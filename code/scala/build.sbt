val NGSNexus     = "NGS Nexus"     at "http://ngs.hr/nexus/content/groups/public/"
val NGSReleases  = "NGS Releases"  at "http://ngs.hr/nexus/content/repositories/releases/"
val NGSSnapshots = "NGS Snapshots" at "http://ngs.hr/nexus/content/repositories/snapshots/"

// ### BASIC SETTINGS ### //

organization := "com.dslplatform"

name := "DSL-OCD"

version := "0.0.0-SNAPSHOT"

unmanagedSourceDirectories in Compile := (scalaSource in Compile).value :: Nil

unmanagedSourceDirectories in Test := Nil


// ### DEPENDENCIES ### //

libraryDependencies ++= Seq(
  "com.dslplatform" % "dsl-compiler-client-cmdline" % "0.8.0-SNAPSHOT"
, "com.dslplatform" % "dsl-client-http" % "0.4.9"
, "io.jvm" %% "scala-uuid" % "0.1.1"
, "com.github.scala-incubator.io" %% "scala-io-file" % "0.4.2"
, "ch.qos.logback" % "logback-classic" % "1.0.13" % "compile->default"
, "hr.ngs" %% "ngs-core" % "0.3.19"
)

// ### RESOLVERS ### //

resolvers := Seq(NGSNexus)

externalResolvers := Resolver.withDefaultResolvers(resolvers.value, mavenCentral = false)

publishTo := Some(
  if (version.value endsWith "SNAPSHOT") NGSSnapshots else NGSReleases
)

credentials += Credentials(Path.userHome / ".config" / "DSL-OCD" / "nexus.config")

publishArtifact in (Compile, packageDoc) := false


// ### COMPILE SETTINGS ### //

crossScalaVersions := Seq("2.10.2")

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
, "-language:implicitConversions"
, "-language:existentials"
)

javaHome := sys.env.get("JDK16_HOME").map(file(_))

javacOptions := Seq(
  "-deprecation"
, "-encoding", "UTF-8"
, "-Xlint:unchecked"
, "-source", "1.6"
, "-target", "1.6"
)


// ### ECLIPSE ### //

EclipseKeys.executionEnvironment := Some(EclipseExecutionEnvironment.JavaSE16)

EclipseKeys.createSrc := EclipseCreateSrc.Default + EclipseCreateSrc.Resource
