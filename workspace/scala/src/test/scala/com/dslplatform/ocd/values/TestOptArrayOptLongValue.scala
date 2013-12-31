package com.dslplatform.ocd.values

import OptArrayOptLongInValue.OptArrayOptLongValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptArrayOptLongValue extends SpecExtensions {
  def `Test property field type: Option[Array[Option[Long]]]`() =
    checkType(
      typeOf[Option[Array[Option[Long]]]]
    , typeOf[OptArrayOptLongValue].member("optArrayOptLong": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptArrayOptLongValue().optArrayOptLong === None)
  }
}
