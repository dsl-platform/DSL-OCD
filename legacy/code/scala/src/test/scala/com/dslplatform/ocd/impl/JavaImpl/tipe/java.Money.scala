package com.dslplatform.ocd
package impl

import box._
import types._
import tipe._

sealed trait JavaMoneyStub
    extends JavaImpl
    with `tipe.Money`
    with TipeConstrainedType
    with TipeSpecialEqualsType
    with TipeStableType {

  def javaDesc = "Money"
}

case object `java.Money` extends JavaMoneyStub with JavaOne {
  def javaClass = "java.math.BigDecimal"
  def defaultValue = "java.math.BigDecimal.ZERO.setScale(2)"
}

case object `java.Money?` extends JavaMoneyStub with JavaOpt {
  def javaClass = "java.math.BigDecimal"
  def defaultValue = "null"
}

case object `java.Money[]` extends JavaMoneyStub with JavaArray {
  def javaClass = "java.math.BigDecimal[]"
  def defaultValue = "new java.math.BigDecimal[0]"
}

case object `java.Money?[]` extends JavaMoneyStub with JavaArrayOpt {
  def javaClass = "java.math.BigDecimal[]"
  def defaultValue = "new java.math.BigDecimal[0]"
}

case object `java.Money[]?` extends JavaMoneyStub with JavaOptArray {
  def javaClass = "java.math.BigDecimal[]"
  def defaultValue = "null"
}

case object `java.Money?[]?` extends JavaMoneyStub with JavaOptArrayOpt {
  def javaClass = "java.math.BigDecimal[]"
  def defaultValue = "null"
}

case object `java.List<Money>` extends JavaMoneyStub with JavaList {
  def javaClass = "List<java.math.BigDecimal>"
  def defaultValue = "new ArrayList<java.math.BigDecimal>(0)"
}

case object `java.List<Money?>` extends JavaMoneyStub with JavaListOpt {
  def javaClass = "List<java.math.BigDecimal>"
  def defaultValue = "new ArrayList<java.math.BigDecimal>(0)"
}

case object `java.List<Money>?` extends JavaMoneyStub with JavaOptList {
  def javaClass = "List<java.math.BigDecimal>"
  def defaultValue = "null"
}

case object `java.List<Money?>?` extends JavaMoneyStub with JavaOptListOpt {
  def javaClass = "List<java.math.BigDecimal>"
  def defaultValue = "null"
}

case object `java.Set<Money>` extends JavaMoneyStub with JavaSet {
  def javaClass = "Set<java.math.BigDecimal>"
  def defaultValue = "new HashSet<java.math.BigDecimal>(0)"
}

case object `java.Set<Money?>` extends JavaMoneyStub with JavaSetOpt {
  def javaClass = "Set<java.math.BigDecimal>"
  def defaultValue = "new HashSet<java.math.BigDecimal>(0)"
}

case object `java.Set<Money>?` extends JavaMoneyStub with JavaOptSet {
  def javaClass = "Set<java.math.BigDecimal>"
  def defaultValue = "null"
}

case object `java.Set<Money?>?` extends JavaMoneyStub with JavaOptSetOpt {
  def javaClass = "Set<java.math.BigDecimal>"
  def defaultValue = "null"
}
