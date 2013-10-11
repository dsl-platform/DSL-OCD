package com.dslplatform.ocd
package impl

import types._
import tipe._

sealed trait DslBinaryStub
    extends `tipe.Binary`
    with DslImpl
    with TipeUnconstrainedType {

  def dslDesc = "Binary"
}

case object `Binary`         extends DslBinaryStub with `box.One`
case object `Binary?`        extends DslBinaryStub with `box.Opt`
case object `Binary[]`       extends DslBinaryStub with `box.Array`
case object `List<Binary>`   extends DslBinaryStub with `box.List`
case object `Set<Binary>`    extends DslBinaryStub with `box.Set`
case object `Binary[]?`      extends DslBinaryStub with `box.OptArray`
case object `List<Binary>?`  extends DslBinaryStub with `box.OptList`
case object `Set<Binary>?`   extends DslBinaryStub with `box.OptSet`
case object `Binary?[]`      extends DslBinaryStub with `box.ArrayOpt`
case object `List<Binary?>`  extends DslBinaryStub with `box.ListOpt`
case object `Set<Binary?>`   extends DslBinaryStub with `box.SetOpt`
case object `Binary?[]?`     extends DslBinaryStub with `box.OptArrayOpt`
case object `List<Binary?>?` extends DslBinaryStub with `box.OptListOpt`
case object `Set<Binary?>?`  extends DslBinaryStub with `box.OptSetOpt`
