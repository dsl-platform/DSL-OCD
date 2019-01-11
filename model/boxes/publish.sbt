// ### PUBLISH SETTINGS ###

credentials in ThisBuild ++= {
  val creds = Path.userHome / ".config" / "DSL-OCD" / "nexus.config"
  if (creds.exists) Some(Credentials(creds)) else None
}.toSeq

scalacOptions in (Compile, doc) ++= Seq(
  "-no-link-warnings",
  "-sourcepath", baseDirectory.value.toString,
  "-doc-source-url", {
    val base = "https://github.com/dsl-platform/DSL-OCD/"
    val tag = if (isSnapshot.value) "tree/master" else s"blob/v${version.value}"
    val section = baseDirectory.value.getParentFile.getName
    val project = baseDirectory.value.getName
    base + tag + "/" + section + "/" + project + "\u20AC{FILE_PATH}.scala"
  },
)

packageOptions := Seq(Package.ManifestAttributes(
  ("Implementation-Vendor", "DSL Platform"),
  ("Sealed", "true"),
))

publishTo := Some(if (isSnapshot.value) Opts.resolver.sonatypeSnapshots else Opts.resolver.sonatypeStaging)
publishArtifact in Test := false
publishMavenStyle := true
pomIncludeRepository := { _ => false }

pomExtra :=
  <inceptionYear>2013</inceptionYear>
    <url>https://github.com/dsl-platform/DSL-OCD</url>
    <licenses>
      <license>
        <name>BSD 3-clause "New" or "Revised" License</name>
        <url>https://spdx.org/licenses/BSD-3-Clause.html</url>
        <distribution>repo</distribution>
      </license>
    </licenses>
    <scm>
      <url>git@github.com:dsl-platform/DSL-OCD.git</url>
      <connection>scm:git:git@github.com:dsl-platform/DSL-OCD.git</connection>
    </scm>
    <developers>
      <developer>
        <id>melezov</id>
        <name>Marko Elezovi&#263;</name>
        <url>https://github.com/melezov</url>
      </developer>
      <developer>
        <id>hperadin</id>
        <name>Hrvoje Peradin</name>
        <url>https://github.com/hperadin</url>
      </developer>
      <developer>
        <id>tferega</id>
        <name>Tomo Ferega</name>
        <url>https://github.com/tferega</url>
      </developer>
    </developers>
