package com.dslplatform.ocd.generators
package javas

import Types._
import Boxes._

object JavaBool
    extends JavaStub {

  override val classPrimitive = Some("boolean")
  val classReference = "Boolean"

  val defaultSingle = "false"
}
