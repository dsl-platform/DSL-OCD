package com.dslplatform.ocd
package impl

import box._
import types._
import tipe._

sealed trait JavaBooleanStub
    extends JavaImpl
    with `tipe.Boolean`
    with TipeUnconstrainedType
    with TipeScalarType
    with TipeStableType {

  def javaDesc = "boolean"
}

case object `java.Boolean`         extends JavaBooleanStub with JavaOne
case object `java.Boolean?`        extends JavaBooleanStub with JavaOpt
case object `java.Boolean[]`       extends JavaBooleanStub with JavaArray
case object `java.List<Boolean>`   extends JavaBooleanStub with JavaList
case object `java.Set<Boolean>`    extends JavaBooleanStub with JavaSet
case object `java.Boolean[]?`      extends JavaBooleanStub with JavaOptArray
case object `java.List<Boolean>?`  extends JavaBooleanStub with JavaOptList
case object `java.Set<Boolean>?`   extends JavaBooleanStub with JavaOptSet
case object `java.Boolean?[]`      extends JavaBooleanStub with JavaArrayOpt
case object `java.List<Boolean?>`  extends JavaBooleanStub with JavaListOpt
case object `java.Set<Boolean?>`   extends JavaBooleanStub with JavaSetOpt
case object `java.Boolean?[]?`     extends JavaBooleanStub with JavaOptArrayOpt
case object `java.List<Boolean?>?` extends JavaBooleanStub with JavaOptListOpt
case object `java.Set<Boolean?>?`  extends JavaBooleanStub with JavaOptSetOpt
