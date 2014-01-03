package com.dslplatform.ocd.values

import OptArrayOptIntInValue.OptArrayOptIntValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptArrayOptIntValue extends SpecExtensions {
  def `Test property field type: Option[Array[Option[Int]]]`() =
    checkType(
      typeOf[Option[Array[Option[Int]]]]
    , typeOf[OptArrayOptIntValue].member("optArrayOptInt": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptArrayOptIntValue().optArrayOptInt === None)
  }
}
