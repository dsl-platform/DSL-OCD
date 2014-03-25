package com.dslplatform.ocd
package test
package javatest
package property

import com.dslplatform.ocd.javas.OcdJava

trait TestJavaPropertyCrudPersist
    extends test.TestComponent {

  def conceptName: String
  def propertyName: String
  def propertyType: OcdJava

  private def PropertyName = propertyName.fciu

  def testComponentBody = s"""
    /* Testing the "${propertyName}" property value after CRUD persist */
    @org.junit.Test
    public void test${PropertyName}PropertyValueAfterCRUDPersist() throws java.io.IOException {
         final ${propertyType.javaClass}[] testValues = new ${propertyType.javaClass}[] ${propertyType.borderValues.mkString(
             "{\n            ",
             ",\n            ",
             "\n        }")};

         for (final ${propertyType.javaClass} testValue : testValues) {
            new ${conceptName}()
              .set${PropertyName}(testValue)
              .persist()
              .get${PropertyName}().equals(testValue);
         }
    }
"""
}
