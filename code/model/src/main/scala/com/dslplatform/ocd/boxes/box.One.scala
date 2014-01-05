package com.dslplatform.ocd
package boxes

trait `box.One`
    extends OcdBox {

  def boxName = "One"

  def boxAliases = Set.empty
}

case object `box.One` extends `box.One`
