// ### BASIC SETTINGS ### //

organization := "com.dslplatform.ocd"
name := "DSL-OCD-Staging"
version := "0.4.0"

unmanagedSourceDirectories in Compile := Seq(
  (scalaSource in Compile).value,
)
unmanagedSourceDirectories in Test := Nil

// ### DEPENDENCIES ### //

resolvers += "repo.jenkins-ci.org" at "http://repo.jenkins-ci.org/public"
libraryDependencies ++= Seq(
  "com.github.pathikrit"       %% "better-files"     % "3.7.0",
  "commons-io"                 %  "commons-io"       % "2.6",
  "com.github.nscala-time"     %% "nscala-time"      % "2.20.0",
  "org.kohsuke"                %  "github-api"       % "1.95",
  "org.eclipse.jgit"           %  "org.eclipse.jgit" % "5.2.0.201812061821-r",
  "com.typesafe.scala-logging" %% "scala-logging"    % "3.9.2",
  "ch.qos.logback"             %  "logback-classic"  % "1.2.3",
)

// ### MISC ### //

fork in run := true
