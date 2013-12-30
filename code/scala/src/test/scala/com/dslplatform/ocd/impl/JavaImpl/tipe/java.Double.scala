package com.dslplatform.ocd
package impl

import box._
import types._
import tipe._

sealed trait JavaDoubleStub
    extends JavaImpl
    with `tipe.Double`
    with TipeUnconstrainedType
    with TipePrimitiveType
    with TipeStableType {

  def javaDesc = "Double"
}

case object `java.Double` extends JavaDoubleStub with JavaOne {
  def javaClass = "double"
  def defaultValue = "0.0"
}

case object `java.Double?` extends JavaDoubleStub with JavaOpt {
  def javaClass = "Double"
  def defaultValue = "null"
}

case object `java.Double[]` extends JavaDoubleStub with JavaArray {
  def javaClass = "double[]"
  def defaultValue = "new double[0]"
}

case object `java.Double?[]` extends JavaDoubleStub with JavaArrayOpt {
  def javaClass = "Double[]"
  def defaultValue = "new Double[0]"
}

case object `java.Double[]?` extends JavaDoubleStub with JavaOptArray {
  def javaClass = "double[]"
  def defaultValue = "null"
}

case object `java.Double?[]?` extends JavaDoubleStub with JavaOptArrayOpt {
  def javaClass = "Double[]"
  def defaultValue = "null"
}

case object `java.List<Double>` extends JavaDoubleStub with JavaList {
  def javaClass = "List<Double>"
  def defaultValue = "new ArrayList<Double>(0)"
}

case object `java.List<Double?>` extends JavaDoubleStub with JavaListOpt {
  def javaClass = "List<Double>"
  def defaultValue = "new ArrayList<Double>(0)"
}

case object `java.List<Double>?` extends JavaDoubleStub with JavaOptList {
  def javaClass = "List<Double>"
  def defaultValue = "null"
}

case object `java.List<Double?>?` extends JavaDoubleStub with JavaOptListOpt {
  def javaClass = "List<Double>"
  def defaultValue = "null"
}

case object `java.Set<Double>` extends JavaDoubleStub with JavaSet {
  def javaClass = "Set<Double>"
  def defaultValue = "new HashSet<Double>(0)"
}

case object `java.Set<Double?>` extends JavaDoubleStub with JavaSetOpt {
  def javaClass = "Set<Double>"
  def defaultValue = "new HashSet<Double>(0)"
}

case object `java.Set<Double>?` extends JavaDoubleStub with JavaOptSet {
  def javaClass = "Set<Double>"
  def defaultValue = "null"
}

case object `java.Set<Double?>?` extends JavaDoubleStub with JavaOptSetOpt {
  def javaClass = "Set<Double>"
  def defaultValue = "null"
}
