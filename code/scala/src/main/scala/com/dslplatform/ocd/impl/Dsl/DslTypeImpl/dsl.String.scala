package com.dslplatform.ocd

sealed trait DslStringStub
    extends TipeStringType
    with TipeUnconstrainedType {
  def dslType = "String"
}

case object `dsl.String`         extends DslStringStub with DslOneImpl        { def apply(length: Int) = `dsl.String(x)`        (length) }
case object `dsl.String?`        extends DslStringStub with DslOptImpl        { def apply(length: Int) = `dsl.String(x)?`       (length) }
case object `dsl.String[]`       extends DslStringStub with DslArrImpl        { def apply(length: Int) = `dsl.String(x)[]`      (length) }
case object `dsl.List<String>`   extends DslStringStub with DslListImpl       { def apply(length: Int) = `dsl.List<String(x)>`  (length) }
case object `dsl.Set<String>`    extends DslStringStub with DslSetImpl        { def apply(length: Int) = `dsl.Set<String(x)>`   (length) }
case object `dsl.String[]?`      extends DslStringStub with DslOptArrImpl     { def apply(length: Int) = `dsl.String(x)[]?`     (length) }
case object `dsl.List<String>?`  extends DslStringStub with DslOptListImpl    { def apply(length: Int) = `dsl.List<String(x)>?` (length) }
case object `dsl.Set<String>?`   extends DslStringStub with DslOptSetImpl     { def apply(length: Int) = `dsl.Set<String(x)>?`  (length) }
case object `dsl.String?[]`      extends DslStringStub with DslArrOptImpl     { def apply(length: Int) = `dsl.String(x)?[]`     (length) }
case object `dsl.List<String?>`  extends DslStringStub with DslListOptImpl    { def apply(length: Int) = `dsl.List<String(x)?>` (length) }
case object `dsl.Set<String?>`   extends DslStringStub with DslSetOptImpl     { def apply(length: Int) = `dsl.Set<String(x)?>`  (length) }
case object `dsl.String?[]?`     extends DslStringStub with DslOptArrOptImpl  { def apply(length: Int) = `dsl.String(x)?[]?`    (length) }
case object `dsl.List<String?>?` extends DslStringStub with DslOptListOptImpl { def apply(length: Int) = `dsl.List<String(x)?>?`(length) }
case object `dsl.Set<String?>?`  extends DslStringStub with DslOptSetOptImpl  { def apply(length: Int) = `dsl.Set<String(x)?>?` (length) }

sealed trait DslStringWithLengthStub
    extends TipeStringType
    with TipeConstrainedType {
  def dslType = s"String($length)"
  def length: Int
}

case class `dsl.String(x)`        (length: Int) extends DslStringWithLengthStub with DslOneImpl
case class `dsl.String(x)?`       (length: Int) extends DslStringWithLengthStub with DslOptImpl
case class `dsl.String(x)[]`      (length: Int) extends DslStringWithLengthStub with DslArrImpl
case class `dsl.List<String(x)>`  (length: Int) extends DslStringWithLengthStub with DslListImpl
case class `dsl.Set<String(x)>`   (length: Int) extends DslStringWithLengthStub with DslSetImpl
case class `dsl.String(x)[]?`     (length: Int) extends DslStringWithLengthStub with DslOptArrImpl
case class `dsl.List<String(x)>?` (length: Int) extends DslStringWithLengthStub with DslOptListImpl
case class `dsl.Set<String(x)>?`  (length: Int) extends DslStringWithLengthStub with DslOptSetImpl
case class `dsl.String(x)?[]`     (length: Int) extends DslStringWithLengthStub with DslArrOptImpl
case class `dsl.List<String(x)?>` (length: Int) extends DslStringWithLengthStub with DslListOptImpl
case class `dsl.Set<String(x)?>`  (length: Int) extends DslStringWithLengthStub with DslSetOptImpl
case class `dsl.String(x)?[]?`    (length: Int) extends DslStringWithLengthStub with DslOptArrOptImpl
case class `dsl.List<String(x)?>?`(length: Int) extends DslStringWithLengthStub with DslOptListOptImpl
case class `dsl.Set<String(x)?>?` (length: Int) extends DslStringWithLengthStub with DslOptSetOptImpl
