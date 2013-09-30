val NGSNexus = "NGS Nexus"     at "http://ngs.hr/nexus/content/groups/public/"

// ### BASIC SETTINGS ### //

organization := "com.dslplatform.ocd"

name := "DSL-Test-Java"

version := "0.0.0-SNAPSHOT"

unmanagedSourceDirectories in Compile :=
  (javaSource in Compile).value / ".." / ".." / "generated" / "java" ::
  (javaSource in Compile).value :: Nil

unmanagedSourceDirectories in Test := (javaSource in Test).value :: Nil


// ### DEPENDENCIES ### //

libraryDependencies ++= Seq(
  "com.dslplatform" % "dsl-client-http" % "0.4.9"
, "ch.qos.logback" % "logback-classic" % "1.0.13" % "compile->default"
, "junit" % "junit" % "4.11" % "test"
)

// ### RESOLVERS ### //

resolvers := Seq(NGSNexus)

externalResolvers := Resolver.withDefaultResolvers(resolvers.value, mavenCentral = false)


// ### COMPILE SETTINGS ### //

crossScalaVersions := Seq("2.10.3-RC3")

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


// ### ECLIPSE ### //

EclipseKeys.executionEnvironment := Some(EclipseExecutionEnvironment.JavaSE16)

EclipseKeys.createSrc := EclipseCreateSrc.Default + EclipseCreateSrc.Resource

EclipseKeys.eclipseOutput := Some(".target")

EclipseKeys.projectFlavor := EclipseProjectFlavor.Java
