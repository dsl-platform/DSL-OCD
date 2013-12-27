//package com.dslplatform.ocd
//package impl
//
//import box._
//import types._
//import tipe._
//
//sealed trait JavaMapStub
//    extends JavaImpl
//    with `tipe.KeyValue`
//    with TipeUnconstrainedType
//    with TipeEqualsComparableType
//    with TipeStableType {
//
//  def javaDesc = "java.util.HashMap<String, String>"
//}
//
//case object `java.Map`         extends JavaMapStub with JavaOne
//case object `java.Map?`        extends JavaMapStub with JavaOpt
//case object `java.Map[]`       extends JavaMapStub with JavaArray
//case object `java.List<Map>`   extends JavaMapStub with JavaList
//case object `java.Set<Map>`    extends JavaMapStub with JavaSet
//case object `java.Map[]?`      extends JavaMapStub with JavaOptArray
//case object `java.List<Map>?`  extends JavaMapStub with JavaOptList
//case object `java.Set<Map>?`   extends JavaMapStub with JavaOptSet
//case object `java.Map?[]`      extends JavaMapStub with JavaArrayOpt
//case object `java.List<Map?>`  extends JavaMapStub with JavaListOpt
//case object `java.Set<Map?>`   extends JavaMapStub with JavaSetOpt
//case object `java.Map?[]?`     extends JavaMapStub with JavaOptArrayOpt
//case object `java.List<Map?>?` extends JavaMapStub with JavaOptListOpt
//case object `java.Set<Map?>?`  extends JavaMapStub with JavaOptSetOpt
