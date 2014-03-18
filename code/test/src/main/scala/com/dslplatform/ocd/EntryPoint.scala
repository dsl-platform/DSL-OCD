package com.dslplatform.ocd

import config._
import javas.OcdJava
import test.TestComponent
import test.PathResolver
import test.javatest.TestJavaTemplate
import test.javatest.property.Visibility
import test.javatest.property.TestJavaPropertyFieldType
import com.dslplatform.compiler.client.api.params.Language
import com.dslplatform.ocd.test.javatest.property.Modifier
import com.dslplatform.ocd.test.javatest.property.turtle.TestJavaPropertyFieldTypeTurtle

object EntryPoint extends App {
  Locator[EntryPoint].run()
}

class EntryPoint(
    logger: Logger
  , testDeployer: ITestDeployer) {

  def run(): Unit = {
    testDeployer.deployTests(Seq(new TestJavaPropertyFieldTypeTurtle()))
  }
}
