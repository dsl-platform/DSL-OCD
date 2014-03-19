package com.dslplatform.ocd.generators
package javas

import Types._
import Boxes._

object JavaXml
    extends JavaStub {

  val classReference = "org.w3c.dom.Element"

  val defaultSingle = "null"

  //TODO:
  override val borderSingleValues = Seq(
        "dinamo"
      , "hajduk"
      )
}
