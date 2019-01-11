// ### BASIC SETTINGS ### //

organization := "com.dslplatform.ocd"
name := "DSL-OCD-Model-Boxes"
version := "0.4.0"

unmanagedSourceDirectories in Compile := Seq(
  (scalaSource in Compile).value,
  sourceDirectory.value / "generated" / "scala",
)
unmanagedSourceDirectories in Test := Nil
