// ### BASIC SETTINGS ### //

organization := "com.dslplatform.ocd"
name := "DSL-OCD-Util-Revenj-Runner"
version := "0.4.0"

unmanagedSourceDirectories in Compile := Seq(
  (javaSource in Compile).value,
)
unmanagedSourceDirectories in Test := Nil

crossPaths := false
autoScalaLibrary := false

// ### DEPENDENCIES ### //

libraryDependencies ++= Seq(
  "org.nanohttpd" % "nanohttpd" % "2.3.1",
  "net.revenj" %% "revenj-akka" % "0.8.5" % Provided, // TODO: sync with revenj version in staging
)

assemblyJarName in assembly := s"${name.value.toLowerCase}-${version.value}.jar"
