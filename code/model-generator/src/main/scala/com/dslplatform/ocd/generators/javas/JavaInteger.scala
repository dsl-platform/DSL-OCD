package com.dslplatform.ocd.generators
package javas

import Types._
import Boxes._

object JavaInteger
    extends JavaStub {

  override val classPrimitive = Some("int")
  val classReference = "Integer"

  val defaultSingle = "0"
}
