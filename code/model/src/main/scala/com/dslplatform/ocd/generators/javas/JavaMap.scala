package com.dslplatform.ocd.generators
package javas

import Types._
import Boxes._

object JavaMap
    extends JavaStub {

  val classReference = "java.util.Map<String, String>"

  val defaultSingle = "new java.util.HashMap<String, String>(0)"

  override def defaultValue(box: Box) = box match {
    case Box(SingleType.One, Some((CollectionType.Array, _)), _*) =>
      "new java.util.HashMap[0]"

    case _ =>
      super.defaultValue(box)
  }

  // FIXME
  val nonDefaultValues = Seq(
    "dinamo"
  , "hajduk"
  )
}
