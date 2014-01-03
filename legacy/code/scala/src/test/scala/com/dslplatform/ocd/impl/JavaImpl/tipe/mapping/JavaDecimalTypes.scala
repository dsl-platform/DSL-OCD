package com.dslplatform.ocd
package impl.mapping

object JavaDecimalTypes {
  val types: Map[impl.DslDecimalStub, impl.JavaDecimalStub] = Map(
    impl.`Decimal`        -> impl.`java.Decimal`
  , impl.`Decimal?`       -> impl.`java.Decimal?`
  , impl.`Decimal[]`      -> impl.`java.Decimal[]`
  , impl.`Decimal?[]`     -> impl.`java.Decimal?[]`
  , impl.`Decimal[]?`     -> impl.`java.Decimal[]?`
  , impl.`Decimal?[]?`    -> impl.`java.Decimal?[]?`
  , impl.`List<Decimal>`  -> impl.`java.List<Decimal>`
  , impl.`List<Decimal?>` -> impl.`java.List<Decimal?>`
  , impl.`List<Decimal>?` -> impl.`java.List<Decimal>?`
  , impl.`List<Decimal?>?`-> impl.`java.List<Decimal?>?`
  , impl.`Set<Decimal>`   -> impl.`java.Set<Decimal>`
  , impl.`Set<Decimal?>`  -> impl.`java.Set<Decimal?>`
  , impl.`Set<Decimal>?`  -> impl.`java.Set<Decimal>?`
  , impl.`Set<Decimal?>?` -> impl.`java.Set<Decimal?>?`
  )
}
