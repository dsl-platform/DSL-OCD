package com.dslplatform.ocd
package impl.mapping

object ScalaMoneyTypes {
  val types: Map[impl.DslMoneyStub, impl.ScalaMoneyStub] = Map(
    impl.`Money`        -> impl.`scala.Money`
  , impl.`Money?`       -> impl.`scala.Money?`
  , impl.`Money[]`      -> impl.`scala.Money[]`
  , impl.`Money?[]`     -> impl.`scala.Money?[]`
  , impl.`Money[]?`     -> impl.`scala.Money[]?`
  , impl.`Money?[]?`    -> impl.`scala.Money?[]?`
  , impl.`List<Money>`  -> impl.`scala.List<Money>`
  , impl.`List<Money?>` -> impl.`scala.List<Money?>`
  , impl.`List<Money>?` -> impl.`scala.List<Money>?`
  , impl.`List<Money?>?`-> impl.`scala.List<Money?>?`
  , impl.`Set<Money>`   -> impl.`scala.Set<Money>`
  , impl.`Set<Money?>`  -> impl.`scala.Set<Money?>`
  , impl.`Set<Money>?`  -> impl.`scala.Set<Money>?`
  , impl.`Set<Money?>?` -> impl.`scala.Set<Money?>?`
  )
}
