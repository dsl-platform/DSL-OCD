package com.dslplatform.ocd
package impl.mapping

object ScalaMapTypes {
  val types: Map[impl.DslMapStub, impl.ScalaMapStub] = Map(
    impl.`Map`        -> impl.`scala.Map`
  , impl.`Map?`       -> impl.`scala.Map?`
  , impl.`Map[]`      -> impl.`scala.Map[]`
  , impl.`Map?[]`     -> impl.`scala.Map?[]`
  , impl.`Map[]?`     -> impl.`scala.Map[]?`
  , impl.`Map?[]?`    -> impl.`scala.Map?[]?`
  , impl.`List<Map>`  -> impl.`scala.List<Map>`
  , impl.`List<Map?>` -> impl.`scala.List<Map?>`
  , impl.`List<Map>?` -> impl.`scala.List<Map>?`
  , impl.`List<Map?>?`-> impl.`scala.List<Map?>?`
  , impl.`Set<Map>`   -> impl.`scala.Set<Map>`
  , impl.`Set<Map?>`  -> impl.`scala.Set<Map?>`
  , impl.`Set<Map>?`  -> impl.`scala.Set<Map>?`
  , impl.`Set<Map?>?` -> impl.`scala.Set<Map?>?`
  )
}
