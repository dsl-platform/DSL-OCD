package com.dslplatform.ocd
package test
package value

import config._
import types._
import boxes._
import dsls._

import javas.OcdJava

import javatest.JavaInfo
import javatest.TestJavaTemplate
import javatest.property.TestJavaPropertyFieldType
import javatest.property.Visibility

//import scalas.OcdScala
//import test.scalatestproperty.TestScalaPropertyFieldType
//import test.scalatestTestScalaTemplate

class PropertyInValueSetup(
    val propertyType: OcdDsl) {

  val PropertyName = propertyType.boxName + (
    if (propertyType.areElementsNullable.isEmpty)
      propertyType.typeSingleName
    else
      propertyType.typePluralName
  )

  val propertyName = PropertyName.fcil

  val ModuleName = "PropertyInValue"
  val ValueName = UniqueNames(PropertyName)

  private val dslPath =
    s"values/${ModuleName}/${propertyType.typeName}/${ValueName}.dsl"

  private val dslBody =
s"""module ${ModuleName}
{
  value ${ValueName} {
    ${propertyType.dslName} ${propertyName};
  }
}
"""

  val dslFiles = Map(dslPath -> dslBody)
}

class PropertyInValueTest(
    setup: PropertyInValueSetup
  ) extends ITestProject {

  val projectPath = "turtles/PropertyInValue/" + setup.propertyType.typeName + "Tests"
  val projectName = "ValueTests"

  val packageName = "com.dslplatform.ocd.values"

  private val modulePrefix =
    packageName + '.' + setup.ModuleName + '.'

  def dslFiles = setup.dslFiles

  def javaTests = new TestJavaTemplate {
    def packageName = modulePrefix + setup.propertyType.typeSingleName + "Tests"

    def testName = "Test" + setup.ValueName

    override def imports = Seq(
      modulePrefix + setup.ValueName
    )

    val javaType = OcdJava.resolve(setup.propertyType)

    def tests = Seq(
      new TestJavaPropertyFieldType {
        def conceptName = setup.ValueName
        def propertyName = setup.propertyName
        def propertyType = javaType
        def visibility = Visibility.Private
        def modifiers = Set.empty
      }
    )
  }

//  def scalaTests = new TestScalaTemplate {
//    def basePackageName = modulePrefix.init
//    def testPackageName = setup.propertyType.typeSingleName + "Tests"
//
//    def testName = "Test" + setup.ValueName
//
//    override def imports = Seq(
//      "scala.reflect.runtime.universe._"
//    )
//
//    val scalaType = OcdScala.resolve(setup.propertyType)
//
//    def tests = Seq(
//      new TestScalaPropertyFieldType {
//        def conceptName = setup.ValueName
//        def propertyName = setup.propertyName
//        def propertyType = scalaType
//      }
//    )
//  }

  def testFiles = Map(
    JAVA -> Map(JavaInfo(javaTests.testBody).toEntry)
//  , Language.SCALA -> Map(PathResolver.withScalaPath(scalaTests.testBody))
  )
}

private object PropertyInValueTests {
  val types: IndexedSeq[OcdType] = IndexedSeq(
    `type.Binary`
  , `type.Bool`
  , `type.Date`
  , `type.Decimal`
  , `type.Decimal(9)`
  , `type.Double`
  , `type.Float`
  , `type.Guid`
  , `type.Image`
  , `type.Integer`
  , `type.Ip`
  , `type.Location`
  , `type.Long`
  , `type.Map`
  , `type.Money`
  , `type.Point`
  , `type.Rectangle`
//  , `type.S3`       // TODO: Missing implementation
  , `type.String`
  , `type.String(9)`
  , `type.Text`
  , `type.Timestamp`
  , `type.Url`
  , `type.Xml`
  )

  val boxes: IndexedSeq[OcdBox] = IndexedSeq(
    `box.One`
  , `box.OneArrayOfOne`
  , `box.OneArrayOfNullable`
  , `box.OneListOfOne`
  , `box.OneListOfNullable`
  , `box.OneSetOfOne`
  , `box.OneSetOfNullable`
  , `box.Nullable`
  , `box.NullableArrayOfOne`
  , `box.NullableArrayOfNullable`
  , `box.NullableListOfOne`
  , `box.NullableListOfNullable`
  , `box.NullableSetOfOne`
  , `box.NullableSetOfNullable`
  )

  val setups = for {
    t <- types
    b <- boxes
    d <- OcdDsl.resolveAll(t, b).take(1) // don't compile aliases
  } yield {
    new PropertyInValueSetup(d)
  }
}

trait PropertyInValueTests {
  import PropertyInValueTests._

  def propertyInValueTests =
    setups.map(new PropertyInValueTest(_))

  def propertyInValueTestsAggregated =
    new ITestProject {
      val projectPath = "values/PropertyInValue"
      val projectName = "PropertyInValueTests"

      val dslFiles =
        setups.foldLeft(new MFiles){ _ ++= _.dslFiles }.toMap

      val testFiles = {
         val testFilesBuilder = new MMap[Language, MFiles]

        setups foreach { setup =>
          new PropertyInValueTest(setup).testFiles foreach { case (language, testFiles) =>
            testFilesBuilder.getOrElse(language, {
              val mFiles = new MFiles
              testFilesBuilder(language) = mFiles
              mFiles
            }) ++= testFiles
          }
        }

        testFilesBuilder.map(e => e.copy(_2 = e._2.toMap)).toMap
      }
    }
}
