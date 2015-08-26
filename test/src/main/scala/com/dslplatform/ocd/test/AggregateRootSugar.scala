package com.dslplatform.ocd
package test

import types._

sealed abstract class AggregateRootSugar(val sugarDsl: String, val surrogateKeyType: OcdType, val shortName: String)
object AggregateRootSugar {
  case object StandardAggregate extends AggregateRootSugar("aggregate", `type.Integer`, "SA")
  case object BigAggregate extends AggregateRootSugar("big aggregate root", `type.Long`, "BA")
  case object GuidAggregate extends AggregateRootSugar("guid root", `type.Guid`, "GA")
  val values: IndexedSeq[AggregateRootSugar] = IndexedSeq(StandardAggregate, BigAggregate, GuidAggregate)
}
