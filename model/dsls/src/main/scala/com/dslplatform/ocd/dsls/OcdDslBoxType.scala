package com.dslplatform.ocd
package dsls

trait OcdDslBoxType
    extends types.OcdType
    with boxes.OcdBox{

  val dslName = toString.substring(4) // "dsl."
}

object OcdDslBoxType
    extends OcdDslBoxTypeValues
    with OcdDslBoxTypeResolver
