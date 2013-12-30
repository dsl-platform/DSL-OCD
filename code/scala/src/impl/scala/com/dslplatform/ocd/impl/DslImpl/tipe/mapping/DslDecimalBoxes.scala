package com.dslplatform.ocd
package impl.mapping

import types._

object DslDecimalBoxes {
  val boxes = Map(
    `box.One`         -> impl.`Decimal`
  , `box.Opt`         -> impl.`Decimal?`
  , `box.Array`       -> impl.`Decimal[]`
  , `box.List`        -> impl.`List<Decimal>`
  , `box.Set`         -> impl.`Set<Decimal>`
  , `box.OptArray`    -> impl.`Decimal[]?`
  , `box.OptList`     -> impl.`List<Decimal>?`
  , `box.OptSet`      -> impl.`Set<Decimal>?`
  , `box.ArrayOpt`    -> impl.`Decimal?[]`
  , `box.ListOpt`     -> impl.`List<Decimal?>`
  , `box.SetOpt`      -> impl.`Set<Decimal?>`
  , `box.OptArrayOpt` -> impl.`Decimal?[]?`
  , `box.OptListOpt`  -> impl.`List<Decimal?>?`
  , `box.OptSetOpt`   -> impl.`Set<Decimal?>?`
  )
}
