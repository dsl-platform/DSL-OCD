package com.dslplatform.ocd

sealed trait DslXMLStub
    extends TipeXmlType
    with TipeUnconstrainedType {
  def dslType = "XML"
}

case object `dsl.XML`         extends DslXMLStub with DslOneImpl
case object `dsl.XML?`        extends DslXMLStub with DslOptImpl
case object `dsl.XML[]`       extends DslXMLStub with DslArrImpl
case object `dsl.List<XML>`   extends DslXMLStub with DslListImpl
case object `dsl.Set<XML>`    extends DslXMLStub with DslSetImpl
case object `dsl.XML[]?`      extends DslXMLStub with DslOptArrImpl
case object `dsl.List<XML>?`  extends DslXMLStub with DslOptListImpl
case object `dsl.Set<XML>?`   extends DslXMLStub with DslOptSetImpl
case object `dsl.XML?[]`      extends DslXMLStub with DslArrOptImpl
case object `dsl.List<XML?>`  extends DslXMLStub with DslListOptImpl
case object `dsl.Set<XML?>`   extends DslXMLStub with DslSetOptImpl
case object `dsl.XML?[]?`     extends DslXMLStub with DslOptArrOptImpl
case object `dsl.List<XML?>?` extends DslXMLStub with DslOptListOptImpl
case object `dsl.Set<XML?>?`  extends DslXMLStub with DslOptSetOptImpl
