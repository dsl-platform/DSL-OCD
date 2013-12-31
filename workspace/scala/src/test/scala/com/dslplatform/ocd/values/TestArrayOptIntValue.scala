package com.dslplatform.ocd.values

import ArrayOptIntInValue.ArrayOptIntValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayOptIntValue extends SpecExtensions {
  def `Test property field type: Array[Option[Int]]`() =
    checkType(
      typeOf[Array[Option[Int]]]
    , typeOf[ArrayOptIntValue].member("arrayOptInt": TermName).asMethod.returnType
    )

  def `Test property default value: Array.empty[Option[Int]]`() {
    assert(ArrayOptIntValue().arrayOptInt === Array.empty[Option[Int]])
  }
}
