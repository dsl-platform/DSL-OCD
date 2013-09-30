package com.dslplatform.ocd

sealed trait DslBinaryStub
    extends TipeBinaryType
    with TipeUnconstrainedType {
  def dslType = "Binary"
}

case object `dsl.Binary`         extends DslBinaryStub with DslOneImpl
case object `dsl.Binary?`        extends DslBinaryStub with DslOptImpl
case object `dsl.Binary[]`       extends DslBinaryStub with DslArrImpl
case object `dsl.List<Binary>`   extends DslBinaryStub with DslListImpl
case object `dsl.Set<Binary>`    extends DslBinaryStub with DslSetImpl
case object `dsl.Binary[]?`      extends DslBinaryStub with DslOptArrImpl
case object `dsl.List<Binary>?`  extends DslBinaryStub with DslOptListImpl
case object `dsl.Set<Binary>?`   extends DslBinaryStub with DslOptSetImpl
case object `dsl.Binary?[]`      extends DslBinaryStub with DslArrOptImpl
case object `dsl.List<Binary?>`  extends DslBinaryStub with DslListOptImpl
case object `dsl.Set<Binary?>`   extends DslBinaryStub with DslSetOptImpl
case object `dsl.Binary?[]?`     extends DslBinaryStub with DslOptArrOptImpl
case object `dsl.List<Binary?>?` extends DslBinaryStub with DslOptListOptImpl
case object `dsl.Set<Binary?>?`  extends DslBinaryStub with DslOptSetOptImpl
