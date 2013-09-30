package com.dslplatform.ocd

sealed trait DslIntStub
    extends TipeIntegerType
    with TipeUnconstrainedType {
  def dslType = "Int"
}

case object `dsl.Int`         extends DslIntStub with DslOneImpl
case object `dsl.Int?`        extends DslIntStub with DslOptImpl
case object `dsl.Int[]`       extends DslIntStub with DslArrImpl
case object `dsl.List<Int>`   extends DslIntStub with DslListImpl
case object `dsl.Set<Int>`    extends DslIntStub with DslSetImpl
case object `dsl.Int[]?`      extends DslIntStub with DslOptArrImpl
case object `dsl.List<Int>?`  extends DslIntStub with DslOptListImpl
case object `dsl.Set<Int>?`   extends DslIntStub with DslOptSetImpl
case object `dsl.Int?[]`      extends DslIntStub with DslArrOptImpl
case object `dsl.List<Int?>`  extends DslIntStub with DslListOptImpl
case object `dsl.Set<Int?>`   extends DslIntStub with DslSetOptImpl
case object `dsl.Int?[]?`     extends DslIntStub with DslOptArrOptImpl
case object `dsl.List<Int?>?` extends DslIntStub with DslOptListOptImpl
case object `dsl.Set<Int?>?`  extends DslIntStub with DslOptSetOptImpl
