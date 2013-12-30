package com.dslplatform.ocd
package impl

import box._
import types._
import tipe._

sealed trait JavaFloatStub
    extends JavaImpl
    with `tipe.Float`
    with TipeUnconstrainedType
    with TipePrimitiveType
    with TipeStableType {

  def javaDesc = "Float"
}

case object `java.Float` extends JavaFloatStub with JavaOne {
  def javaClass = "float"
  def defaultValue = "0.0f"
}

case object `java.Float?` extends JavaFloatStub with JavaOpt {
  def javaClass = "Float"
  def defaultValue = "null"
}

case object `java.Float[]` extends JavaFloatStub with JavaArray {
  def javaClass = "float[]"
  def defaultValue = "new float[0]"
}

case object `java.Float?[]` extends JavaFloatStub with JavaArrayOpt {
  def javaClass = "Float[]"
  def defaultValue = "new Float[0]"
}

case object `java.Float[]?` extends JavaFloatStub with JavaOptArray {
  def javaClass = "float[]"
  def defaultValue = "null"
}

case object `java.Float?[]?` extends JavaFloatStub with JavaOptArrayOpt {
  def javaClass = "Float[]"
  def defaultValue = "null"
}

case object `java.List<Float>` extends JavaFloatStub with JavaList {
  def javaClass = "List<Float>"
  def defaultValue = "new ArrayList<Float>(0)"
}

case object `java.List<Float?>` extends JavaFloatStub with JavaListOpt {
  def javaClass = "List<Float>"
  def defaultValue = "new ArrayList<Float>(0)"
}

case object `java.List<Float>?` extends JavaFloatStub with JavaOptList {
  def javaClass = "List<Float>"
  def defaultValue = "null"
}

case object `java.List<Float?>?` extends JavaFloatStub with JavaOptListOpt {
  def javaClass = "List<Float>"
  def defaultValue = "null"
}

case object `java.Set<Float>` extends JavaFloatStub with JavaSet {
  def javaClass = "Set<Float>"
  def defaultValue = "new HashSet<Float>(0)"
}

case object `java.Set<Float?>` extends JavaFloatStub with JavaSetOpt {
  def javaClass = "Set<Float>"
  def defaultValue = "new HashSet<Float>(0)"
}

case object `java.Set<Float>?` extends JavaFloatStub with JavaOptSet {
  def javaClass = "Set<Float>"
  def defaultValue = "null"
}

case object `java.Set<Float?>?` extends JavaFloatStub with JavaOptSetOpt {
  def javaClass = "Set<Float>"
  def defaultValue = "null"
}
