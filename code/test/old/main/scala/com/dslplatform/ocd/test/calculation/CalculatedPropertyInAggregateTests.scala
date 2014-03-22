package com.dslplatform.ocd
package test
package calculation

import config._
import types._
import boxes._
import dsls._

import javas.OcdJava
import `test.javas`.property.TestJavaPropertyFieldType
import `test.javas`.TestJavaTemplate

import scalas.OcdScala
import `test.scalas`.property.TestScalaPropertyFieldType
import `test.scalas`.TestScalaTemplate

class CalculatedPropertyInAggregateSetup(
    val propertyType: OcdDsl) {

  val PropertyName = propertyType.boxName + (
    if (propertyType.areElementsNullable.isEmpty)
      propertyType.typeSingleName
    else
      propertyType.typePluralName
  )

  val propertyName = PropertyName.fcil

  val ModuleName = "CalculatedPropertyInAggregateSetup"
  val AggregateName = UniqueNames(PropertyName)

  private val dslPath =
    s"calculations/${ModuleName}/${propertyType.typeName}/${AggregateName}.dsl"

  private val dslBody =
s"""module ${ModuleName}
{
  aggregate ${AggregateName} {
    ${propertyType.dslName} ${propertyName};

    calculated ${propertyType.dslName} calculated${PropertyName} from 'it => it.${propertyName}';

    calculated ${propertyType.dslName} persisted${PropertyName} from 'it => it.${propertyName}' { persisted; }
  }
}
"""

  val dslFiles = Map(dslPath -> dslBody)
}

class CalculatedPropertyInAggregateTest(
    setup: CalculatedPropertyInAggregateSetup
  ) extends ITest {

  val packageName = "com.dslplatform.ocd.calculation"

  private val modulePrefix =
    packageName + '.' + setup.ModuleName + '.'

  def dslFiles = setup.dslFiles

  def javaTests = new TestJavaTemplate {
    def packageName = modulePrefix + setup.propertyType.typeSingleName + "Tests"

    def testName = "Test" + setup.AggregateName

    override def imports = Seq(
      modulePrefix + setup.AggregateName
    )

    val javaType = OcdJava.resolve(setup.propertyType)

    def tests = Seq(
      new TestJavaPropertyFieldType {
        def conceptName = setup.AggregateName
        def propertyName = setup.propertyName
        def propertyType = javaType
      }
    )
  }

  def scalaTests = new TestScalaTemplate {
    def basePackageName = modulePrefix.init
    def testPackageName = setup.propertyType.typeSingleName + "Tests"

    def testName = "Test" + setup.AggregateName

    override def imports = Seq(
      "scala.reflect.runtime.universe._"
    )

    val scalaType = OcdScala.resolve(setup.propertyType)

    def tests = Seq(
      new TestScalaPropertyFieldType {
        def conceptName = setup.AggregateName
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


private object CalculatedPropertyInAggregateTests {
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
//    if !(t == `type.Money` && b.areElementsNullable == Some(true)) // NullableCollections of Monies don't compile
    d <- OcdDsl.resolveAll(t, b).take(1) // don't compile aliases
  } yield {
    new CalculatedPropertyInAggregateSetup(d)
  }
}

trait CalculatedPropertyInAggregateTests {
  import CalculatedPropertyInAggregateTests._

  def calculatedPropertyInAggregateTests =
    setups.head.ModuleName ->
    setups.map(new CalculatedPropertyInAggregateTest(_))
}
