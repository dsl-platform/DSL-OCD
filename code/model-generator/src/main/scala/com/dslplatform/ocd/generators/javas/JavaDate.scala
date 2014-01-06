package com.dslplatform.ocd.generators
package javas

import Types._
import Boxes._

object JavaDate
    extends JavaStub {

  val classReference = "org.joda.time.LocalDate"

  val defaultSingle = "org.joda.time.LocalDate.now()"
}
