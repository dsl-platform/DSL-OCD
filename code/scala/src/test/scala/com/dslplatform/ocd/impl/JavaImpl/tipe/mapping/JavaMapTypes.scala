package com.dslplatform.ocd
package impl.mapping

object JavaMapTypes {
  val types: Map[impl.DslMapStub, impl.JavaMapStub] = Map(
    impl.`Map`        -> impl.`java.Map`
  , impl.`Map?`       -> impl.`java.Map?`
  , impl.`Map[]`      -> impl.`java.Map[]`
  , impl.`Map?[]`     -> impl.`java.Map?[]`
  , impl.`Map[]?`     -> impl.`java.Map[]?`
  , impl.`Map?[]?`    -> impl.`java.Map?[]?`
  , impl.`List<Map>`  -> impl.`java.List<Map>`
  , impl.`List<Map?>` -> impl.`java.List<Map?>`
  , impl.`List<Map>?` -> impl.`java.List<Map>?`
  , impl.`List<Map?>?`-> impl.`java.List<Map?>?`
  , impl.`Set<Map>`   -> impl.`java.Set<Map>`
  , impl.`Set<Map?>`  -> impl.`java.Set<Map?>`
  , impl.`Set<Map>?`  -> impl.`java.Set<Map>?`
  , impl.`Set<Map?>?` -> impl.`java.Set<Map?>?`
  )
}
