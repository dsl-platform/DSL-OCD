package com.dslplatform.ocd
package scalas

trait OcdScalaBoxType
    extends types.OcdType
    with boxes.OcdBox {

  val scalaClass: String
  val defaultValue: String
}

object OcdScalaBoxType
    extends OcdScalaBoxTypeValues
    with OcdScalaBoxTypeResolver
