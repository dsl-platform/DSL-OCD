package com.dslplatform.ocd

trait TestSinglePropertyInValueDsl
    extends TestValuePropertiesDsl
    with TestSinglePropertyInValueType {

  def ModuleName = propertyName + "InValue"
  def ValueName = propertyName + "Value"

  def propertyType: DslTypeImplStub
  def propertyName = propertyType.boxType + propertyType.dslType

  def property = propertyType -> propertyName.fcil
  def valueProperties = Seq(property)
}
