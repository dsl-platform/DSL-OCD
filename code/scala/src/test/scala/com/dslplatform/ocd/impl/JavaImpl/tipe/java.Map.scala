package com.dslplatform.ocd
package impl

import box._
import types._
import tipe._

sealed trait JavaMapStub
    extends JavaImpl
    with `tipe.KeyValue`
    with TipeUnconstrainedType
    with TipeEqualsComparableType
    with TipeStableType {

  def javaDesc = "Map"
}

case object `java.Map` extends JavaMapStub with JavaOne {
  def javaClass = "Map<String, String>"
  def defaultValue = "new HashMap<String, String>(0)"
}

case object `java.Map?` extends JavaMapStub with JavaOpt {
  def javaClass = "Map<String, String>"
  def defaultValue = "null"
}

case object `java.Map[]` extends JavaMapStub with JavaArray {
  def javaClass = "Map<String, String>[]"
  def defaultValue = "new HashMap[0]"
}

case object `java.Map?[]` extends JavaMapStub with JavaArrayOpt {
  def javaClass = "Map<String, String>[]"
  def defaultValue = "new HashMap[0]"
}

case object `java.Map[]?` extends JavaMapStub with JavaOptArray {
  def javaClass = "Map<String, String>[]"
  def defaultValue = "null"
}

case object `java.Map?[]?` extends JavaMapStub with JavaOptArrayOpt {
  def javaClass = "Map<String, String>[]"
  def defaultValue = "null"
}

case object `java.List<Map>` extends JavaMapStub with JavaList {
  def javaClass = "List<Map<String, String>>"
  def defaultValue = "new ArrayList<Map<String, String>>(0)"
}

case object `java.List<Map?>` extends JavaMapStub with JavaListOpt {
  def javaClass = "List<Map<String, String>>"
  def defaultValue = "new ArrayList<Map<String, String>>(0)"
}

case object `java.List<Map>?` extends JavaMapStub with JavaOptList {
  def javaClass = "List<Map<String, String>>"
  def defaultValue = "null"
}

case object `java.List<Map?>?` extends JavaMapStub with JavaOptListOpt {
  def javaClass = "List<Map<String, String>>"
  def defaultValue = "null"
}

case object `java.Set<Map>` extends JavaMapStub with JavaSet {
  def javaClass = "Set<Map<String, String>>"
  def defaultValue = "new HashSet<Map<String, String>>(0)"
}

case object `java.Set<Map?>` extends JavaMapStub with JavaSetOpt {
  def javaClass = "Set<Map<String, String>>"
  def defaultValue = "new HashSet<Map<String, String>>(0)"
}

case object `java.Set<Map>?` extends JavaMapStub with JavaOptSet {
  def javaClass = "Set<Map<String, String>>"
  def defaultValue = "null"
}

case object `java.Set<Map?>?` extends JavaMapStub with JavaOptSetOpt {
  def javaClass = "Set<Map<String, String>>"
  def defaultValue = "null"
}
