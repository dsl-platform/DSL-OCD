package com.dslplatform.ocd
package impl
package dsl
package setup

import types._

trait SetupSinglePropertyInValueDsl
    extends SetupValuePropertiesDsl
    with SetupSinglePropertyInValueType {

  def ModuleName = propertyName + "InValue"
  def ValueName = propertyName + "Value"

  def propertyType: DslImpl
  def propertyName = propertyType.boxDesc + propertyType.dslDesc

  def property: DslProperty// = propertyType -> propertyName.fcil
  def valueProperties = Seq(property)
}
