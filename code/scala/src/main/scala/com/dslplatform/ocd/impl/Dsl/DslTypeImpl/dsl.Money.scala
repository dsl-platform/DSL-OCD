package com.dslplatform.ocd

sealed trait DslMoneyStub
    extends TipeMoneyType
    with TipeUnconstrainedType {
  def dslType = "Money"
}

case object `dsl.Money`         extends DslMoneyStub with DslOneImpl
case object `dsl.Money?`        extends DslMoneyStub with DslOptImpl
case object `dsl.Money[]`       extends DslMoneyStub with DslArrImpl
case object `dsl.List<Money>`   extends DslMoneyStub with DslListImpl
case object `dsl.Set<Money>`    extends DslMoneyStub with DslSetImpl
case object `dsl.Money[]?`      extends DslMoneyStub with DslOptArrImpl
case object `dsl.List<Money>?`  extends DslMoneyStub with DslOptListImpl
case object `dsl.Set<Money>?`   extends DslMoneyStub with DslOptSetImpl
case object `dsl.Money?[]`      extends DslMoneyStub with DslArrOptImpl
case object `dsl.List<Money?>`  extends DslMoneyStub with DslListOptImpl
case object `dsl.Set<Money?>`   extends DslMoneyStub with DslSetOptImpl
case object `dsl.Money?[]?`     extends DslMoneyStub with DslOptArrOptImpl
case object `dsl.List<Money?>?` extends DslMoneyStub with DslOptListOptImpl
case object `dsl.Set<Money?>?`  extends DslMoneyStub with DslOptSetOptImpl
