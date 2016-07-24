package com.dslplatform.ocd

import dsls.OcdDslBoxType
import scala.concurrent.Future
import config._
import test.javatest.property.turtle._
import test.domain._

object EntryPoint extends App {
  Locator[EntryPoint].run()
}

class EntryPoint(
    logger: Logger
  , testSettings: ITestSettings
  , testDeployer: ITestDeployer) {

  def run(): Unit = {
    Future {
      logger.trace(s"Initializing DSL values ...")
      val values = OcdDslBoxType.values
      logger.debug(s"Initialized ${values.size} DSL values!")
    }

    lazy val turtles = {
      logger.debug("Initializing turtles ...")

      Seq[ITestProject](
        TestJavaAssertsBorderValuesTurtle
        , TestJavaPropertyFieldTypeTurtle
        , TestJavaPropertyGetterTypeTurtle
        , TestJavaPropertySetterTypeTurtle
      )
    }

    lazy val projectFactories = {
      logger.debug("Initializing project factories ...")

      Seq[ProjectFactory](
        new AggregateWithOnePropertyTestProjectFactory(testSettings)
      , new AggregateWithSurrogateKeyAndOnePropertyTestProjectFactory(testSettings)
      , new AggregateWithSurrogateKeyAndOnePropertyWithinOneEntityTestProjectFactory(testSettings)
      , new AggregateWithSurrogateKeyAndOnePropertyWithinOneValueTestProjectFactory(testSettings)
      , new AggregateWithSurrogateKeyAndOnePropertyWithinOneEntityWithinOneEntityTestProjectFactory(testSettings)
      , new AggregateWithSurrogateKeyAndOnePropertyWithinOneValueWithinOneEntityTestProjectFactory(testSettings)
      , new AggregateWithSurrogateKeyAndOnePropertyWithinOneValueWithinOneValueTestProjectFactory(testSettings)
      , new EventWithOnePropertyTestProjectFactory(testSettings)
      , new CalculatedPropertyInSnowflakeTestProjectFactory(testSettings)
      , new ValueWithOnePropertyTestProjectFactory(testSettings)
      )
    }

    val tests = (testSettings.turtles match {
      case true => turtles
      case _ => Nil
    }) ++ (projectFactories flatMap { projectFactory =>
      val name = projectFactory.getClass.getSimpleName
      testSettings.projectPattern.pattern.matcher(name).matches() match {
        case true =>
          val projects = projectFactory.projects
          logger.info("Initialized project factory [{}], deploying {} projects ...", name, projects.size)
          projects
        case _ =>
          logger.warn("Skipping project factory: {}", name)
          Nil
      }
    })

    testDeployer.deployTests(tests)

    logger.info("Finished!")
    sys.exit(0)
  }
}
