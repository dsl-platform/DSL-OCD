package com.dslplatform.ocd
package impl

import types._
import tipe._

sealed trait DslIntStub
    extends `tipe.Integer`
    with DslImpl
    with TipeUnconstrainedType {

  def dslDesc = "Int"
}

case object `Int`         extends DslIntStub with `box.One`
case object `Int?`        extends DslIntStub with `box.Opt`
case object `Int[]`       extends DslIntStub with `box.Array`
case object `List<Int>`   extends DslIntStub with `box.List`
case object `Set<Int>`    extends DslIntStub with `box.Set`
case object `Int[]?`      extends DslIntStub with `box.OptArray`
case object `List<Int>?`  extends DslIntStub with `box.OptList`
case object `Set<Int>?`   extends DslIntStub with `box.OptSet`
case object `Int?[]`      extends DslIntStub with `box.ArrayOpt`
case object `List<Int?>`  extends DslIntStub with `box.ListOpt`
case object `Set<Int?>`   extends DslIntStub with `box.SetOpt`
case object `Int?[]?`     extends DslIntStub with `box.OptArrayOpt`
case object `List<Int?>?` extends DslIntStub with `box.OptListOpt`
case object `Set<Int?>?`  extends DslIntStub with `box.OptSetOpt`
