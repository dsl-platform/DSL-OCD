package com.dslplatform.ocd.generators
package javas

import Types._
import Boxes._

object JavaXml
    extends JavaStub {

  val classReference = "org.w3c.dom.Element"

  val defaultSingle = "null"

  // FIXME
  val nonDefaultValues = Seq(
    "dinamo"
  , "hajduk"
  )
}
