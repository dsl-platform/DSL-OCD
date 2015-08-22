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

private[domain] object AggregateWithSurrogateKeyAndOnePropertyWithinOneValueSetup {
  val setups = for {
    t <- OcdType.useCaseValues
    b <- OcdBox.values
    if !(b.collectionFamily == Some(CollectionFamily.Queue) && b.areElementsNullable == Some(true)) // Queue cannot contain null elements
//    if (t.typeName != "String" && t.typeName != "Text" && t.typeName != "Binary") || !b.isCollection
    d = OcdDslBoxType.resolve(t, b)
  } yield {
    new AggregateWithSurrogateKeyAndOnePropertyWithinOneValueSetup(d)
  }
}

private[domain] class AggregateWithSurrogateKeyAndOnePropertyWithinOneValueSetup(
    val propertyType: OcdDslBoxType
  ) extends TestSetup {

  def ModuleName = "AggregateOneValue" + propertyType.typeNameSafe
  def aggregateComment = s"AggregateTypeWithSurrogateKeyAnd${propertyType.dslDesc}PropertyWithinOneValue"

  def shortName = propertyType.dslDescShort
  def AggregateName = "Aggregate" + shortName
  def aggregateName = AggregateName.fcil
  def propertyName = "p" + shortName
  def PropertyName = propertyName.fciu
  def valueName = "v"+shortName
  def ValueName = valueName.fciu

  private val dslPath = s"aggregates/${ModuleName}/${AggregateName}.dsl"

  private val dslBody =
s"""module ${ModuleName}
{
  // ${aggregateComment}
  aggregate ${AggregateName} {
    ${ValueName} ${valueName};
  }

  value ${ValueName} {
    ${propertyType.dslName} ${propertyName};
  }
}
"""

  val dslFiles = Map(dslPath -> dslBody)
}

class AggregateWithSurrogateKeyAndOnePropertyWithinOneValueTestProject(
    setup: AggregateWithSurrogateKeyAndOnePropertyWithinOneValueSetup
  ) extends ITestProject {

  def projectPath = "aggregates/surrogate-one-value-" + setup.AggregateName
  def ProjectNameCamel = "SurrogateOneValue" + setup.AggregateName
  def projectName = s"OCD Single Property within One Value in Aggregate With Surrogate Key Tests (${setup.AggregateName})"

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
    def packageName = "com.dslplatform.ocd.aggregates"
    def testName = setup.aggregateComment + "Test"

    override def imports = Seq(
      "java.io.IOException"
    , "java.util.concurrent.ExecutionException"
    )

    override def classDecorations: Seq[String] = Nil

    val repoClass = "ocd." + setup.ModuleName + ".repositories." + setup.AggregateName + "Repository"
    val repoName = setup.AggregateName.fcil + "Repository"

    val aggregateConcept = "ocd." + setup.ModuleName + "." + setup.AggregateName
    val valueConcept = "ocd." + setup.ModuleName + "." + setup.ValueName
    val javaProperty = OcdJavaBoxTypeProperty(setup.propertyName, ojbt)

    override def leadingBlocks = Seq(s"""
    private static org.slf4j.Logger logger;
    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<${aggregateConcept}> ${repoName};

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(
                ${testName}.class.getResourceAsStream("/dsl-project.ini"));
        logger = locator.resolve(org.slf4j.Logger.class);
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        ${repoName} = locator.resolve(${repoClass}.class);
    }
""")

//    private val uriProperty = OcdJavaBoxTypeProperty("URI", `java.String`)
//    private val idProperty = OcdJavaBoxTypeProperty("ID", `java.Integer`)

    override def tests = Seq(
      new TestJavaOneValueInAggregate {
        def conceptName = aggregateConcept
        def property = javaProperty
        def isDefault = true
        def testID = "Default"
        def testValue = ojbt.defaultValue
        def valueName = setup.valueName
        def valueConceptName = valueConcept
        def repositoryName = repoName
      }
    ) ++ ojbt.nonDefaultValues.zipWithIndex.map { case (ndv, index) =>
      new TestJavaOneValueInAggregate {
        def conceptName = aggregateConcept
        def property = javaProperty
        def isDefault = false
        def testID = "NonDefault" + (index + 1)
        def testValue = ndv
        def valueName = setup.valueName
        def valueConceptName = valueConcept
        def repositoryName = repoName
      }
    }
  }
}

object AggregateWithSurrogateKeyAndOneValueTestProject {
  private val setups = AggregateWithSurrogateKeyAndOnePropertyWithinOneValueSetup.setups

  val projects =
    (setups.groupBy(_.propertyType.typeNameSafe) map { case (typeNameSafe, typeSetups) =>
      new ITestProject {
        def projectPath = "aggregates/surrogate-one-value-" + typeNameSafe
        def ProjectNameCamel = "SurrogateOneValue"+typeNameSafe
        def projectName = s"OCD Single Property within One Value in Aggregate With Surrogate Key Tests (${typeNameSafe})"
        val dslFiles = typeSetups.dslFiles
        val testFiles = typeSetups.map(new AggregateWithSurrogateKeyAndOnePropertyWithinOneValueTestProject(_)).testFiles
      }
    }) toSeq
}
