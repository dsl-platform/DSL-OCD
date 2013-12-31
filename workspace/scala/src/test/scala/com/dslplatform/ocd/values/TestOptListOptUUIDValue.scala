package com.dslplatform.ocd.values

import OptListOptUUIDInValue.OptListOptUUIDValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptListOptUUIDValue extends SpecExtensions {
  def `Test property field type: Option[IndexedSeq[Option[java.util.UUID]]]`() =
    checkType(
      typeOf[Option[IndexedSeq[Option[java.util.UUID]]]]
    , typeOf[OptListOptUUIDValue].member("optListOptUUID": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptListOptUUIDValue().optListOptUUID === None)
  }
}
