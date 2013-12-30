package com.dslplatform.ocd
package impl.mapping

object ScalaIntTypes {
  val types: Map[impl.DslIntStub, impl.ScalaIntStub] = Map(
    impl.`Int`        -> impl.`scala.Int`
  , impl.`Int?`       -> impl.`scala.Int?`
  , impl.`Int[]`      -> impl.`scala.Int[]`
  , impl.`Int?[]`     -> impl.`scala.Int?[]`
  , impl.`Int[]?`     -> impl.`scala.Int[]?`
  , impl.`Int?[]?`    -> impl.`scala.Int?[]?`
  , impl.`List<Int>`  -> impl.`scala.List<Int>`
  , impl.`List<Int?>` -> impl.`scala.List<Int?>`
  , impl.`List<Int>?` -> impl.`scala.List<Int>?`
  , impl.`List<Int?>?`-> impl.`scala.List<Int?>?`
  , impl.`Set<Int>`   -> impl.`scala.Set<Int>`
  , impl.`Set<Int?>`  -> impl.`scala.Set<Int?>`
  , impl.`Set<Int>?`  -> impl.`scala.Set<Int>?`
  , impl.`Set<Int?>?` -> impl.`scala.Set<Int?>?`
  )
}
