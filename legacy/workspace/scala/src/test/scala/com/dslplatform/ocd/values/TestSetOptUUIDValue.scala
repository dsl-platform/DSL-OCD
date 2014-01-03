package com.dslplatform.ocd.values

import SetOptUUIDInValue.SetOptUUIDValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetOptUUIDValue extends SpecExtensions {
  def `Test property field type: Set[Option[java.util.UUID]]`() =
    checkType(
      typeOf[Set[Option[java.util.UUID]]]
    , typeOf[SetOptUUIDValue].member("setOptUUID": TermName).asMethod.returnType
    )

  def `Test property default value: Set.empty[Option[java.util.UUID]]`() {
    assert(SetOptUUIDValue().setOptUUID === Set.empty[Option[java.util.UUID]])
  }
}
