package com.dslplatform.ocd
package impl

import types._
import tipe._

sealed trait DslLongStub
    extends `tipe.Long`
    with DslImpl
    with TipeUnconstrainedType {

  def dslDesc = "Long"
}

case object `Long`         extends DslLongStub with `box.One`
case object `Long?`        extends DslLongStub with `box.Opt`
case object `Long[]`       extends DslLongStub with `box.Array`
case object `List<Long>`   extends DslLongStub with `box.List`
case object `Set<Long>`    extends DslLongStub with `box.Set`
case object `Long[]?`      extends DslLongStub with `box.OptArray`
case object `List<Long>?`  extends DslLongStub with `box.OptList`
case object `Set<Long>?`   extends DslLongStub with `box.OptSet`
case object `Long?[]`      extends DslLongStub with `box.ArrayOpt`
case object `List<Long?>`  extends DslLongStub with `box.ListOpt`
case object `Set<Long?>`   extends DslLongStub with `box.SetOpt`
case object `Long?[]?`     extends DslLongStub with `box.OptArrayOpt`
case object `List<Long?>?` extends DslLongStub with `box.OptListOpt`
case object `Set<Long?>?`  extends DslLongStub with `box.OptSetOpt`
