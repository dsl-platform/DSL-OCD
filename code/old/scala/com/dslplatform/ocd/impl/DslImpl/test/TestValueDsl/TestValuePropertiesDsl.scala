package com.dslplatform.ocd
package impl
package dsl
package test

import types._

trait TestValuePropertiesDsl
    extends TestImplDsl
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
