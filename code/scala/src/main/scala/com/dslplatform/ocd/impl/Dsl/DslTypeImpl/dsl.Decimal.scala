package com.dslplatform.ocd

sealed trait DslDecimalStub
    extends TipeDecimalType
    with TipeUnconstrainedType {
  def dslType = "Decimal"
}

case object `dsl.Decimal`         extends DslDecimalStub with DslOneImpl        { def apply(scale: Int) = `dsl.Decimal(x)`        (scale) }
case object `dsl.Decimal?`        extends DslDecimalStub with DslOptImpl        { def apply(scale: Int) = `dsl.Decimal(x)?`       (scale) }
case object `dsl.Decimal[]`       extends DslDecimalStub with DslArrImpl        { def apply(scale: Int) = `dsl.Decimal(x)[]`      (scale) }
case object `dsl.List<Decimal>`   extends DslDecimalStub with DslListImpl       { def apply(scale: Int) = `dsl.List<Decimal(x)>`  (scale) }
case object `dsl.Set<Decimal>`    extends DslDecimalStub with DslSetImpl        { def apply(scale: Int) = `dsl.Set<Decimal(x)>`   (scale) }
case object `dsl.Decimal[]?`      extends DslDecimalStub with DslOptArrImpl     { def apply(scale: Int) = `dsl.Decimal(x)[]?`     (scale) }
case object `dsl.List<Decimal>?`  extends DslDecimalStub with DslOptListImpl    { def apply(scale: Int) = `dsl.List<Decimal(x)>?` (scale) }
case object `dsl.Set<Decimal>?`   extends DslDecimalStub with DslOptSetImpl     { def apply(scale: Int) = `dsl.Set<Decimal(x)>?`  (scale) }
case object `dsl.Decimal?[]`      extends DslDecimalStub with DslArrOptImpl     { def apply(scale: Int) = `dsl.Decimal(x)?[]`     (scale) }
case object `dsl.List<Decimal?>`  extends DslDecimalStub with DslListOptImpl    { def apply(scale: Int) = `dsl.List<Decimal(x)?>` (scale) }
case object `dsl.Set<Decimal?>`   extends DslDecimalStub with DslSetOptImpl     { def apply(scale: Int) = `dsl.Set<Decimal(x)?>`  (scale) }
case object `dsl.Decimal?[]?`     extends DslDecimalStub with DslOptArrOptImpl  { def apply(scale: Int) = `dsl.Decimal(x)?[]?`    (scale) }
case object `dsl.List<Decimal?>?` extends DslDecimalStub with DslOptListOptImpl { def apply(scale: Int) = `dsl.List<Decimal(x)?>?`(scale) }
case object `dsl.Set<Decimal?>?`  extends DslDecimalStub with DslOptSetOptImpl  { def apply(scale: Int) = `dsl.Set<Decimal(x)?>?` (scale) }

sealed trait DslDecimalWithScaleStub
    extends TipeDecimalType
    with TipeConstrainedType {
  def dslType = s"Decimal($scale)"
  def scale: Int
}

case class `dsl.Decimal(x)`        (scale: Int) extends DslDecimalWithScaleStub with DslOneImpl
case class `dsl.Decimal(x)?`       (scale: Int) extends DslDecimalWithScaleStub with DslOptImpl
case class `dsl.Decimal(x)[]`      (scale: Int) extends DslDecimalWithScaleStub with DslArrImpl
case class `dsl.List<Decimal(x)>`  (scale: Int) extends DslDecimalWithScaleStub with DslListImpl
case class `dsl.Set<Decimal(x)>`   (scale: Int) extends DslDecimalWithScaleStub with DslSetImpl
case class `dsl.Decimal(x)[]?`     (scale: Int) extends DslDecimalWithScaleStub with DslOptArrImpl
case class `dsl.List<Decimal(x)>?` (scale: Int) extends DslDecimalWithScaleStub with DslOptListImpl
case class `dsl.Set<Decimal(x)>?`  (scale: Int) extends DslDecimalWithScaleStub with DslOptSetImpl
case class `dsl.Decimal(x)?[]`     (scale: Int) extends DslDecimalWithScaleStub with DslArrOptImpl
case class `dsl.List<Decimal(x)?>` (scale: Int) extends DslDecimalWithScaleStub with DslListOptImpl
case class `dsl.Set<Decimal(x)?>`  (scale: Int) extends DslDecimalWithScaleStub with DslSetOptImpl
case class `dsl.Decimal(x)?[]?`    (scale: Int) extends DslDecimalWithScaleStub with DslOptArrOptImpl
case class `dsl.List<Decimal(x)?>?`(scale: Int) extends DslDecimalWithScaleStub with DslOptListOptImpl
case class `dsl.Set<Decimal(x)?>?` (scale: Int) extends DslDecimalWithScaleStub with DslOptSetOptImpl
