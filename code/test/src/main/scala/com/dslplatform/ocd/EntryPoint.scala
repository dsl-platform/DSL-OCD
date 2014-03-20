package com.dslplatform.ocd

import config._
import javas.OcdJava
import test._
import javatest._
import property._
import turtle.TestJavaPropertyFieldTypeTurtle
import com.dslplatform.compiler.client.api.params.Language
import com.dslplatform.ocd.test.value.PropertyInValueTests

object EntryPoint extends App {
  Locator[EntryPoint].run()
}

class EntryPoint(
    logger: Logger
  , testDeployer: ITestDeployer
  ) extends PropertyInValueTests {

  def run(): Unit = {

    import com.dslplatform.ocd.test.value.PropertyInValueTests

    testDeployer.deployTests(Seq(
//        Seq(propertyInValueTestsAggregated)
      new TestJavaPropertyFieldTypeTurtle()
//    , new PropertyInValueTest()
    ))
  }
}
