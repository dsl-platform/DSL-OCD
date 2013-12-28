package com.dslplatform.ocd
package impl.mapping

import types._

object DslStringBoxes {
  val boxes = Map(
    `box.One`         -> impl.`String`
  , `box.Opt`         -> impl.`String?`
  , `box.Array`       -> impl.`String[]`
  , `box.List`        -> impl.`List<String>`
  , `box.Set`         -> impl.`Set<String>`
  , `box.OptArray`    -> impl.`String[]?`
  , `box.OptList`     -> impl.`List<String>?`
  , `box.OptSet`      -> impl.`Set<String>?`
  , `box.ArrayOpt`    -> impl.`String?[]`
  , `box.ListOpt`     -> impl.`List<String?>`
  , `box.SetOpt`      -> impl.`Set<String?>`
  , `box.OptArrayOpt` -> impl.`String?[]?`
  , `box.OptListOpt`  -> impl.`List<String?>?`
  , `box.OptSetOpt`   -> impl.`Set<String?>?`
  )
}
