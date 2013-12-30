package com.dslplatform.ocd
package impl.mapping

object JavaFloatTypes {
  val types: Map[impl.DslFloatStub, impl.JavaFloatStub] = Map(
    impl.`Float`        -> impl.`java.Float`
  , impl.`Float?`       -> impl.`java.Float?`
  , impl.`Float[]`      -> impl.`java.Float[]`
  , impl.`Float?[]`     -> impl.`java.Float?[]`
  , impl.`Float[]?`     -> impl.`java.Float[]?`
  , impl.`Float?[]?`    -> impl.`java.Float?[]?`
  , impl.`List<Float>`  -> impl.`java.List<Float>`
  , impl.`List<Float?>` -> impl.`java.List<Float?>`
  , impl.`List<Float>?` -> impl.`java.List<Float>?`
  , impl.`List<Float?>?`-> impl.`java.List<Float?>?`
  , impl.`Set<Float>`   -> impl.`java.Set<Float>`
  , impl.`Set<Float?>`  -> impl.`java.Set<Float?>`
  , impl.`Set<Float>?`  -> impl.`java.Set<Float>?`
  , impl.`Set<Float?>?` -> impl.`java.Set<Float?>?`
  )
}
