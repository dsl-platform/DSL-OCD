package com.dslplatform.ocd.generators
package javas

import Types._
import Boxes._

object JavaTimestamp
    extends JavaStub {

  val classReference = "org.joda.time.DateTime"

  val defaultSingle = "org.joda.time.DateTime.now()"

  val nonDefaultValues = Seq(
    "new org.joda.time.DateTime(0)"                         // Epoch 1970
  , "new org.joda.time.DateTime(1, 1, 1, 1, 1)"             // 01-01-01 01:01
  , "new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L)" // beyond UNIX epoch (>2038)
  )
}
