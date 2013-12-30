package com.dslplatform.ocd
package impl.mapping

object ScalaUUIDTypes {
  val types: Map[impl.DslUUIDStub, impl.ScalaUUIDStub] = Map(
    impl.`UUID`        -> impl.`scala.UUID`
  , impl.`UUID?`       -> impl.`scala.UUID?`
  , impl.`UUID[]`      -> impl.`scala.UUID[]`
  , impl.`UUID?[]`     -> impl.`scala.UUID?[]`
  , impl.`UUID[]?`     -> impl.`scala.UUID[]?`
  , impl.`UUID?[]?`    -> impl.`scala.UUID?[]?`
  , impl.`List<UUID>`  -> impl.`scala.List<UUID>`
  , impl.`List<UUID?>` -> impl.`scala.List<UUID?>`
  , impl.`List<UUID>?` -> impl.`scala.List<UUID>?`
  , impl.`List<UUID?>?`-> impl.`scala.List<UUID?>?`
  , impl.`Set<UUID>`   -> impl.`scala.Set<UUID>`
  , impl.`Set<UUID?>`  -> impl.`scala.Set<UUID?>`
  , impl.`Set<UUID>?`  -> impl.`scala.Set<UUID>?`
  , impl.`Set<UUID?>?` -> impl.`scala.Set<UUID?>?`
  )
}
