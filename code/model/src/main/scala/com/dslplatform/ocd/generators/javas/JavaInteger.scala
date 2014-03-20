package com.dslplatform.ocd.generators
package javas

import Types._
import Boxes._

object JavaInteger
    extends JavaStub {

  override val classPrimitive = Some("int")
  val classReference = "Integer"

  val defaultSingle = "0"

  override val borderSingleValues = Seq(
        defaultSingle
      , "java.lang.Integer.MIN_VALUE"
      , "java.lang.Integer.MAX_VALUE"
      )

}
