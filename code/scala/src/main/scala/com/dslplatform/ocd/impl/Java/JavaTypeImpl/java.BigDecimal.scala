package com.dslplatform.ocd

sealed trait JavaBigDecimalStub
extends JavaImplStub
with TipeDecimalType
with TipeEqualsType
with TipeConstrainedType
with TipeStableType

case object `java.Decimal` extends JavaBigDecimalStub with JavaOneImpl {
  def javaType = "java.math.BigDecimal"
  def defaultValue = "new java.math.BigDecimal(0)"
}

case object `java.Decimal?` extends JavaBigDecimalStub with JavaOptImpl {
  def javaType = "java.math.BigDecimal"
  def defaultValue = "null"
}

case object `java.Decimal[]` extends JavaBigDecimalStub with JavaArrImpl {
  def javaType = "java.math.BigDecimal[]"
  def defaultValue = "{}"
}

case object `java.Decimal?[]` extends JavaBigDecimalStub with JavaArrOptImpl {
  def javaType = "java.math.BigDecimal[]"
  def defaultValue = "{}"
}

case object `java.Decimal[]?` extends JavaBigDecimalStub with JavaOptArrImpl {
  def javaType = "java.math.BigDecimal[]"
  def defaultValue = "null"
}

case object `java.Decimal?[]?` extends JavaBigDecimalStub with JavaOptArrOptImpl {
  def javaType = "java.math.BigDecimal[]"
  def defaultValue = "null"
}

case object `java.List<Decimal>` extends JavaBigDecimalStub with JavaListImpl {
  def javaType = "ArrayList<java.math.BigDecimal>"
  def defaultValue = "new ArrayList<java.math.BigDecimal>()"
}

case object `java.List<Decimal?>` extends JavaBigDecimalStub with JavaListOptImpl {
  def javaType = "ArrayList<java.math.BigDecimal>"
  def defaultValue = "new ArrayList<java.math.BigDecimal>()"
}

case object `java.List<Decimal>?` extends JavaBigDecimalStub with JavaOptListImpl {
  def javaType = "ArrayList<java.math.BigDecimal>"
  def defaultValue = "null"
}

case object `java.List<Decimal?>?` extends JavaBigDecimalStub with JavaOptListOptImpl {
  def javaType = "ArrayList<java.math.BigDecimal>"
  def defaultValue = "null"
}

case object `java.Set<Decimal>` extends JavaBigDecimalStub with JavaSetImpl {
  def javaType = "HashSet<java.math.BigDecimal>"
  def defaultValue = "new HashSet<java.math.BigDecimal>()"
}

case object `java.Set<Decimal?>` extends JavaBigDecimalStub with JavaSetOptImpl {
  def javaType = "HashSet<java.math.BigDecimal>"
  def defaultValue = "new HashSet<java.math.BigDecimal>()"
}

case object `java.Set<Decimal>?` extends JavaBigDecimalStub with JavaOptSetImpl {
  def javaType = "HashSet<java.math.BigDecimal>"
  def defaultValue = "null"
}

case object `java.Set<Decimal?>?` extends JavaBigDecimalStub with JavaOptSetOptImpl {
  def javaType = "HashSet<java.math.BigDecimal>"
  def defaultValue = "null"
}
