//package com.dslplatform.ocd
//
//sealed trait JavaBinaryStub
//    extends JavaImplStub
//    with TipeBinaryType
//    with TipeUnconstrainedType
//    with TipeComplexType
//    with TipeStableType
//
//case object `java.Binary`
//    extends JavaBinaryStub
//    with JavaOneImpl {
//
//  def javaType = "byte[]"
//  def defaultValue = "new byte[] {}"
//}
