// ### BASIC SETTINGS ### //

organization := "com.dslplatform.ocd"

name := "DSL-OCD-Test-Turtle-Java"

version := "0.0.0-SNAPSHOT"

unmanagedSourceDirectories in Compile := Seq(
  (javaSource in Compile).value
, baseDirectory.value / "src" / "generated" / "java"
)

unmanagedSourceDirectories in Test :=
  (javaSource in Test).value :: Nil

// ### DEPENDENCIES ### //

libraryDependencies ++= Seq(
  "com.dslplatform" % "dsl-client-http-apache" % "0.4.14"
, "org.slf4j" % "slf4j-simple" % "1.7.5"
, "junit" % "junit" % "4.11"
, "com.novocode" % "junit-interface" % "0.10"
)

// ### COMPILE SETTINGS ### //

scalaVersion := "2.10.4-RC3"

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

autoScalaLibrary := false

crossPaths := false

net.virtualvoid.sbt.graph.Plugin.graphSettings

// ### ECLIPSE ### //

EclipseKeys.executionEnvironment := Some(EclipseExecutionEnvironment.JavaSE16)

EclipseKeys.createSrc := EclipseCreateSrc.Default + EclipseCreateSrc.Resource

EclipseKeys.eclipseOutput := Some(".target")

EclipseKeys.projectFlavor := EclipseProjectFlavor.Java
