package com.dslplatform.ocd
package impl

import box._
import types._
import tipe._

sealed trait JavaXMLStub
    extends JavaImpl
    with `tipe.Xml`
    with TipeUnconstrainedType
    with TipeSpecialEqualsType
    with TipeStableType {

  def javaDesc = "XML"
}

case object `java.XML` extends JavaXMLStub with JavaOne {
  def javaClass = "org.w3c.dom.Element"
  def defaultValue = "null"
}

case object `java.XML?` extends JavaXMLStub with JavaOpt {
  def javaClass = "org.w3c.dom.Element"
  def defaultValue = "null"
}

case object `java.XML[]` extends JavaXMLStub with JavaArray {
  def javaClass = "org.w3c.dom.Element[]"
  def defaultValue = "new org.w3c.dom.Element[0]"
}

case object `java.XML?[]` extends JavaXMLStub with JavaArrayOpt {
  def javaClass = "org.w3c.dom.Element[]"
  def defaultValue = "new org.w3c.dom.Element[0]"
}

case object `java.XML[]?` extends JavaXMLStub with JavaOptArray {
  def javaClass = "org.w3c.dom.Element[]"
  def defaultValue = "null"
}

case object `java.XML?[]?` extends JavaXMLStub with JavaOptArrayOpt {
  def javaClass = "org.w3c.dom.Element[]"
  def defaultValue = "null"
}

case object `java.List<XML>` extends JavaXMLStub with JavaList {
  def javaClass = "List<org.w3c.dom.Element>"
  def defaultValue = "new ArrayList<org.w3c.dom.Element>(0)"
}

case object `java.List<XML?>` extends JavaXMLStub with JavaListOpt {
  def javaClass = "List<org.w3c.dom.Element>"
  def defaultValue = "new ArrayList<org.w3c.dom.Element>(0)"
}

case object `java.List<XML>?` extends JavaXMLStub with JavaOptList {
  def javaClass = "List<org.w3c.dom.Element>"
  def defaultValue = "null"
}

case object `java.List<XML?>?` extends JavaXMLStub with JavaOptListOpt {
  def javaClass = "List<org.w3c.dom.Element>"
  def defaultValue = "null"
}

case object `java.Set<XML>` extends JavaXMLStub with JavaSet {
  def javaClass = "Set<org.w3c.dom.Element>"
  def defaultValue = "new HashSet<org.w3c.dom.Element>(0)"
}

case object `java.Set<XML?>` extends JavaXMLStub with JavaSetOpt {
  def javaClass = "Set<org.w3c.dom.Element>"
  def defaultValue = "new HashSet<org.w3c.dom.Element>(0)"
}

case object `java.Set<XML>?` extends JavaXMLStub with JavaOptSet {
  def javaClass = "Set<org.w3c.dom.Element>"
  def defaultValue = "null"
}

case object `java.Set<XML?>?` extends JavaXMLStub with JavaOptSetOpt {
  def javaClass = "Set<org.w3c.dom.Element>"
  def defaultValue = "null"
}
