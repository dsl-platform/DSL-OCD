package com.dslplatform.ocd
package test
package javatest
package property

import types._
import javas._

trait TestJavaCalculatedPropertyInAggregate
    extends TestComponentWithProperty {

  def testID: String
  def isDefault: Boolean
  def testValue: JavaValue
  def setupBlock: String = ""

  def clonePropertyName: String
  val ClonePropertyName = clonePropertyName.fciu

  def repositoryName: String

  def testComponentBody = (
    (!isDisallowed(isDefault)).ifTrue(activeRecordPersistTest)
  + (!isDisallowed(isDefault)).ifTrue(repositoryPersistTest)
  )

  private def assertEquals(target: String) = property match {
    case _ if isDisallowed(isDefault) =>
      s"""// special null check for disallowed null value in a non-nullable property
        org.junit.Assert.assertNull(${target});"""

    case p: OcdJavaBoxTypeProperty if p.boxType.isPrecise =>
      s"""com.dslplatform.ocd.javaasserts.${p.boxType.typeSingleName}Asserts.assert${p.box.boxName}Equals(
                testValue,
                ${target},
                2);"""

    case p: OcdJavaBoxTypeProperty =>
      s"""com.dslplatform.ocd.javaasserts.${p.boxType.typeSingleName}Asserts.assert${p.box.boxName}Equals(
                testValue,
                ${target});"""

    case _ => ???
  }

  def activeRecordPersistTest = s"""
    /* Testing the "${propertyName}" ${testID} property value after active record persist */
    @org.junit.Test
    public void test${PropertyName}${testID}PropertyValueInAggregateAfterActiveRecordPersist() throws IOException {${setupBlock}${isDefault match {
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
        aggregate.create();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        ${assertEquals(s"aggregate.get${PropertyName}()")}

        // check the calculated property clone
        ${assertEquals(s"aggregate.get${ClonePropertyName}()")}

        final ${conceptName} aggregateFound =
                ${conceptName}.find(aggregate.getURI());

        // check the property retrieved from the database
        ${assertEquals(s"aggregateFound.get${PropertyName}()")}

        // ditto for the calculated property clone
        ${assertEquals(s"aggregateFound.get${ClonePropertyName}()")}

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
        final ${conceptName} aggregate =
                new ${conceptName}();
        final ${propertyType.javaClass} testValue = aggregate.get${PropertyName}();"""

           case _ => s"""
        final ${propertyType.javaClass} testValue = ${testValue};
        final ${conceptName} aggregate =
                new ${conceptName}()
                .set${PropertyName}(testValue);"""}}

        // persist via repository
        final String uri = ${repositoryName}.insert(new ${conceptName}[] { aggregate }).get().get(0);

        final ${conceptName} aggregateFound =
                ${repositoryName}.find(uri).get();

        // check the property retrieved from the database
        ${assertEquals(s"aggregateFound.get${PropertyName}()")}

        // ditto for the calculated property clone
        ${assertEquals(s"aggregateFound.get${ClonePropertyName}()")}
    }
"""
}
