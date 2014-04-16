package com.dslplatform.ocd
package test
package javatest
package property

import types._
import javas._

trait TestJavaPropertyInAggregate
    extends TestComponentWithProperty {

  def testID: String
  def isDefault: Boolean
  def testValue: JavaValue
  def setupBlock: String = ""

  def testComponentBody = (
    jsonSerializationTest
  + (!isDisallowed(isDefault)).ifTrue(activeRecordPersistTest)
  )

  private def assertEquals(target: String) = property match {
    case _ if isDisallowed(isDefault) =>
      s"""// special null check for dissalowed null value in a non-nullable property
        org.junit.Assert.assertNull(${target}.get${PropertyName}());"""

    case p: OcdJavaBoxTypeProperty =>
      s"""com.dslplatform.ocd.javaasserts.${p.boxType.typeSingleName}Asserts.assert${p.box.boxName}Equals(
                testValue,
                ${target}.get${PropertyName}());"""

    case _ => ???
  }

  def jsonSerializationTest = s"""
    /* Testing the "${propertyName}" ${testID} aggregate property JSON serialization */
    @org.junit.Test
    public void test${PropertyName}${testID}PropertyInAggregateJsonSerialization() throws java.io.IOException {${isDefault match {
           case true => s"""
        final ${conceptName} aggregate =
                new ${conceptName}();
        final ${propertyType.javaClass} testValue = aggregate.get${PropertyName}();"""

           case _ => s"""
        final ${propertyType.javaClass} testValue = ${testValue};
        final ${conceptName} aggregate =
                new ${conceptName}()
                .set${PropertyName}(testValue);"""}}

        // check that the property was properly assigned
        ${assertEquals("aggregate")}

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ${conceptName} aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(${conceptName}.class),
                serialized);

        // check that the property was properly deserialized
        ${assertEquals("aggregateDeserialized")}
    }
"""

  def activeRecordPersistTest = s"""
    /* Testing the "${propertyName}" ${testID} property value after active record persist */
    @org.junit.Test
    public void test${PropertyName}${testID}PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {${setupBlock}${isDefault match {
           case true => s"""
        final ${conceptName} aggregate =
                new ${conceptName}();
        final ${propertyType.javaClass} testValue = aggregate.get${PropertyName}();"""

           case _ => s"""
        final ${propertyType.javaClass} testValue = ${testValue};
        final ${conceptName} aggregate =
                new ${conceptName}()
                .set${PropertyName}(testValue);"""}}

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        ${assertEquals(s"aggregate.get${PropertyName}()")}

        final ${conceptName} aggregateFound =
                ${conceptName}.find(aggregate.getURI());

        final ${conceptName} aggregateFound =
                ${conceptName}.find(aggregate.getURI());

        // check the property retrieved from the database
        ${assertEquals("aggregateFound")}

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
"""
}
