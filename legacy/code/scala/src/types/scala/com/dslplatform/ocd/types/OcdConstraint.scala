package com.dslplatform.ocd
package types

trait OcdConstraint
    extends OcdType {

  def constraintDesc: String
  def tipeDesc = constraintDesc
}
