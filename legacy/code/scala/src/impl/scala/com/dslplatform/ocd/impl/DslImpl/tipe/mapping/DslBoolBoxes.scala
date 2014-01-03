package com.dslplatform.ocd
package impl.mapping

import types._

object DslBoolBoxes {
  val boxes = Map(
    `box.One`         -> impl.`Bool`
  , `box.Opt`         -> impl.`Bool?`
  , `box.Array`       -> impl.`Bool[]`
  , `box.List`        -> impl.`List<Bool>`
  , `box.Set`         -> impl.`Set<Bool>`
  , `box.OptArray`    -> impl.`Bool[]?`
  , `box.OptList`     -> impl.`List<Bool>?`
  , `box.OptSet`      -> impl.`Set<Bool>?`
  , `box.ArrayOpt`    -> impl.`Bool?[]`
  , `box.ListOpt`     -> impl.`List<Bool?>`
  , `box.SetOpt`      -> impl.`Set<Bool?>`
  , `box.OptArrayOpt` -> impl.`Bool?[]?`
  , `box.OptListOpt`  -> impl.`List<Bool?>?`
  , `box.OptSetOpt`   -> impl.`Set<Bool?>?`
  )
}
