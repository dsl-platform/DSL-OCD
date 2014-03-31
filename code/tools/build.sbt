val NGSNexus            = "NGS Nexus"             at "http://ngs.hr/nexus/content/groups/public/"
val NGSPrivateReleases  = "NGS Private Releases"  at "http://ngs.hr/nexus/content/repositories/releases-private/"
val NGSPrivateSnapshots = "NGS Private Snapshots" at "http://ngs.hr/nexus/content/repositories/snapshots-private/"

// ### BASIC SETTINGS ### //

organization := "com.dslplatform"

name := "DSL-Client-Tools"

version := "0.0.0-SNAPSHOT"

scalaVersion := "2.10.4"

javacOptions in doc := Seq(
  "-encoding", "UTF-8"
, "-source", "1.6"
) ++ (sys.env.get("JDK16_HOME") match {
  case Some(jdk16Home) => Seq("-bootclasspath", jdk16Home + "/jre/lib/rt.jar")
  case _ => Nil
})

javacOptions := Seq(
  "-deprecation"
, "-Xlint"
, "-target", "1.6"
) ++ (javacOptions in doc).value

libraryDependencies := Seq(
  "joda-time" % "joda-time" % "2.3"
, "com.fasterxml.jackson.core" % "jackson-databind" % "2.3.1"
, "com.dslplatform" % "dsl-client-core" % "0.4.14"
)

crossPaths := false

autoScalaLibrary := false

unmanagedSourceDirectories in Compile := (javaSource in Compile).value :: Nil

unmanagedSourceDirectories in Test := Nil

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

publishArtifact in (Compile, packageDoc) := false

// ### ECLIPSE ### //

EclipseKeys.eclipseOutput := Some(".target")

EclipseKeys.executionEnvironment := Some(EclipseExecutionEnvironment.JavaSE16)

EclipseKeys.projectFlavor := EclipseProjectFlavor.Java
