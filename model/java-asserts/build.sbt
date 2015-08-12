val NGSNexus            = "NGS Nexus"             at "http://ngs.hr/nexus/content/groups/public/"
val NGSPrivateReleases  = "NGS Private Releases"  at "http://ngs.hr/nexus/content/repositories/releases-private/"
val NGSPrivateSnapshots = "NGS Private Snapshots" at "http://ngs.hr/nexus/content/repositories/snapshots-private/"

// ### BASIC SETTINGS ### //

organization := "com.dslplatform.ocd"
name := "DSL-OCD-Model-Java-Asserts"
version := "0.1.0-SNAPSHOT"

unmanagedSourceDirectories in Compile := Seq(
  sourceDirectory.value / "generated" / "java"
)

unmanagedSourceDirectories in Test := Nil

libraryDependencies ++= Seq(
  "com.dslplatform.ocd" % "dsl-ocd-util-testing" % "0.1.0-SNAPSHOT"
, "joda-time" % "joda-time" % "2.7"
, "junit" % "junit" % "4.12"
)

// ### RESOLVERS ### //

resolvers := Seq(NGSNexus, NGSPrivateReleases, NGSPrivateSnapshots)
externalResolvers := Resolver.withDefaultResolvers(resolvers.value, mavenCentral = false)

publishTo := Some(if (version.value endsWith "-SNAPSHOT") NGSPrivateSnapshots else NGSPrivateReleases)
publishArtifact in (Compile, packageDoc) := false

credentials in ThisBuild ++= {
  val creds = Path.userHome / ".config" / "DSL-OCD" / "nexus.config"
  if (creds.exists) Some(Credentials(creds)) else None
}.toSeq

// ### COMPILE SETTINGS ### //

scalaVersion := "2.11.7"

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

crossPaths := false
autoScalaLibrary := false

graphSettings

// ### ECLIPSE ### //

EclipseKeys.executionEnvironment := Some(EclipseExecutionEnvironment.JavaSE16)
EclipseKeys.eclipseOutput := Some(".target")
EclipseKeys.projectFlavor := EclipseProjectFlavor.Java
