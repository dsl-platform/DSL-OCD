package com.dslplatform.ocd.generators
package javas

import Types._
import Boxes._

object JavaBinary
    extends JavaStub {

  val classReference = "byte[]"

  val defaultSingle: TestValue = "new byte[0]"

  override def defaultValue(box: Box) = box match {
    case Box(SingleType.One, Some((CollectionType.Array, _)), _*) =>
      "new byte[0][]"

    case _ =>
      super.defaultValue(box)
  }

  val nonDefaultValues: Seq[TestValue] = Seq(
    ArrayOfJavaValues("byte", Seq("Byte.MIN_VALUE"))
  , ArrayOfJavaValues("byte", Seq("Byte.MIN_VALUE", "0"))
  , ArrayOfJavaValues("byte", Seq("Byte.MIN_VALUE", "0", "Byte.MAX_VALUE"))
  )
}
