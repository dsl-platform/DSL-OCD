package com.dslplatform.ocd.values

import OptArrayUUIDInValue.OptArrayUUIDValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptArrayUUIDValue extends SpecExtensions {
  def `Test property field type: Option[Array[java.util.UUID]]`() =
    checkType(
      typeOf[Option[Array[java.util.UUID]]]
    , typeOf[OptArrayUUIDValue].member("optArrayUUID": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptArrayUUIDValue().optArrayUUID === None)
  }
}
