package com.dslplatform.ocd
package impl

import types._
import tipe._

sealed trait DslUUIDStub
    extends `tipe.Guid`
    with DslImpl
    with TipeUnconstrainedType {

  def dslDesc = "UUID"
}

case object `UUID`         extends DslUUIDStub with `box.One`
case object `UUID?`        extends DslUUIDStub with `box.Opt`
case object `UUID[]`       extends DslUUIDStub with `box.Array`
case object `List<UUID>`   extends DslUUIDStub with `box.List`
case object `Set<UUID>`    extends DslUUIDStub with `box.Set`
case object `UUID[]?`      extends DslUUIDStub with `box.OptArray`
case object `List<UUID>?`  extends DslUUIDStub with `box.OptList`
case object `Set<UUID>?`   extends DslUUIDStub with `box.OptSet`
case object `UUID?[]`      extends DslUUIDStub with `box.ArrayOpt`
case object `List<UUID?>`  extends DslUUIDStub with `box.ListOpt`
case object `Set<UUID?>`   extends DslUUIDStub with `box.SetOpt`
case object `UUID?[]?`     extends DslUUIDStub with `box.OptArrayOpt`
case object `List<UUID?>?` extends DslUUIDStub with `box.OptListOpt`
case object `Set<UUID?>?`  extends DslUUIDStub with `box.OptSetOpt`
