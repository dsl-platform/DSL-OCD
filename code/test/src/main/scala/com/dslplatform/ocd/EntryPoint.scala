package com.dslplatform.ocd

import scala.reflect.runtime.universe
import config.ITestDeployer

import javas.turtle._
import test.javatest.property.turtle._

object EntryPoint extends App {
  Locator[EntryPoint].run()
}

class EntryPoint(
    logger: Logger
  , testDeployer: ITestDeployer
  ) {

  def run(): Unit = {
    testDeployer.deployTests(Seq(
      new OcdJavaDefaultsEqualityTurtle {}

//      new OcdJavaDefaultsModifiersTurtle {}
//    , new OcdJavaDefaultsEqualityTurtle {}
//    , new TestJavaPropertyFieldTypeTurtle {}
//    , new TestJavaPropertyGetterTypeTurtle {}
//    , new TestJavaPropertySetterTypeTurtle {}
    ))
  }
}
