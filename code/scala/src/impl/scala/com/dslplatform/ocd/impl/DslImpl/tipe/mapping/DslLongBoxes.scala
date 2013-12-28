package com.dslplatform.ocd
package impl.mapping

import types._

object DslLongBoxes {
  val boxes = Map(
    `box.One`         -> impl.`Long`
  , `box.Opt`         -> impl.`Long?`
  , `box.Array`       -> impl.`Long[]`
  , `box.List`        -> impl.`List<Long>`
  , `box.Set`         -> impl.`Set<Long>`
  , `box.OptArray`    -> impl.`Long[]?`
  , `box.OptList`     -> impl.`List<Long>?`
  , `box.OptSet`      -> impl.`Set<Long>?`
  , `box.ArrayOpt`    -> impl.`Long?[]`
  , `box.ListOpt`     -> impl.`List<Long?>`
  , `box.SetOpt`      -> impl.`Set<Long?>`
  , `box.OptArrayOpt` -> impl.`Long?[]?`
  , `box.OptListOpt`  -> impl.`List<Long?>?`
  , `box.OptSetOpt`   -> impl.`Set<Long?>?`
  )
}
