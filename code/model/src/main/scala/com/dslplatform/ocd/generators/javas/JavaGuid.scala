package com.dslplatform.ocd.generators
package javas

import Types._
import Boxes._

object JavaGuid
    extends JavaStub {

  val classReference = "java.util.UUID"

  val defaultSingle: TestValue = "java.util.UUID.randomUUID()" ~ Unstable

  val nonDefaultValues: Seq[TestValue] = Seq(
    E"java.util.UUID.fromString(${"1-2-3-4-5"})"
  , "new java.util.UUID(0L, 0L)"
  )
}
