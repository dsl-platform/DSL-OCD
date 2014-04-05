package com.dslplatform.ocd
package test
package aggregate

import types._
import boxes._
import dsls.OcdDsl
import javas.OcdJava
import config.ITestProject
import javatest.TestJavaTemplate
import javatest.JavaInfo
import javatest.property._

object AggregateWithOnePropertySetup {
  val types: IndexedSeq[OcdType] = IndexedSeq(
    `type.Binary`
  , `type.Bool`
  , `type.Date`
  , `type.Decimal`
  , `type.Decimal(9)`
  , `type.Double`
  , `type.Float`
  , `type.Guid`
//  , `type.Image`
  , `type.Integer`
  , `type.Ip`
  , `type.Location`
  , `type.Long`
  , `type.Map`
  , `type.Money`
  , `type.Point`
  , `type.Rectangle`
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
  )

  val setups = for {
    t <- types
    b <- boxes
    d <- OcdDsl.resolveAll(t, b).take(1) // don't compile aliases
  } yield {
    new AggregateWithOnePropertySetup(d)
  }
}

class AggregateWithOnePropertySetup(
    val propertyType: OcdDsl) {

  val PropertyName = propertyType.boxName + (
    if (propertyType.areElementsNullable.isEmpty)
      propertyType.typeSingleName
    else
      propertyType.typePluralName
  )

  val propertyName = PropertyName.fcil

  val ModuleName = "AggregateWithOneProperty"
  val AggregateName = UniqueNames(ModuleName, PropertyName)

  private val dslPath =
    s"aggregates/${ModuleName}/${propertyType.typeName}/${AggregateName}.dsl"

  private val dslBody =
s"""module ${ModuleName}
{
  aggregate ${AggregateName}(${propertyName}) {
    ${propertyType.dslName} ${propertyName};
  }
}
"""

  val dslFiles = Map(dslPath -> dslBody)
}

class AggregateWithOnePropertyTestProject(
    setup: AggregateWithOnePropertySetup
  ) extends ITestProject {

  def projectPath = "aggregate/primary-single-" + setup.AggregateName
  def projectName = "OCD Single Property in Aggregate Tests (" + setup.AggregateName + ")"

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
    def packageName = "com.dslplatform.ocd.aggregates"
    def testName = "AggregateWith" + setup.PropertyName + "PropertyTest"

    override def imports = Seq("java.io.IOException")

    override def classDecorations: Seq[String] = Nil

    override def leadingBlocks = Seq(s"""
    private static com.dslplatform.patterns.ServiceLocator locator;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        locator = com.dslplatform.client.Bootstrap.init(${testName}.class.getResourceAsStream("/dsl-project.ini"));
    }
""")

    override def tests = Seq(
      new TestJavaPropertyFieldType {
        def conceptName = "model." + setup.ModuleName + "." + setup.AggregateName
        def propertyName = setup.propertyName
        def propertyType = oj
        def visibility = Visibility.Private
        def modifiers = Set.empty
      }
    , new TestJavaPropertyGetterType {
        def conceptName = "model." + setup.ModuleName + "." + setup.AggregateName
        def propertyName = setup.propertyName
        def propertyType = oj
        def visibility = Visibility.Public
        def modifiers = Set.empty
      }
    , new TestJavaPropertySetterType {
        def conceptName = "model." + setup.ModuleName + "." + setup.AggregateName
        def propertyName = setup.propertyName
        def propertyType = oj
        def visibility = Visibility.Public
        def modifiers = Set.empty
      }
    , new TestJavaPropertyDefaultValue {
        def conceptName = "model." + setup.ModuleName + "." + setup.AggregateName
        def propertyName = setup.propertyName
        def propertyType = oj
      }
    , new TestJavaPropertyInAggregateAfterActiveRecordPersist {
        def conceptName = "model." + setup.ModuleName + "." + setup.AggregateName
        def propertyName = setup.propertyName
        def propertyType = oj
        def isDefault = true
        def testID = "Default"
        def testValue = oj.defaultValue
      }
    ) ++ oj.nonDefaultValues.zipWithIndex.map { case (ndv, index) =>
      new TestJavaPropertyInAggregateAfterActiveRecordPersist {
        def conceptName = "model." + setup.ModuleName + "." + setup.AggregateName
        def propertyName = setup.propertyName
        def propertyType = oj
        def isDefault = false
        def testID = "NonDefault" + (index + 1)
        def testValue = ndv
      }
    }
  }
}

object AggregateWithOnePropertyTestProject {
  val setups = AggregateWithOnePropertySetup.setups

  val projects =
    (setups.groupBy(_.propertyType.typeName) map { case (tipe, typeSetups) =>
    new ITestProject {
      def projectPath = "aggregate/primary-single-" + tipe.replaceAll("[^-\\w]+", "")
      def projectName = "OCD Single Property in Aggregate Tests (" + tipe + ")"

      val dslFiles =
        typeSetups.foldLeft(new MFiles){ _ ++= _.dslFiles }.toMap

      val testFiles = {
        val testFilesBuilder = new MMap[Language, MFiles]

        typeSetups.map(new AggregateWithOnePropertyTestProject(_)) foreach { project =>
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
