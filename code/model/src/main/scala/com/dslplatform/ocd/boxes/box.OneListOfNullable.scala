package com.dslplatform.ocd
package boxes

trait `box.OneListOfNullable`
    extends OcdBox {

  def boxName = "OneListOfNullable"

  def boxAliases = Set.empty
}

case object `box.OneListOfNullable` extends `box.OneListOfNullable`
