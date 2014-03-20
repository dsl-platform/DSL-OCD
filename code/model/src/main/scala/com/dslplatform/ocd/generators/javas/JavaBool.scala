package com.dslplatform.ocd.generators
package javas

import Types._
import Boxes._

object JavaBool
    extends JavaStub {

  override val classPrimitive = Some("boolean")
  val classReference = "Boolean"

  val defaultSingle = "false"

  override val borderSingleValues = Seq(
          defaultSingle
        , "Boolean.FALSE"
        , "Boolean.TRUE"
      )
}
