package com.dslplatform.ocd

sealed trait DslUUIDStub
    extends TipeGuidType
    with TipeUnconstrainedType {
  def dslType = "UUID"
}

case object `dsl.UUID`         extends DslUUIDStub with DslOneImpl
case object `dsl.UUID?`        extends DslUUIDStub with DslOptImpl
case object `dsl.UUID[]`       extends DslUUIDStub with DslArrImpl
case object `dsl.List<UUID>`   extends DslUUIDStub with DslListImpl
case object `dsl.Set<UUID>`    extends DslUUIDStub with DslSetImpl
case object `dsl.UUID[]?`      extends DslUUIDStub with DslOptArrImpl
case object `dsl.List<UUID>?`  extends DslUUIDStub with DslOptListImpl
case object `dsl.Set<UUID>?`   extends DslUUIDStub with DslOptSetImpl
case object `dsl.UUID?[]`      extends DslUUIDStub with DslArrOptImpl
case object `dsl.List<UUID?>`  extends DslUUIDStub with DslListOptImpl
case object `dsl.Set<UUID?>`   extends DslUUIDStub with DslSetOptImpl
case object `dsl.UUID?[]?`     extends DslUUIDStub with DslOptArrOptImpl
case object `dsl.List<UUID?>?` extends DslUUIDStub with DslOptListOptImpl
case object `dsl.Set<UUID?>?`  extends DslUUIDStub with DslOptSetOptImpl
