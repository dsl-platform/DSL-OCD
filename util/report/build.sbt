// ### BASIC SETTINGS ### //

organization := "com.dslplatform.ocd"
name := "DSL-OCD-Util-Report"
version := "0.4.0"

unmanagedSourceDirectories in Compile := Seq(
  (javaSource in Compile).value,
)
unmanagedSourceDirectories in Test := Nil

crossPaths := false
autoScalaLibrary := false
