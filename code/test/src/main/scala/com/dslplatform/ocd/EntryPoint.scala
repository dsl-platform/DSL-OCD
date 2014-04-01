package com.dslplatform.ocd

import scala.reflect.runtime.universe
import config.ITestDeployer
import javas.turtle._
import test.javatest.property.turtle._

import test.aggregate._

object EntryPoint extends App {
  Locator[EntryPoint].run()
}

class EntryPoint(
    logger: Logger
  , testDeployer: ITestDeployer
  ) {

  def run(): Unit = {
    val turtles = Seq(
      new OcdJavaDefaultsEqualityTurtle {}
    , new OcdJavaDefaultsModifiersTurtle {}
    , new TestJavaPropertyFieldTypeTurtle {}
    , new TestJavaPropertyGetterTypeTurtle {}
    , new TestJavaPropertySetterTypeTurtle {}
    )

    val projects =
      AggregateWithSurrogatePrimaryKeyAndOnePropertyTestProject.projects

    testDeployer.deployTests(projects)
  }
}
