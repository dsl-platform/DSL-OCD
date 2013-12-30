package com.dslplatform.ocd
package impl

import types._
import types.{ box => tbox }
import com.dslplatform.ocd.impl.mapping._

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
  def defaultValue: String
}

object JavaTypes {
  def resolve(dslType: DslImpl) = {
    dslType match {
      case x: DslBinaryStub    => JavaBinaryTypes.types(x)
      case x: DslBoolStub      => JavaBooleanTypes.types(x)
      case x: DslFloatStub     => JavaFloatTypes.types(x)
      case x: DslDoubleStub    => JavaDoubleTypes.types(x)
      case x: DslIntStub       => JavaIntTypes.types(x)
      case x: DslLongStub      => JavaLongTypes.types(x)
      case x: DslStringStub    => JavaStringTypes.types(x)
      case x: DslUUIDStub      => JavaUUIDTypes.types(x)
      case x: DslDateStub      => JavaDateTypes.types(x)
      case x: DslTimestampStub => JavaTimestampTypes.types(x)
      case x: DslDecimalStub   => JavaDecimalTypes.types(x)
      case x: DslMoneyStub     => JavaMoneyTypes.types(x)
      case x: DslXMLStub       => JavaXMLTypes.types(x)
      case x: DslMapStub       => JavaMapTypes.types(x)
    }
  }
}
