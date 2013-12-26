package com.dslplatform.ocd
package config

import com.dslplatform.compiler.client.api.params.Credentials
import com.dslplatform.compiler.client.api.params.ProjectID
import com.dslplatform.compiler.client.cmdline.logger.LoggerSystem
import com.dslplatform.compiler.client.api.ApiCall
import com.dslplatform.compiler.client.api.Actions

private [config] class TestSettingsLoader(logger: Logger) {
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
      logger.trace("Extracting credentials ...")

      val username = properties getProperty "username"
      logger.debug("Reading test username: " + username)
      require(username ne null, "Username could not be read!")

      val password = {
        val password = properties getProperty "password"
        require(password ne null, "Password could not be read!")
        logger.debug("Test password: " + "*" * password.length)
        password getBytes "UTF-8"
      }

      val workspace = {
        val workspace = properties getProperty "workspace"
        logger.debug("Reading test workspace: " + workspace)
        require(workspace ne null, "Workspace could not be read!")
        Workspace(workspace)
      }

      val xkcd = XKCD.now
      logger.debug("Test XKCD: " + xkcd)
    }

    logger.trace("Test settings successfully extracted!")
    settings
  }
}