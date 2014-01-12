package com.dslplatform.ocd
package test
package value

import config._
import types._
import boxes._
import dsls._
import com.dslplatform.compiler.client.api.params.Language

import com.dslplatform.ocd.javas.OcdJava
import com.dslplatform.ocd.`test.javas`.property.TestJavaPropertyFieldType
import com.dslplatform.ocd.`test.javas`.TestJavaTemplate

import com.dslplatform.ocd.scalas.OcdScala
import com.dslplatform.ocd.`test.scalas`.property.TestScalaPropertyFieldType
import com.dslplatform.ocd.`test.scalas`.TestScalaTemplate

class SetupSinglePropertyInValueDsl(
    val propertyType: OcdDsl) {

  val PropertyName = propertyType.boxName + (
    if (propertyType.areElementsNullable.isEmpty)
      propertyType.typeSingleName
    else
      propertyType.typePluralName
  )

  val propertyName = PropertyName.fcil

  val ModuleName = "SinglePropertyInValue"
  val ValueName = UniqueNames(PropertyName + "Value")

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

private object ValueSinglePropertyTests {
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
//   `type.Rectangle` // TODO: FIXME
//  , `type.S3`       // TODO: Missing implementation
  , `type.String`
  , `type.String(9)`
  , `type.Text`
  , `type.Timestamp`
  , `type.Url`
  , `type.Xml`
  )

  val setups = for {
    b <- boxes
    t <- types
    d <- OcdDsl.resolveAll(t, b)
  } yield {
    new SetupSinglePropertyInValueDsl(d)
  }
}

trait ValueSinglePropertyTests {
  import ValueSinglePropertyTests._

  def valueSinglePropertyTests = setups map { setup =>
    new ITest { test =>
      val packageName = "com.dslplatform.ocd.values"

      def dslFiles = setup.dslFiles

      def javaTests =
        new TestJavaTemplate {
          def packageName =
            test.packageName + '.' + setup.ModuleName + '.' +
              setup.propertyType.typeSingleName

          def testName = "Test" + setup.ValueName

          override def imports = Seq(
            test.packageName + '.' + setup.ModuleName + '.' +
              setup.ValueName
          , "org.scalatest._"
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

      def scalaTests =
        new TestScalaTemplate {
          def packageName =
            test.packageName + '.' + setup.ModuleName + '.' +
              setup.propertyType.typeSingleName

          def testName = "Test" + setup.ValueName

          override def imports = Seq(
            test.packageName + '.' + setup.ModuleName + '.' +
              setup.ValueName
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
  }
}
