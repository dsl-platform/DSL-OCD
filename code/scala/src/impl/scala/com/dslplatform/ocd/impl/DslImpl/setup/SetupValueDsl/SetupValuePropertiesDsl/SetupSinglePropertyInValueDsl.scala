package com.dslplatform.ocd
package impl
package dsl
package setup

import types._

trait SetupSinglePropertyInValueDsl
    extends SetupValuePropertiesDsl
    with SetupSinglePropertyInValueType {

  def ModuleName = PropertyName + "InValue"
  def ValueName = PropertyName + "Value"

  def propertyType: DslImpl
  def PropertyName = propertyType.boxDesc + propertyType.dslDesc
  def propertyName = PropertyName.fcil

  def property: DslPropertyStub = propertyType -> propertyName
  def valueProperties = Some(Seq(property))

  def setupDesc = "SetupSinglePropertyInValueDsl: " + PropertyName
}
