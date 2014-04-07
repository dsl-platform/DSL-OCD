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

object AggregateWithOnePropertySetup {
  val setups = for {
    t <- OcdType.useCaseValues
    b <- OcdBox.values
    if !b.isNullable                                // Primary keys cannot be nullable
    if b.collectionType != Some(CollectionType.Set) // URIs from Set PKs are currently behaving erratically
    d = OcdDsl.resolve(t, b)
  } yield {
    new AggregateWithOnePropertySetup(d)
  }
}

class AggregateWithOnePropertySetup(
    val propertyType: OcdDsl) extends TestSetup {

  val PropertyName = propertyType.typeDescription
  val propertyName = PropertyName.fcil

  val ModuleName = "AggregateWithOneProperty"
  val AggregateName = "RootWith" + PropertyName

  private val dslPath =
    s"aggregates/${ModuleName}/${propertyType.safeTypeName}/${AggregateName}.dsl"

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

  def projectPath = "aggregates/primary-single-" + setup.AggregateName
  def projectName = "OCD Single PK Property in Aggregate Tests (" + setup.AggregateName + ")"

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
    def testName = "AggregateWith" + setup.PropertyName + "PropertyTest"

    override def imports = Seq("java.io.IOException")
    override def classDecorations: Seq[String] = Nil

    val repoClass = "model." + setup.ModuleName + ".repositories." + setup.AggregateName + "Repository"
    val repoName = setup.AggregateName.fcil + "Repository"
    val concept = "model." + setup.ModuleName + "." + setup.AggregateName

    override def leadingBlocks = Seq(s"""
    private static com.dslplatform.patterns.ServiceLocator locator;
    private static com.dslplatform.patterns.PersistableRepository<${concept}> ${repoName};

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        locator = com.dslplatform.client.Bootstrap.init(${testName}.class.getResourceAsStream("/dsl-project.ini"));
        ${repoName} = locator.resolve(${repoClass}.class);
    }

    public static void cleanup() throws IOException {
        try {
            final java.util.List<${concept}> values = ${repoName}.findAll(Integer.MAX_VALUE, 0).get();
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
        override def setupBlock = cleanup
      }
    ) ++ oj.nonDefaultValues.zipWithIndex.map { case (ndv, index) =>
      new TestJavaPropertyInAggregateAfterActiveRecordPersist {
        def conceptName = concept
        def propertyName = setup.propertyName
        def propertyType = oj
        def isDefault = false
        def testID = "NonDefault" + (index + 1)
        def testValue = ndv
        override def setupBlock = cleanup
      }
    }
  }
}

object AggregateWithOnePropertyTestProject {
  private val setups = AggregateWithOnePropertySetup.setups

  val projects =
    (setups.groupBy(_.propertyType.safeTypeName) map { case (tipe, typeSetups) =>
      new ITestProject {
        def projectPath = "aggregates/primary-single-" + tipe
        def projectName = "OCD Single PK Property in Aggregate Tests (" + tipe + ")"
        val dslFiles = typeSetups.dslFiles
        val testFiles = typeSetups.map(new AggregateWithOnePropertyTestProject(_)).testFiles
      }
    }) toSeq
}
