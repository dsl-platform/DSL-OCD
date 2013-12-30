package com.dslplatform.ocd
package impl.mapping

object ScalaFloatTypes {
  val types: Map[impl.DslFloatStub, impl.ScalaFloatStub] = Map(
    impl.`Float`        -> impl.`scala.Float`
  , impl.`Float?`       -> impl.`scala.Float?`
  , impl.`Float[]`      -> impl.`scala.Float[]`
  , impl.`Float?[]`     -> impl.`scala.Float?[]`
  , impl.`Float[]?`     -> impl.`scala.Float[]?`
  , impl.`Float?[]?`    -> impl.`scala.Float?[]?`
  , impl.`List<Float>`  -> impl.`scala.List<Float>`
  , impl.`List<Float?>` -> impl.`scala.List<Float?>`
  , impl.`List<Float>?` -> impl.`scala.List<Float>?`
  , impl.`List<Float?>?`-> impl.`scala.List<Float?>?`
  , impl.`Set<Float>`   -> impl.`scala.Set<Float>`
  , impl.`Set<Float?>`  -> impl.`scala.Set<Float?>`
  , impl.`Set<Float>?`  -> impl.`scala.Set<Float>?`
  , impl.`Set<Float?>?` -> impl.`scala.Set<Float?>?`
  )
}
