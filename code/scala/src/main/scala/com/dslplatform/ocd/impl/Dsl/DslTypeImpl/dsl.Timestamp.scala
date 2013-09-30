package com.dslplatform.ocd

sealed trait DslTimestampStub
    extends TipeTimestampType
    with TipeUnconstrainedType {
  def dslType = "Timestamp"
}

case object `dsl.Timestamp`         extends DslTimestampStub with DslOneImpl
case object `dsl.Timestamp?`        extends DslTimestampStub with DslOptImpl
case object `dsl.Timestamp[]`       extends DslTimestampStub with DslArrImpl
case object `dsl.List<Timestamp>`   extends DslTimestampStub with DslListImpl
case object `dsl.Set<Timestamp>`    extends DslTimestampStub with DslSetImpl
case object `dsl.Timestamp[]?`      extends DslTimestampStub with DslOptArrImpl
case object `dsl.List<Timestamp>?`  extends DslTimestampStub with DslOptListImpl
case object `dsl.Set<Timestamp>?`   extends DslTimestampStub with DslOptSetImpl
case object `dsl.Timestamp?[]`      extends DslTimestampStub with DslArrOptImpl
case object `dsl.List<Timestamp?>`  extends DslTimestampStub with DslListOptImpl
case object `dsl.Set<Timestamp?>`   extends DslTimestampStub with DslSetOptImpl
case object `dsl.Timestamp?[]?`     extends DslTimestampStub with DslOptArrOptImpl
case object `dsl.List<Timestamp?>?` extends DslTimestampStub with DslOptListOptImpl
case object `dsl.Set<Timestamp?>?`  extends DslTimestampStub with DslOptSetOptImpl
