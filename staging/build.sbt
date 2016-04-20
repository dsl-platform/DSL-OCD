organization := "com.dslplatform.ocd"
name := "DSL-OCD-Staging"

libraryDependencies ++= Seq(
  "com.github.scala-incubator.io" %% "scala-io-file" % "0.4.3-1"
, "com.github.nscala-time"        %% "nscala-time"   % "2.12.0"

, "com.typesafe.scala-logging" %% "scala-logging"  % "3.1.0" 
, "ch.qos.logback"             % "logback-classic" % "1.1.7"
)

scalaVersion := "2.11.8"

scalacOptions := Seq(
  "-deprecation"
, "-encoding", "UTF-8"
, "-feature"
, "-language:postfixOps"
, "-language:reflectiveCalls"
, "-language:implicitConversions"
, "-language:existentials"
, "-language:dynamics"
, "-optimise"
, "-unchecked"
, "-Xcheckinit"
, "-Xlint"
, "-Xmax-classfile-name", "72"
, "-Xverify"
, "-Yclosure-elim"
, "-Yconst-opt"
, "-Ydead-code"
, "-Yinline"
, "-Yrepl-sync"
, "-Ywarn-adapted-args"
, "-Ywarn-dead-code"
, "-Ywarn-inaccessible"
, "-Ywarn-infer-any"
, "-Ywarn-nullary-override"
, "-Ywarn-nullary-unit"
, "-Ywarn-numeric-widen"
, "-Ywarn-unused"
)
