package com.dslplatform.ocd
package boxes

trait `box.NullableSetOfNullable`
    extends OcdBox {

  def boxName = "NullableSetOfNullable"

  def boxAliases = Set.empty
}

case object `box.NullableSetOfNullable` extends `box.NullableSetOfNullable`
