package com.dslplatform.ocd.values

import ArrayUUIDInValue.ArrayUUIDValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayUUIDValue extends SpecExtensions {
  def `Test property field type: Array[java.util.UUID]`() =
    checkType(
      typeOf[Array[java.util.UUID]]
    , typeOf[ArrayUUIDValue].member("arrayUUID": TermName).asMethod.returnType
    )

  def `Test property default value: Array.empty[java.util.UUID]`() {
    assert(ArrayUUIDValue().arrayUUID === Array.empty[java.util.UUID])
  }
}
