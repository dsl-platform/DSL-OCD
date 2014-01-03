package com.dslplatform.ocd
package impl

import types._
import tipe._

sealed trait DslTimestampStub
    extends `tipe.Timestamp`
    with DslImpl
    with TipeUnconstrainedType {

  def dslDesc = "Timestamp"
}

case object `Timestamp`         extends DslTimestampStub with `box.One`
case object `Timestamp?`        extends DslTimestampStub with `box.Opt`
case object `Timestamp[]`       extends DslTimestampStub with `box.Array`
case object `List<Timestamp>`   extends DslTimestampStub with `box.List`
case object `Set<Timestamp>`    extends DslTimestampStub with `box.Set`
case object `Timestamp[]?`      extends DslTimestampStub with `box.OptArray`
case object `List<Timestamp>?`  extends DslTimestampStub with `box.OptList`
case object `Set<Timestamp>?`   extends DslTimestampStub with `box.OptSet`
case object `Timestamp?[]`      extends DslTimestampStub with `box.ArrayOpt`
case object `List<Timestamp?>`  extends DslTimestampStub with `box.ListOpt`
case object `Set<Timestamp?>`   extends DslTimestampStub with `box.SetOpt`
case object `Timestamp?[]?`     extends DslTimestampStub with `box.OptArrayOpt`
case object `List<Timestamp?>?` extends DslTimestampStub with `box.OptListOpt`
case object `Set<Timestamp?>?`  extends DslTimestampStub with `box.OptSetOpt`
