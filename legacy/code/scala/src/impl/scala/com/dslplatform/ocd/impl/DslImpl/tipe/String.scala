package com.dslplatform.ocd
package impl

import types._
import tipe._

sealed trait DslStringStub
    extends `tipe.String`
    with DslImpl
    with TipeUnconstrainedType {

  def dslDesc = "String"
}

case object `String`         extends DslStringStub with `box.One`         { def apply(scale: Int) = `String(x)`(scale) }
case object `String?`        extends DslStringStub with `box.Opt`         { def apply(scale: Int) = `String(x)?`(scale) }
case object `String[]`       extends DslStringStub with `box.Array`       { def apply(scale: Int) = `String(x)[]`(scale) }
case object `List<String>`   extends DslStringStub with `box.List`        { def apply(scale: Int) = `List<String(x)>`(scale) }
case object `Set<String>`    extends DslStringStub with `box.Set`         { def apply(scale: Int) = `Set<String(x)>`(scale) }
case object `String[]?`      extends DslStringStub with `box.OptArray`    { def apply(scale: Int) = `String(x)[]?`(scale) }
case object `List<String>?`  extends DslStringStub with `box.OptList`     { def apply(scale: Int) = `List<String(x)>?`(scale) }
case object `Set<String>?`   extends DslStringStub with `box.OptSet`      { def apply(scale: Int) = `Set<String(x)>?`(scale) }
case object `String?[]`      extends DslStringStub with `box.ArrayOpt`    { def apply(scale: Int) = `String(x)?[]`(scale) }
case object `List<String?>`  extends DslStringStub with `box.ListOpt`     { def apply(scale: Int) = `List<String(x)?>`(scale) }
case object `Set<String?>`   extends DslStringStub with `box.SetOpt`      { def apply(scale: Int) = `Set<String(x)?>`(scale) }
case object `String?[]?`     extends DslStringStub with `box.OptArrayOpt` { def apply(scale: Int) = `String(x)?[]?`(scale) }
case object `List<String?>?` extends DslStringStub with `box.OptListOpt`  { def apply(scale: Int) = `List<String(x)?>?`(scale) }
case object `Set<String?>?`  extends DslStringStub with `box.OptSetOpt`   { def apply(scale: Int) = `Set<String(x)?>?`(scale) }

sealed trait DslStringWithScaleStub
    extends `tipe.String`
    with DslImpl
    with TipeConstrainedType {

  def dslDesc = s"String($scale)"
  def scale: Int
}

case class `String(x)`        (scale: Int) extends DslStringWithScaleStub with `box.One`
case class `String(x)?`       (scale: Int) extends DslStringWithScaleStub with `box.Opt`
case class `String(x)[]`      (scale: Int) extends DslStringWithScaleStub with `box.Array`
case class `List<String(x)>`  (scale: Int) extends DslStringWithScaleStub with `box.List`
case class `Set<String(x)>`   (scale: Int) extends DslStringWithScaleStub with `box.Set`
case class `String(x)[]?`     (scale: Int) extends DslStringWithScaleStub with `box.OptArray`
case class `List<String(x)>?` (scale: Int) extends DslStringWithScaleStub with `box.OptList`
case class `Set<String(x)>?`  (scale: Int) extends DslStringWithScaleStub with `box.OptSet`
case class `String(x)?[]`     (scale: Int) extends DslStringWithScaleStub with `box.ArrayOpt`
case class `List<String(x)?>` (scale: Int) extends DslStringWithScaleStub with `box.ListOpt`
case class `Set<String(x)?>`  (scale: Int) extends DslStringWithScaleStub with `box.SetOpt`
case class `String(x)?[]?`    (scale: Int) extends DslStringWithScaleStub with `box.OptArrayOpt`
case class `List<String(x)?>?`(scale: Int) extends DslStringWithScaleStub with `box.OptListOpt`
case class `Set<String(x)?>?` (scale: Int) extends DslStringWithScaleStub with `box.OptSetOpt`
