package com.dslplatform.ocd.generators
package javas

import Types._
import Boxes._

object JavaDate
    extends JavaStub {

  val classReference = "org.joda.time.LocalDate"

  val defaultSingle = "org.joda.time.LocalDate.now()"

  val nonDefaultValues = Seq(
    "new org.joda.time.LocalDate(-1, 1, 1)"                  // -01-01-01
  , "new org.joda.time.LocalDate(0)"                         // 1970
  , "new org.joda.time.LocalDate(Integer.MAX_VALUE * 1001L)" // beyond UNIX epoch (>2038)
  )
}
