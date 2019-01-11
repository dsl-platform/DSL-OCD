// ### BASIC SETTINGS ### //

organization := "com.dslplatform.ocd"
name := "DSL-OCD-Test-Generator"
version := "0.4.0"

unmanagedSourceDirectories in Compile :=
  Seq("interfaces", "services", "turtles").map {
    sourceDirectory.value / _ / "scala"
  } :+ (scalaSource in Compile).value
unmanagedResourceDirectories in Compile := Seq(
  sourceDirectory.value / "main" / "resources",
)
unmanagedSourceDirectories in Test := Nil

// ### DEPENDENCIES ### //

libraryDependencies ++= Seq(
  "com.dslplatform.ocd"    %% "dsl-ocd-model-dsls"   % "0.4.0",
  "com.dslplatform.ocd"    %% "dsl-ocd-model-javas"  % "0.4.0",
  "com.dslplatform.ocd"    %% "dsl-ocd-model-scalas" % "0.4.0",
  "com.github.nscala-time" %% "nscala-time"          % "2.20.0",
  "io.jvm.uuid"            %% "scala-uuid"           % "0.3.0",
  "com.github.pathikrit"   %% "better-files"         % "3.7.0",
  "ch.qos.logback"         %  "logback-classic"      % "1.2.3",
)

resolvers += Resolver.mavenLocal

// ### MISC ### //

fork in run := true
