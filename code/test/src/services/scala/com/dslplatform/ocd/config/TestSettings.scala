package com.dslplatform.ocd
package config

import com.dslplatform.compiler.client.api.params.Credentials
import com.dslplatform.compiler.client.api.params.ProjectID
import com.dslplatform.compiler.client.cmdline.logger.LoggerSystem
import com.dslplatform.compiler.client.api.ApiCall
import com.dslplatform.compiler.client.api.Actions
import com.dslplatform.compiler.client.api.ApiProperties

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
        val workspace = properties getProperty "generated"
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
