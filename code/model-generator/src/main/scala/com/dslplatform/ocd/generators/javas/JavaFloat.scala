package com.dslplatform.ocd.generators
package javas

import Types._
import Boxes._

object JavaFloat
    extends JavaStub {

  override val classPrimitive = Some("float")
  val classReference = "Float"

  val defaultSingle = "0.0f"
}
