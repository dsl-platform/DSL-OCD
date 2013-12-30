package com.dslplatform.ocd
package impl.mapping

object JavaXMLTypes {
  val types: Map[impl.DslXMLStub, impl.JavaXMLStub] = Map(
    impl.`XML`        -> impl.`java.XML`
  , impl.`XML?`       -> impl.`java.XML?`
  , impl.`XML[]`      -> impl.`java.XML[]`
  , impl.`XML?[]`     -> impl.`java.XML?[]`
  , impl.`XML[]?`     -> impl.`java.XML[]?`
  , impl.`XML?[]?`    -> impl.`java.XML?[]?`
  , impl.`List<XML>`  -> impl.`java.List<XML>`
  , impl.`List<XML?>` -> impl.`java.List<XML?>`
  , impl.`List<XML>?` -> impl.`java.List<XML>?`
  , impl.`List<XML?>?`-> impl.`java.List<XML?>?`
  , impl.`Set<XML>`   -> impl.`java.Set<XML>`
  , impl.`Set<XML?>`  -> impl.`java.Set<XML?>`
  , impl.`Set<XML>?`  -> impl.`java.Set<XML>?`
  , impl.`Set<XML?>?` -> impl.`java.Set<XML?>?`
  )
}
