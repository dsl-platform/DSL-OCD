package com.dslplatform.ocd
package test
package aggregates

import types._
import boxes._
import dsls.OcdDsl
import javas.OcdJava

import config.ITestProject

import javatest._
import javatest.property._

object AggregateWithSurrogateKeyAndOnePropertySetup {
  val setups = for {
    t <- OcdType.useCaseValues
    b <- OcdBox.values
    d = OcdDsl.resolve(t, b)
  } yield {
    new AggregateWithSurrogateKeyAndOnePropertySetup(d)
  }
}

class AggregateWithSurrogateKeyAndOnePropertySetup(
    val propertyType: OcdDsl) extends TestSetup {

  val PropertyName = propertyType.typeDescription
  val propertyName = PropertyName.fcil

  val ModuleName = "AggregateWithSurrogateKeyAndOneProperty"
  val AggregateName = "StandardRootWith" + PropertyName

  private val dslPath =
    s"aggregates/${ModuleName}/${propertyType.safeTypeName}/${AggregateName}.dsl"

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

class AggregateWithSurrogateKeyAndOnePropertyTestProject(
    setup: AggregateWithSurrogateKeyAndOnePropertySetup
  ) extends ITestProject {

  def projectPath = "aggregates/surrogate-single-" + setup.AggregateName
  def projectName = "OCD Single Property in Aggregate with Surrogate Key Tests (" + setup.AggregateName + ")"

  def dslFiles = setup.dslFiles

  def testFiles = Map(
    JAVA -> Map{
      val javaType = OcdJava.resolve(setup.propertyType)
      val template = makeJavaTemplate(javaType)
      val body = template.testBody
      JavaInfo(body).toEntry
    }
  )

  private def makeJavaTemplate(oj: OcdJava) = new TestJavaTemplate {
    def packageName = "com.dslplatform.ocd.aggregates"
    def testName = "AggregateWithSurrogateKeyAnd" + setup.PropertyName + "PropertyTest"

    override def imports = Seq("java.io.IOException")
    override def classDecorations: Seq[String] = Nil

    val concept = "model." + setup.ModuleName + "." + setup.AggregateName

    override def leadingBlocks = Seq(s"""
    private static com.dslplatform.patterns.ServiceLocator locator;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        locator = com.dslplatform.client.Bootstrap.init(${testName}.class.getResourceAsStream("/dsl-project.ini"));
    }
""")

    override def tests = Seq(
      new TestJavaPropertyFieldType {
        def conceptName = concept
        def propertyName = setup.propertyName
        def propertyType = oj
        def visibility = Visibility.Private
        def modifiers = Set.empty
      }
    , new TestJavaPropertyGetterType {
        def conceptName = concept
        def propertyName = setup.propertyName
        def propertyType = oj
        def visibility = Visibility.Public
        def modifiers = Set.empty
      }
    , new TestJavaPropertySetterType {
        def conceptName = concept
        def propertyName = setup.propertyName
        def propertyType = oj
        def visibility = Visibility.Public
        def modifiers = Set.empty
      }
    , new TestJavaPropertyDefaultValue {
        def conceptName = concept
        def propertyName = setup.propertyName
        def propertyType = oj
      }
    , new TestJavaPropertyInAggregateAfterActiveRecordPersist {
        def conceptName = concept
        def propertyName = setup.propertyName
        def propertyType = oj
        def isDefault = true
        def testID = "Default"
        def testValue = oj.defaultValue
      }
    ) ++ oj.nonDefaultValues.zipWithIndex.map { case (ndv, index) =>
      new TestJavaPropertyInAggregateAfterActiveRecordPersist {
        def conceptName = concept
        def propertyName = setup.propertyName
        def propertyType = oj
        def isDefault = false
        def testID = "NonDefault" + (index + 1)
        def testValue = ndv
      }
    }
  }
}

object AggregateWithSurrogateKeyAndOnePropertyTestProject {
  private val setups = AggregateWithSurrogateKeyAndOnePropertySetup.setups

  val projects =
    (setups.groupBy(_.propertyType.safeTypeName) map { case (tipe, typeSetups) =>
      new ITestProject {
        def projectPath = "aggregates/surrogate-single-" + tipe
        def projectName = "OCD Single Property in Aggregate with Surrogate Key Tests (" + tipe + ")"
        val dslFiles = typeSetups.dslFiles
        val testFiles = typeSetups.map(new AggregateWithSurrogateKeyAndOnePropertyTestProject(_)).testFiles
      }
    }) toSeq
}
