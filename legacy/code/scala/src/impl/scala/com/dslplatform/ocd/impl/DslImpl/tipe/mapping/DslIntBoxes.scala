package com.dslplatform.ocd
package impl.mapping

import types._

object DslIntBoxes {
  val boxes = Map(
    `box.One`         -> impl.`Int`
  , `box.Opt`         -> impl.`Int?`
  , `box.Array`       -> impl.`Int[]`
  , `box.List`        -> impl.`List<Int>`
  , `box.Set`         -> impl.`Set<Int>`
  , `box.OptArray`    -> impl.`Int[]?`
  , `box.OptList`     -> impl.`List<Int>?`
  , `box.OptSet`      -> impl.`Set<Int>?`
  , `box.ArrayOpt`    -> impl.`Int?[]`
  , `box.ListOpt`     -> impl.`List<Int?>`
  , `box.SetOpt`      -> impl.`Set<Int?>`
  , `box.OptArrayOpt` -> impl.`Int?[]?`
  , `box.OptListOpt`  -> impl.`List<Int?>?`
  , `box.OptSetOpt`   -> impl.`Set<Int?>?`
  )
}
