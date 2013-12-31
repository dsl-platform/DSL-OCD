package com.dslplatform.ocd.values

import OptArrayOptUUIDInValue.OptArrayOptUUIDValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptArrayOptUUIDValue extends SpecExtensions {
  def `Test property field type: Option[Array[Option[java.util.UUID]]]`() =
    checkType(
      typeOf[Option[Array[Option[java.util.UUID]]]]
    , typeOf[OptArrayOptUUIDValue].member("optArrayOptUUID": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptArrayOptUUIDValue().optArrayOptUUID === None)
  }
}
