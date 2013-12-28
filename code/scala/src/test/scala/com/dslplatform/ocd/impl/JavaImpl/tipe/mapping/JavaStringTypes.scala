package com.dslplatform.ocd
package impl.mapping

object JavaStringTypes {
  val types: Map[impl.DslStringStub, impl.JavaStringStub] = Map(
    impl.`String`        -> impl.`java.String`
  , impl.`String?`       -> impl.`java.String?`
  , impl.`String[]`      -> impl.`java.String[]`
  , impl.`String?[]`     -> impl.`java.String?[]`
  , impl.`String[]?`     -> impl.`java.String[]?`
  , impl.`String?[]?`    -> impl.`java.String?[]?`
  , impl.`List<String>`  -> impl.`java.List<String>`
  , impl.`List<String?>` -> impl.`java.List<String?>`
  , impl.`List<String>?` -> impl.`java.List<String>?`
  , impl.`List<String?>?`-> impl.`java.List<String?>?`
  , impl.`Set<String>`   -> impl.`java.Set<String>`
  , impl.`Set<String?>`  -> impl.`java.Set<String?>`
  , impl.`Set<String>?`  -> impl.`java.Set<String>?`
  , impl.`Set<String?>?` -> impl.`java.Set<String?>?`
  )
}
