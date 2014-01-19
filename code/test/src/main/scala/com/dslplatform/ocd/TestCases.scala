package com.dslplatform.ocd

import config._
import types._
import boxes._
import dsls._

import test.value._
import test.aggregate._
import test.calculation._
import test.snowflake._

import scala.concurrent.Future

class TestCases(
    val logger: Logger
  , val testGenerator: ITestGenerator
  , val testDeployer: ITestDeployer)
    extends PropertyInValueTests
    with PrimaryKeyPropertyInAggregateTests
    with SurrogatePrimaryKeyWithOnePropertyInAggregateTests
    with CalculatedPropertyInAggregateTests
    with CalculatedPropertyInValueTests
    with SnowflakePropertyFromAggregateTests {

  def generateTests() = {
    val tests = Seq(
      propertyInValueTests
    , primaryKeyPropertyInAggregateTests
    , surrogatePrimaryKeyWithOnePropertyInAggregateTests
    , calculatedPropertyInAggregateTests
    , calculatedPropertyInValueTests
    , snowflakePropertyFromAggregateTests
    )

    Future.sequence(
      tests.map{ case (name, test) => Future{
        logger.info(s"Generating tests: $name ...")
        val setup = testGenerator.generateTests(name, test)
        logger.info(s"Done generating tests: $name")
        setup
      }}
    ) map { result =>
      logger.info(s"Deploying tests: ${result.map(_.tests.size).sum} in total")
      testDeployer.deployTests(result)
    }
  }
}
