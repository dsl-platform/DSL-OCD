package com.dslplatform.ocd
package impl.mapping

object JavaUUIDTypes {
  val types: Map[impl.DslUUIDStub, impl.JavaUUIDStub] = Map(
    impl.`UUID`        -> impl.`java.UUID`
  , impl.`UUID?`       -> impl.`java.UUID?`
  , impl.`UUID[]`      -> impl.`java.UUID[]`
  , impl.`UUID?[]`     -> impl.`java.UUID?[]`
  , impl.`UUID[]?`     -> impl.`java.UUID[]?`
  , impl.`UUID?[]?`    -> impl.`java.UUID?[]?`
  , impl.`List<UUID>`  -> impl.`java.List<UUID>`
  , impl.`List<UUID?>` -> impl.`java.List<UUID?>`
  , impl.`List<UUID>?` -> impl.`java.List<UUID>?`
  , impl.`List<UUID?>?`-> impl.`java.List<UUID?>?`
  , impl.`Set<UUID>`   -> impl.`java.Set<UUID>`
  , impl.`Set<UUID?>`  -> impl.`java.Set<UUID?>`
  , impl.`Set<UUID>?`  -> impl.`java.Set<UUID>?`
  , impl.`Set<UUID?>?` -> impl.`java.Set<UUID?>?`
  )
}
