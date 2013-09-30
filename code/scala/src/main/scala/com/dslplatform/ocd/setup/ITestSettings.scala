package com.dslplatform.ocd

import com.dslplatform.compiler.client.api.params.Credentials
import com.dslplatform.compiler.client.api.params.ProjectID
import com.dslplatform.compiler.client.cmdline.logger.LoggerSystem
import com.dslplatform.compiler.client.api.ApiCall
import com.dslplatform.compiler.client.api.Actions

trait ITestSettings {
  def credentials: Credentials
  def projectID: ProjectID
}

class TestSettingsLoader(logger: Logger) {
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
      val credentials = new Credentials(
        properties getProperty "username" ensuring(_ ne null, "Username could not be read!")
      , properties getProperty "password" ensuring(_ ne null, "Password could not be read!")
      )

      logger.trace("Extracting project ID ...")
      val projectID = new ProjectID(
        UUID(properties getProperty "project-id") ensuring(_ ne null, "ProjectID could not be read!")
      )
    }

    logger.debug("Test settings successfully extracted!")
    settings
  }
}
