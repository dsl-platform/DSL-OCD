package com.dslplatform.ocd
package dsls

trait OcdDsl
    extends types.OcdType
    with boxes.OcdBox{

  val dslName = toString.substring(4) // "dsl."
}

object OcdDsl
    extends OcdDslValues
    with OcdDslResolver
