package com.dslplatform.ocd

import config._
import types._
import boxes._
import dsls._
import test.value.ValueSinglePropertyTests

object EntryPoint extends App {
  Locator[EntryPoint].simpleTest()
}

class EntryPoint(
    val testGenerator: ITestGenerator,
    val testDeployer: ITestDeployer)
    extends /* ValueZeroPropertiesTests
    with */ ValueSinglePropertyTests /*
    with AggregateSinglePropertyTests
    with AggregateSinglePropertyWithSurrogateTests */ {

  def simpleTest() {
    val valueTests =
      testGenerator.generateTests(
//        valueZeroPropertiesTests ++
        valueSinglePropertyTests
      )

//    val aggregateTests = testGenerator.generateTests(
//      aggregateSinglePropertyTests ++
//      aggregateSinglePropertyWithSurrogateTests
//    )
//
//    testDeployer.deployTests(Seq(
//      valueTests
////    , aggregateTests
//    ))
  }
}
