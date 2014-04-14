package com.dslplatform.ocd
package test
package values

import config.ITestProject

import types._
import boxes._
import dsls._
import javas._

import javatest._
import javatest.property._

object ValueWithOnePropertySetup {
  val setups = for {
    t <- OcdType.useCaseValues
    b <- OcdBox.values
    d = OcdDslBoxType.resolve(t, b)
  } yield {
    new ValueWithOnePropertySetup(d)
  }
}

class ValueWithOnePropertySetup(
    val propertyType: OcdDslBoxType
  ) extends TestSetup {

  def valueComment = "ValueWith" + propertyType.dslDesc

  def ModuleName = "ValueSingle" + propertyType.typeNameSafe
  def ValueName = "V" + propertyType.dslDescShort
  def propertyName = "p" + propertyType.dslDescShort
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
  def projectName = "OCD Value with Single Property Tests (" + setup.ValueName + ")"

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

    override def tests = Seq(
      new TestJavaPropertyFieldType {
        def conceptName = valueConcept
        def property = OcdJavaBoxTypeProperty(setup.propertyName, ojbt)
        def visibility = Visibility.Private
        def modifiers = Set.empty
      }
    , new TestJavaPropertyGetterType {
        def conceptName = valueConcept
        def property = OcdJavaBoxTypeProperty(setup.propertyName, ojbt)
        def visibility = Visibility.Public
        def modifiers = Set.empty
      }
    , new TestJavaPropertySetterType {
        def conceptName = valueConcept
        def property = OcdJavaBoxTypeProperty(setup.propertyName, ojbt)
        def visibility = Visibility.Public
        def modifiers = Set.empty
      }
    , new TestJavaPropertyInValue {
        def conceptName = valueConcept
        def property = OcdJavaBoxTypeProperty(setup.propertyName, ojbt)
        def visibility = Visibility.Public
        def modifiers = Set.empty
        def isDefault = true
        def testID = "Default"
        def testValue = ojbt.defaultValue
      }
    ) ++ ojbt.nonDefaultValues.zipWithIndex.map { case (ndv, index) =>
      new TestJavaPropertyInValue {
        def conceptName = valueConcept
        def property = OcdJavaBoxTypeProperty(setup.propertyName, ojbt)
        def visibility = Visibility.Public
        def modifiers = Set.empty
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
      def projectName = "OCD Value with Single Property Tests (" + typeNameSafe + ")"
      val dslFiles = typeSetups.dslFiles
      val testFiles = typeSetups.map(new ValueWithOnePropertyTestProject(_)).testFiles
    }
  }) toSeq
}
