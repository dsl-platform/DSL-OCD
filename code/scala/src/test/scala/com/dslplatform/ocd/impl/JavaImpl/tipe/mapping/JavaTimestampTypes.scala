package com.dslplatform.ocd
package impl.mapping

object JavaTimestampTypes {
  val types: Map[impl.DslTimestampStub, impl.JavaTimestampStub] = Map(
    impl.`Timestamp`        -> impl.`java.Timestamp`
  , impl.`Timestamp?`       -> impl.`java.Timestamp?`
  , impl.`Timestamp[]`      -> impl.`java.Timestamp[]`
  , impl.`Timestamp?[]`     -> impl.`java.Timestamp?[]`
  , impl.`Timestamp[]?`     -> impl.`java.Timestamp[]?`
  , impl.`Timestamp?[]?`    -> impl.`java.Timestamp?[]?`
  , impl.`List<Timestamp>`  -> impl.`java.List<Timestamp>`
  , impl.`List<Timestamp?>` -> impl.`java.List<Timestamp?>`
  , impl.`List<Timestamp>?` -> impl.`java.List<Timestamp>?`
  , impl.`List<Timestamp?>?`-> impl.`java.List<Timestamp?>?`
  , impl.`Set<Timestamp>`   -> impl.`java.Set<Timestamp>`
  , impl.`Set<Timestamp?>`  -> impl.`java.Set<Timestamp?>`
  , impl.`Set<Timestamp>?`  -> impl.`java.Set<Timestamp>?`
  , impl.`Set<Timestamp?>?` -> impl.`java.Set<Timestamp?>?`
  )
}
