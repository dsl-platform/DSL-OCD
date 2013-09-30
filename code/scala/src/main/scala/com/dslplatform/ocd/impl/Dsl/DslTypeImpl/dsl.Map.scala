package com.dslplatform.ocd

sealed trait DslMapStub
    extends TipeKeyValueType
    with TipeUnconstrainedType {
  def dslType = "Map"
}

case object `dsl.Map`         extends DslMapStub with DslOneImpl
case object `dsl.Map?`        extends DslMapStub with DslOptImpl
case object `dsl.Map[]`       extends DslMapStub with DslArrImpl
case object `dsl.List<Map>`   extends DslMapStub with DslListImpl
case object `dsl.Set<Map>`    extends DslMapStub with DslSetImpl
case object `dsl.Map[]?`      extends DslMapStub with DslOptArrImpl
case object `dsl.List<Map>?`  extends DslMapStub with DslOptListImpl
case object `dsl.Set<Map>?`   extends DslMapStub with DslOptSetImpl
case object `dsl.Map?[]`      extends DslMapStub with DslArrOptImpl
case object `dsl.List<Map?>`  extends DslMapStub with DslListOptImpl
case object `dsl.Set<Map?>`   extends DslMapStub with DslSetOptImpl
case object `dsl.Map?[]?`     extends DslMapStub with DslOptArrOptImpl
case object `dsl.List<Map?>?` extends DslMapStub with DslOptListOptImpl
case object `dsl.Set<Map?>?`  extends DslMapStub with DslOptSetOptImpl
