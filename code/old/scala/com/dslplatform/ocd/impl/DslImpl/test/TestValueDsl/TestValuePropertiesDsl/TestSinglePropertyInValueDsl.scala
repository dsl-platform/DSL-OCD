package com.dslplatform.ocd
package impl
package dsl
package test

import types._

trait TestSinglePropertyInValueDsl
    extends TestValuePropertiesDsl
    with TestSinglePropertyInValueType {

  def ModuleName = propertyName + "InValue"
  def ValueName = propertyName + "Value"

  def propertyType: DslImpl
  def propertyName = propertyType.boxDesc + propertyType.dslDesc

  def property = propertyType -> propertyName.fcil
  def valueProperties = Seq(property)
}
