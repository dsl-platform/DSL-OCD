package com.dslplatform.ocd
package impl.mapping

object JavaBooleanTypes {
  val types: Map[impl.DslBoolStub, impl.JavaBooleanStub] = Map(
    impl.`Bool`        -> impl.`java.Boolean`
  , impl.`Bool?`       -> impl.`java.Boolean?`
  , impl.`Bool[]`      -> impl.`java.Boolean[]`
  , impl.`Bool?[]`     -> impl.`java.Boolean?[]`
  , impl.`Bool[]?`     -> impl.`java.Boolean[]?`
  , impl.`Bool?[]?`    -> impl.`java.Boolean?[]?`
  , impl.`List<Bool>`  -> impl.`java.List`
  , impl.`List<Bool?>` -> impl.`java.List<Boolean?>`
  , impl.`List<Bool>?` -> impl.`java.List?`
  , impl.`List<Bool?>?`-> impl.`java.List<Boolean?>?`
  , impl.`Set<Bool>`   -> impl.`java.Set`
  , impl.`Set<Bool?>`  -> impl.`java.Set<Boolean?>`
  , impl.`Set<Bool>?`  -> impl.`java.Set?`
  , impl.`Set<Bool?>?` -> impl.`java.Set<Boolean?>?`
  )
}
