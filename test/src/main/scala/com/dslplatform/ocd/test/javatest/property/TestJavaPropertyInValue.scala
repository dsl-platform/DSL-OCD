package com.dslplatform.ocd
package test
package javatest
package property

import types._
import javas._

trait TestJavaPropertyInValue
    extends test.TestComponent {

  def conceptName: String
  def property: OcdJavaProperty

  def testID: String
  def isDefault: Boolean
  def testValue: JavaValue
  def setupBlock: String = ""

  private def propertyName = property.name
  private def PropertyName = property.name.fciu

  private def defaultValue = property match {
    case p: OcdJavaBoxTypeProperty => p.boxType.defaultValue
    case _ => s"new ${property.javaType}()"
  }

  private def javaClass = property match {
    case p: OcdJavaBoxTypeProperty => p.boxType.javaClass
    case _ => property.javaType.toString
  }

  private def hasGenerics = property match {
    case p: OcdJavaBoxTypeProperty => p.boxType.hasGenerics
    case _ => javaClass.contains('<')
  }

  private def assertEquals(target: String) = property match {
    case p: OcdJavaBoxTypeProperty if isDefault && (p.boxType.defaultValue eq DisallowedNullValue) =>
      s"""// special null check for dissalowed null value in a non-nullable property
        org.junit.Assert.assertNull(${target}.get${PropertyName}());"""

    case p: OcdJavaBoxTypeProperty =>
      s"""com.dslplatform.ocd.javaasserts.${p.boxType.typeSingleName}Asserts.assert${p.box.boxName}Equals(
                testValue,
                ${target}.get${PropertyName}());"""

    case _ => ""
  }

  def testComponentBody = s"""
    /* Testing the "${propertyName}" ${testID} property value serialization */
    @org.junit.Test
    public void test${PropertyName}${testID}PropertyValueSerialization() throws java.io.IOException {${setupBlock}${isDefault match {
           case true => s"""
        final ${conceptName} domainValue =
                new ${conceptName}();
        final ${javaClass} testValue = domainValue.get${PropertyName}();"""

           case _ => s"""
        final ${javaClass} testValue = ${testValue};
        final ${conceptName} domainValue =
                new ${conceptName}()
                .set${PropertyName}(testValue);"""}}

        // check that the property was properly assigned
        ${assertEquals("domainValue")}

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(domainValue);
        final ${conceptName} domainValueDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(${conceptName}.class),
                serialized);

        // check that the property was properly deserialized
        ${assertEquals("domainValueDeserialized")}

        // values are checked internally by comparing hashcodes of all properties
        org.junit.Assert.assertEquals(domainValue.hashCode(), domainValueDeserialized.hashCode());

        // values are checked internally by comparing all properties for equality
        org.junit.Assert.assertEquals(domainValue, domainValueDeserialized);
    }
"""
}
