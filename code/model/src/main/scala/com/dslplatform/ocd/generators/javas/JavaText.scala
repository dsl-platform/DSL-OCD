package com.dslplatform.ocd.generators
package javas

import Types._
import Boxes._

object JavaText
    extends JavaStub {

  val classReference = "String"

  //val defaultSingle = "\\\"\\\""
  val defaultSingle = "new java.lang.String()"

  //TODO:
  override val borderSingleValues = Seq(
        defaultSingle
      , "abc"
      , "\\\t"
      , "\\\b"
      , "\\\n"
      , "\\\r"
      , "\\\f"
      , "\\\'"
      , "\\\""
      , "\\\\"
      )
}
