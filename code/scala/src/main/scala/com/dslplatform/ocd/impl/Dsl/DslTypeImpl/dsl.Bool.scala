package com.dslplatform.ocd

sealed trait DslBoolStub
    extends TipeBoolType
    with TipeUnconstrainedType {
  def dslType = "Bool"
}

case object `dsl.Bool`         extends DslBoolStub with DslOneImpl
case object `dsl.Bool?`        extends DslBoolStub with DslOptImpl
case object `dsl.Bool[]`       extends DslBoolStub with DslArrImpl
case object `dsl.List<Bool>`   extends DslBoolStub with DslListImpl
case object `dsl.Set<Bool>`    extends DslBoolStub with DslSetImpl
case object `dsl.Bool[]?`      extends DslBoolStub with DslOptArrImpl
case object `dsl.List<Bool>?`  extends DslBoolStub with DslOptListImpl
case object `dsl.Set<Bool>?`   extends DslBoolStub with DslOptSetImpl
case object `dsl.Bool?[]`      extends DslBoolStub with DslArrOptImpl
case object `dsl.List<Bool?>`  extends DslBoolStub with DslListOptImpl
case object `dsl.Set<Bool?>`   extends DslBoolStub with DslSetOptImpl
case object `dsl.Bool?[]?`     extends DslBoolStub with DslOptArrOptImpl
case object `dsl.List<Bool?>?` extends DslBoolStub with DslOptListOptImpl
case object `dsl.Set<Bool?>?`  extends DslBoolStub with DslOptSetOptImpl
