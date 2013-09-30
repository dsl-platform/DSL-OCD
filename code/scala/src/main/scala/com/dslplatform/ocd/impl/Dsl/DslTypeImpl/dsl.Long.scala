package com.dslplatform.ocd

sealed trait DslLongStub
    extends TipeLongType
    with TipeUnconstrainedType {
  def dslType = "Long"
}

case object `dsl.Long`         extends DslLongStub with DslOneImpl
case object `dsl.Long?`        extends DslLongStub with DslOptImpl
case object `dsl.Long[]`       extends DslLongStub with DslArrImpl
case object `dsl.List<Long>`   extends DslLongStub with DslListImpl
case object `dsl.Set<Long>`    extends DslLongStub with DslSetImpl
case object `dsl.Long[]?`      extends DslLongStub with DslOptArrImpl
case object `dsl.List<Long>?`  extends DslLongStub with DslOptListImpl
case object `dsl.Set<Long>?`   extends DslLongStub with DslOptSetImpl
case object `dsl.Long?[]`      extends DslLongStub with DslArrOptImpl
case object `dsl.List<Long?>`  extends DslLongStub with DslListOptImpl
case object `dsl.Set<Long?>`   extends DslLongStub with DslSetOptImpl
case object `dsl.Long?[]?`     extends DslLongStub with DslOptArrOptImpl
case object `dsl.List<Long?>?` extends DslLongStub with DslOptListOptImpl
case object `dsl.Set<Long?>?`  extends DslLongStub with DslOptSetOptImpl
