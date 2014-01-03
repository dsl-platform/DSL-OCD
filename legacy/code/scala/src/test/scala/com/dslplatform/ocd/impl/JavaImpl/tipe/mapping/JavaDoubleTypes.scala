package com.dslplatform.ocd
package impl.mapping

object JavaDoubleTypes {
  val types: Map[impl.DslDoubleStub, impl.JavaDoubleStub] = Map(
    impl.`Double`        -> impl.`java.Double`
  , impl.`Double?`       -> impl.`java.Double?`
  , impl.`Double[]`      -> impl.`java.Double[]`
  , impl.`Double?[]`     -> impl.`java.Double?[]`
  , impl.`Double[]?`     -> impl.`java.Double[]?`
  , impl.`Double?[]?`    -> impl.`java.Double?[]?`
  , impl.`List<Double>`  -> impl.`java.List<Double>`
  , impl.`List<Double?>` -> impl.`java.List<Double?>`
  , impl.`List<Double>?` -> impl.`java.List<Double>?`
  , impl.`List<Double?>?`-> impl.`java.List<Double?>?`
  , impl.`Set<Double>`   -> impl.`java.Set<Double>`
  , impl.`Set<Double?>`  -> impl.`java.Set<Double?>`
  , impl.`Set<Double>?`  -> impl.`java.Set<Double>?`
  , impl.`Set<Double?>?` -> impl.`java.Set<Double?>?`
  )
}
