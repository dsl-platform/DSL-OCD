package com.dslplatform.ocd
package boxes

trait `box.OneSetOfNullable`
    extends OcdBox {

  def boxName = "OneSetOfNullable"

  def boxAliases = Set.empty
}

case object `box.OneSetOfNullable` extends `box.OneSetOfNullable`
