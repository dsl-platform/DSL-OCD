package com.dslplatform.ocd
package test
package domain

import config._
import boxes._
import dsls._
import javas._

import javatest._
import javatest.property._

private[domain] class AggregateWithSurrogateKeyAndOnePropertyWithinOneEntityWithinOneEntitySetupFactory(
    testSettings: ITestSettings
  ) extends SetupFactory(testSettings) {

  val setups = for {
    st <- AggregateRootSugar.values
    d <- OcdDslBoxType.useCaseValues(testSettings)
    if !isOracle || (d.typeName != "String" && d.typeName != "Text" && d.typeName != "Binary" || !d.isCollection)
  } yield {
    new AggregateWithSurrogateKeyAndOnePropertyWithinOneEntityWithinOneEntitySetup(st, d)
  }
}

private[domain] class AggregateWithSurrogateKeyAndOnePropertyWithinOneEntityWithinOneEntitySetup(
    val sugarType: AggregateRootSugar
  , val propertyType: OcdDslBoxType
  ) extends TestSetup {

  def ModuleName = "AggregateOneEntityOneEntity" + propertyType.typeNameSafe
  def aggregateComment = s"${sugarType}WithSurrogateKeyAnd${propertyType.dslDesc}PropertyWithinOneEntityAndOneEntity"

  def shortName = propertyType.dslDescShort
  def AggregateName = sugarType.shortName + shortName
  def aggregateName = AggregateName.fcil
  def EntityName = sugarType.shortName.head + "E" + shortName
  def entityName = EntityName.fcil
  def NestedEntityName = "N" + EntityName
  def nestedEntityName = NestedEntityName.fcil
  def PropertyName = "P" + shortName
  def propertyName = PropertyName.fcil

  private val dslPath = s"aggregates/${ModuleName}/${AggregateName}.dsl"

  private val dslBody =
s"""module ${ModuleName}
{
  // ${aggregateComment}
  ${sugarType.sugarDsl} ${AggregateName} {
    ${EntityName} ${entityName};
  }

  entity ${EntityName} {
    ${NestedEntityName} ${nestedEntityName};
  }

  // should merge with twins
  entity ${NestedEntityName} {
    ${propertyType.dslName} ${propertyName};
  }
}
"""

  val dslFiles = Map(dslPath -> dslBody)
}

class AggregateWithSurrogateKeyAndOnePropertyWithinOneEntityWithinOneEntityTestProject(
    setup: AggregateWithSurrogateKeyAndOnePropertyWithinOneEntityWithinOneEntitySetup
  ) extends ITestProject {

  def projectPath = "aggregates/surrogate-one-entity-one-entity-" + setup.AggregateName
  def ProjectNameCamel = "SurrogateOneEntityOneEntity" + setup.AggregateName
  def projectName = s"OCD Single Property within One Entity within One Entity in Aggregate With Surrogate Key Tests (${setup.AggregateName})"

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
    val javaProperty = OcdJavaBoxTypeProperty(setup.propertyName, ojbt)

    override def leadingBlocks = Seq(s"""
    private static org.slf4j.Logger logger;
    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<${aggregateConcept}> ${repoName};

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(
                ${testName}.class.getResourceAsStream("/dsl-project.properties"));
        logger = locator.resolve(org.slf4j.Logger.class);
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        ${repoName} = locator.resolve(${repoClass}.class);
    }
""")

    private val uriProperty = OcdJavaBoxTypeProperty("URI", `java.String`)
    private val javaIdType = OcdJavaBoxType.resolve(setup.sugarType.surrogateKeyType, `box.One`)
    private val idProperty = OcdJavaBoxTypeProperty("ID", javaIdType)

    override def tests = Seq(
      new TestJavaPropertyFieldType {
        def conceptName = aggregateConcept
        def property = uriProperty
        def visibility = Visibility.Private
      }
    , new TestJavaPropertyGetterType {
        def conceptName = aggregateConcept
        def property = uriProperty
        def visibility = Visibility.Public
      }
    , new TestJavaPropertySetterType {
        def conceptName = aggregateConcept
        def property = uriProperty
        def visibility = Visibility.Private
        override def testNonExistence = true
      }
    , new TestJavaPropertyFieldType {
        def conceptName = aggregateConcept
        def property = idProperty
        def visibility = Visibility.Private
      }
    , new TestJavaPropertyGetterType {
        def conceptName = aggregateConcept
        def property = idProperty
        def visibility = Visibility.Public
      }
    , new TestJavaPropertySetterType {
        def conceptName = aggregateConcept
        def property = idProperty
        def visibility = Visibility.Private
      }
    , new TestJavaOneEntityInOneEntityInAggregate {
        def conceptName = aggregateConcept
        def property = javaProperty
        def isDefault = true
        def testID = "Default"
        def testValue = ojbt.defaultValue
        def entityName = setup.entityName
        def nestedEntityName = setup.nestedEntityName
        def repositoryName = repoName
      }
    ) ++ ojbt.nonDefaultValues.zipWithIndex.map { case (ndv, index) =>
      new TestJavaOneEntityInOneEntityInAggregate {
        def conceptName = aggregateConcept
        def property = javaProperty
        def isDefault = false
        def testID = "NonDefault" + (index + 1)
        def testValue = ndv
        def entityName = setup.entityName
        def nestedEntityName = setup.nestedEntityName
        def repositoryName = repoName
      }
    }
  }
}

class AggregateWithSurrogateKeyAndOnePropertyWithinOneEntityWithinOneEntityTestProjectFactory(
    testSettings: ITestSettings
  ) extends ProjectFactory(testSettings) {

  private lazy val setups = new AggregateWithSurrogateKeyAndOnePropertyWithinOneEntityWithinOneEntitySetupFactory(testSettings).setups

  def projects =
    (setups.groupBy(_.propertyType.typeNameSafe) map { case (typeNameSafe, typeSetups) =>
      new ITestProject {
        def projectPath = "aggregates/surrogate-one-entity-one-entity-" + typeNameSafe
        def ProjectNameCamel = "SurrogateOneEntityOneEntity" + typeNameSafe
        def projectName = s"OCD Single Property within One Entity within One Entity in Aggregate With Surrogate Key Tests (${typeNameSafe})"
        val dslFiles = typeSetups.dslFiles
        val testFiles = typeSetups.map(new AggregateWithSurrogateKeyAndOnePropertyWithinOneEntityWithinOneEntityTestProject(_)).testFiles
      }
    }) toSeq
}
