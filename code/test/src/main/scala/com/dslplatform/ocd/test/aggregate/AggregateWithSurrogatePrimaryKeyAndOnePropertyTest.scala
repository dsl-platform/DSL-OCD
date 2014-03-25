package com.dslplatform.ocd
package test
package aggregate

import types._
import boxes._
import dsls.OcdDsl
import javas.OcdJava
import config.ITestProject
import com.dslplatform.ocd.test.javatest.TestJavaTemplate
import com.dslplatform.ocd.test.javatest.JavaInfo
import com.dslplatform.ocd.test.javatest.property.Visibility
import com.dslplatform.ocd.test.javatest.property.TestJavaPropertySetterType
import com.dslplatform.ocd.test.javatest.property.TestJavaPropertyFieldType
import com.dslplatform.ocd.test.javatest.property.TestJavaPropertyGetterType
import com.dslplatform.ocd.test.javatest.property.TestJavaPropertyCrudPersist

object AggregateWithSurrogatePrimaryKeyAndOnePropertySetup {
  val types: IndexedSeq[OcdType] = IndexedSeq(
//    `type.Binary`
//  , `type.Bool`
//  , `type.Date`
//  , `type.Decimal`
//  , `type.Decimal(9)`
//  , `type.Double`
//  , `type.Float`
//  , `type.Guid`
//  , `type.Image`
//  , `type.Integer`
//  , `type.Ip`
//  , `type.Location`
   `type.Long`
//  , `type.Map`
//  , `type.Money`
  , `type.Point`
//  , `type.Rectangle`
//  , `type.String`
//  , `type.String(9)`
//  , `type.Text`
//  , `type.Timestamp`
//  , `type.Url`
//  , `type.Xml`
  )

  val boxes: IndexedSeq[OcdBox] = IndexedSeq(
    `box.One`
//  , `box.OneArrayOfOne`
//  , `box.OneArrayOfNullable`
//  , `box.OneListOfOne`
//  , `box.OneListOfNullable`
//  , `box.OneSetOfOne`
//  , `box.OneSetOfNullable`
//  , `box.Nullable`
//  , `box.NullableArrayOfOne`
  , `box.NullableArrayOfNullable`
//  , `box.NullableListOfOne`
//  , `box.NullableListOfNullable`
//  , `box.NullableSetOfOne`
//  , `box.NullableSetOfNullable`
  )

  val setups = for {
    t <- types
    b <- boxes
    d <- OcdDsl.resolveAll(t, b).take(1) // don't compile aliases
  } yield {
    new AggregateWithSurrogatePrimaryKeyAndOnePropertySetup(d)
  }
}

class AggregateWithSurrogatePrimaryKeyAndOnePropertySetup(
    val propertyType: OcdDsl) {

  val PropertyName = propertyType.boxName + (
    if (propertyType.areElementsNullable.isEmpty)
      propertyType.typeSingleName
    else
      propertyType.typePluralName
  )

  val propertyName = PropertyName.fcil

  val ModuleName = "AggregateWithSurrogatePrimaryKeyAndOneProperty"
  val AggregateName = UniqueNames(ModuleName, PropertyName)

  private val dslPath =
    s"aggregates/${ModuleName}/${propertyType.typeName}/${AggregateName}.dsl"

  private val dslBody =
s"""module ${ModuleName}
{
  aggregate ${AggregateName} {
    ${propertyType.dslName} ${propertyName};
  }
}
"""

  val dslFiles = Map(dslPath -> dslBody)
}

class AggregateWithSurrogatePrimaryKeyAndOnePropertyTestProject(
    setup: AggregateWithSurrogatePrimaryKeyAndOnePropertySetup
  ) extends ITestProject {

  def projectPath = "aggregate/surrogate-single-" + setup.AggregateName
  def projectName = "OCD Single Property in Aggregate With Surrogate Key Tests (" + setup.AggregateName + ")"

  def dslFiles = setup.dslFiles

  def testFiles = Map(
    JAVA -> Map{
      val javaType = OcdJava.resolve(setup.propertyType)
      val template = makeTemplate(javaType)
      val body = template.testBody
      JavaInfo(body).toEntry
    }
  )

  private def makeTemplate(oj: OcdJava) = new TestJavaTemplate {
    def packageName = "com.dsplatform.ocd.aggregates"
    def testName = "AggregateWithSurrogatePrimaryKeyAndOne" + setup.PropertyName + "PropertyTest"

    override def imports = Seq("java.io.IOException")

    override def classDecorations: Seq[String] = Nil

    override def leadingBlocks = Seq(s"""
    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        com.dslplatform.client.Bootstrap.init(${testName}.class.getResourceAsStream("/dsl-project.ini"));
    }
""")

    override def tests = Seq(
      new TestJavaPropertyCrudPersist {
        def conceptName = "model." + setup.ModuleName + "." + setup.AggregateName
        def propertyName = setup.propertyName
        def propertyType = oj
      }
//    , new TestJavaPropertyFieldType {
//        def conceptName = "model." + setup.ModuleName + "." + setup.AggregateName
//        def propertyName = setup.propertyName
//        def propertyType = oj
//        def visibility = Visibility.Private
//        def modifiers = Set.empty
//      }
//    , new TestJavaPropertyGetterType {
//        def conceptName = "model." + setup.ModuleName + "." + setup.AggregateName
//        def propertyName = setup.propertyName
//        def propertyType = oj
//        def visibility = Visibility.Public
//        def modifiers = Set.empty
//      }
//    , new TestJavaPropertySetterType {
//        def conceptName = "model." + setup.ModuleName + "." + setup.AggregateName
//        def propertyName = setup.propertyName
//        def propertyType = oj
//        def visibility = Visibility.Public
//        def modifiers = Set.empty
//      }
    )
  }

//    val name = oj.boxName + (if (oj.areElementsNullable.isEmpty) oj.typeSingleName else oj.typePluralName)
//    val _testName = s"${name}FieldTurtle"
//
//    val fieldTests =
//      for {
//        vis <- Visibility.values
//        mods <- Modifier.fieldCombinations
//      } yield {
//        new TestJavaPropertyFieldType {
//          def conceptName = _testName
//          def propertyName = name.fcil + vis + mods.mkString
//          def propertyType = oj
//          def visibility = vis
//          def modifiers = mods
//        }
//      }
//
//    new TestJavaTemplate {
//      def packageName = "com.dslplatform.ocd.test.javatest.property.turtles." + oj.typeSingleName
//      def testName = _testName
//
//      override def classDecorations = Seq(
//        """SuppressWarnings({ "rawtypes", "unchecked" })"""
//      )
//
//      override def leadingBlocks = fieldTests map { test =>
//        val visibility =
//          (if (test.visibility == Visibility.Private) """@SuppressWarnings("unused") """ else "") +
//          test.visibility.javaFieldPrefix
//
//        val modifiers = test.modifiers.map(_.javaFieldPrefix).mkString
//        val clazz = test.propertyType.javaClass
//
//        s"""
//    ${visibility}${modifiers}${clazz} ${test.propertyName} = ${test.propertyType.defaultValue};
//"""
//      }
//
//      def tests: Seq[TestComponent] = fieldTests
//    }
}

object AggregateWithSurrogatePrimaryKeyAndOnePropertyTestProject {
  val setups = AggregateWithSurrogatePrimaryKeyAndOnePropertySetup.setups

  val projects =
    (setups.groupBy(_.propertyType.typeName) map { case (tipe, typeSetups) =>
    new ITestProject {
      def projectPath = "aggregate/surrogate-single-" + tipe
      def projectName = "OCD Single Property in Aggregate With Surrogate Key Tests (" + tipe + ")"

      val dslFiles =
        typeSetups.foldLeft(new MFiles){ _ ++= _.dslFiles }.toMap

      val testFiles = {
        val testFilesBuilder = new MMap[Language, MFiles]

        typeSetups.map(new AggregateWithSurrogatePrimaryKeyAndOnePropertyTestProject(_)) foreach { project =>
          project.testFiles foreach { case (language, testFiles) =>
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
  }) toSeq
}
