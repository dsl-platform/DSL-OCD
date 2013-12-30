package com.dslplatform.ocd
package impl.mapping

object JavaMoneyTypes {
  val types: Map[impl.DslMoneyStub, impl.JavaMoneyStub] = Map(
    impl.`Money`        -> impl.`java.Money`
  , impl.`Money?`       -> impl.`java.Money?`
  , impl.`Money[]`      -> impl.`java.Money[]`
  , impl.`Money?[]`     -> impl.`java.Money?[]`
  , impl.`Money[]?`     -> impl.`java.Money[]?`
  , impl.`Money?[]?`    -> impl.`java.Money?[]?`
  , impl.`List<Money>`  -> impl.`java.List<Money>`
  , impl.`List<Money?>` -> impl.`java.List<Money?>`
  , impl.`List<Money>?` -> impl.`java.List<Money>?`
  , impl.`List<Money?>?`-> impl.`java.List<Money?>?`
  , impl.`Set<Money>`   -> impl.`java.Set<Money>`
  , impl.`Set<Money?>`  -> impl.`java.Set<Money?>`
  , impl.`Set<Money>?`  -> impl.`java.Set<Money>?`
  , impl.`Set<Money?>?` -> impl.`java.Set<Money?>?`
  )
}
