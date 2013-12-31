package com.dslplatform.ocd.values

import OptSetOptUUIDInValue.OptSetOptUUIDValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptSetOptUUIDValue extends SpecExtensions {
  def `Test property field type: Option[Set[Option[java.util.UUID]]]`() =
    checkType(
      typeOf[Option[Set[Option[java.util.UUID]]]]
    , typeOf[OptSetOptUUIDValue].member("optSetOptUUID": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptSetOptUUIDValue().optSetOptUUID === None)
  }
}
