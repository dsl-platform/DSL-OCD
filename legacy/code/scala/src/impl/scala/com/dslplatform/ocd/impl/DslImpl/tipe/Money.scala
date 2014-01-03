package com.dslplatform.ocd
package impl

import types._
import tipe._

sealed trait DslMoneyStub
    extends `tipe.Money`
    with DslImpl
    with TipeUnconstrainedType {

  def dslDesc = "Money"
}

case object `Money`         extends DslMoneyStub with `box.One`
case object `Money?`        extends DslMoneyStub with `box.Opt`
case object `Money[]`       extends DslMoneyStub with `box.Array`
case object `List<Money>`   extends DslMoneyStub with `box.List`
case object `Set<Money>`    extends DslMoneyStub with `box.Set`
case object `Money[]?`      extends DslMoneyStub with `box.OptArray`
case object `List<Money>?`  extends DslMoneyStub with `box.OptList`
case object `Set<Money>?`   extends DslMoneyStub with `box.OptSet`
case object `Money?[]`      extends DslMoneyStub with `box.ArrayOpt`
case object `List<Money?>`  extends DslMoneyStub with `box.ListOpt`
case object `Set<Money?>`   extends DslMoneyStub with `box.SetOpt`
case object `Money?[]?`     extends DslMoneyStub with `box.OptArrayOpt`
case object `List<Money?>?` extends DslMoneyStub with `box.OptListOpt`
case object `Set<Money?>?`  extends DslMoneyStub with `box.OptSetOpt`
