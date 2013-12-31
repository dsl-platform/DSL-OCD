package com.dslplatform.ocd.values

import ArrayOptLongInValue.ArrayOptLongValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayOptLongValue extends SpecExtensions {
  def `Test property field type: Array[Option[Long]]`() =
    checkType(
      typeOf[Array[Option[Long]]]
    , typeOf[ArrayOptLongValue].member("arrayOptLong": TermName).asMethod.returnType
    )

  def `Test property default value: Array.empty[Option[Long]]`() {
    assert(ArrayOptLongValue().arrayOptLong === Array.empty[Option[Long]])
  }
}
