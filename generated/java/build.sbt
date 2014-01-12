val NGSNexus = "NGS Nexus" at "http://ngs.hr/nexus/content/groups/public/"

// ### BASIC SETTINGS ### //

organization := "com.dslplatform.ocd"

name := "DSL-OCD-Test-Java"

version := "0.0.0-SNAPSHOT"

unmanagedSourceDirectories in Compile :=
  baseDirectory.value / "src" / "generated" / "java" ::
  Nil

unmanagedSourceDirectories in Test :=
  (javaSource in Test).value :: Nil

// ### DEPENDENCIES ### //

libraryDependencies ++= Seq(
  "com.dslplatform" % "dsl-client-http" % "0.4.13"
, "org.slf4j" % "slf4j-simple" % "1.7.5"
, "junit" % "junit" % "4.11" % "test"
, "com.novocode" % "junit-interface" % "0.10" % "test"
)

// ### RESOLVERS ### //

resolvers := Seq(NGSNexus)

externalResolvers := Resolver.withDefaultResolvers(resolvers.value, mavenCentral = false)

// ### COMPILE SETTINGS ### //

crossScalaVersions := Seq("2.10.3")

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

autoScalaLibrary := false

crossPaths := false

net.virtualvoid.sbt.graph.Plugin.graphSettings

// ### ECLIPSE ### //

EclipseKeys.executionEnvironment := Some(EclipseExecutionEnvironment.JavaSE16)

EclipseKeys.createSrc := EclipseCreateSrc.Default + EclipseCreateSrc.Resource

EclipseKeys.eclipseOutput := Some(".target")

EclipseKeys.projectFlavor := EclipseProjectFlavor.Java
