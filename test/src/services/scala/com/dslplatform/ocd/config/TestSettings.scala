package com.dslplatform.ocd
package config

private[config] class TestSettingsLoader(logger: Logger) {
  def load(relativePath: String) = {
    val testIni = Path(
      sys.props("user.home")
        .replace('\\', '/')
        .replaceFirst("\\+$", "") + "/.config/" + relativePath
    , '/'
    )

    logger.info("Loading test settings from: " + testIni.path)

    val properties =
      testIni.inputStream acquireAndGet { is =>
        val props = new Properties
        props load is
        props
      }

    val settings = new ITestSettings {
      val workspace = {
        val workspace = properties getProperty "test-projects"
        logger.debug("Reading test workspace: " + workspace)
        require(workspace ne null, "Workspace could not be read!")
        Workspace(workspace)
      }

      val xkcd = XKCD.now
      logger.debug("Test XKCD: " + xkcd)

      val revenj = Revenj.find(properties getProperty "targetRevenj")
      logger.debug("Target Revenj: " + revenj)

      val database = Database.find(properties getProperty "targetDatabase")
      logger.debug("Target Database: " + database)
    }

    logger.trace("Test settings successfully extracted!")
    settings
  }
}
