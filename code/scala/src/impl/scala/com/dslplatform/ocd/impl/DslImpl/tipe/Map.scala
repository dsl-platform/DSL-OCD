package com.dslplatform.ocd
package impl

import types._
import tipe._

sealed trait DslMapStub
    extends `tipe.KeyValue`
    with DslImpl
    with TipeUnconstrainedType {

  def dslDesc = "Map"
}

case object `Map`         extends DslMapStub with `box.One`
case object `Map?`        extends DslMapStub with `box.Opt`
case object `Map[]`       extends DslMapStub with `box.Array`
case object `List<Map>`   extends DslMapStub with `box.List`
case object `Set<Map>`    extends DslMapStub with `box.Set`
case object `Map[]?`      extends DslMapStub with `box.OptArray`
case object `List<Map>?`  extends DslMapStub with `box.OptList`
case object `Set<Map>?`   extends DslMapStub with `box.OptSet`
case object `Map?[]`      extends DslMapStub with `box.ArrayOpt`
case object `List<Map?>`  extends DslMapStub with `box.ListOpt`
case object `Set<Map?>`   extends DslMapStub with `box.SetOpt`
case object `Map?[]?`     extends DslMapStub with `box.OptArrayOpt`
case object `List<Map?>?` extends DslMapStub with `box.OptListOpt`
case object `Set<Map?>?`  extends DslMapStub with `box.OptSetOpt`
