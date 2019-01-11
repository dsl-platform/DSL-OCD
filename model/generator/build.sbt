// ### BASIC SETTINGS ### //

organization := "com.dslplatform.ocd"
name := "DSL-OCD-Model-Generator"
version := "0.4.0"

unmanagedSourceDirectories in Compile := Seq(
  (scalaSource in Compile).value,
)
unmanagedSourceDirectories in Test := Nil

// ### DEPENDENCIES ### //

libraryDependencies ++= Seq(
  "com.dslplatform.ocd"    %% "dsl-ocd-util-generator" % "0.4.0",
  "com.github.pathikrit"   %% "better-files"           % "3.7.0",
  "org.scala-lang.modules" %% "scala-xml"              % "1.1.1",
)
