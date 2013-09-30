package com.dslplatform.ocd

sealed trait DslDoubleStub
    extends TipeDoubleType
    with TipeUnconstrainedType {
  def dslType = "Double"
}

case object `dsl.Double`         extends DslDoubleStub with DslOneImpl
case object `dsl.Double?`        extends DslDoubleStub with DslOptImpl
case object `dsl.Double[]`       extends DslDoubleStub with DslArrImpl
case object `dsl.List<Double>`   extends DslDoubleStub with DslListImpl
case object `dsl.Set<Double>`    extends DslDoubleStub with DslSetImpl
case object `dsl.Double[]?`      extends DslDoubleStub with DslOptArrImpl
case object `dsl.List<Double>?`  extends DslDoubleStub with DslOptListImpl
case object `dsl.Set<Double>?`   extends DslDoubleStub with DslOptSetImpl
case object `dsl.Double?[]`      extends DslDoubleStub with DslArrOptImpl
case object `dsl.List<Double?>`  extends DslDoubleStub with DslListOptImpl
case object `dsl.Set<Double?>`   extends DslDoubleStub with DslSetOptImpl
case object `dsl.Double?[]?`     extends DslDoubleStub with DslOptArrOptImpl
case object `dsl.List<Double?>?` extends DslDoubleStub with DslOptListOptImpl
case object `dsl.Set<Double?>?`  extends DslDoubleStub with DslOptSetOptImpl
