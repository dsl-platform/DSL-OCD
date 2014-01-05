package com.dslplatform.ocd
package boxes

trait `box.Nullable`
    extends OcdBox {

  def boxName = "Nullable"

  def boxAliases = Set.empty
}

case object `box.Nullable` extends `box.Nullable`
