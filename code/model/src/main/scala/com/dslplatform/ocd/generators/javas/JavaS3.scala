package com.dslplatform.ocd.generators
package javas

import Types._
import Boxes._

object JavaS3
    extends JavaStub {

  val classReference = "com.dslplatform.storage.S3"

  val defaultSingle = "null"

    //TODO:
  override val borderSingleValues = Seq(
        "dinamo"
      , "hajduk"
      )
}
