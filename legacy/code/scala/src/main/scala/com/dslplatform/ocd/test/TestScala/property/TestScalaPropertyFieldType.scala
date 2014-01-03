package com.dslplatform.ocd
package test
package TestScala
package property

trait TestScalaPropertyFieldType
    extends TestComponentScala
    with types.TestPropertyFieldType {

  val testDesc = "Test property field type"

  val imports = Seq(
    "scala.reflect.runtime.universe._"
  )

  def scalaClass: String
  def fieldName: String
  def fieldClass: String

  def testComponentBody = s"""
  def `${testDesc}: ${fieldClass}`() =
    checkType(
      typeOf[${fieldClass}]
    , typeOf[${scalaClass}].member("${fieldName}": TermName).asMethod.returnType
    )
"""
}
