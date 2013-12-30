package com.dslplatform.ocd
package impl.mapping

object ScalaBinaryTypes {
  val types: Map[impl.DslBinaryStub, impl.ScalaBinaryStub] = Map(
    impl.`Binary`        -> impl.`scala.Binary`
  , impl.`Binary?`       -> impl.`scala.Binary?`
  , impl.`Binary[]`      -> impl.`scala.Binary[]`
  , impl.`Binary?[]`     -> impl.`scala.Binary?[]`
  , impl.`Binary[]?`     -> impl.`scala.Binary[]?`
  , impl.`Binary?[]?`    -> impl.`scala.Binary?[]?`
  , impl.`List<Binary>`  -> impl.`scala.List<Binary>`
  , impl.`List<Binary?>` -> impl.`scala.List<Binary?>`
  , impl.`List<Binary>?` -> impl.`scala.List<Binary>?`
  , impl.`List<Binary?>?`-> impl.`scala.List<Binary?>?`
  , impl.`Set<Binary>`   -> impl.`scala.Set<Binary>`
  , impl.`Set<Binary?>`  -> impl.`scala.Set<Binary?>`
  , impl.`Set<Binary>?`  -> impl.`scala.Set<Binary>?`
  , impl.`Set<Binary?>?` -> impl.`scala.Set<Binary?>?`
  )
}
