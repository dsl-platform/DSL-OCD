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
    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[${conceptName}].member("${propertyName}": TermName).asMethod.isPublic
      )
"""

  private def typeTest = s"""
    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[${propertyType}]
      , typeOf[${conceptName}].member("${propertyName}": TermName).asMethod.returnType
      )
"""
}
