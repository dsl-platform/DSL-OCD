package com.dslplatform.ocd
package impl.mapping

import types._

object DslDoubleBoxes {
  val boxes = Map(
    `box.One`         -> impl.`Double`
  , `box.Opt`         -> impl.`Double?`
  , `box.Array`       -> impl.`Double[]`
  , `box.List`        -> impl.`List<Double>`
  , `box.Set`         -> impl.`Set<Double>`
  , `box.OptArray`    -> impl.`Double[]?`
  , `box.OptList`     -> impl.`List<Double>?`
  , `box.OptSet`      -> impl.`Set<Double>?`
  , `box.ArrayOpt`    -> impl.`Double?[]`
  , `box.ListOpt`     -> impl.`List<Double?>`
  , `box.SetOpt`      -> impl.`Set<Double?>`
  , `box.OptArrayOpt` -> impl.`Double?[]?`
  , `box.OptListOpt`  -> impl.`List<Double?>?`
  , `box.OptSetOpt`   -> impl.`Set<Double?>?`
  )
}
