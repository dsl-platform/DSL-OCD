package com.dslplatform.ocd.generators
package javas

import Types._
import Boxes._

object JavaBinary
    extends JavaStub {

  val classReference = "byte[]"

  val defaultSingle = "new byte[0]"

  override def defaultValue = (_: Box) match {
    case Box(_, Some((CollectionType.Array, _)), _*) =>
      "new byte[][0]"

    case b =>
      super.defaultValue(b)
  }
}
