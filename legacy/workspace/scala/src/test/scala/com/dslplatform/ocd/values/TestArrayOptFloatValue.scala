package com.dslplatform.ocd.values

import ArrayOptFloatInValue.ArrayOptFloatValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayOptFloatValue extends SpecExtensions {
  def `Test property field type: Array[Option[Float]]`() =
    checkType(
      typeOf[Array[Option[Float]]]
    , typeOf[ArrayOptFloatValue].member("arrayOptFloat": TermName).asMethod.returnType
    )

  def `Test property default value: Array.empty[Option[Float]]`() {
    assert(ArrayOptFloatValue().arrayOptFloat === Array.empty[Option[Float]])
  }
}
