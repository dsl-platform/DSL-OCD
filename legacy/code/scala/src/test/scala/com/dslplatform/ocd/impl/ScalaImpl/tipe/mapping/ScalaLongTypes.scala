package com.dslplatform.ocd
package impl.mapping

object ScalaLongTypes {
  val types: Map[impl.DslLongStub, impl.ScalaLongStub] = Map(
    impl.`Long`        -> impl.`scala.Long`
  , impl.`Long?`       -> impl.`scala.Long?`
  , impl.`Long[]`      -> impl.`scala.Long[]`
  , impl.`Long?[]`     -> impl.`scala.Long?[]`
  , impl.`Long[]?`     -> impl.`scala.Long[]?`
  , impl.`Long?[]?`    -> impl.`scala.Long?[]?`
  , impl.`List<Long>`  -> impl.`scala.List<Long>`
  , impl.`List<Long?>` -> impl.`scala.List<Long?>`
  , impl.`List<Long>?` -> impl.`scala.List<Long>?`
  , impl.`List<Long?>?`-> impl.`scala.List<Long?>?`
  , impl.`Set<Long>`   -> impl.`scala.Set<Long>`
  , impl.`Set<Long?>`  -> impl.`scala.Set<Long?>`
  , impl.`Set<Long>?`  -> impl.`scala.Set<Long>?`
  , impl.`Set<Long?>?` -> impl.`scala.Set<Long?>?`
  )
}
