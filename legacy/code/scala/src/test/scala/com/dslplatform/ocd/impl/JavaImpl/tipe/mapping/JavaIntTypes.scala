package com.dslplatform.ocd
package impl.mapping

object JavaIntTypes {
  val types: Map[impl.DslIntStub, impl.JavaIntStub] = Map(
    impl.`Int`        -> impl.`java.Integer`
  , impl.`Int?`       -> impl.`java.Integer?`
  , impl.`Int[]`      -> impl.`java.Integer[]`
  , impl.`Int?[]`     -> impl.`java.Integer?[]`
  , impl.`Int[]?`     -> impl.`java.Integer[]?`
  , impl.`Int?[]?`    -> impl.`java.Integer?[]?`
  , impl.`List<Int>`  -> impl.`java.List<Integer>`
  , impl.`List<Int?>` -> impl.`java.List<Integer?>`
  , impl.`List<Int>?` -> impl.`java.List<Integer>?`
  , impl.`List<Int?>?`-> impl.`java.List<Integer?>?`
  , impl.`Set<Int>`   -> impl.`java.Set<Integer>`
  , impl.`Set<Int?>`  -> impl.`java.Set<Integer?>`
  , impl.`Set<Int>?`  -> impl.`java.Set<Integer>?`
  , impl.`Set<Int?>?` -> impl.`java.Set<Integer?>?`
  )
}
