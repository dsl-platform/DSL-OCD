package com.dslplatform.ocd
package impl.mapping

object JavaLongTypes {
  val types: Map[impl.DslLongStub, impl.JavaLongStub] = Map(
    impl.`Long`        -> impl.`java.Long`
  , impl.`Long?`       -> impl.`java.Long?`
  , impl.`Long[]`      -> impl.`java.Long[]`
  , impl.`Long?[]`     -> impl.`java.Long?[]`
  , impl.`Long[]?`     -> impl.`java.Long[]?`
  , impl.`Long?[]?`    -> impl.`java.Long?[]?`
  , impl.`List<Long>`  -> impl.`java.List<Long>`
  , impl.`List<Long?>` -> impl.`java.List<Long?>`
  , impl.`List<Long>?` -> impl.`java.List<Long>?`
  , impl.`List<Long?>?`-> impl.`java.List<Long?>?`
  , impl.`Set<Long>`   -> impl.`java.Set<Long>`
  , impl.`Set<Long?>`  -> impl.`java.Set<Long?>`
  , impl.`Set<Long>?`  -> impl.`java.Set<Long>?`
  , impl.`Set<Long?>?` -> impl.`java.Set<Long?>?`
  )
}
