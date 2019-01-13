package com.dslplatform.ocd

import scala.concurrent.Future
import config._
import org.slf4j.LoggerFactory
import test.javatest.property.turtle._
import test.domain._

object EntryPoint extends App {
  val logger = Logger(LoggerFactory getLogger "DSL-OCD")

  val testSettings = new TestSettings(logger)
    .load("DSL-OCD/ocd.config")

  val testDeployer = new TestDeployer(logger, testSettings)

  new EntryPoint(
    logger = logger,
    testSettings = testSettings,
    testDeployer = testDeployer,
  ).run()
}

class EntryPoint(
    logger: Logger
  , testSettings: ITestSettings
  , testDeployer: ITestDeployer) {

  def run(): Unit = {
    Future {
      logger.trace(s"Initializing DSL values ...")
      val values = dsls.OcdDslBoxType.values
      logger.debug(s"Initialized ${values.size} DSL values!")
    }(scala.concurrent.ExecutionContext.Implicits.global)

    locally {
      import test._
      logger.whenDebugEnabled {
        types.OcdType.useCaseValues(testSettings) foreach { tpe =>
          logger.debug("Using use-case type: {}", tpe.typeName)
        }
        boxes.OcdBox.useCaseValues(testSettings) foreach { box =>
          logger.debug("Using use-case box: {}", box.boxName)
        }
      }
    }

    lazy val turtles = {
      logger.debug("Initializing turtles ...")

      Seq[ITestProject](
        new TestJavaAssertsBorderValuesTurtle(testSettings),
        new TestJavaPropertyFieldTypeTurtle(testSettings),
        new TestJavaPropertyGetterTypeTurtle(testSettings),
        new TestJavaPropertySetterTypeTurtle(testSettings),
      )
    }

    lazy val projectFactories = {
      logger.debug("Initializing project factories ...")

      Seq[ProjectFactory](
        new AggregateWithOnePropertyTestProjectFactory(testSettings),
        new AggregateWithSurrogateKeyAndOnePropertyTestProjectFactory(testSettings),
        new AggregateWithSurrogateKeyAndOnePropertyWithinOneEntityTestProjectFactory(testSettings),
        new AggregateWithSurrogateKeyAndOnePropertyWithinOneValueTestProjectFactory(testSettings),
        new AggregateWithSurrogateKeyAndOnePropertyWithinOneEntityWithinOneEntityTestProjectFactory(testSettings),
        new AggregateWithSurrogateKeyAndOnePropertyWithinOneValueWithinOneEntityTestProjectFactory(testSettings),
        new AggregateWithSurrogateKeyAndOnePropertyWithinOneValueWithinOneValueTestProjectFactory(testSettings),
//        new AggregateWithSurrogateKeyAndCollectionsOfValuesTestProjectFactory(testSettings),
        new EventWithOnePropertyTestProjectFactory(testSettings),
        new EventWithOnePropertyWithinOneValueTestProjectFactory(testSettings),
        new CalculatedPropertyInSnowflakeTestProjectFactory(testSettings),
        new ValueWithOnePropertyTestProjectFactory(testSettings),
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
  }
}
