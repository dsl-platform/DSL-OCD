val NGSNexus            = "NGS Nexus"             at "http://ngs.hr/nexus/content/groups/public/"
val NGSPrivateReleases  = "NGS Private Releases"  at "http://ngs.hr/nexus/content/repositories/releases-private/"
val NGSPrivateSnapshots = "NGS Private Snapshots" at "http://ngs.hr/nexus/content/repositories/snapshots-private/"

// ### BASIC SETTINGS ### //

organization := "com.dslplatform.ocd"

name := "DSL-OCD-Projects"

version := "0.0.0-SNAPSHOT"

unmanagedSourceDirectories in Compile :=
  (scalaSource in Compile).value ::
  baseDirectory.value / "src" / "generated" / "scala" ::
  Nil

unmanagedSourceDirectories in Test := Nil

// ### DEPENDENCIES ### //

libraryDependencies += "com.dslplatform" %% "dsl-client-scala-http" % "0.1.2-SNAPSHOT"

// ### RESOLVERS ### //

resolvers := Seq(NGSNexus, NGSPrivateReleases, NGSPrivateSnapshots)

externalResolvers := Resolver.withDefaultResolvers(resolvers.value, mavenCentral = false)

publishTo := Some(
  if (version.value endsWith "SNAPSHOT") NGSPrivateSnapshots else NGSPrivateReleases
)

credentials in ThisBuild ++= {
  val creds = Path.userHome / ".config" / "DSL-OCD" / "nexus.config"
  if (creds.exists) Some(Credentials(creds)) else None
}.toSeq

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

EclipseKeys.eclipseOutput := Some(".target")