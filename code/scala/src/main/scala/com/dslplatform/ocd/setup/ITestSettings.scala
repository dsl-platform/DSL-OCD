package com.dslplatform.ocd.setup

import com.dslplatform.compiler.client.api.params.Credentials
import com.dslplatform.compiler.client.api.params.ProjectID
import com.dslplatform.compiler.client.cmdline.logger.LoggerSystem
import com.dslplatform.compiler.client.api.ApiCall
import com.dslplatform.compiler.client.api.Actions
import java.util.Properties
import org.slf4j.Logger
import scalax.file._
import scalax.io._
import io.jvm.uuid._

trait ITestSettings {
  val credentials: Credentials
  val projectID: ProjectID
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
        properties getProperty "user"
      , properties getProperty "password"
      )

      logger.trace("Extracting project ID ...")
      val projectID = new ProjectID(
        UUID(properties getProperty "project-id")
      )

    }

    logger.debug("Test settings successfully extracted!")
    settings
  }
}
