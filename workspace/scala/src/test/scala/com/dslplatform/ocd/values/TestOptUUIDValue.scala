package com.dslplatform.ocd.values

import OptUUIDInValue.OptUUIDValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptUUIDValue extends SpecExtensions {
  def `Test property field type: Option[java.util.UUID]`() =
    checkType(
      typeOf[Option[java.util.UUID]]
    , typeOf[OptUUIDValue].member("optUUID": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptUUIDValue().optUUID === None)
  }
}
