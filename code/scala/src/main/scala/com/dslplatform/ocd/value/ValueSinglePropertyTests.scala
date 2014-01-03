package com.dslplatform.ocd
package value

import config._
import impl.dsl.setup._

import test.TestJava._
import test.TestJava.property._
import test.TestJava.value._

import test.TestScala._
import test.TestScala.property._
// import test.TestScala.value._

import com.dslplatform.compiler.client.api.params.Language

import types._
import impl.DslTypeResolver

private object ValueSinglePropertyTests {
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
    new SetupSinglePropertyInValueDsl {
      val propertyType = DslTypeResolver.resolve(tipe, box, constraint)
    }
  }
}

trait ValueSinglePropertyTests {
  import ValueSinglePropertyTests._

  def valueSinglePropertyTests = setups map { setup =>
    new ITest { test =>
      def packageName = "com.dslplatform.ocd.values"

      def dslFiles =
        Map(("values/single/" + setup.ModuleName + ".dsl", setup.dslTemplate + "\n"))

      val javaTemplate = new TestJavaTemplate {
        val packageName = test.packageName

        val testName = "Test" + setup.ValueName
        val testDesc = testName

        val imports = Seq(
          packageName + "." + setup.ModuleName + "." + setup.ValueName
        )

        val staticFields = ""
        val beforeClass = ""
        val afterClass = ""
        val beforeTest = ""
        val afterTest = ""
        val helperMethods = ""

        val javaType = impl.JavaTypes.resolve(setup.propertyType)

        val testComponents = Seq(
          new TestJavaPropertyFieldType {
            def javaClass = setup.ValueName
            def fieldClass = javaType.javaClass
            def fieldName = setup.property.name
          }
        , new TestJavaPropertyGetterType {
            def javaClass = setup.ValueName
            def fieldClass = javaType.javaClass
            def fieldName = setup.property.name
          }
        , new TestJavaPropertySetterType {
            def javaClass = setup.ValueName
            def fieldClass = javaType.javaClass
            def fieldName = setup.property.name
          }
        , new TestJavaPropertyDefaultValue {
            def javaClass = setup.ValueName
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
                def javaClass = setup.ValueName
                def fieldClass = javaType.javaClass
                def fieldName = setup.property.name
                def isNullable = javaType.isInstanceOf[box.BoxNullableType]
              }
            )
        }) ++ (javaType match {
          case _: tipe.TipeUnstableType =>
            None
          case _ =>
            Some(
              new TestJavaValueEquality {
                def javaClass = setup.ValueName
              }
            )
        })
      }

      val scalaTemplate = new TestScalaTemplate {
        val packageName = test.packageName

        val testName = "Test" + setup.ValueName
        val testDesc = testName

        val imports = Seq(
          setup.ModuleName + "." + setup.ValueName
        )

        val scalaType = impl.ScalaTypes.resolve(setup.propertyType)

        val testComponents = Seq(
          new TestScalaPropertyFieldType {
            def scalaClass = setup.ValueName
            def fieldClass = scalaType.scalaClass
            def fieldName = setup.property.name
          }
        , new TestScalaPropertyDefaultValue {
            def scalaClass = setup.ValueName
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
