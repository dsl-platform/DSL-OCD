package com.dslplatform.ocd
package impl.mapping

object ScalaBooleanTypes {
  val types: Map[impl.DslBoolStub, impl.ScalaBooleanStub] = Map(
    impl.`Bool`        -> impl.`scala.Boolean`
  , impl.`Bool?`       -> impl.`scala.Boolean?`
  , impl.`Bool[]`      -> impl.`scala.Boolean[]`
  , impl.`Bool?[]`     -> impl.`scala.Boolean?[]`
  , impl.`Bool[]?`     -> impl.`scala.Boolean[]?`
  , impl.`Bool?[]?`    -> impl.`scala.Boolean?[]?`
  , impl.`List<Bool>`  -> impl.`scala.List<Boolean>`
  , impl.`List<Bool?>` -> impl.`scala.List<Boolean?>`
  , impl.`List<Bool>?` -> impl.`scala.List<Boolean>?`
  , impl.`List<Bool?>?`-> impl.`scala.List<Boolean?>?`
  , impl.`Set<Bool>`   -> impl.`scala.Set<Boolean>`
  , impl.`Set<Bool?>`  -> impl.`scala.Set<Boolean?>`
  , impl.`Set<Bool>?`  -> impl.`scala.Set<Boolean>?`
  , impl.`Set<Bool?>?` -> impl.`scala.Set<Boolean?>?`
  )
}
