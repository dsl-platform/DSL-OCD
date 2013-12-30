package com.dslplatform.ocd
package impl.mapping

object JavaDateTypes {
  val types: Map[impl.DslDateStub, impl.JavaDateStub] = Map(
    impl.`Date`        -> impl.`java.Date`
  , impl.`Date?`       -> impl.`java.Date?`
  , impl.`Date[]`      -> impl.`java.Date[]`
  , impl.`Date?[]`     -> impl.`java.Date?[]`
  , impl.`Date[]?`     -> impl.`java.Date[]?`
  , impl.`Date?[]?`    -> impl.`java.Date?[]?`
  , impl.`List<Date>`  -> impl.`java.List<Date>`
  , impl.`List<Date?>` -> impl.`java.List<Date?>`
  , impl.`List<Date>?` -> impl.`java.List<Date>?`
  , impl.`List<Date?>?`-> impl.`java.List<Date?>?`
  , impl.`Set<Date>`   -> impl.`java.Set<Date>`
  , impl.`Set<Date?>`  -> impl.`java.Set<Date?>`
  , impl.`Set<Date>?`  -> impl.`java.Set<Date>?`
  , impl.`Set<Date?>?` -> impl.`java.Set<Date?>?`
  )
}
