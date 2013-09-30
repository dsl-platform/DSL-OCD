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

trait ITestDeployer {
  def deploy(): Unit
}

class TestDeployer(
    logger: Logger
  , settings: ITestSettings
  , project: ITestProject) extends ITestDeployer {

  def deploy() {
    project.clean()


  }
}
