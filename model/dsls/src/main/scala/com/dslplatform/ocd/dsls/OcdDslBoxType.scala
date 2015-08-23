package com.dslplatform.ocd
package dsls

trait OcdDslBoxType
    extends types.OcdType
    with boxes.OcdBox {

  def dslName = toString substring 4 // "dsl."
  def dslDesc = boxName + (if (isCollection) typePluralName else typeSingleName)
  def dslDescShort = boxNameShort + typeNameShort
}

object OcdDslBoxType
    extends OcdDslBoxTypeValues
    with OcdDslBoxTypeResolver
