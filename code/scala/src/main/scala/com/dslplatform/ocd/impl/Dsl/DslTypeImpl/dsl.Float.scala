package com.dslplatform.ocd

sealed trait DslFloatStub
    extends TipeFloatType
    with TipeUnconstrainedType {
  def dslType = "Float"
}

case object `dsl.Float`         extends DslFloatStub with DslOneImpl
case object `dsl.Float?`        extends DslFloatStub with DslOptImpl
case object `dsl.Float[]`       extends DslFloatStub with DslArrImpl
case object `dsl.List<Float>`   extends DslFloatStub with DslListImpl
case object `dsl.Set<Float>`    extends DslFloatStub with DslSetImpl
case object `dsl.Float[]?`      extends DslFloatStub with DslOptArrImpl
case object `dsl.List<Float>?`  extends DslFloatStub with DslOptListImpl
case object `dsl.Set<Float>?`   extends DslFloatStub with DslOptSetImpl
case object `dsl.Float?[]`      extends DslFloatStub with DslArrOptImpl
case object `dsl.List<Float?>`  extends DslFloatStub with DslListOptImpl
case object `dsl.Set<Float?>`   extends DslFloatStub with DslSetOptImpl
case object `dsl.Float?[]?`     extends DslFloatStub with DslOptArrOptImpl
case object `dsl.List<Float?>?` extends DslFloatStub with DslOptListOptImpl
case object `dsl.Set<Float?>?`  extends DslFloatStub with DslOptSetOptImpl
