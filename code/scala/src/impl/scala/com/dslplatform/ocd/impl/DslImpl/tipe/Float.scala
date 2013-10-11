package com.dslplatform.ocd
package impl

import types._
import tipe._

sealed trait DslFloatStub
    extends `tipe.Float`
    with DslImpl
    with TipeUnconstrainedType {

  def dslDesc = "Float"
}

case object `Float`         extends DslFloatStub with `box.One`
case object `Float?`        extends DslFloatStub with `box.Opt`
case object `Float[]`       extends DslFloatStub with `box.Array`
case object `List<Float>`   extends DslFloatStub with `box.List`
case object `Set<Float>`    extends DslFloatStub with `box.Set`
case object `Float[]?`      extends DslFloatStub with `box.OptArray`
case object `List<Float>?`  extends DslFloatStub with `box.OptList`
case object `Set<Float>?`   extends DslFloatStub with `box.OptSet`
case object `Float?[]`      extends DslFloatStub with `box.ArrayOpt`
case object `List<Float?>`  extends DslFloatStub with `box.ListOpt`
case object `Set<Float?>`   extends DslFloatStub with `box.SetOpt`
case object `Float?[]?`     extends DslFloatStub with `box.OptArrayOpt`
case object `List<Float?>?` extends DslFloatStub with `box.OptListOpt`
case object `Set<Float?>?`  extends DslFloatStub with `box.OptSetOpt`
