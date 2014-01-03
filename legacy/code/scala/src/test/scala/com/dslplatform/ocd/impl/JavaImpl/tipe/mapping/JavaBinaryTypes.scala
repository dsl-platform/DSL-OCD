package com.dslplatform.ocd
package impl.mapping

object JavaBinaryTypes {
  val types: Map[impl.DslBinaryStub, impl.JavaBinaryStub] = Map(
    impl.`Binary`        -> impl.`java.Binary`
  , impl.`Binary?`       -> impl.`java.Binary?`
  , impl.`Binary[]`      -> impl.`java.Binary[]`
  , impl.`Binary?[]`     -> impl.`java.Binary?[]`
  , impl.`Binary[]?`     -> impl.`java.Binary[]?`
  , impl.`Binary?[]?`    -> impl.`java.Binary?[]?`
  , impl.`List<Binary>`  -> impl.`java.List<Binary>`
  , impl.`List<Binary?>` -> impl.`java.List<Binary?>`
  , impl.`List<Binary>?` -> impl.`java.List<Binary>?`
  , impl.`List<Binary?>?`-> impl.`java.List<Binary?>?`
  , impl.`Set<Binary>`   -> impl.`java.Set<Binary>`
  , impl.`Set<Binary?>`  -> impl.`java.Set<Binary?>`
  , impl.`Set<Binary>?`  -> impl.`java.Set<Binary>?`
  , impl.`Set<Binary?>?` -> impl.`java.Set<Binary?>?`
  )
}
