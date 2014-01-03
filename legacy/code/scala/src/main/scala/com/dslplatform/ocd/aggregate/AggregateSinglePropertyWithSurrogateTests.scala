package com.dslplatform.ocd
package aggregate

import config._
import impl.dsl.setup._

import test.TestJava._
import test.TestJava.property._

import test.TestScala._
import test.TestScala.property._
// import test.TestScala.value._

import com.dslplatform.compiler.client.api.params.Language

import types._
import impl.DslTypeResolver

private object AggregateSinglePropertyWithSurrogateTests {
  val boxes = Seq(
    `box.One`
  , `box.Opt`
  , `box.Array`
  , `box.List`
  , `box.Set`
  , `box.OptArray`
  , `box.OptList`
  , `box.OptSet`
  , `box.ArrayOpt`
  , `box.ListOpt`
  , `box.SetOpt`
  , `box.OptArrayOpt`
  , `box.OptListOpt`
  , `box.OptSetOpt`
  )

  val types = Seq(
    `tipe.Binary`
  , `tipe.Bool`
  , `tipe.Date`
  , `tipe.Decimal`
  , `tipe.Double`
  , `tipe.Float`
  , `tipe.Guid`
  , `tipe.Integer`
  , `tipe.KeyValue`
  , `tipe.Long`
  , `tipe.Money`
  , `tipe.String`
  , `tipe.Timestamp`
  , `tipe.Xml`
  )

  val constraints = Seq(
    `constraint.Free`
  , `constraint.Length`
  , `constraint.Scale`
  )

  val setups = for {
    box <- boxes
    tipe <- types
    constraint <- constraints
  } yield {
    new SetupSinglePropertyInAggregateDsl {
      val propertyType = DslTypeResolver.resolve(tipe, box, constraint)
    }
  }
}

trait AggregateSinglePropertyWithSurrogateTests {
  import AggregateSinglePropertyWithSurrogateTests._

  def aggregateSinglePropertyWithSurrogateTests = setups map { setup =>
    new ITest { test =>
      def packageName = "com.dslplatform.ocd.aggregates"

      def dslFiles =
        Map(("aggregates/single/" + setup.ModuleName + ".dsl", setup.dslTemplate + "\n"))

      val javaTemplate = new TestJavaTemplate {
        val packageName = test.packageName

        val testName = "Test" + setup.AggregateName
        val testDesc = testName

        def aggregateClassPath = s"${packageName}.${setup.ModuleName}.${setup.AggregateName}";
        def repositoryClass = s"${setup.AggregateName}Repository"
        def repositoryClassPath = s"${packageName}.${setup.ModuleName}.repositories.${repositoryClass}";

        def imports = Seq(
          aggregateClassPath
        , repositoryClassPath
        )

        def beforeClass: String = s"""
        repository = locator.resolve(${repositoryClass}.class);"""

        def afterClass: String = s"""
        repository = null;"""

        def beforeTest: String = ""
        def afterTest: String = ""

        val staticFields = s"""
        private static ${repositoryClass} repository;"""

        val helperMethods = s"""
    private static void cleanup()
            throws InterruptedException, ExecutionException {
        if (repository.countAll().get() > 0) {
            repository.delete(repository.findAll().get()).get();

            final long remaining = repository.countAll().get();
            assertEquals(0L, remaining);
        }
    }"""

        def javaType = impl.JavaTypes.resolve(setup.propertyType)

        val testComponents = Seq(
          new TestJavaPropertyFieldType {
            def javaClass = setup.AggregateName
            def fieldClass = javaType.javaClass
            def fieldName = setup.property.name
          }
        , new TestJavaPropertyGetterType {
            def javaClass = setup.AggregateName
            def fieldClass = javaType.javaClass
            def fieldName = setup.property.name
          }
        , new TestJavaPropertySetterType {
            def javaClass = setup.AggregateName
            def fieldClass = javaType.javaClass
            def fieldName = setup.property.name
          }
        , new TestJavaPropertyDefaultValue {
            def javaClass = setup.AggregateName
            def fieldClass = javaType.javaClass
            def fieldName = setup.property.name
            def defaultPropertyValue = javaType.defaultValue
          }
        ) ++ (javaType match {
          case _: tipe.TipeScalarType =>
            None
          case _ =>
            Some(
              new TestJavaPropertySetterNullGuard {
                def javaClass = setup.AggregateName
                def fieldClass = javaType.javaClass
                def fieldName = setup.property.name
                def isNullable = javaType.isInstanceOf[box.BoxNullableType]
              }
            )
        }) ++ Seq(
          new TestJavaPropertyDefaultValueAfterPersist {
            def javaClass = setup.AggregateName
            def fieldClass = javaType.javaClass
            def fieldName = setup.property.name
            def defaultPropertyValue = javaType.defaultValue
          }
        )
      }

      val scalaTemplate = new TestScalaTemplate {
        val packageName = test.packageName

        val testName = "Test" + setup.AggregateName
        val testDesc = testName

        val imports = Seq(
          setup.ModuleName + "." + setup.AggregateName
        )

        val scalaType = impl.ScalaTypes.resolve(setup.propertyType)

        val testComponents = Seq(
          new TestScalaPropertyFieldType {
            def scalaClass = setup.AggregateName
            def fieldClass = scalaType.scalaClass
            def fieldName = setup.property.name
          }
        , new TestScalaPropertyDefaultValue {
            def scalaClass = setup.AggregateName
            def fieldClass = scalaType.scalaClass
            def fieldName = setup.property.name
            def defaultPropertyValue = scalaType.defaultValue
          }
        )
      }

      val javaFilePath =
        "java/" +
        javaTemplate.packageName.replace('.', '/') + "/" +
        javaTemplate.testName + ".java"

      val scalaFilePath =
        "scala/" +
        scalaTemplate.packageName.replace('.', '/') + "/" +
        scalaTemplate.testName + ".scala"

      def testFiles = Map(
        Language.JAVA -> Map(
          javaFilePath -> javaTemplate.testBody
        , "java/org/junit/AssertExtensions.java" -> TestJavaAssertExtensions.body
        )
      , Language.SCALA -> Map(
          scalaFilePath -> scalaTemplate.testBody
        , "scala/org/scalatest/SpecExtensions.scala" -> TestScalaSpecExtensions.body
        )
      )
    }
  }
}
