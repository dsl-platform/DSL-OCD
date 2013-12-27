//package com.dslplatform.ocd
//package impl
//
//import box._
//import types._
//import tipe._
//
//sealed trait JavaBinaryStub
//    extends JavaImpl
//    with `tipe.Binary`
//    with TipeUnconstrainedType
//    with TipeSpecialEqualsType
//    with TipeStableType {
//
//  def javaDesc = "byte[]"
//}
//
//case object `java.Binary`         extends JavaBinaryStub with JavaOne
//case object `java.Binary?`        extends JavaBinaryStub with JavaOpt
//case object `java.Binary[]`       extends JavaBinaryStub with JavaArray
//case object `java.List<Binary>`   extends JavaBinaryStub with JavaList
//case object `java.Set<Binary>`    extends JavaBinaryStub with JavaSet
//case object `java.Binary[]?`      extends JavaBinaryStub with JavaOptArray
//case object `java.List<Binary>?`  extends JavaBinaryStub with JavaOptList
//case object `java.Set<Binary>?`   extends JavaBinaryStub with JavaOptSet
//case object `java.Binary?[]`      extends JavaBinaryStub with JavaArrayOpt
//case object `java.List<Binary?>`  extends JavaBinaryStub with JavaListOpt
//case object `java.Set<Binary?>`   extends JavaBinaryStub with JavaSetOpt
//case object `java.Binary?[]?`     extends JavaBinaryStub with JavaOptArrayOpt
//case object `java.List<Binary?>?` extends JavaBinaryStub with JavaOptListOpt
//case object `java.Set<Binary?>?`  extends JavaBinaryStub with JavaOptSetOpt
