package com.dslplatform.ocd
package impl.mapping

object ScalaXMLTypes {
  val types: Map[impl.DslXMLStub, impl.ScalaXMLStub] = Map(
    impl.`XML`        -> impl.`scala.XML`
  , impl.`XML?`       -> impl.`scala.XML?`
  , impl.`XML[]`      -> impl.`scala.XML[]`
  , impl.`XML?[]`     -> impl.`scala.XML?[]`
  , impl.`XML[]?`     -> impl.`scala.XML[]?`
  , impl.`XML?[]?`    -> impl.`scala.XML?[]?`
  , impl.`List<XML>`  -> impl.`scala.List<XML>`
  , impl.`List<XML?>` -> impl.`scala.List<XML?>`
  , impl.`List<XML>?` -> impl.`scala.List<XML>?`
  , impl.`List<XML?>?`-> impl.`scala.List<XML?>?`
  , impl.`Set<XML>`   -> impl.`scala.Set<XML>`
  , impl.`Set<XML?>`  -> impl.`scala.Set<XML?>`
  , impl.`Set<XML>?`  -> impl.`scala.Set<XML>?`
  , impl.`Set<XML?>?` -> impl.`scala.Set<XML?>?`
  )
}
