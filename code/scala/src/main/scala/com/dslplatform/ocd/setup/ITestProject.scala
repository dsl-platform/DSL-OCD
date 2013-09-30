package com.dslplatform.ocd.setup

import org.slf4j.Logger
import scalax.file._

trait ITestProject {
  val root: Path
  def clean(): Unit
}

class TestProjectLoader(
    logger: Logger) {

  def load(path: String) = {
    val project = new ITestProject() {
      logger.debug("Initializing test project at " + path)
      val root = Path(path.replace('\\', '/'), '/')

      def clean() {
        if (root.isDirectory) {
          logger.debug("Cleaning test project ...")
          val remaining = root.deleteRecursively(true, true)._2
          if (remaining > 0) {
            logger.warn(s"Could not delete all generated resources ($remaining)!")
          }
        }

        logger.trace("Creating directory for the test project ...")
        root.createDirectory(true, true)
      }

      logger.info("Initialized test project!")
    }

    project
  }
}
