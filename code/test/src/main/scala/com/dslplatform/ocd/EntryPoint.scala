package com.dslplatform.ocd

import config._
import types._
import boxes._
import dsls._
import test.value._
import test.aggregate._
import java.io.FileOutputStream
import scala.concurrent.Future
import scala.concurrent.ExecutionContext
import java.util.concurrent.Executors
import scala.util._

object EntryPoint extends App {
  Locator[EntryPoint].simpleTest()
}

class EntryPoint(
    val logger: Logger
  , val testGenerator: ITestGenerator
  , val testDeployer: ITestDeployer)
    extends /* ValueZeroPropertiesTests
    with */ PropertyInValueTests
    with PrimaryKeyPropertyInAggregateTests
    with SurrogatePrimaryKeyWithOnePropertyInAggregateTests {

  private implicit val ec =
    ExecutionContext.fromExecutor(Executors.newCachedThreadPool)

  def simpleTest() {
    val tests = Seq(
    //  valueZeroPropertiesTests
      propertyInValueTests
    , primaryKeyPropertyInAggregateTests
    , surrogatePrimaryKeyWithOnePropertyInAggregateTests
    )

    Future.sequence(
      tests.map{ case (name, test) => Future {
        logger.info(s"Generating tests: $name ...")
        val setup = testGenerator.generateTests(name, test)
        logger.info(s"Done generating tests: $name")
        setup
      }}
    ) onComplete {
      case Success(result) =>
        logger.info(s"Deploying tests: ${result.map(_.tests.size).sum} in total")
        testDeployer.deployTests(result)
        sys.exit(0)

      case Failure(e) =>
        logger.error("An error has occurred: ", e)
        sys.exit(1)
    }
  }
}
