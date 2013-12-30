package com.dslplatform.ocd
package impl.mapping

object ScalaTimestampTypes {
  val types: Map[impl.DslTimestampStub, impl.ScalaTimestampStub] = Map(
    impl.`Timestamp`        -> impl.`scala.Timestamp`
  , impl.`Timestamp?`       -> impl.`scala.Timestamp?`
  , impl.`Timestamp[]`      -> impl.`scala.Timestamp[]`
  , impl.`Timestamp?[]`     -> impl.`scala.Timestamp?[]`
  , impl.`Timestamp[]?`     -> impl.`scala.Timestamp[]?`
  , impl.`Timestamp?[]?`    -> impl.`scala.Timestamp?[]?`
  , impl.`List<Timestamp>`  -> impl.`scala.List<Timestamp>`
  , impl.`List<Timestamp?>` -> impl.`scala.List<Timestamp?>`
  , impl.`List<Timestamp>?` -> impl.`scala.List<Timestamp>?`
  , impl.`List<Timestamp?>?`-> impl.`scala.List<Timestamp?>?`
  , impl.`Set<Timestamp>`   -> impl.`scala.Set<Timestamp>`
  , impl.`Set<Timestamp?>`  -> impl.`scala.Set<Timestamp?>`
  , impl.`Set<Timestamp>?`  -> impl.`scala.Set<Timestamp>?`
  , impl.`Set<Timestamp?>?` -> impl.`scala.Set<Timestamp?>?`
  )
}
