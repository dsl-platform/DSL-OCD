package com.dslplatform.ocd
package impl

import types._
import tipe._

sealed trait DslBoolStub
    extends `tipe.Bool`
    with DslImpl
    with TipeUnconstrainedType {

  def dslDesc = "Bool"
}

case object `Bool`         extends DslBoolStub with `box.One`
case object `Bool?`        extends DslBoolStub with `box.Opt`
case object `Bool[]`       extends DslBoolStub with `box.Array`
case object `List<Bool>`   extends DslBoolStub with `box.List`
case object `Set<Bool>`    extends DslBoolStub with `box.Set`
case object `Bool[]?`      extends DslBoolStub with `box.OptArray`
case object `List<Bool>?`  extends DslBoolStub with `box.OptList`
case object `Set<Bool>?`   extends DslBoolStub with `box.OptSet`
case object `Bool?[]`      extends DslBoolStub with `box.ArrayOpt`
case object `List<Bool?>`  extends DslBoolStub with `box.ListOpt`
case object `Set<Bool?>`   extends DslBoolStub with `box.SetOpt`
case object `Bool?[]?`     extends DslBoolStub with `box.OptArrayOpt`
case object `List<Bool?>?` extends DslBoolStub with `box.OptListOpt`
case object `Set<Bool?>?`  extends DslBoolStub with `box.OptSetOpt`
