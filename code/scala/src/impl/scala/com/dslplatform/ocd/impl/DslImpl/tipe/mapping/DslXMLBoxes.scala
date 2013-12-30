package com.dslplatform.ocd
package impl.mapping

import types._

object DslXMLBoxes {
  val boxes = Map(
    `box.One`         -> impl.`XML`
  , `box.Opt`         -> impl.`XML?`
  , `box.Array`       -> impl.`XML[]`
  , `box.List`        -> impl.`List<XML>`
  , `box.Set`         -> impl.`Set<XML>`
  , `box.OptArray`    -> impl.`XML[]?`
  , `box.OptList`     -> impl.`List<XML>?`
  , `box.OptSet`      -> impl.`Set<XML>?`
  , `box.ArrayOpt`    -> impl.`XML?[]`
  , `box.ListOpt`     -> impl.`List<XML?>`
  , `box.SetOpt`      -> impl.`Set<XML?>`
  , `box.OptArrayOpt` -> impl.`XML?[]?`
  , `box.OptListOpt`  -> impl.`List<XML?>?`
  , `box.OptSetOpt`   -> impl.`Set<XML?>?`
  )
}
