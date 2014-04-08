package com.dslplatform.ocd
package scalas

trait OcdScala
    extends types.OcdType
    with boxes.OcdBox {

  val scalaClass: String
  val defaultValue: String
}
