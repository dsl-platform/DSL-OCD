package com.dslplatform.ocd
package boxes

trait `box.NullableSetOfOne`
    extends OcdBox {

  def boxName = "NullableSetOfOne"

  def boxAliases = Set.empty
}

case object `box.NullableSetOfOne` extends `box.NullableSetOfOne`
