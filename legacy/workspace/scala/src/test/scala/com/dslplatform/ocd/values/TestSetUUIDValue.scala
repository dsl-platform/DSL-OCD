package com.dslplatform.ocd.values

import SetUUIDInValue.SetUUIDValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetUUIDValue extends SpecExtensions {
  def `Test property field type: Set[java.util.UUID]`() =
    checkType(
      typeOf[Set[java.util.UUID]]
    , typeOf[SetUUIDValue].member("setUUID": TermName).asMethod.returnType
    )

  def `Test property default value: Set.empty[java.util.UUID]`() {
    assert(SetUUIDValue().setUUID === Set.empty[java.util.UUID])
  }
}
