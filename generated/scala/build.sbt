val NGSNexus = "NGS Nexus" at "http://ngs.hr/nexus/content/groups/public/"

// ### BASIC SETTINGS ### //

organization := "com.dslplatform.ocd"

name := "DSL-OCD-Test-Scala"

version := "0.0.0-SNAPSHOT"

      unmanagedSourceDirectories in Compile := Seq(
        sourceDirectory.value / "generated" / "scala"
      ),
      unmanagedResourceDirectories in Compile := Seq(
        sourceDirectory.value / "generated" / "resources",
        sourceDirectory.value / "main" / "resources"
      ),
      unmanagedSourceDirectories in Test := Seq(
        (scalaSource in Test).value
      ),
      EclipseKeys.createSrc := EclipseCreateSrc.Default + EclipseCreateSrc.Resource 

unmanagedSourceDirectories in Compile := Seq(
  (scalaSource in Compile).value
, sourceDirectory.value / "generated" / "scala"
)

unmanagedSourceDirectories in Test :=
  (scalaSource in Test).value :: Nil

// ### DEPENDENCIES ### //

libraryDependencies ++= Seq(
  "com.dslplatform" %% "dsl-client-scala-http" % "0.1.1-SNAPSHOT"
, "ch.qos.logback" % "logback-classic" % "1.0.13" % "compile->default"
, "org.scalatest" %% "scalatest" % "2.0"
, "junit" % "junit" % "4.11"
)

// ### RESOLVERS ### //

resolvers := Seq(NGSNexus)

externalResolvers := Resolver.withDefaultResolvers(resolvers.value, mavenCentral = false)

// ### COMPILE SETTINGS ### //

crossScalaVersions := Seq("2.10.4-RC1")

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

net.virtualvoid.sbt.graph.Plugin.graphSettings

// ### ECLIPSE ### //

EclipseKeys.executionEnvironment := Some(EclipseExecutionEnvironment.JavaSE16)

EclipseKeys.createSrc := EclipseCreateSrc.Default + EclipseCreateSrc.Resource

EclipseKeys.eclipseOutput := Some(".target")
