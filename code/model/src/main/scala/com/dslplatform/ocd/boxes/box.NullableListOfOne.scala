package com.dslplatform.ocd
package boxes

trait `box.NullableListOfOne`
    extends OcdBox {

  def boxName = "NullableListOfOne"

  def boxAliases = Set.empty
}

case object `box.NullableListOfOne` extends `box.NullableListOfOne`
