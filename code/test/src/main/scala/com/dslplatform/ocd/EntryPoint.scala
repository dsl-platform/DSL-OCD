package com.dslplatform.ocd

import scala.reflect.runtime.universe

import config.ITestDeployer

import javas.turtle.OcdJavaTurtle
import test.javatest.property.turtle.TestJavaPropertyFieldTypeTurtle

import com.dslplatform.ocd.test.value.PropertyInValueTests

object EntryPoint extends App {
  Locator[EntryPoint].run()
}

class EntryPoint(
    logger: Logger
  , testDeployer: ITestDeployer
  ) extends PropertyInValueTests {

  def run(): Unit = {

    testDeployer.deployTests(Seq(
      new OcdJavaTurtle()
    , new TestJavaPropertyFieldTypeTurtle()
    ))
  }
}
