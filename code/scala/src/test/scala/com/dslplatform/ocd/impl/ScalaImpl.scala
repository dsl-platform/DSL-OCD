package com.dslplatform.ocd
package impl

import types._
import types.{ box => tbox }
import com.dslplatform.ocd.impl.mapping._

trait ScalaImpl
    extends OcdImpl
    with tbox.BoxOnenessType
    with tbox.BoxNullnessType
    with tipe.TipeConstrainessType
    with tipe.TipeStablenessType
    with tipe.TipeComplexityType
    with `lang.Scala` {

  def scalaDesc: String
  def scalaClass: String
  def defaultValue: String
}

object ScalaTypes {
  def resolve(dslType: DslImpl) = {
    dslType match {
      case x: DslBinaryStub    => ScalaBinaryTypes.types(x)
      case x: DslBoolStub      => ScalaBooleanTypes.types(x)
      case x: DslFloatStub     => ScalaFloatTypes.types(x)
      case x: DslDoubleStub    => ScalaDoubleTypes.types(x)
      case x: DslIntStub       => ScalaIntTypes.types(x)
      case x: DslLongStub      => ScalaLongTypes.types(x)
      case x: DslStringStub    => ScalaStringTypes.types(x)
      case x: DslUUIDStub      => ScalaUUIDTypes.types(x)
      case x: DslDateStub      => ScalaDateTypes.types(x)
      case x: DslTimestampStub => ScalaTimestampTypes.types(x)
      case x: DslDecimalStub   => ScalaDecimalTypes.types(x)
      case x: DslMoneyStub     => ScalaMoneyTypes.types(x)
      case x: DslXMLStub       => ScalaXMLTypes.types(x)
      case x: DslMapStub       => ScalaMapTypes.types(x)
    }
  }
}
