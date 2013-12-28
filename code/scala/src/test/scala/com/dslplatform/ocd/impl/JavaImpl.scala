package com.dslplatform.ocd
package impl

import types._
import types.{ box => tbox }
import com.dslplatform.ocd.impl.mapping.JavaBooleanTypes

trait JavaImpl
    extends OcdImpl
    with tbox.BoxOnenessType
    with tbox.BoxNullnessType
    with tipe.TipeConstrainessType
    with tipe.TipeStablenessType
    with tipe.TipeComplexityType
    with `lang.Java` {

  def javaDesc: String
  def javaClass: String
}

object JavaTypes {
  def resolve(dslType: DslImpl) = {
    dslType match {
      case dbs: DslBoolStub =>
        JavaBooleanTypes.types(dbs)
    }
  }
}
