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
    isPublicTest +
    typeTest

  private def isPublicTest = s"""
    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
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
