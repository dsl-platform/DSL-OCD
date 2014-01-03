package com.dslplatform.ocd
package impl.mapping

import types._

object DslFloatBoxes {
  val boxes = Map(
    `box.One`         -> impl.`Float`
  , `box.Opt`         -> impl.`Float?`
  , `box.Array`       -> impl.`Float[]`
  , `box.List`        -> impl.`List<Float>`
  , `box.Set`         -> impl.`Set<Float>`
  , `box.OptArray`    -> impl.`Float[]?`
  , `box.OptList`     -> impl.`List<Float>?`
  , `box.OptSet`      -> impl.`Set<Float>?`
  , `box.ArrayOpt`    -> impl.`Float?[]`
  , `box.ListOpt`     -> impl.`List<Float?>`
  , `box.SetOpt`      -> impl.`Set<Float?>`
  , `box.OptArrayOpt` -> impl.`Float?[]?`
  , `box.OptListOpt`  -> impl.`List<Float?>?`
  , `box.OptSetOpt`   -> impl.`Set<Float?>?`
  )
}
