package com.dslplatform.ocd

sealed trait DslDecimalStub
    extends TipeDecimalType
    with TipeUnconstrainedType {
  def dslType = "Decimal"
}

case object `dsl.Decimal`         extends DslDecimalStub with DslOneImpl        { def apply(length: Int) = `dsl.Decimal(x)`        (length) }
case object `dsl.Decimal?`        extends DslDecimalStub with DslOptImpl        { def apply(length: Int) = `dsl.Decimal(x)?`       (length) }
case object `dsl.Decimal[]`       extends DslDecimalStub with DslArrImpl        { def apply(length: Int) = `dsl.Decimal(x)[]`      (length) }
case object `dsl.List<Decimal>`   extends DslDecimalStub with DslListImpl       { def apply(length: Int) = `dsl.List<Decimal(x)>`  (length) }
case object `dsl.Set<Decimal>`    extends DslDecimalStub with DslSetImpl        { def apply(length: Int) = `dsl.Set<Decimal(x)>`   (length) }
case object `dsl.Decimal[]?`      extends DslDecimalStub with DslOptArrImpl     { def apply(length: Int) = `dsl.Decimal(x)[]?`     (length) }
case object `dsl.List<Decimal>?`  extends DslDecimalStub with DslOptListImpl    { def apply(length: Int) = `dsl.List<Decimal(x)>?` (length) }
case object `dsl.Set<Decimal>?`   extends DslDecimalStub with DslOptSetImpl     { def apply(length: Int) = `dsl.Set<Decimal(x)>?`  (length) }
case object `dsl.Decimal?[]`      extends DslDecimalStub with DslArrOptImpl     { def apply(length: Int) = `dsl.Decimal(x)?[]`     (length) }
case object `dsl.List<Decimal?>`  extends DslDecimalStub with DslListOptImpl    { def apply(length: Int) = `dsl.List<Decimal(x)?>` (length) }
case object `dsl.Set<Decimal?>`   extends DslDecimalStub with DslSetOptImpl     { def apply(length: Int) = `dsl.Set<Decimal(x)?>`  (length) }
case object `dsl.Decimal?[]?`     extends DslDecimalStub with DslOptArrOptImpl  { def apply(length: Int) = `dsl.Decimal(x)?[]?`    (length) }
case object `dsl.List<Decimal?>?` extends DslDecimalStub with DslOptListOptImpl { def apply(length: Int) = `dsl.List<Decimal(x)?>?`(length) }
case object `dsl.Set<Decimal?>?`  extends DslDecimalStub with DslOptSetOptImpl  { def apply(length: Int) = `dsl.Set<Decimal(x)?>?` (length) }

sealed trait DslDecimalWithLengthStub
    extends TipeDecimalType
    with TipeConstrainedType {
  def dslType = s"Decimal($length)"
  def length: Int
}

case class `dsl.Decimal(x)`        (length: Int) extends DslDecimalWithLengthStub with DslOneImpl
case class `dsl.Decimal(x)?`       (length: Int) extends DslDecimalWithLengthStub with DslOptImpl
case class `dsl.Decimal(x)[]`      (length: Int) extends DslDecimalWithLengthStub with DslArrImpl
case class `dsl.List<Decimal(x)>`  (length: Int) extends DslDecimalWithLengthStub with DslListImpl
case class `dsl.Set<Decimal(x)>`   (length: Int) extends DslDecimalWithLengthStub with DslSetImpl
case class `dsl.Decimal(x)[]?`     (length: Int) extends DslDecimalWithLengthStub with DslOptArrImpl
case class `dsl.List<Decimal(x)>?` (length: Int) extends DslDecimalWithLengthStub with DslOptListImpl
case class `dsl.Set<Decimal(x)>?`  (length: Int) extends DslDecimalWithLengthStub with DslOptSetImpl
case class `dsl.Decimal(x)?[]`     (length: Int) extends DslDecimalWithLengthStub with DslArrOptImpl
case class `dsl.List<Decimal(x)?>` (length: Int) extends DslDecimalWithLengthStub with DslListOptImpl
case class `dsl.Set<Decimal(x)?>`  (length: Int) extends DslDecimalWithLengthStub with DslSetOptImpl
case class `dsl.Decimal(x)?[]?`    (length: Int) extends DslDecimalWithLengthStub with DslOptArrOptImpl
case class `dsl.List<Decimal(x)?>?`(length: Int) extends DslDecimalWithLengthStub with DslOptListOptImpl
case class `dsl.Set<Decimal(x)?>?` (length: Int) extends DslDecimalWithLengthStub with DslOptSetOptImpl
