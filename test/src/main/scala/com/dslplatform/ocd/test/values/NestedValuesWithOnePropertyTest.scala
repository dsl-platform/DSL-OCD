//package com.dslplatform.ocd
//package test
//package values
//
//import config.ITestProject
//
//import types._
//import boxes._
//import dsls._
//import javas._
//
//import javatest._
//import javatest.property._
//
//object NestedValuesWithOnePropertySetup {
//  val setups = for {
//    cb <- OcdBox.values
//    t <- OcdType.useCaseValues
//    b <- OcdBox.values
//    d = OcdDslBoxType.resolve(t, b)
//  } yield {
//    new NestedValuesWithOnePropertySetup(cb, d)
//  }
//}
//
//class NestedValuesWithOnePropertySetup(
//    val containerBox: OcdBox
//  , val propertyType: OcdDslBoxType
//  ) extends TestSetup {
//
//  val PropertyName = propertyType.typeDescription
//  val propertyName = PropertyName.fcil
//
//  val ModuleName = "NestedValuesWith" + propertyType.typeNameSafe + "Property"
//  val InnerValueName = UniqueNames(ModuleName, "Inner")
//
//  val OutterValueName = UniqueNames(ModuleName, "Outter")
//  val InnerValueType = OcdDslBoxType.resolve(`type.Guid`, containerBox).dslName.replace("Guid", InnerValueName)
//
//  private val dslPath =
//    s"values/${ModuleName}/boxed-${propertyType.typeNameSafe}/${InnerValueName}.dsl"
//
//  private val dslBody =
//s"""module ${ModuleName}
//{
//  value ${OutterValueName} {
//    ${InnerValueType} underlying;
//  }
//
//  value ${InnerValueName} {
//    ${propertyType.dslName} ${propertyName};
//  }
//}
//"""
//
//  val dslFiles = Map(dslPath -> dslBody)
//}
//
//class NestedValuesWithOnePropertyTestProject(
//    setup: NestedValuesWithOnePropertySetup
//  ) extends ITestProject {
//
//  def projectPath = "values/value-boxed-" + setup.InnerValueName
//  def projectName = "OCD Value Boxed Property Tests (" + setup.InnerValueName + ")"
//
//  def dslFiles = setup.dslFiles
//
//  def testFiles = Map(
//    JAVA -> Map{
//      val javaType = OcdJavaBoxType.resolve(setup.propertyType)
//      val template = makeJavaTemplate(javaType)
//      val body = template.testBody
//      JavaInfo(body).toEntry
//    }
//  )
//
//  private def makeJavaTemplate(ojbt: OcdJavaBoxType) = new TestJavaTemplate {
//    def packageName = "com.dslplatform.ocd.values"
//    def testName = setup.InnerValueName
//
//    override def imports = Seq("java.io.IOException")
//    override def classDecorations: Seq[String] = Nil
//
//    override def leadingBlocks = Seq(s"""
//    private static com.dslplatform.client.JsonSerialization jsonSerialization;
//
//    @org.junit.BeforeClass
//    public static void initialize() throws IOException {
//        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(${testName}.class.getResourceAsStream("/dsl-project.ini"));
//        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
//    }
//""")
//
////    val valueConcept = "model." + setup.ModuleName + "." + setup.ValueName
//
//    override def tests = Seq(
////      new TestJavaPropertyFieldType {
////        def conceptName = valueConcept
////        def property = OcdJavaBoxTypeProperty(setup.propertyName, ojbt)
////        def visibility = Visibility.Private
////        def modifiers = Set.empty
////      }
////    , new TestJavaPropertyGetterType {
////        def conceptName = valueConcept
////        def property = OcdJavaBoxTypeProperty(setup.propertyName, ojbt)
////        def visibility = Visibility.Public
////        def modifiers = Set.empty
////      }
////    , new TestJavaPropertySetterType {
////        def conceptName = valueConcept
////        def property = OcdJavaBoxTypeProperty(setup.propertyName, ojbt)
////        def visibility = Visibility.Public
////        def modifiers = Set.empty
////      }
////    , new TestJavaPropertyInValue {
////        def conceptName = valueConcept
////        def property = OcdJavaBoxTypeProperty(setup.propertyName, ojbt)
////        def visibility = Visibility.Public
////        def modifiers = Set.empty
////        def isDefault = true
////        def testID = "Default"
////        def testValue = ojbt.defaultValue
////      }
////    ) ++ ojbt.nonDefaultValues.zipWithIndex.map { case (ndv, index) =>
////      new TestJavaPropertyInValue {
////        def conceptName = valueConcept
////        def property = OcdJavaBoxTypeProperty(setup.propertyName, ojbt)
////        def visibility = Visibility.Public
////        def modifiers = Set.empty
////        def isDefault = false
////        def testID = "NonDefault" + (index + 1)
////        def testValue = ndv
////      }
//      )
//  }
//}
//
//object NestedValuesWithOnePropertyTestProject {
//  val setups = NestedValuesWithOnePropertySetup.setups
//
//  val projects =
//    (setups.groupBy(_.propertyType.typeNameSafe) map { case (tipe, typeSetups) =>
//    new ITestProject {
//      def projectPath = "values/value-boxed-" + tipe
//      def projectName = "OCD Value with Boxed Value Tests (" + tipe + ")"
//      val dslFiles = typeSetups.dslFiles
//      val testFiles = typeSetups.map(new NestedValuesWithOnePropertyTestProject(_)).testFiles
//    }
//  }) toSeq
//}
