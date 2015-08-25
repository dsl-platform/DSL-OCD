package com.dslplatform.ocd
package test
package javatest
package property

import types._
import javas._

trait TestJavaPropertyInValue
    extends TestComponentWithProperty {

  def testID: String
  def isDefault: Boolean
  def testValue: JavaValue
  def setupBlock: String = ""

  private def assertEquals(target: String) = property match {
    case _ if isDisallowed(isDefault) =>
      s"""// special null check for dissalowed null value in a non-nullable property
        org.junit.Assert.assertNull(${target}.get${PropertyName}());"""

    case p: OcdJavaBoxTypeProperty if p.boxType.isPrecise =>
      s"""com.dslplatform.ocd.javaasserts.${p.boxType.typeSingleName}Asserts.assert${p.box.boxName}Equals(
                testValue,
                ${target}.get${PropertyName}(),
                2);"""

    case p: OcdJavaBoxTypeProperty =>
      s"""com.dslplatform.ocd.javaasserts.${p.boxType.typeSingleName}Asserts.assert${p.box.boxName}Equals(
                testValue,
                ${target}.get${PropertyName}());"""

    case _ => ???
  }

  private def assertEqualHashCodes = (property match {
    case p: OcdJavaBoxTypeProperty if !p.boxType.isEqualable =>
      s"""// cannot compare hashCode equality since domainValue contains property
        // of type ${p.boxType.javaClass} which does not have a "stable" hashCode
        // """
    case _ => """// values are checked internally by comparing hashcodes of all properties
        """
  }) + "org.junit.Assert.assertEquals(domainValue.hashCode(), domainValueDeserialized.hashCode());"

  private def assertEqualValues = (property match {
    case p: OcdJavaBoxTypeProperty if !p.boxType.isEqualable =>
      s"""// cannot compare for value equality since domainValue contains property
        // of type ${p.boxType.javaClass} which is not equalable
        // """
    case _ => """// values are checked internally by comparing all properties for equality
        """
  }) + "org.junit.Assert.assertEquals(domainValue, domainValueDeserialized);"

  def testComponentBody = s"""
    /* Testing the "${propertyName}" ${testID} value property JSON serialization */
    @org.junit.Test
    public void test${PropertyName}${testID}PropertyValueJsonSerialization() throws IOException {${setupBlock}${isDefault match {
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

        logger.trace("Serializing ${conceptName}: {}", domainValue);
        final com.dslplatform.patterns.Bytes serialized = jsonSerialization.serialize(domainValue);
        logger.debug("Serialized ${conceptName}: {}", serialized.toUtf8());

        final ${conceptName} domainValueDeserialized = jsonSerialization.deserialize(
                ${conceptName}.class,
                serialized.content,
                serialized.length);
        logger.trace("Deserialized ${conceptName}: {}", domainValueDeserialized);

        // check that the property was properly deserialized
        ${assertEquals("domainValueDeserialized")}

        ${assertEqualHashCodes}

        ${assertEqualValues}
    }
"""
}
