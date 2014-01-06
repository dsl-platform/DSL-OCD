package com.dslplatform.ocd

import config._
import types._
import boxes._
import dsls._

object EntryPoint extends App {
  Locator[EntryPoint].simpleTest()
}

class EntryPoint(
    val testGenerator: ITestGenerator,
    val testDeployer: ITestDeployer)
    extends /* ValueZeroPropertiesTests
    with ValueSinglePropertyTests
    with AggregateSinglePropertyTests
    with AggregateSinglePropertyWithSurrogateTests */ {

  def simpleTest() {

    println(
      DSLResolver.resolveOne(`type.BINARY`, `box.NullableArrayOfNullable`)
    )
//
//      val a1 = Resolver.resolveOne(`type.Long`, `box.Nullable`)
//      val a2 = Resolver.resolveOne[`type.Long`, `box.Nullable`]
//
//      println(a1, a2, a1 eq a2)
////        types
//    )


//    val valueTests =
//      testGenerator.generateTests(
//      valueZeroPropertiesTests ++
//      valueSinglePropertyTests
//    )
//
//    val aggregateTests = testGenerator.generateTests(
//      aggregateSinglePropertyTests ++
//      aggregateSinglePropertyWithSurrogateTests
//    )
//
//    testDeployer.deployTests(Seq(
//      valueTests
//    , aggregateTests
//    ))
  }
}
