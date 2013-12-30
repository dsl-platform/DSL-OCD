package com.dslplatform.ocd
package impl.mapping

import types._

object DslMoneyBoxes {
  val boxes = Map(
    `box.One`         -> impl.`Money`
  , `box.Opt`         -> impl.`Money?`
  , `box.Array`       -> impl.`Money[]`
  , `box.List`        -> impl.`List<Money>`
  , `box.Set`         -> impl.`Set<Money>`
  , `box.OptArray`    -> impl.`Money[]?`
  , `box.OptList`     -> impl.`List<Money>?`
  , `box.OptSet`      -> impl.`Set<Money>?`
  , `box.ArrayOpt`    -> impl.`Money?[]`
  , `box.ListOpt`     -> impl.`List<Money?>`
  , `box.SetOpt`      -> impl.`Set<Money?>`
  , `box.OptArrayOpt` -> impl.`Money?[]?`
  , `box.OptListOpt`  -> impl.`List<Money?>?`
  , `box.OptSetOpt`   -> impl.`Set<Money?>?`
  )
}
