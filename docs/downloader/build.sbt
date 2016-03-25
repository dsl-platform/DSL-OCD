scalaVersion := "2.11.8"
autoScalaLibrary := false
crossPaths := false

resolvers += Resolver.mavenLocal

libraryDependencies ++= Seq(
  "org.revenj" % "revenj-servlet" % "0.9.4"
)

packAutoSettings
packCopyDependenciesUseSymbolicLinks := false
packCopyDependenciesTarget := file("dependencies")
