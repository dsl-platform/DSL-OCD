package com.dslplatform.ocd
package config

class TestSettings(logger: Logger) {
  def load(relativePath: String) = {
    val testIni = File(
      sys.props("user.home")
        .replace('\\', '/')
        .replaceFirst("\\+$", "") + "/.config/" + relativePath
    )

    logger.info("Loading test settings from: " + testIni.path)

    val properties =
      testIni.inputStream apply { is =>
        val props = new Properties
        props load is
        props
      }

    def fromPath(path: String): File = File(new java.io.File(path).getAbsolutePath)

    val settings = new ITestSettings {
      val xkcd = XKCD.now
      logger.debug("Test XKCD: " + xkcd)

      val workspace = {
        val tmp = properties getProperty "test-projects"
        require(tmp ne null, "Workspace could not be read!")
        val path = fromPath(tmp)
        logger.debug("Read test workspace path: {}", path.path)
        Workspace(path)
      }

      val templates = {
        val tmp = properties getProperty "templates"
        tmp match {
          case null =>
            val path = workspace / ".." / "templates" path;
            logger.warn("Templates path is not defined, deriving from workspace: {}", path.path)
            path
          case path =>
            logger.debug("Read templates path: {}", path)
            fromPath(path)
        }
      }

      val revenj = Revenj.find(properties getProperty "targetRevenj")
      logger.info("Target Revenj: {}", revenj)

      val database = Database.find(properties getProperty "targetDatabase")
      logger.info("Target Database: {}", database)

      val turtles = properties.getProperty("turtles", "false").toBoolean
      logger.info("Run turtles: {}", turtles)

      val projectPattern = properties.getProperty("projectPattern", ".*").r
      logger.info("Project pattern: {}", projectPattern)

      val typePattern = properties.getProperty("typePattern", ".*").r
      logger.info("Type pattern: {}", typePattern)

      val boxPattern = properties.getProperty("boxPattern", ".*").r
      logger.info("Box pattern: {}", boxPattern)
    }

    logger.trace("Test settings successfully extracted!")
    settings
  }
}
