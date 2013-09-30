package com.dslplatform.ocd

sealed trait DslDateStub
    extends TipeDateType
    with TipeUnconstrainedType {
  def dslType = "Date"
}

case object `dsl.Date`         extends DslDateStub with DslOneImpl
case object `dsl.Date?`        extends DslDateStub with DslOptImpl
case object `dsl.Date[]`       extends DslDateStub with DslArrImpl
case object `dsl.List<Date>`   extends DslDateStub with DslListImpl
case object `dsl.Set<Date>`    extends DslDateStub with DslSetImpl
case object `dsl.Date[]?`      extends DslDateStub with DslOptArrImpl
case object `dsl.List<Date>?`  extends DslDateStub with DslOptListImpl
case object `dsl.Set<Date>?`   extends DslDateStub with DslOptSetImpl
case object `dsl.Date?[]`      extends DslDateStub with DslArrOptImpl
case object `dsl.List<Date?>`  extends DslDateStub with DslListOptImpl
case object `dsl.Set<Date?>`   extends DslDateStub with DslSetOptImpl
case object `dsl.Date?[]?`     extends DslDateStub with DslOptArrOptImpl
case object `dsl.List<Date?>?` extends DslDateStub with DslOptListOptImpl
case object `dsl.Set<Date?>?`  extends DslDateStub with DslOptSetOptImpl
