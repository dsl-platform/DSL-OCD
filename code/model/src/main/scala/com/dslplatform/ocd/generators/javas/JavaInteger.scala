package com.dslplatform.ocd.generators
package javas

import Types._
import Boxes._

object JavaInteger
    extends JavaStub {

  override val classPrimitive = Some("int")
  val classReference = "Integer"

  val defaultSingle = "0"

  val nonDefaultValues = Seq(
    "Integer.MIN_VALUE"
  , "Integer.MAX_VALUE"
  , "1000000000"
  )
}
