package com.dslplatform.ocd.generators
package javas

import Types._
import Boxes._

object JavaDouble
    extends JavaStub {

  override val classPrimitive = Some("double")
  val classReference = "Double"

  val defaultSingle = "0.0"
}
