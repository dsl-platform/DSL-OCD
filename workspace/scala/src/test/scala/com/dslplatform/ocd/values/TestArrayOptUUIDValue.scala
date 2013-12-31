package com.dslplatform.ocd.values

import ArrayOptUUIDInValue.ArrayOptUUIDValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayOptUUIDValue extends SpecExtensions {
  def `Test property field type: Array[Option[java.util.UUID]]`() =
    checkType(
      typeOf[Array[Option[java.util.UUID]]]
    , typeOf[ArrayOptUUIDValue].member("arrayOptUUID": TermName).asMethod.returnType
    )

  def `Test property default value: Array.empty[Option[java.util.UUID]]`() {
    assert(ArrayOptUUIDValue().arrayOptUUID === Array.empty[Option[java.util.UUID]])
  }
}
