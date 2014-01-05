package com.dslplatform.ocd
package boxes

trait `box.OneSetOfOne`
    extends OcdBox {

  def boxName = "OneSetOfOne"

  def boxAliases = Set.empty
}

case object `box.OneSetOfOne` extends `box.OneSetOfOne`
