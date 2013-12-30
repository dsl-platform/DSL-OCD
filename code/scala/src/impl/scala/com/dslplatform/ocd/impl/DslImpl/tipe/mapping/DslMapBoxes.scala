package com.dslplatform.ocd
package impl.mapping

import types._

object DslMapBoxes {
  val boxes = Map(
    `box.One`         -> impl.`Map`
  , `box.Opt`         -> impl.`Map?`
  , `box.Array`       -> impl.`Map[]`
  , `box.List`        -> impl.`List<Map>`
  , `box.Set`         -> impl.`Set<Map>`
  , `box.OptArray`    -> impl.`Map[]?`
  , `box.OptList`     -> impl.`List<Map>?`
  , `box.OptSet`      -> impl.`Set<Map>?`
  , `box.ArrayOpt`    -> impl.`Map?[]`
  , `box.ListOpt`     -> impl.`List<Map?>`
  , `box.SetOpt`      -> impl.`Set<Map?>`
  , `box.OptArrayOpt` -> impl.`Map?[]?`
  , `box.OptListOpt`  -> impl.`List<Map?>?`
  , `box.OptSetOpt`   -> impl.`Set<Map?>?`
  )
}
