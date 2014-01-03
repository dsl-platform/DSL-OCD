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

  def valueProperties: Option[Seq[DslPropertyStub]]

  def dslTemplate =
    valueProperties match {
      case Some(vp) =>

        module (ModuleName) {
          value (ValueName) {
            vp: _*
          }
        }

      case _ =>

        module (ModuleName) {
          value (ValueName);
        }

  }
}
