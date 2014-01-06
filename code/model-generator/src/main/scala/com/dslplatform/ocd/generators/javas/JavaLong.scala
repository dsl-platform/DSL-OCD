package com.dslplatform.ocd.generators
package javas

import Types._
import Boxes._

object JavaLong
    extends JavaStub {

  override val classPrimitive = Some("long")
  val classReference = "Long"

  val defaultSingle = "0L"
}
