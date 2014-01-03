package com.dslplatform.ocd
package impl.mapping

import types._

object DslUUIDBoxes {
  val boxes = Map(
    `box.One`         -> impl.`UUID`
  , `box.Opt`         -> impl.`UUID?`
  , `box.Array`       -> impl.`UUID[]`
  , `box.List`        -> impl.`List<UUID>`
  , `box.Set`         -> impl.`Set<UUID>`
  , `box.OptArray`    -> impl.`UUID[]?`
  , `box.OptList`     -> impl.`List<UUID>?`
  , `box.OptSet`      -> impl.`Set<UUID>?`
  , `box.ArrayOpt`    -> impl.`UUID?[]`
  , `box.ListOpt`     -> impl.`List<UUID?>`
  , `box.SetOpt`      -> impl.`Set<UUID?>`
  , `box.OptArrayOpt` -> impl.`UUID?[]?`
  , `box.OptListOpt`  -> impl.`List<UUID?>?`
  , `box.OptSetOpt`   -> impl.`Set<UUID?>?`
  )
}
