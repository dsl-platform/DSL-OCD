package com.dslplatform.ocd
package impl

import box._
import types._
import tipe._

sealed trait JavaDecimalStub
    extends JavaImpl
    with `tipe.Decimal`
    with TipeUnconstrainedType
    with TipeSpecialEqualsType
    with TipeStableType {

  def javaDesc = "Decimal"
}

case object `java.Decimal` extends JavaDecimalStub with JavaOne {
  def javaClass = "java.math.BigDecimal"
  def defaultValue = "java.math.BigDecimal.ZERO"
}

case object `java.Decimal?` extends JavaDecimalStub with JavaOpt {
  def javaClass = "java.math.BigDecimal"
  def defaultValue = "null"
}

case object `java.Decimal[]` extends JavaDecimalStub with JavaArray {
  def javaClass = "java.math.BigDecimal[]"
  def defaultValue = "new java.math.BigDecimal[0]"
}

case object `java.Decimal?[]` extends JavaDecimalStub with JavaArrayOpt {
  def javaClass = "java.math.BigDecimal[]"
  def defaultValue = "new java.math.BigDecimal[0]"
}

case object `java.Decimal[]?` extends JavaDecimalStub with JavaOptArray {
  def javaClass = "java.math.BigDecimal[]"
  def defaultValue = "null"
}

case object `java.Decimal?[]?` extends JavaDecimalStub with JavaOptArrayOpt {
  def javaClass = "java.math.BigDecimal[]"
  def defaultValue = "null"
}

case object `java.List<Decimal>` extends JavaDecimalStub with JavaList {
  def javaClass = "List<java.math.BigDecimal>"
  def defaultValue = "new ArrayList<java.math.BigDecimal>(0)"
}

case object `java.List<Decimal?>` extends JavaDecimalStub with JavaListOpt {
  def javaClass = "List<java.math.BigDecimal>"
  def defaultValue = "new ArrayList<java.math.BigDecimal>(0)"
}

case object `java.List<Decimal>?` extends JavaDecimalStub with JavaOptList {
  def javaClass = "List<java.math.BigDecimal>"
  def defaultValue = "null"
}

case object `java.List<Decimal?>?` extends JavaDecimalStub with JavaOptListOpt {
  def javaClass = "List<java.math.BigDecimal>"
  def defaultValue = "null"
}

case object `java.Set<Decimal>` extends JavaDecimalStub with JavaSet {
  def javaClass = "Set<java.math.BigDecimal>"
  def defaultValue = "new HashSet<java.math.BigDecimal>(0)"
}

case object `java.Set<Decimal?>` extends JavaDecimalStub with JavaSetOpt {
  def javaClass = "Set<java.math.BigDecimal>"
  def defaultValue = "new HashSet<java.math.BigDecimal>(0)"
}

case object `java.Set<Decimal>?` extends JavaDecimalStub with JavaOptSet {
  def javaClass = "Set<java.math.BigDecimal>"
  def defaultValue = "null"
}

case object `java.Set<Decimal?>?` extends JavaDecimalStub with JavaOptSetOpt {
  def javaClass = "Set<java.math.BigDecimal>"
  def defaultValue = "null"
}

/*
sealed trait JavaDecimalWithScaleStub
    extends JavaImpl
    with `tipe.Decimal`
    with TipeConstrainedType
    with TipeSpecialEqualsType
    with TipeStableType {

  def javaDesc = s"Decimal($scale)"
  def scale: Int
}

case class `java.Decimal(x)`        (scale: Int) extends JavaDecimalWithScaleStub with JavaOne
case class `java.Decimal(x)?`       (scale: Int) extends JavaDecimalWithScaleStub with JavaOpt
case class `java.Decimal(x)[]`      (scale: Int) extends JavaDecimalWithScaleStub with JavaArray
case class `java.List<Decimal(x)>`  (scale: Int) extends JavaDecimalWithScaleStub with JavaList
case class `java.Set<Decimal(x)>`   (scale: Int) extends JavaDecimalWithScaleStub with JavaSet
case class `java.Decimal(x)[]?`     (scale: Int) extends JavaDecimalWithScaleStub with JavaOptArray
case class `java.List<Decimal(x)>?` (scale: Int) extends JavaDecimalWithScaleStub with JavaOptList
case class `java.Set<Decimal(x)>?`  (scale: Int) extends JavaDecimalWithScaleStub with JavaOptSet
case class `java.Decimal(x)?[]`     (scale: Int) extends JavaDecimalWithScaleStub with JavaArrayOpt
case class `java.List<Decimal(x)?>` (scale: Int) extends JavaDecimalWithScaleStub with JavaListOpt
case class `java.Set<Decimal(x)?>`  (scale: Int) extends JavaDecimalWithScaleStub with JavaSetOpt
case class `java.Decimal(x)?[]?`    (scale: Int) extends JavaDecimalWithScaleStub with JavaOptArrayOpt
case class `java.List<Decimal(x)?>?`(scale: Int) extends JavaDecimalWithScaleStub with JavaOptListOpt
case class `java.Set<Decimal(x)?>?` (scale: Int) extends JavaDecimalWithScaleStub with JavaOptSetOpt

*/
