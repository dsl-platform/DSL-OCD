package com.dslplatform.ocd
package impl.mapping

object ScalaStringTypes {
  val types: Map[impl.DslStringStub, impl.ScalaStringStub] = Map(
    impl.`String`        -> impl.`scala.String`
  , impl.`String?`       -> impl.`scala.String?`
  , impl.`String[]`      -> impl.`scala.String[]`
  , impl.`String?[]`     -> impl.`scala.String?[]`
  , impl.`String[]?`     -> impl.`scala.String[]?`
  , impl.`String?[]?`    -> impl.`scala.String?[]?`
  , impl.`List<String>`  -> impl.`scala.List<String>`
  , impl.`List<String?>` -> impl.`scala.List<String?>`
  , impl.`List<String>?` -> impl.`scala.List<String>?`
  , impl.`List<String?>?`-> impl.`scala.List<String?>?`
  , impl.`Set<String>`   -> impl.`scala.Set<String>`
  , impl.`Set<String?>`  -> impl.`scala.Set<String?>`
  , impl.`Set<String>?`  -> impl.`scala.Set<String>?`
  , impl.`Set<String?>?` -> impl.`scala.Set<String?>?`
  )
}
