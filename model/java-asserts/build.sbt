// ### BASIC SETTINGS ### //

organization := "com.dslplatform.ocd"
name := "DSL-OCD-Model-Java-Asserts"
version := "0.4.0"

unmanagedSourceDirectories in Compile := Seq(
  sourceDirectory.value / "generated" / "java",
)
unmanagedSourceDirectories in Test := Nil

crossPaths := false
autoScalaLibrary := false

// ### DEPENDENCIES ### //

libraryDependencies ++= Seq(
  "com.dslplatform.ocd" % "dsl-ocd-util-testing" % "0.4.0",
  "com.dslplatform"     % "dsl-client-java"      % "1.5.0" % Provided,
  "junit"               % "junit"                % "4.12",
)

resolvers += Resolver.mavenLocal
