package com.dslplatform.ocd
package `test.scalas`
package property

import scalas._

trait TestScalaPropertyFieldType
    extends test.TestComponent {

  def conceptName: String
  def propertyName: String
  def propertyType: OcdScala

  def testComponentBody =
    nonPublicTest +
    typeTest

  private def nonPublicTest = s"""
    /* Testing the property field public access via reflection (no instantiation) */
    def `Test property field access`() =
      lock(
        typeOf[${conceptName}]
          .member("${propertyName}": TermName)
          .asMethod.isPublic
      ) === true
"""

  private def typeTest = s"""
    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[${propertyType.scalaClass}]
      , typeOf[${conceptName}]
          .member("${propertyName}": TermName)
          .asMethod.returnType
      )
"""
}
