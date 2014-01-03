package com.dslplatform.ocd
package impl
package dsl
package setup

import types._

trait SetupZeroPropertiesInValueDsl
    extends SetupValuePropertiesDsl
    with SetupZeroPropertiesInValueType {

  def ModuleName = "ZeroPropertiesInValue"
  def ValueName = "ZeroPropertiesValue"

  def valueProperties = None

  def setupDesc = "SetupZeroPropertiesInValueDsl"
}
