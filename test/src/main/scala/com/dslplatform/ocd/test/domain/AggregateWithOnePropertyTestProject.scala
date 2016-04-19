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

private[domain] class AggregateWithOnePropertySetupFactory(
    testSettings: ITestSettings
  ) extends SetupFactory(testSettings) {

  val setups = for {
    t <- OcdType.useCaseValues(testSettings)
    if t != `type.Image`                                // Image types shouldn't be a primary key
    if t != `type.Location` && t != `type.Point`        // ERROR: data type point has no default operator class for access method "btree"
    if t != `type.Xml`                                  // ERROR: data type xml has no default operator class for access method "btree"
    if t != `type.Rectangle`                            // ERROR: data type box has no default operator class for access method "btree"
    if !isOracle || t != `type.Binary` && t != `type.String` && t != `type.Text` // Oracle doesn't support BLOB or CLOB as primary key
    b <- OcdBox.values
    if !b.isNullable                                    // Primary keys cannot be nullable
    if !(b.collectionFamily == Some(CollectionFamily.Queue) && b.areElementsNullable == Some(true)) // Queue cannot contain null elements
    if !isOracle || b.isCollection == false               // Collections cannot be PK in Oracle
    if b.collectionFamily != Some(CollectionFamily.Set) // URIs from Set PKs are currently behaving erratically
    d = OcdDslBoxType.resolve(t, b)
  } yield {
    new AggregateWithOnePropertySetup(d)
  }
}

private[domain] class AggregateWithOnePropertySetup(
    val propertyType: OcdDslBoxType
  ) extends TestSetup {

  def ModuleName = "AggregatePrimary" + propertyType.typeNameSafe
  def aggregateComment = s"AggregateWith${propertyType.dslDesc}PropertyAsPrimaryKey"

  def shortName = propertyType.dslDescShort
  def AggregateName = "A" + shortName
  def aggregateName = AggregateName.fcil
  def propertyName = "p" + shortName
  def PropertyName = propertyName.fciu

  private val dslPath = s"aggregates/${ModuleName}/${AggregateName}.dsl"

  private val dslBody =
s"""module ${ModuleName}
{
  // ${aggregateComment}
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

  def projectPath = "aggregates/primary-single-" + setup.AggregateName
  def ProjectNameCamel = "PrimarySingle" + setup.AggregateName
  def projectName = s"OCD Single Primary Key Property in Aggregate Tests (${setup.AggregateName})"

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

    val repoClass = s"ocd.${setup.ModuleName}.repositories.${setup.AggregateName}Repository"
    val repoName = setup.AggregateName.fcil + "Repository"

    val aggregateConcept = s"ocd.${setup.ModuleName}.${setup.AggregateName}"
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

    public static void cleanup() throws IOException {
        try {
            final java.util.List<${aggregateConcept}> values = ${repoName}.search(Integer.MAX_VALUE, 0).get();
            ${repoName}.delete(values).get();
        } catch (final InterruptedException e) {
            throw new IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new IOException(e);
        }
    }
""")

    private val cleanup = s"""
        // Clean previous test results
        cleanup();
"""

    private val uriProperty = OcdJavaBoxTypeProperty("URI", `java.String`)

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
        def property = javaProperty
        def visibility = Visibility.Private
      }
    , new TestJavaPropertyGetterType {
        def conceptName = aggregateConcept
        def property = javaProperty
        def visibility = Visibility.Public
      }
    , new TestJavaPropertySetterType {
        def conceptName = aggregateConcept
        def property = javaProperty
        def visibility = Visibility.Public
      }
    , new TestJavaPropertyDefaultValue {
        def conceptName = aggregateConcept
        def property = javaProperty
      }
    , new TestJavaPropertyInAggregate {
        def conceptName = aggregateConcept
        def property = javaProperty
        def isDefault = true
        def testID = "Default"
        def testValue = ojbt.defaultValue
        def repositoryName = repoName
        override def setupBlock = cleanup
      }
    ) ++ ojbt.nonDefaultValues.zipWithIndex.map { case (ndv, index) =>
      new TestJavaPropertyInAggregate {
        def conceptName = aggregateConcept
        def property = javaProperty
        def isDefault = false
        def testID = "NonDefault" + (index + 1)
        def testValue = ndv
        def repositoryName = repoName
        override def setupBlock = cleanup
      }
    }
  }
}

class AggregateWithOnePropertyTestProjectFactory(
    testSettings: ITestSettings
  ) extends ProjectFactory(testSettings) {

  private lazy val setups = new AggregateWithOnePropertySetupFactory(testSettings).setups

  def projects =
    (setups.groupBy(_.propertyType.typeNameSafe) map { case (typeNameSafe, typeSetups) =>
      new ITestProject {
        def projectPath = "aggregates/primary-single-" + typeNameSafe
        def ProjectNameCamel = "PrimarySingle" + typeNameSafe
        def projectName = s"OCD Single Primary Key Property in Aggregate Tests (${typeNameSafe})"
        val dslFiles = typeSetups.dslFiles
        val testFiles = typeSetups.map(new AggregateWithOnePropertyTestProject(_)).testFiles
      }
    }) toSeq
}
