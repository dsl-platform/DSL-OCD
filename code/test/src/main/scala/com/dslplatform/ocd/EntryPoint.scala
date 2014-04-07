package com.dslplatform.ocd

import config.ITestDeployer

import javas.turtle._
import test.javatest.property.turtle._

import test.aggregates._
import test.values._

object EntryPoint extends App {
  Locator[EntryPoint].run()
}

class EntryPoint(
    logger: Logger
  , testDeployer: ITestDeployer
  ) {

  def run(): Unit = {
    val turtles = Seq(
//      new OcdJavaDefaultsEqualityTurtle {}
//    , new OcdJavaDefaultsModifiersTurtle {}
//    , new TestJavaPropertyFieldTypeTurtle {}
//    , new TestJavaPropertyGetterTypeTurtle {}
//    , new TestJavaPropertySetterTypeTurtle {}
    )

    val projects =
//      AggregateWithOnePropertyTestProject.projects ++
//      AggregateWithSurrogateKeyAndOnePropertyTestProject.projects ++
      ValueWithOnePropertyInAggregateWithSurrogateKeyTestProject.projects

    testDeployer.deployTests(turtles ++ projects)
  }
}
