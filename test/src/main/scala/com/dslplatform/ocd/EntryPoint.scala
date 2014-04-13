package com.dslplatform.ocd

import config.ITestDeployer

import test.javatest.property.turtle._

//import test.aggregates._
//import test.values._

object EntryPoint extends App {
  Locator[EntryPoint].run()
}

class EntryPoint(
    logger: Logger
  , testDeployer: ITestDeployer) {

  def run(): Unit = {
    val turtles = Seq(
      TestJavaAssertsBorderValuesTurtle
    , TestJavaPropertyFieldTypeTurtle
    , TestJavaPropertyGetterTypeTurtle
    , TestJavaPropertySetterTypeTurtle
    )

    val projects =
//      AggregateWithOnePropertyTestProject.projects ++
//      AggregateWithSurrogateKeyAndOnePropertyTestProject.projects ++
//      ValueWithOnePropertyInAggregateWithSurrogateKeyTestProject.projects ++
      Nil

    testDeployer.deployTests(turtles ++ projects)
  }
}
