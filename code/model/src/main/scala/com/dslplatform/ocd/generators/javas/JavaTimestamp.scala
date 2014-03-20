package com.dslplatform.ocd.generators
package javas

import Types._
import Boxes._

object JavaTimestamp
    extends JavaStub {

  val classReference = "org.joda.time.DateTime"

  val defaultSingle = "org.joda.time.DateTime.now()"

  // FIXME
  val nonDefaultValues = Seq(
    "dinamo"
  , "hajduk"
  )
}
