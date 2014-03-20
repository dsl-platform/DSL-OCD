package com.dslplatform.ocd.generators
package javas

import Types._
import Boxes._

object JavaBinary
    extends JavaStub {

  val classReference = "byte[]"

  val defaultSingle = "new byte[0]"

  override def defaultValue(box: Box) = box match {
    case Box(_, Some((CollectionType.Array, _)), _*) =>
      "new byte[0][]"

    case _ =>
      super.defaultValue(box)
  }

  val nonDefaultValues = Seq(
    "new byte[] { Byte.MIN_VALUE }"
  , "new byte[] { Byte.MIN_VALUE, 0 }"
  , "new byte[] { Byte.MIN_VALUE, 0, Byte.MAX_VALUE }"
  )
}
