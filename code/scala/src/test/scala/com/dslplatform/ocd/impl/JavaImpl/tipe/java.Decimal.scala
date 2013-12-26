//package com.dslplatform.ocd
//package impl
//
//import box._
//import types._
//import tipe._
//
//sealed trait JavaDecimalStub
//    extends JavaImpl
//    with `tipe.Decimal`
//    with TipeUnconstrainedType
//    with TipeSpecialEqualsType
//    with TipeStableType {
//
//  def javaDesc = "java.math.BigDecimal"
//}
//
//case object `java.Decimal`         extends JavaDecimalStub with JavaOne
//case object `java.Decimal?`        extends JavaDecimalStub with JavaOpt
//case object `java.Decimal[]`       extends JavaDecimalStub with JavaArray
//case object `java.List<Decimal>`   extends JavaDecimalStub with JavaList
//case object `java.Set<Decimal>`    extends JavaDecimalStub with JavaSet
//case object `java.Decimal[]?`      extends JavaDecimalStub with JavaOptArray
//case object `java.List<Decimal>?`  extends JavaDecimalStub with JavaOptList
//case object `java.Set<Decimal>?`   extends JavaDecimalStub with JavaOptSet
//case object `java.Decimal?[]`      extends JavaDecimalStub with JavaArrayOpt
//case object `java.List<Decimal?>`  extends JavaDecimalStub with JavaListOpt
//case object `java.Set<Decimal?>`   extends JavaDecimalStub with JavaSetOpt
//case object `java.Decimal?[]?`     extends JavaDecimalStub with JavaOptArrayOpt
//case object `java.List<Decimal?>?` extends JavaDecimalStub with JavaOptListOpt
//case object `java.Set<Decimal?>?`  extends JavaDecimalStub with JavaOptSetOpt
//
//sealed trait JavaDecimalWithScaleStub
//    extends JavaImpl
//    with `tipe.Decimal`
//    with TipeConstrainedType
//    with TipeSpecialEqualsType
//    with TipeStableType {
//
//  def javaDesc = s"Decimal($scale)"
//  def scale: Int
//}
//
//case class `java.Decimal(x)`        (scale: Int) extends JavaDecimalWithScaleStub with JavaOne
//case class `java.Decimal(x)?`       (scale: Int) extends JavaDecimalWithScaleStub with JavaOpt
//case class `java.Decimal(x)[]`      (scale: Int) extends JavaDecimalWithScaleStub with JavaArray
//case class `java.List<Decimal(x)>`  (scale: Int) extends JavaDecimalWithScaleStub with JavaList
//case class `java.Set<Decimal(x)>`   (scale: Int) extends JavaDecimalWithScaleStub with JavaSet
//case class `java.Decimal(x)[]?`     (scale: Int) extends JavaDecimalWithScaleStub with JavaOptArray
//case class `java.List<Decimal(x)>?` (scale: Int) extends JavaDecimalWithScaleStub with JavaOptList
//case class `java.Set<Decimal(x)>?`  (scale: Int) extends JavaDecimalWithScaleStub with JavaOptSet
//case class `java.Decimal(x)?[]`     (scale: Int) extends JavaDecimalWithScaleStub with JavaArrayOpt
//case class `java.List<Decimal(x)?>` (scale: Int) extends JavaDecimalWithScaleStub with JavaListOpt
//case class `java.Set<Decimal(x)?>`  (scale: Int) extends JavaDecimalWithScaleStub with JavaSetOpt
//case class `java.Decimal(x)?[]?`    (scale: Int) extends JavaDecimalWithScaleStub with JavaOptArrayOpt
//case class `java.List<Decimal(x)?>?`(scale: Int) extends JavaDecimalWithScaleStub with JavaOptListOpt
//case class `java.Set<Decimal(x)?>?` (scale: Int) extends JavaDecimalWithScaleStub with JavaOptSetOpt
