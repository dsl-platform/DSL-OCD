package com.dslplatform.ocd
package boxes

trait `box.OneListOfOne`
    extends OcdBox {

  def boxName = "OneListOfOne"

  def boxAliases = Set.empty
}

case object `box.OneListOfOne` extends `box.OneListOfOne`
