package com.dslplatform.ocd
package impl.mapping

object ScalaDecimalTypes {
  val types: Map[impl.DslDecimalStub, impl.ScalaDecimalStub] = Map(
    impl.`Decimal`        -> impl.`scala.Decimal`
  , impl.`Decimal?`       -> impl.`scala.Decimal?`
  , impl.`Decimal[]`      -> impl.`scala.Decimal[]`
  , impl.`Decimal?[]`     -> impl.`scala.Decimal?[]`
  , impl.`Decimal[]?`     -> impl.`scala.Decimal[]?`
  , impl.`Decimal?[]?`    -> impl.`scala.Decimal?[]?`
  , impl.`List<Decimal>`  -> impl.`scala.List<Decimal>`
  , impl.`List<Decimal?>` -> impl.`scala.List<Decimal?>`
  , impl.`List<Decimal>?` -> impl.`scala.List<Decimal>?`
  , impl.`List<Decimal?>?`-> impl.`scala.List<Decimal?>?`
  , impl.`Set<Decimal>`   -> impl.`scala.Set<Decimal>`
  , impl.`Set<Decimal?>`  -> impl.`scala.Set<Decimal?>`
  , impl.`Set<Decimal>?`  -> impl.`scala.Set<Decimal>?`
  , impl.`Set<Decimal?>?` -> impl.`scala.Set<Decimal?>?`
  )
}
