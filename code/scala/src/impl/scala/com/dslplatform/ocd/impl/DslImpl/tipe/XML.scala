package com.dslplatform.ocd
package impl

import types._
import tipe._

sealed trait DslXMLStub
    extends `tipe.Xml`
    with DslImpl
    with TipeUnconstrainedType {

  def dslDesc = "XML"
}

case object `XML`         extends DslXMLStub with `box.One`
case object `XML?`        extends DslXMLStub with `box.Opt`
case object `XML[]`       extends DslXMLStub with `box.Array`
case object `List<XML>`   extends DslXMLStub with `box.List`
case object `Set<XML>`    extends DslXMLStub with `box.Set`
case object `XML[]?`      extends DslXMLStub with `box.OptArray`
case object `List<XML>?`  extends DslXMLStub with `box.OptList`
case object `Set<XML>?`   extends DslXMLStub with `box.OptSet`
case object `XML?[]`      extends DslXMLStub with `box.ArrayOpt`
case object `List<XML?>`  extends DslXMLStub with `box.ListOpt`
case object `Set<XML?>`   extends DslXMLStub with `box.SetOpt`
case object `XML?[]?`     extends DslXMLStub with `box.OptArrayOpt`
case object `List<XML?>?` extends DslXMLStub with `box.OptListOpt`
case object `Set<XML?>?`  extends DslXMLStub with `box.OptSetOpt`
