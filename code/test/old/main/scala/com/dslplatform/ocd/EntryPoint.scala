package com.dslplatform.ocd

import config._
import types._
import boxes._
import dsls._

import test.value._
import test.aggregate._

import scala.concurrent.Future
import scala.util._

object EntryPoint extends App {
  Locator[EntryPoint].run()
}

class EntryPoint(
    logger: Logger
  , testCases: TestCases) {

  def run(): Unit = {
    Future.sequence(Seq(
      testCases.generateTests()
    )) onComplete {
      case Success(_) =>
        logger.info("All actions completed successfully!")
        sys.exit(0)

      case Failure(e) =>
        logger.error("An error has occurred", e)
        sys.exit(1)
    }
  }
}
