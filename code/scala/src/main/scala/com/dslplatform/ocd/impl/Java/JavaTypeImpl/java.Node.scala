package com.dslplatform.ocd

sealed trait JavaNodeStub extends JavaImplStub with TipeXmlType with TipeComplexType with TipeUnconstrainedType with TipeStableType

case object `java.Xml` extends JavaNodeStub with JavaOneImpl {
  def javaType = "org.w3c.dom.Node"
  def defaultValue = "new org.w3c.dom.Node()"
}
case object `java.Xml?` extends JavaNodeStub with JavaOptImpl {
  def javaType = "org.w3c.dom.Node"
  def defaultValue = "null"
}
case object `java.Xml[]` extends JavaNodeStub with JavaArrImpl {
  def javaType = "org.w3c.dom.Node[]"
  def defaultValue = "{}"
}
case object `java.Xml?[]` extends JavaNodeStub with JavaArrOptImpl {
  def javaType = "org.w3c.dom.Node[]"
  def defaultValue = "{}"
}
case object `java.Xml[]?` extends JavaNodeStub with JavaOptArrImpl {
  def javaType = "org.w3c.dom.Node[]"
  def defaultValue = "null"
}
case object `java.Xml?[]?` extends JavaNodeStub with JavaOptArrOptImpl {
  def javaType = "org.w3c.dom.Node[]"
  def defaultValue = "null"
}
case object `java.List<Xml>` extends JavaNodeStub with JavaListImpl {
  def javaType = "ArrayList<org.w3c.dom.Node>"
  def defaultValue = "new ArrayList<org.w3c.dom.Node>()"
}
case object `java.List<Xml?>` extends JavaNodeStub with JavaListOptImpl {
  def javaType = "ArrayList<org.w3c.dom.Node>"
  def defaultValue = "new ArrayList<org.w3c.dom.Node>()"
}
case object `java.List<Xml>?` extends JavaNodeStub with JavaOptListImpl {
  def javaType = "ArrayList<org.w3c.dom.Node>"
  def defaultValue = "null"
}
case object `java.List<Xml?>?` extends JavaNodeStub with JavaOptListOptImpl {
  def javaType = "ArrayList<org.w3c.dom.Node>"
  def defaultValue = "null"
}
case object `java.Set<Xml>` extends JavaNodeStub with JavaSetImpl {
  def javaType = "HashSet<org.w3c.dom.Node>"
  def defaultValue = "new HashSet<org.w3c.dom.Node>()"
}
case object `java.Set<Xml?>` extends JavaNodeStub with JavaSetOptImpl {
  def javaType = "HashSet<org.w3c.dom.Node>"
  def defaultValue = "new HashSet<org.w3c.dom.Node>()"
}
case object `java.Set<Xml>?` extends JavaNodeStub with JavaOptSetImpl {
  def javaType = "HashSet<org.w3c.dom.Node>"
  def defaultValue = "null"
}
case object `java.Set<Xml?>?` extends JavaNodeStub with JavaOptSetOptImpl {
  def javaType = "HashSet<org.w3c.dom.Node>"
  def defaultValue = "null"
}
