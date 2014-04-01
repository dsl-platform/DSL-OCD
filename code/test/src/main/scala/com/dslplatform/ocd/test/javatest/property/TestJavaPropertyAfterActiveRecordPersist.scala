package com.dslplatform.ocd
package test
package javatest
package property

import com.dslplatform.ocd.javas.OcdJava
import com.dslplatform.ocd.javas.JavaValue

trait TestJavaPropertyInAggregateAfterActiveRecordPersist
    extends test.TestComponent {

  def conceptName: String
  def propertyName: String
  def propertyType: OcdJava

  def testID: String
  def isDefault: Boolean
  def testValue: JavaValue

  private def PropertyName = propertyName.fciu

  def testComponentBody = s"""
    /* Testing the "${propertyName}" ${testID} property value after active record persist */
    @org.junit.Test
    public void test${PropertyName}${testID}PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
         final ${propertyType.javaClass} testValue = ${testValue};
         ${isDefault match {
           case true => s"""
         final ${conceptName} aggregate =
                 new ${conceptName}()
                 .persist();"""

           case _ => s"""
         final ${conceptName} aggregate =
                 new ${conceptName}()
                 .set${PropertyName}(testValue)
                 .persist();"""
         }}

         com.dslplatform.ocd.javaasserts.${propertyType.typeSingleName}Asserts.assert${propertyType.boxName}Equals(
                 testValue,
                 aggregate.get${PropertyName}());

         final ${conceptName} foundAggregate =
                 ${conceptName}.find(aggregate.getURI());

         // Aggregates are compared via URI equality
         org.junit.Assert.assertEquals(aggregate, foundAggregate);

         com.dslplatform.ocd.javaasserts.${propertyType.typeSingleName}Asserts.assert${propertyType.boxName}Equals(
                 testValue,
                 foundAggregate.get${PropertyName}());
    }
"""
}
