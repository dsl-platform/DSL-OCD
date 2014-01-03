package com.dslplatform.ocd
package impl.mapping

object ScalaDoubleTypes {
  val types: Map[impl.DslDoubleStub, impl.ScalaDoubleStub] = Map(
    impl.`Double`        -> impl.`scala.Double`
  , impl.`Double?`       -> impl.`scala.Double?`
  , impl.`Double[]`      -> impl.`scala.Double[]`
  , impl.`Double?[]`     -> impl.`scala.Double?[]`
  , impl.`Double[]?`     -> impl.`scala.Double[]?`
  , impl.`Double?[]?`    -> impl.`scala.Double?[]?`
  , impl.`List<Double>`  -> impl.`scala.List<Double>`
  , impl.`List<Double?>` -> impl.`scala.List<Double?>`
  , impl.`List<Double>?` -> impl.`scala.List<Double>?`
  , impl.`List<Double?>?`-> impl.`scala.List<Double?>?`
  , impl.`Set<Double>`   -> impl.`scala.Set<Double>`
  , impl.`Set<Double?>`  -> impl.`scala.Set<Double?>`
  , impl.`Set<Double>?`  -> impl.`scala.Set<Double>?`
  , impl.`Set<Double?>?` -> impl.`scala.Set<Double?>?`
  )
}
