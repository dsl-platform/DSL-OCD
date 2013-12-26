package com.dslplatform.ocd
package impl

import box._
import types._
import tipe._

sealed trait JavaLongStub
    extends JavaImpl
    with `tipe.Long`
    with TipeUnconstrainedType
    with TipeScalarType
    with TipeStableType {

  def javaDesc = "long"
}

case object `java.Long`         extends JavaLongStub with JavaOne
case object `java.Long?`        extends JavaLongStub with JavaOpt
case object `java.Long[]`       extends JavaLongStub with JavaArray
case object `java.List<Long>`   extends JavaLongStub with JavaList
case object `java.Set<Long>`    extends JavaLongStub with JavaSet
case object `java.Long[]?`      extends JavaLongStub with JavaOptArray
case object `java.List<Long>?`  extends JavaLongStub with JavaOptList
case object `java.Set<Long>?`   extends JavaLongStub with JavaOptSet
case object `java.Long?[]`      extends JavaLongStub with JavaArrayOpt
case object `java.List<Long?>`  extends JavaLongStub with JavaListOpt
case object `java.Set<Long?>`   extends JavaLongStub with JavaSetOpt
case object `java.Long?[]?`     extends JavaLongStub with JavaOptArrayOpt
case object `java.List<Long?>?` extends JavaLongStub with JavaOptListOpt
case object `java.Set<Long?>?`  extends JavaLongStub with JavaOptSetOpt
