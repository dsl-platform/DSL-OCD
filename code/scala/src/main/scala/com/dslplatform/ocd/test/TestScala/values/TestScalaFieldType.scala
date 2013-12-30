package com.dslplatform.ocd
package test
package TestScala
package values

trait TestScalaFieldType
    extends TestComponentScala
    with types.TestFieldType {

  val testDesc = "Tests field type"

  val imports = Seq(
    "scala.reflect.runtime.universe._"
  )

  def scalaClass: String
  def fieldName: String
  def fieldClass: String

  def testComponentBody = s"""
  def `Check single property type via reflection: ${fieldClass}`() =
    checkType(
      typeOf[${fieldClass}]
    , typeOf[${scalaClass}].member("${fieldName}": TermName).asMethod.returnType
    )
"""
}
