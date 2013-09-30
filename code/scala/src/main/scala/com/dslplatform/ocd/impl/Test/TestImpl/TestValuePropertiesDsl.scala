package com.dslplatform.ocd

trait TestValuePropertiesDsl
    extends TestImpl
    with TestValuePropertiesType {

  def ModuleName: String
  def ValueName: String

  def valueProperties: Seq[DslPropertyStub]

  def dslTemplate =
    module (ModuleName) {
      value (ValueName) {
        valueProperties: _*
      }
    }
}
