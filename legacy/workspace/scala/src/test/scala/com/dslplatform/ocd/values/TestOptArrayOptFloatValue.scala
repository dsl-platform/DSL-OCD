package com.dslplatform.ocd.values

import OptArrayOptFloatInValue.OptArrayOptFloatValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptArrayOptFloatValue extends SpecExtensions {
  def `Test property field type: Option[Array[Option[Float]]]`() =
    checkType(
      typeOf[Option[Array[Option[Float]]]]
    , typeOf[OptArrayOptFloatValue].member("optArrayOptFloat": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptArrayOptFloatValue().optArrayOptFloat === None)
  }
}
