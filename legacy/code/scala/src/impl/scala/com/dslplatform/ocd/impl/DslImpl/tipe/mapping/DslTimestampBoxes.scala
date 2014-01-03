package com.dslplatform.ocd
package impl.mapping

import types._

object DslTimestampBoxes {
  val boxes = Map(
    `box.One`         -> impl.`Timestamp`
  , `box.Opt`         -> impl.`Timestamp?`
  , `box.Array`       -> impl.`Timestamp[]`
  , `box.List`        -> impl.`List<Timestamp>`
  , `box.Set`         -> impl.`Set<Timestamp>`
  , `box.OptArray`    -> impl.`Timestamp[]?`
  , `box.OptList`     -> impl.`List<Timestamp>?`
  , `box.OptSet`      -> impl.`Set<Timestamp>?`
  , `box.ArrayOpt`    -> impl.`Timestamp?[]`
  , `box.ListOpt`     -> impl.`List<Timestamp?>`
  , `box.SetOpt`      -> impl.`Set<Timestamp?>`
  , `box.OptArrayOpt` -> impl.`Timestamp?[]?`
  , `box.OptListOpt`  -> impl.`List<Timestamp?>?`
  , `box.OptSetOpt`   -> impl.`Set<Timestamp?>?`
  )
}
