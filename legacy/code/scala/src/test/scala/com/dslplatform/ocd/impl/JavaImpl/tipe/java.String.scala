package com.dslplatform.ocd
package impl

import box._
import types._
import tipe._

sealed trait JavaStringStub
    extends JavaImpl
    with `tipe.String`
    with TipeUnconstrainedType
    with TipeEqualsComparableType
    with TipeStableType {

  def javaDesc = "String"
}

case object `java.String` extends JavaStringStub with JavaOne {
  def javaClass = "String"
  def defaultValue = "\"\""
}

case object `java.String?` extends JavaStringStub with JavaOpt {
  def javaClass = "String"
  def defaultValue = "null"
}

case object `java.String[]` extends JavaStringStub with JavaArray {
  def javaClass = "String[]"
  def defaultValue = "new String[0]"
}

case object `java.String?[]` extends JavaStringStub with JavaArrayOpt {
  def javaClass = "String[]"
  def defaultValue = "new String[0]"
}

case object `java.String[]?` extends JavaStringStub with JavaOptArray {
  def javaClass = "String[]"
  def defaultValue = "null"
}

case object `java.String?[]?` extends JavaStringStub with JavaOptArrayOpt {
  def javaClass = "String[]"
  def defaultValue = "null"
}

case object `java.List<String>` extends JavaStringStub with JavaList {
  def javaClass = "List<String>"
  def defaultValue = "new ArrayList<String>(0)"
}

case object `java.List<String?>` extends JavaStringStub with JavaListOpt {
  def javaClass = "List<String>"
  def defaultValue = "new ArrayList<String>(0)"
}

case object `java.List<String>?` extends JavaStringStub with JavaOptList {
  def javaClass = "List<String>"
  def defaultValue = "null"
}

case object `java.List<String?>?` extends JavaStringStub with JavaOptListOpt {
  def javaClass = "List<String>"
  def defaultValue = "null"
}

case object `java.Set<String>` extends JavaStringStub with JavaSet {
  def javaClass = "Set<String>"
  def defaultValue = "new HashSet<String>(0)"
}

case object `java.Set<String?>` extends JavaStringStub with JavaSetOpt {
  def javaClass = "Set<String>"
  def defaultValue = "new HashSet<String>(0)"
}

case object `java.Set<String>?` extends JavaStringStub with JavaOptSet {
  def javaClass = "Set<String>"
  def defaultValue = "null"
}

case object `java.Set<String?>?` extends JavaStringStub with JavaOptSetOpt {
  def javaClass = "Set<String>"
  def defaultValue = "null"
}
