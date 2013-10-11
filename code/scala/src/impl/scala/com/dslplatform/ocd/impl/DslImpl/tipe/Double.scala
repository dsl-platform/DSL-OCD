package com.dslplatform.ocd
package impl

import types._
import tipe._

sealed trait DslDoubleStub
    extends `tipe.Double`
    with DslImpl
    with TipeUnconstrainedType {

  def dslDesc = "Double"
}

case object `Double`         extends DslDoubleStub with `box.One`
case object `Double?`        extends DslDoubleStub with `box.Opt`
case object `Double[]`       extends DslDoubleStub with `box.Array`
case object `List<Double>`   extends DslDoubleStub with `box.List`
case object `Set<Double>`    extends DslDoubleStub with `box.Set`
case object `Double[]?`      extends DslDoubleStub with `box.OptArray`
case object `List<Double>?`  extends DslDoubleStub with `box.OptList`
case object `Set<Double>?`   extends DslDoubleStub with `box.OptSet`
case object `Double?[]`      extends DslDoubleStub with `box.ArrayOpt`
case object `List<Double?>`  extends DslDoubleStub with `box.ListOpt`
case object `Set<Double?>`   extends DslDoubleStub with `box.SetOpt`
case object `Double?[]?`     extends DslDoubleStub with `box.OptArrayOpt`
case object `List<Double?>?` extends DslDoubleStub with `box.OptListOpt`
case object `Set<Double?>?`  extends DslDoubleStub with `box.OptSetOpt`
