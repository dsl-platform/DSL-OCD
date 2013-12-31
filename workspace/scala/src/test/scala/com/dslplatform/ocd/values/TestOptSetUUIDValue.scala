package com.dslplatform.ocd.values

import OptSetUUIDInValue.OptSetUUIDValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptSetUUIDValue extends SpecExtensions {
  def `Test property field type: Option[Set[java.util.UUID]]`() =
    checkType(
      typeOf[Option[Set[java.util.UUID]]]
    , typeOf[OptSetUUIDValue].member("optSetUUID": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptSetUUIDValue().optSetUUID === None)
  }
}
