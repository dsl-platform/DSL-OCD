package com.dslplatform.ocd
package test
package value

import config._
import types._
import boxes._
import dsls._
import com.dslplatform.compiler.client.api.params.Language

import javas.OcdJava
import `test.javas`.property.TestJavaPropertyFieldType
import `test.javas`.TestJavaTemplate

import scalas.OcdScala
import `test.scalas`.property.TestScalaPropertyFieldType
import `test.scalas`.TestScalaTemplate

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
  ) extends ITest {

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
      }
    )
  }

  def scalaTests = new TestScalaTemplate {
    def basePackageName = modulePrefix.init
    def testPackageName = setup.propertyType.typeSingleName + "Tests"

    def testName = "Test" + setup.ValueName

    override def imports = Seq(
      "scala.reflect.runtime.universe._"
    )

    val scalaType = OcdScala.resolve(setup.propertyType)

    def tests = Seq(
      new TestScalaPropertyFieldType {
        def conceptName = setup.ValueName
        def propertyName = setup.propertyName
        def propertyType = scalaType
      }
    )
  }

  def testFiles = Map(
    Language.JAVA -> Map(PathResolver.withJavaPath(javaTests.testBody))
  , Language.SCALA -> Map(PathResolver.withScalaPath(scalaTests.testBody))
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
    setups.head.ModuleName ->
    setups.map(new PropertyInValueTest(_))
}
