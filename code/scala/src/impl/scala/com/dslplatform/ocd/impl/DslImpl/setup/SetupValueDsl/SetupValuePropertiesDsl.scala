package com.dslplatform.ocd
package impl
package dsl
package setup

import types._

trait SetupValuePropertiesDsl
    extends SetupDsl
    with SetupValuePropertiesType {

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
