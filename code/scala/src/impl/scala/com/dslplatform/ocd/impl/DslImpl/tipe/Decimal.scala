package com.dslplatform.ocd
package impl

import types._
import tipe._

sealed trait DslDecimalStub
    extends `tipe.Decimal`
    with DslImpl
    with TipeUnconstrainedType {

  def dslDesc = "Decimal"
}

case object `Decimal`         extends DslDecimalStub with `box.One`         { def apply(scale: Int) = `Decimal(x)`(scale) }
case object `Decimal?`        extends DslDecimalStub with `box.Opt`         { def apply(scale: Int) = `Decimal(x)?`(scale) }
case object `Decimal[]`       extends DslDecimalStub with `box.Array`       { def apply(scale: Int) = `Decimal(x)[]`(scale) }
case object `List<Decimal>`   extends DslDecimalStub with `box.List`        { def apply(scale: Int) = `List<Decimal(x)>`(scale) }
case object `Set<Decimal>`    extends DslDecimalStub with `box.Set`         { def apply(scale: Int) = `Set<Decimal(x)>`(scale) }
case object `Decimal[]?`      extends DslDecimalStub with `box.OptArray`    { def apply(scale: Int) = `Decimal(x)[]?`(scale) }
case object `List<Decimal>?`  extends DslDecimalStub with `box.OptList`     { def apply(scale: Int) = `List<Decimal(x)>?`(scale) }
case object `Set<Decimal>?`   extends DslDecimalStub with `box.OptSet`      { def apply(scale: Int) = `Set<Decimal(x)>?`(scale) }
case object `Decimal?[]`      extends DslDecimalStub with `box.ArrayOpt`    { def apply(scale: Int) = `Decimal(x)?[]`(scale) }
case object `List<Decimal?>`  extends DslDecimalStub with `box.ListOpt`     { def apply(scale: Int) = `List<Decimal(x)?>`(scale) }
case object `Set<Decimal?>`   extends DslDecimalStub with `box.SetOpt`      { def apply(scale: Int) = `Set<Decimal(x)?>`(scale) }
case object `Decimal?[]?`     extends DslDecimalStub with `box.OptArrayOpt` { def apply(scale: Int) = `Decimal(x)?[]?`(scale) }
case object `List<Decimal?>?` extends DslDecimalStub with `box.OptListOpt`  { def apply(scale: Int) = `List<Decimal(x)?>?`(scale) }
case object `Set<Decimal?>?`  extends DslDecimalStub with `box.OptSetOpt`   { def apply(scale: Int) = `Set<Decimal(x)?>?`(scale) }

sealed trait DslDecimalWithScaleStub
    extends `tipe.Decimal`
    with DslImpl
    with TipeConstrainedType {

  def dslDesc = s"Decimal($scale)"
  def scale: Int
}

case class `Decimal(x)`        (scale: Int) extends DslDecimalWithScaleStub with `box.One`
case class `Decimal(x)?`       (scale: Int) extends DslDecimalWithScaleStub with `box.Opt`
case class `Decimal(x)[]`      (scale: Int) extends DslDecimalWithScaleStub with `box.Array`
case class `List<Decimal(x)>`  (scale: Int) extends DslDecimalWithScaleStub with `box.List`
case class `Set<Decimal(x)>`   (scale: Int) extends DslDecimalWithScaleStub with `box.Set`
case class `Decimal(x)[]?`     (scale: Int) extends DslDecimalWithScaleStub with `box.OptArray`
case class `List<Decimal(x)>?` (scale: Int) extends DslDecimalWithScaleStub with `box.OptList`
case class `Set<Decimal(x)>?`  (scale: Int) extends DslDecimalWithScaleStub with `box.OptSet`
case class `Decimal(x)?[]`     (scale: Int) extends DslDecimalWithScaleStub with `box.ArrayOpt`
case class `List<Decimal(x)?>` (scale: Int) extends DslDecimalWithScaleStub with `box.ListOpt`
case class `Set<Decimal(x)?>`  (scale: Int) extends DslDecimalWithScaleStub with `box.SetOpt`
case class `Decimal(x)?[]?`    (scale: Int) extends DslDecimalWithScaleStub with `box.OptArrayOpt`
case class `List<Decimal(x)?>?`(scale: Int) extends DslDecimalWithScaleStub with `box.OptListOpt`
case class `Set<Decimal(x)?>?` (scale: Int) extends DslDecimalWithScaleStub with `box.OptSetOpt`
