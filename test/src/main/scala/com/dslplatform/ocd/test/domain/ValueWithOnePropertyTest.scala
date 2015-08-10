package com.dslplatform.ocd
package test
package domain

import config._
import types._
import boxes._
import dsls._
import javas._

import javatest._
import javatest.property._

private[domain] object ValueWithOnePropertySetup {
  val setups = for {
    t <- OcdType.useCaseValues
    b <- OcdBox.values
    if !(b.collectionFamily == Some(CollectionFamily.Queue) && b.areElementsNullable == Some(true)) // Queue cannot contain null elements
    d = OcdDslBoxType.resolve(t, b)
  } yield {
    new ValueWithOnePropertySetup(d)
  }
}

private[domain] class ValueWithOnePropertySetup(
    val propertyType: OcdDslBoxType
  ) extends TestSetup {

  def ModuleName = "ValueSingle" + propertyType.typeNameSafe
  def valueComment = "ValueWith" + propertyType.dslDesc + "Property"

  def shortName = propertyType.dslDescShort
  def ValueName = "V" + shortName
  def propertyName = "p" + shortName
  def PropertyName = propertyName.fciu

  private val dslPath = s"values/${ModuleName}/${ValueName}.dsl"

  private val dslBody =
s"""module ${ModuleName}
{
  // ${valueComment}
  value ${ValueName} {
    ${propertyType.dslName} ${propertyName};
  }
}
"""

  val dslFiles = Map(dslPath -> dslBody)
}

class ValueWithOnePropertyTestProject(
    setup: ValueWithOnePropertySetup
  ) extends ITestProject {

  def projectPath = "values/value-single-" + setup.ValueName
  def ProjectNameCamel = "ValueSingle" + setup.ValueName
  def projectName = s"OCD Value with Single Property Tests (${setup.ValueName})"

  def dslFiles = setup.dslFiles

  def testFiles = Map(
    JAVA -> Map{
      val javaType = OcdJavaBoxType.resolve(setup.propertyType)
      val template = makeJavaTemplate(javaType)
      val body = template.testBody
      JavaInfo(body).toEntry
    }
  )

  private def makeJavaTemplate(ojbt: OcdJavaBoxType) = new TestJavaTemplate {
    def packageName = "com.dslplatform.ocd.values"
    def testName = setup.valueComment

    override def imports = Seq("java.io.IOException")
    override def classDecorations: Seq[String] = Nil

    override def leadingBlocks = Seq(s"""
    private static com.dslplatform.client.JsonSerialization jsonSerialization;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(${testName}.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
    }
""")

    val valueConcept = "ocd." + setup.ModuleName + "." + setup.ValueName
    val javaProperty = OcdJavaBoxTypeProperty(setup.propertyName, ojbt)

    override def tests = Seq(
      new TestJavaPropertyFieldType {
        def conceptName = valueConcept
        def property = javaProperty
        def visibility = Visibility.Private
      }
    , new TestJavaPropertyGetterType {
        def conceptName = valueConcept
        def property = javaProperty
        def visibility = Visibility.Public
      }
    , new TestJavaPropertySetterType {
        def conceptName = valueConcept
        def property = javaProperty
        def visibility = Visibility.Public
      }
    , new TestJavaPropertyInValue {
        def conceptName = valueConcept
        def property = javaProperty
        def isDefault = true
        def testID = "Default"
        def testValue = ojbt.defaultValue
      }
    ) ++ ojbt.nonDefaultValues.zipWithIndex.map { case (ndv, index) =>
      new TestJavaPropertyInValue {
        def conceptName = valueConcept
        def property = javaProperty
        def isDefault = false
        def testID = "NonDefault" + (index + 1)
        def testValue = ndv
      }
    }
  }
}

object ValueWithOnePropertyTestProject {
  val setups = ValueWithOnePropertySetup.setups

  val projects =
    (setups.groupBy(_.propertyType.typeNameSafe) map { case (typeNameSafe, typeSetups) =>
    new ITestProject {
      def projectPath = "values/value-single-" + typeNameSafe
      def ProjectNameCamel = "ValueSingle" + typeNameSafe
      def projectName = s"OCD Value with Single Property Tests (${typeNameSafe})"
      val dslFiles = typeSetups.dslFiles
      val testFiles = typeSetups.map(new ValueWithOnePropertyTestProject(_)).testFiles
    }
  }) toSeq
}
