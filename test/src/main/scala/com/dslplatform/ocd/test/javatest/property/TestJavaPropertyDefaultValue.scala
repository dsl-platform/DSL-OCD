package com.dslplatform.ocd
package test
package javatest
package property

import javas._
import types._

trait TestJavaPropertyDefaultValue
    extends TestComponent {

  def conceptName: String
  def property: OcdJavaProperty

  private def propertyName = property.name
  private def PropertyName = property.name.fciu

  def testComponentBody = (property match {
    case ojbtp: OcdJavaBoxTypeProperty =>
      new TestJavaBoxTypePropertyDefaultValue(ojbtp)

    case x =>
      ???
  }).testComponentBody

  class TestJavaBoxTypePropertyDefaultValue(
      property: OcdJavaBoxTypeProperty
    ) extends TestComponent {

    private val propertyType = property.boxType

    def testComponentBody = s"""
    /* Testing the "${propertyName}" property field default value */
    @org.junit.Test
    public void test${PropertyName}PropertyFieldDefaultValue() {
        ${propertyType.defaultValue match {
          case dv if dv.stability.isStable => s"""
        com.dslplatform.ocd.javaasserts.${propertyType.typeSingleName}Asserts.assert${propertyType.boxName}Equals(
                ${propertyType.defaultValue},
                new ${conceptName}().get${PropertyName}());"""

          case dv if dv.isNull => s"""
        org.junit.Assert.assertNull(new ${conceptName}().get${PropertyName}());"""

          case _ => s"""
        org.junit.Assert.assertNotNull(new ${conceptName}().get${PropertyName}());"""
        }}
    }
"""
  }
}
