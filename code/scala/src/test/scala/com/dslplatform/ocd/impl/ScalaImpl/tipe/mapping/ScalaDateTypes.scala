package com.dslplatform.ocd
package impl.mapping

object ScalaDateTypes {
  val types: Map[impl.DslDateStub, impl.ScalaDateStub] = Map(
    impl.`Date`        -> impl.`scala.Date`
  , impl.`Date?`       -> impl.`scala.Date?`
  , impl.`Date[]`      -> impl.`scala.Date[]`
  , impl.`Date?[]`     -> impl.`scala.Date?[]`
  , impl.`Date[]?`     -> impl.`scala.Date[]?`
  , impl.`Date?[]?`    -> impl.`scala.Date?[]?`
  , impl.`List<Date>`  -> impl.`scala.List<Date>`
  , impl.`List<Date?>` -> impl.`scala.List<Date?>`
  , impl.`List<Date>?` -> impl.`scala.List<Date>?`
  , impl.`List<Date?>?`-> impl.`scala.List<Date?>?`
  , impl.`Set<Date>`   -> impl.`scala.Set<Date>`
  , impl.`Set<Date?>`  -> impl.`scala.Set<Date?>`
  , impl.`Set<Date>?`  -> impl.`scala.Set<Date>?`
  , impl.`Set<Date?>?` -> impl.`scala.Set<Date?>?`
  )
}
