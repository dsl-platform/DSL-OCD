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

  private def propertyName = property.propertyName
  private def PropertyName = property.propertyName.fciu

  def testComponentBody = (property.propertyBoxKind match {
    case propertyType: OcdJavaBoxType =>
      new TestJavaBoxTypePropertyDefaultValue(propertyType)

    case x =>
      ???
  }).testComponentBody

  class TestJavaBoxTypePropertyDefaultValue(
      propertyType: OcdJavaBoxType
    ) extends TestComponent {

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
