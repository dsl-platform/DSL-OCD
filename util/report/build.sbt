organization := "com.dslplatform.ocd"
name := "ocd-report"
version := "0.2.1"

mainClass in assembly := Some("com.dslplatform.ocd.EntryPoint")

javacOptions in doc := Seq(
  "-encoding", "UTF-8"
  , "-source", "1.7"
)

javacOptions := Seq(
  "-deprecation"
  , "-Xlint"
  , "-target", "1.7"
) ++ (javacOptions in doc).value