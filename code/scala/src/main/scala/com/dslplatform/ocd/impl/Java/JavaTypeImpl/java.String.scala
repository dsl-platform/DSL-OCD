//package com.dslplatform.ocd
//
//sealed trait JavaStringStub
//    extends JavaImplStub
//    with TipeStringType
//    with TipeUnconstrainedType
//    with TipeComplexType
//    with TipeStableType {
//
//  def EmptyString = "\"\""
//}
//
//case object `java.String`
//    extends JavaStringStub
//    with JavaOneImpl {
//
//  def javaType = "String"
//  def defaultValue = EmptyString
//}
