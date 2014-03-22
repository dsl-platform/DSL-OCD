val NGSNexus            = "NGS Nexus"             at "http://ngs.hr/nexus/content/groups/public/"
val NGSPrivateReleases  = "NGS Private Releases"  at "http://ngs.hr/nexus/content/repositories/releases-private/"
val NGSPrivateSnapshots = "NGS Private Snapshots" at "http://ngs.hr/nexus/content/repositories/snapshots-private/"

// ### BASIC SETTINGS ### //

organization := "com.dslplatform.ocd"

name := "DSL-OCD-Model"

version := "0.0.0-SNAPSHOT"

unmanagedSourceDirectories in Compile := Seq(
  (scalaSource in Compile).value
, sourceDirectory.value / "generated" / "scala"
)

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


// ### COMPILE SETTINGS ### //

crossScalaVersions := Seq("2.10.4-RC3")

scalaVersion := crossScalaVersions.value.head

scalacOptions := Seq(
  "-encoding", "UTF-8"
, "-deprecation"
, "-optimise"
, "-unchecked"
, "-Xcheckinit"
, "-Xlint"
, "-Xmax-classfile-name", "72"
, "-Xverify"
, "-Yclosure-elim"
, "-Ydead-code"
, "-Yinline"
, "-Yrepl-sync"
, "-Ywarn-adapted-args"
, "-Ywarn-dead-code"
, "-Ywarn-inaccessible"
, "-Ywarn-nullary-override"
, "-Ywarn-nullary-unit"
, "-Ywarn-numeric-widen"
, "-Ywarn-value-discard"
, "-feature"
, "-language:postfixOps"
, "-language:reflectiveCalls"
, "-language:implicitConversions"
, "-language:existentials"
, "-language:dynamics"
)

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

net.virtualvoid.sbt.graph.Plugin.graphSettings

// ### ECLIPSE ### //

EclipseKeys.executionEnvironment := Some(EclipseExecutionEnvironment.JavaSE16)

EclipseKeys.eclipseOutput := Some(".target")
