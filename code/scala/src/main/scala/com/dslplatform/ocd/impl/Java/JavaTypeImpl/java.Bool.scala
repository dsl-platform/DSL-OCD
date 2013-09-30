package com.dslplatform.ocd

sealed trait JavaBoolStub
    extends JavaImplStub
    with TipeBoolType
    with TipeUnconstrainedType
    with TipeScalarType
    with TipeStableType

case object `java.Bool`
    extends JavaBoolStub
    with JavaOneImpl {

  def javaType = "boolean"
  def defaultValue = "false"
}

case object `java.Set<Bool?>?`
    extends JavaBoolStub
    with JavaOptSetOptImpl {

  def javaType = "java.util.HashSet<Boolean>"
}

/*
  case object `java.Bool?`        extends JavaBoolStub with JavaOptImpl        { def javaType = "Boolean" }
  case object `java.Bool[]`       extends JavaBoolStub with JavaArrImpl        { def javaType = "boolean[]" }
  case object `java.List<Bool>`   extends JavaBoolStub with JavaListImpl       { def javaType = "ArrayList<Boolean>" }
  case object `java.Set<Bool>`    extends JavaBoolStub with JavaSetImpl        { def javaType = "HashSet<Boolean>" }
  case object `java.Bool[]?`      extends JavaBoolStub with JavaOptArrImpl     { def javaType = "boolean[]" }
  case object `java.List<Bool>?`  extends JavaBoolStub with JavaOptListImpl    { def javaType = "ArrayList<Boolean>" }
  case object `java.Set<Bool>?`   extends JavaBoolStub with JavaOptSetImpl     { def javaType = "HashSet<Boolean>" }
  case object `java.Bool?[]`      extends JavaBoolStub with JavaArrOptImpl     { def javaType = "Boolean[]" }
  case object `java.List<Bool?>`  extends JavaBoolStub with JavaListOptImpl    { def javaType = "ArrayList<Boolean>" }
  case object `java.Set<Bool?>`   extends JavaBoolStub with JavaSetOptImpl     { def javaType = "HashSet<Boolean>" }
  case object `java.Bool?[]?`     extends JavaBoolStub with JavaOptArrOptImpl  { def javaType = "Booolean[]" }
  case object `java.List<Bool?>?` extends JavaBoolStub with JavaOptListOptImpl { def javaType = "ArrayList<Boolean>" }
  case object `java.Set<Bool?>?`  extends JavaBoolStub with JavaOptSetOptImpl  { def javaType = "HashSet<Boolean>" }
*/
