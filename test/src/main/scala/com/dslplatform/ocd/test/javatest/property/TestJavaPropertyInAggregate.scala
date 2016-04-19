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
  def repositoryName: String

  def testComponentBody = (
    jsonSerializationTest
  + (!isDisallowed(isDefault)).ifTrue(activeRecordPersistTest)
  + (!isDisallowed(isDefault)).ifTrue(repositoryPersistTest)
  )

  private def assertEquals(target: String) = property match {
    case _ if isDisallowed(isDefault) =>
      s"""// special null check for disallowed null value in a non-nullable property
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

  def jsonSerializationTest = s"""
    /* Testing the "${propertyName}" ${testID} aggregate property JSON serialization */
    @org.junit.Test
    public void test${PropertyName}${testID}PropertyInAggregateJsonSerialization() throws IOException {${isDefault match {
           case true => s"""
        final ${conceptName} aggregate = new ${conceptName}();
        final ${propertyType.javaClass} testValue = aggregate.get${PropertyName}();"""

           case _ => s"""
        final ${propertyType.javaClass} testValue = ${testValue};
        final ${conceptName} aggregate = new ${conceptName}()
                .set${PropertyName}(testValue);"""}}

        // check that the property was properly assigned
        ${assertEquals("aggregate")}

        logger.trace("Serializing ${conceptName}: {}", aggregate);
        final com.dslplatform.patterns.Bytes serialized = jsonSerialization.serialize(aggregate);
        logger.debug("Serialized ${conceptName}: {}", serialized.toUtf8());

        final ${conceptName} aggregateDeserialized = jsonSerialization.deserialize(
                ${conceptName}.class,
                serialized.content,
                serialized.length);
        logger.trace("Deserialized ${conceptName}: {}", aggregateDeserialized);

        // check that the property was properly deserialized
        ${assertEquals("aggregateDeserialized")}
    }
"""

  def activeRecordPersistTest = s"""
    /* Testing the "${propertyName}" ${testID} property value after active record persist */
    @org.junit.Test
    public void test${PropertyName}${testID}PropertyValueInAggregateAfterActiveRecordPersist() throws IOException {${setupBlock}${isDefault match {
           case true => s"""
        final ${conceptName} aggregate = new ${conceptName}();
        final ${propertyType.javaClass} testValue = aggregate.get${PropertyName}();"""

           case _ => s"""
        final ${propertyType.javaClass} testValue = ${testValue};
        final ${conceptName} aggregate = new ${conceptName}()
                .set${PropertyName}(testValue);"""}}

        // persist via active record pattern
        aggregate.create();

        // check that the property retrieved from revenj (create will mutate the aggregate)
        ${assertEquals(s"aggregate")}

        final ${conceptName} aggregateFound = ${conceptName}.find(aggregate.getURI());
        // check the property retrieved from the database
        ${assertEquals("aggregateFound")}

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        com.dslplatform.ocd.test.FancyAsserts.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        com.dslplatform.ocd.test.FancyAsserts.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
"""

  def repositoryPersistTest = s"""
    /* Testing the "${propertyName}" ${testID} property value after repository persist */
    @org.junit.Test
    public void test${PropertyName}${testID}PropertyValueInAggregateAfterRepositoryPersist() throws IOException, InterruptedException, ExecutionException {${setupBlock}${isDefault match {
           case true => s"""
        final ${conceptName} aggregate = new ${conceptName}();
        final ${propertyType.javaClass} testValue = aggregate.get${PropertyName}();"""

           case _ => s"""
        final ${propertyType.javaClass} testValue = ${testValue};
        final ${conceptName} aggregate = new ${conceptName}()
                .set${PropertyName}(testValue);"""}}

        // persist via active record pattern
        final String uri = ${repositoryName}.insert(new ${conceptName}[] { aggregate }).get().get(0);

        final ${conceptName} aggregateFound = ${repositoryName}.find(uri).get();

        // compare URIs
        com.dslplatform.ocd.test.FancyAsserts.assertEquals(uri, aggregateFound.getURI());

        // check the property retrieved from the database
        ${assertEquals("aggregateFound")}
    }
"""
}
