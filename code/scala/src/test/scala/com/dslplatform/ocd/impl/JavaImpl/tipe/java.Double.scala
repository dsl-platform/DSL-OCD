package com.dslplatform.ocd
package impl

import box._
import types._
import tipe._

sealed trait JavaDoubleStub
    extends JavaImpl
    with `tipe.Double`
    with TipeUnconstrainedType
    with TipeScalarnessType
    with TipeStableType {

  def javaDesc = "Double"
}

case object `java.Double` extends JavaDoubleStub with JavaOne
    with TipeScalarType {
  def javaClass = "double"
  def defaultValue = "0.0"
}

case object `java.Double?` extends JavaDoubleStub with JavaOpt
    with TipeReferenceType {
  def javaClass = "Double"
  def defaultValue = "null"
}

case object `java.Double[]` extends JavaDoubleStub with JavaArray
    with TipeReferenceType {
  def javaClass = "double[]"
  def defaultValue = "new double[0]"
}

case object `java.Double?[]` extends JavaDoubleStub with JavaArrayOpt
    with TipeReferenceType {
  def javaClass = "Double[]"
  def defaultValue = "new Double[0]"
}

case object `java.Double[]?` extends JavaDoubleStub with JavaOptArray
    with TipeReferenceType {
  def javaClass = "double[]"
  def defaultValue = "null"
}

case object `java.Double?[]?` extends JavaDoubleStub with JavaOptArrayOpt
    with TipeReferenceType {
  def javaClass = "Double[]"
  def defaultValue = "null"
}

case object `java.List<Double>` extends JavaDoubleStub with JavaList
    with TipeReferenceType {
  def javaClass = "List<Double>"
  def defaultValue = "new ArrayList<Double>(0)"
}

case object `java.List<Double?>` extends JavaDoubleStub with JavaListOpt
    with TipeReferenceType {
  def javaClass = "List<Double>"
  def defaultValue = "new ArrayList<Double>(0)"
}

case object `java.List<Double>?` extends JavaDoubleStub with JavaOptList
    with TipeReferenceType {
  def javaClass = "List<Double>"
  def defaultValue = "null"
}

case object `java.List<Double?>?` extends JavaDoubleStub with JavaOptListOpt
    with TipeReferenceType {
  def javaClass = "List<Double>"
  def defaultValue = "null"
}

case object `java.Set<Double>` extends JavaDoubleStub with JavaSet
    with TipeReferenceType {
  def javaClass = "Set<Double>"
  def defaultValue = "new HashSet<Double>(0)"
}

case object `java.Set<Double?>` extends JavaDoubleStub with JavaSetOpt
    with TipeReferenceType {
  def javaClass = "Set<Double>"
  def defaultValue = "new HashSet<Double>(0)"
}

case object `java.Set<Double>?` extends JavaDoubleStub with JavaOptSet
    with TipeReferenceType {
  def javaClass = "Set<Double>"
  def defaultValue = "null"
}

case object `java.Set<Double?>?` extends JavaDoubleStub with JavaOptSetOpt
    with TipeReferenceType {
  def javaClass = "Set<Double>"
  def defaultValue = "null"
}
