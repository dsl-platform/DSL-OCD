package com.dslplatform.ocd
package test
package javatest
package property

import types._
import javas._

trait TestJavaCalculatedPropertyInSnowflake
    extends TestComponentWithProperty {

  def testID: String
  def isDefault: Boolean
  def testValue: JavaValue
  def setupBlock: String = ""

  def snowflakeName: String
  def aggregateClonePropertyName: String
  def AggregateClonePropertyName = aggregateClonePropertyName.fciu
  def snowflakeClonePropertyName: String
  def SnowflakeClonePropertyName = snowflakeClonePropertyName.fciu

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
    public void test${PropertyName}${testID}PropertyValueInSnowflakeAfterActiveRecordPersist() throws IOException {${setupBlock}${isDefault match {
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

        final ${snowflakeName} snowflake =
                ${snowflakeName}.find(aggregate.getURI());

        // check the snowflake aggregate property retrieved from the database
        ${assertEquals(s"snowflake.get${PropertyName}()")}

        // check the snowflake aggregate calculated property clone retrieved from the database
        ${assertEquals(s"snowflake.get${AggregateClonePropertyName}()")}

        // check the snowflake aggregate calculated property clone retrieved from the database
        ${assertEquals(s"snowflake.get${SnowflakeClonePropertyName}()")}
    }
"""

  def repositoryPersistTest = s"""
    /* Testing the "${propertyName}" ${testID} property value after repository persist */
    @org.junit.Test
    public void test${PropertyName}${testID}PropertyValueInSnowflakeAfterRepositoryPersist() throws IOException, InterruptedException, ExecutionException {${setupBlock}${isDefault match {
      case true => s"""
        final ${conceptName} aggregate =
                new ${conceptName}();
        final ${propertyType.javaClass} testValue = aggregate.get${PropertyName}();"""

      case _ => s"""
        final ${propertyType.javaClass} testValue = ${testValue};
        final ${conceptName} aggregate =
                new ${conceptName}()
                .set${PropertyName}(testValue);"""}}

        // persist via repository interface for collections
        final String uri = ${repositoryName}.insert(new ${conceptName}[] { aggregate }).get().get(0);

        final ${snowflakeName} snowflake =
                ${snowflakeName}.find(uri);

        // check the snowflake aggregate property retrieved from the database
        ${assertEquals(s"snowflake.get${PropertyName}()")}

        // check the snowflake aggregate calculated property clone retrieved from the database
        ${assertEquals(s"snowflake.get${AggregateClonePropertyName}()")}

        // check the snowflake aggregate calculated property clone retrieved from the database
        ${assertEquals(s"snowflake.get${SnowflakeClonePropertyName}()")}
    }
"""
}
