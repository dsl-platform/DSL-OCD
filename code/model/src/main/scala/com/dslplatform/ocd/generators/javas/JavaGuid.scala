package com.dslplatform.ocd.generators
package javas

import Types._
import Boxes._

object JavaGuid
    extends JavaStub {

  val classReference = "java.util.UUID"

  val defaultSingle = "java.util.UUID.randomUUID()"

  //TODO:
  override val borderSingleValues = Seq (
        "dinamo"
      , "hajduk"
      )
}
