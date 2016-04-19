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

private[domain] class CalculatedPropertyInSnowflakeSetupFactory(
    testSettings: ITestSettings
  ) extends SetupFactory(testSettings) {

  val setups = for {
    t <- OcdType.useCaseValues(testSettings)
    b <- OcdBox.values
    d = OcdDslBoxType.resolve(t, b)
    if !(b.collectionFamily == Some(CollectionFamily.Queue) && b.areElementsNullable == Some(true)) // Queue cannot contain null elements
    if !isOracle || (t.typeName != "String" && t.typeName != "Text" && t.typeName != "Binary" || !b.isCollection)
  } yield {
    new CalculatedPropertyInSnowflakeSetup(d)
  }
}

private[domain] class CalculatedPropertyInSnowflakeSetup(
    val propertyType: OcdDslBoxType
  ) extends TestSetup {

  def ModuleName = s"Snowflake${propertyType.typeNameSafe}Calc"
  def snowflakeComment = s"Calculated${propertyType.dslDesc}PropertyInSnowflake"

  def shortName = propertyType.dslDescShort
  def AggregateName = "A" + shortName
  def SnowflakeName = "S" + shortName
  def propertyName = "p" + shortName
  def PropertyName = propertyName.fciu

  def aggregateClonePropertyName = "aC_" + propertyName
  def snowflakeClonePropertyName = "sC_" + propertyName

  private val dslPath = s"snowflakes/${ModuleName}/${AggregateName}.dsl"

  private val dslBody =
s"""module ${ModuleName}
{
  aggregate ${AggregateName} {
    ${propertyType.dslName} ${propertyName};

    calculated ${propertyType.dslName} ${aggregateClonePropertyName} from 'it => it.${propertyName}';
  }

  // ${snowflakeComment}
  snowflake<${AggregateName}> ${SnowflakeName} {
    ${propertyName};

    ${aggregateClonePropertyName};

    calculated ${propertyType.dslName} ${snowflakeClonePropertyName} from 'it => it.${propertyName}';
  }
}
"""

  val dslFiles = Map(dslPath -> dslBody)
}

class CalculatedPropertyInSnowflakeTestProject(
    setup: CalculatedPropertyInSnowflakeSetup
  ) extends ITestProject {

  def projectPath = "snowflakes/calculated-single-" + setup.AggregateName
  def ProjectNameCamel = "CalculatedSingle" + setup.AggregateName
  def projectName = s"OCD Single Calculated Property in Snowflake Tests (${setup.AggregateName})"

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
    def packageName = "com.dslplatform.ocd.snowflakes"
    def testName = setup.snowflakeComment + "Test"

    override def imports = Seq(
      "java.io.IOException"
    , "java.util.concurrent.ExecutionException"
    )

    override def classDecorations: Seq[String] = Nil

    val repoClass = s"ocd.${setup.ModuleName}.repositories.${setup.AggregateName}Repository"
    val repoName = setup.AggregateName.fcil + "Repository"

    val aggregateConcept = s"ocd.${setup.ModuleName}.${setup.AggregateName}"
    val snowflakeConcept = s"ocd.${setup.ModuleName}.${setup.SnowflakeName}"
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

    private val uriProperty = OcdJavaBoxTypeProperty("URI", `java.String`)
//    private val idProperty = OcdJavaBoxTypeProperty("ID", `java.Integer`)

    val aggregateCloneProperty = OcdJavaBoxTypeProperty(setup.aggregateClonePropertyName, ojbt)
    val snowflakeCloneProperty = OcdJavaBoxTypeProperty(setup.snowflakeClonePropertyName, ojbt)

    override def tests = Seq(
      new TestJavaPropertyFieldType {
        def conceptName = aggregateConcept
        def property = javaProperty
        def visibility = Visibility.Private
        override def testSuffix = "InAggregate"
      }
    , new TestJavaPropertyGetterType {
        def conceptName = aggregateConcept
        def property = javaProperty
        def visibility = Visibility.Public
        override def testSuffix = "InAggregate"
      }
    , new TestJavaPropertySetterType {
        def conceptName = aggregateConcept
        def property = javaProperty
        def visibility = Visibility.Public
        override def testSuffix = "InAggregate"
      }
    , new TestJavaPropertyDefaultValue {
        def conceptName = aggregateConcept
        def property = javaProperty
      }
    , new TestJavaPropertyFieldType {
        def conceptName = aggregateConcept
        def property = aggregateCloneProperty
        def visibility = Visibility.Private
        override def testSuffix = "InAggregate"
      }
    , new TestJavaPropertyGetterType {
        def conceptName = aggregateConcept
        def property = aggregateCloneProperty
        def visibility = Visibility.Public
        override def testSuffix = "InAggregate"
      }
    , new TestJavaPropertySetterType {
        def conceptName = aggregateConcept
        def property = aggregateCloneProperty
        def visibility = Visibility.Private
        override def testNonExistence = true
        override def testSuffix = "InAggregate"
      }
    , new TestJavaPropertyFieldType {
        def conceptName = snowflakeConcept
        def property = uriProperty
        def visibility = Visibility.Private
        override def modifiers = Set(Modifier.Final)
        override def testSuffix = "InSnowflake"
      }
    , new TestJavaPropertyGetterType {
        def conceptName = snowflakeConcept
        def property = uriProperty
        def visibility = Visibility.Public
        override def testSuffix = "InSnowflake"
      }
    , new TestJavaPropertySetterType {
        def conceptName = snowflakeConcept
        def property = uriProperty
        def visibility = Visibility.Private
        override def testNonExistence = true
        override def testSuffix = "InSnowflake"
      }
    , new TestJavaPropertyFieldType {
        def conceptName = snowflakeConcept
        def property = javaProperty
        def visibility = Visibility.Private
        override def modifiers = Set(Modifier.Final)
        override def testSuffix = "InSnowflake"
      }
    , new TestJavaPropertyGetterType {
        def conceptName = snowflakeConcept
        def property = javaProperty
        def visibility = Visibility.Public
        override def testSuffix = "InSnowflake"
      }
    , new TestJavaPropertySetterType {
        def conceptName = snowflakeConcept
        def property = javaProperty
        def visibility = Visibility.Private
        override def testNonExistence = true
        override def testSuffix = "InSnowflake"
      }
    , new TestJavaPropertyFieldType {
        def conceptName = snowflakeConcept
        def property = aggregateCloneProperty
        def visibility = Visibility.Private
        override def modifiers = Set(Modifier.Final)
        override def testSuffix = "InSnowflake"
      }
    , new TestJavaPropertyGetterType {
        def conceptName = snowflakeConcept
        def property = aggregateCloneProperty
        def visibility = Visibility.Public
        override def testSuffix = "InSnowflake"
      }
    , new TestJavaPropertySetterType {
        def conceptName = snowflakeConcept
        def property = aggregateCloneProperty
        def visibility = Visibility.Private
        override def testNonExistence = true
        override def testSuffix = "InSnowflake"
      }
    , new TestJavaPropertyFieldType {
        def conceptName = snowflakeConcept
        def property = snowflakeCloneProperty
        def visibility = Visibility.Private
        override def modifiers = Set(Modifier.Final)
        override def testSuffix = "InSnowflake"
      }
    , new TestJavaPropertyGetterType {
        def conceptName = snowflakeConcept
        def property = snowflakeCloneProperty
        def visibility = Visibility.Public
        override def testSuffix = "InSnowflake"
      }
    , new TestJavaPropertySetterType {
        def conceptName = snowflakeConcept
        def property = snowflakeCloneProperty
        def visibility = Visibility.Private
        override def testNonExistence = true
        override def testSuffix = "InSnowflake"
      }
    , new TestJavaCalculatedPropertyInAggregate {
        def conceptName = aggregateConcept
        def property = javaProperty
        def isDefault = true
        def testID = "Default"
        def testValue = ojbt.defaultValue
        def clonePropertyName = setup.aggregateClonePropertyName
        def repositoryName = repoName
      }
    , new TestJavaCalculatedPropertyInSnowflake {
        def conceptName = aggregateConcept
        def property = javaProperty
        def isDefault = true
        def testID = "Default"
        def testValue = ojbt.defaultValue
        def snowflakeName = snowflakeConcept
        def aggregateClonePropertyName = setup.aggregateClonePropertyName
        def snowflakeClonePropertyName = setup.snowflakeClonePropertyName
        def repositoryName = repoName
      }
    ) ++ ojbt.nonDefaultValues.zipWithIndex.map { case (ndv, index) =>
      new TestJavaCalculatedPropertyInAggregate {
        def conceptName = aggregateConcept
        def property = javaProperty
        def isDefault = false
        def testID = "NonDefault" + (index + 1)
        def testValue = ndv
        def clonePropertyName = setup.aggregateClonePropertyName
        def repositoryName = repoName
      }
    } ++ ojbt.nonDefaultValues.zipWithIndex.map { case (ndv, index) =>
      new TestJavaCalculatedPropertyInSnowflake {
        def conceptName = aggregateConcept
        def property = javaProperty
        def isDefault = false
        def testID = "NonDefault" + (index + 1)
        def testValue = ndv
        def snowflakeName = snowflakeConcept
        def aggregateClonePropertyName = setup.aggregateClonePropertyName
        def snowflakeClonePropertyName = setup.snowflakeClonePropertyName
        def repositoryName = repoName
      }
    }
  }
}

class CalculatedPropertyInSnowflakeTestProjectFactory(
    testSettings: ITestSettings
  ) extends ProjectFactory(testSettings) {

  private lazy val setups = new CalculatedPropertyInSnowflakeSetupFactory(testSettings).setups

  def projects =
    (setups.groupBy(_.propertyType.typeNameSafe) map { case (typeNameSafe, typeSetups) =>
      new ITestProject {
        def projectPath = "snowflakes/calculated-single-" + typeNameSafe
        def ProjectNameCamel = "CalculatedSingle" + typeNameSafe
        def projectNameCamel = "calculatedSingle" + typeNameSafe
        def projectName = s"OCD Single Calculated Property in Snowflake Tests (${typeNameSafe})"
        val dslFiles = typeSetups.dslFiles
        val testFiles = typeSetups.map(new CalculatedPropertyInSnowflakeTestProject(_)).testFiles
      }
    }) toSeq
}
