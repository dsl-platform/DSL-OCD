package com.dslplatform.ocd
package impl.mapping

import types._

object DslDateBoxes {
  val boxes = Map(
    `box.One`         -> impl.`Date`
  , `box.Opt`         -> impl.`Date?`
  , `box.Array`       -> impl.`Date[]`
  , `box.List`        -> impl.`List<Date>`
  , `box.Set`         -> impl.`Set<Date>`
  , `box.OptArray`    -> impl.`Date[]?`
  , `box.OptList`     -> impl.`List<Date>?`
  , `box.OptSet`      -> impl.`Set<Date>?`
  , `box.ArrayOpt`    -> impl.`Date?[]`
  , `box.ListOpt`     -> impl.`List<Date?>`
  , `box.SetOpt`      -> impl.`Set<Date?>`
  , `box.OptArrayOpt` -> impl.`Date?[]?`
  , `box.OptListOpt`  -> impl.`List<Date?>?`
  , `box.OptSetOpt`   -> impl.`Set<Date?>?`
  )
}
