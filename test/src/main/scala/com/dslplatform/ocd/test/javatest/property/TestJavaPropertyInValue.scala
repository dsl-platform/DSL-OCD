package com.dslplatform.ocd
package test
package javatest
package property

import types._
import javas._
import boxes._

trait TestJavaPropertyInValue
    extends TestComponentWithProperty {

  def testID: String
  def isDefault: Boolean
  def testValue: JavaValue
  def setupBlock: String = ""

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
        final ${conceptName} domainValue = new ${conceptName}();
        final ${javaClass} testValue = domainValue.get${PropertyName}();"""

           case _ => s"""
        final ${javaClass} testValue = ${testValue};
        final ${conceptName} domainValue = new ${conceptName}()
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
${property.box.collectionFamily match {
          case Some(CollectionFamily.Set) =>
            val arrayList = javaClass.replace("Set", "ArrayList")
            val linkedHashSet = javaClass.replace("Set", "LinkedHashSet")

            s"""
        ${property.box.isNullable.ifTrue(
                s"if (domainValueDeserialized.get${PropertyName}() != null) ")}{
            // shuffle the set to check equality properly
            final ${arrayList} deserializedTestValues =
                    new ${arrayList}(domainValueDeserialized.get${PropertyName}());

            final long shuffleSeed = new java.util.Random().nextLong();
            final java.util.Random shuffleRandom = new java.util.Random(shuffleSeed);

            java.util.Collections.shuffle(deserializedTestValues, shuffleRandom);
            domainValueDeserialized.set${PropertyName}(
                    new ${linkedHashSet}(deserializedTestValues));
            logger.trace("Shuffled the set (#" + shuffleSeed + ") in ${conceptName}: {}", deserializedTestValues);
        }

        // check equality after shuffling
        ${assertEquals("domainValueDeserialized")}
"""
          case _ => ""
        }}
        ${assertEqualHashCodes}

        ${assertEqualValues}
    }
"""
}
