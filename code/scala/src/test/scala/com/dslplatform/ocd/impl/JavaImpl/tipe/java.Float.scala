package com.dslplatform.ocd
package impl

import box._
import types._
import tipe._

sealed trait JavaFloatStub
    extends JavaImpl
    with `tipe.Float`
    with TipeUnconstrainedType
    with TipeScalarnessType
    with TipeStableType {

  def javaDesc = "Float"
}

case object `java.Float` extends JavaFloatStub with JavaOne
    with TipeScalarType {
  def javaClass = "float"
  def defaultValue = "0.0f"
}

case object `java.Float?` extends JavaFloatStub with JavaOpt
    with TipeReferenceType {
  def javaClass = "Float"
  def defaultValue = "null"
}

case object `java.Float[]` extends JavaFloatStub with JavaArray
    with TipeReferenceType {
  def javaClass = "float[]"
  def defaultValue = "new float[0]"
}

case object `java.Float?[]` extends JavaFloatStub with JavaArrayOpt
    with TipeReferenceType {
  def javaClass = "Float[]"
  def defaultValue = "new Float[0]"
}

case object `java.Float[]?` extends JavaFloatStub with JavaOptArray
    with TipeReferenceType {
  def javaClass = "float[]"
  def defaultValue = "null"
}

case object `java.Float?[]?` extends JavaFloatStub with JavaOptArrayOpt
    with TipeReferenceType {
  def javaClass = "Float[]"
  def defaultValue = "null"
}

case object `java.List<Float>` extends JavaFloatStub with JavaList
    with TipeReferenceType {
  def javaClass = "List<Float>"
  def defaultValue = "new ArrayList<Float>(0)"
}

case object `java.List<Float?>` extends JavaFloatStub with JavaListOpt
    with TipeReferenceType {
  def javaClass = "List<Float>"
  def defaultValue = "new ArrayList<Float>(0)"
}

case object `java.List<Float>?` extends JavaFloatStub with JavaOptList
    with TipeReferenceType {
  def javaClass = "List<Float>"
  def defaultValue = "null"
}

case object `java.List<Float?>?` extends JavaFloatStub with JavaOptListOpt
    with TipeReferenceType {
  def javaClass = "List<Float>"
  def defaultValue = "null"
}

case object `java.Set<Float>` extends JavaFloatStub with JavaSet
    with TipeReferenceType {
  def javaClass = "Set<Float>"
  def defaultValue = "new HashSet<Float>(0)"
}

case object `java.Set<Float?>` extends JavaFloatStub with JavaSetOpt
    with TipeReferenceType {
  def javaClass = "Set<Float>"
  def defaultValue = "new HashSet<Float>(0)"
}

case object `java.Set<Float>?` extends JavaFloatStub with JavaOptSet
    with TipeReferenceType {
  def javaClass = "Set<Float>"
  def defaultValue = "null"
}

case object `java.Set<Float?>?` extends JavaFloatStub with JavaOptSetOpt
    with TipeReferenceType {
  def javaClass = "Set<Float>"
  def defaultValue = "null"
}
