package com.dslplatform.ocd
package impl.mapping

import types._

object DslBinaryBoxes {
  val boxes = Map(
    `box.One`         -> impl.`Binary`
  , `box.Opt`         -> impl.`Binary?`
  , `box.Array`       -> impl.`Binary[]`
  , `box.List`        -> impl.`List<Binary>`
  , `box.Set`         -> impl.`Set<Binary>`
  , `box.OptArray`    -> impl.`Binary[]?`
  , `box.OptList`     -> impl.`List<Binary>?`
  , `box.OptSet`      -> impl.`Set<Binary>?`
  , `box.ArrayOpt`    -> impl.`Binary?[]`
  , `box.ListOpt`     -> impl.`List<Binary?>`
  , `box.SetOpt`      -> impl.`Set<Binary?>`
  , `box.OptArrayOpt` -> impl.`Binary?[]?`
  , `box.OptListOpt`  -> impl.`List<Binary?>?`
  , `box.OptSetOpt`   -> impl.`Set<Binary?>?`
  )
}
