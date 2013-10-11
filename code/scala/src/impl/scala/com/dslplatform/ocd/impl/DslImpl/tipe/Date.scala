package com.dslplatform.ocd
package impl

import types._
import tipe._

sealed trait DslDateStub
    extends `tipe.Date`
    with DslImpl
    with TipeUnconstrainedType {

  def dslDesc = "Date"
}

case object `Date`         extends DslDateStub with `box.One`
case object `Date?`        extends DslDateStub with `box.Opt`
case object `Date[]`       extends DslDateStub with `box.Array`
case object `List<Date>`   extends DslDateStub with `box.List`
case object `Set<Date>`    extends DslDateStub with `box.Set`
case object `Date[]?`      extends DslDateStub with `box.OptArray`
case object `List<Date>?`  extends DslDateStub with `box.OptList`
case object `Set<Date>?`   extends DslDateStub with `box.OptSet`
case object `Date?[]`      extends DslDateStub with `box.ArrayOpt`
case object `List<Date?>`  extends DslDateStub with `box.ListOpt`
case object `Set<Date?>`   extends DslDateStub with `box.SetOpt`
case object `Date?[]?`     extends DslDateStub with `box.OptArrayOpt`
case object `List<Date?>?` extends DslDateStub with `box.OptListOpt`
case object `Set<Date?>?`  extends DslDateStub with `box.OptSetOpt`
