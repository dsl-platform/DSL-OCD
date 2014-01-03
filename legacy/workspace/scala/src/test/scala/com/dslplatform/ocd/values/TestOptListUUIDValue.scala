package com.dslplatform.ocd.values

import OptListUUIDInValue.OptListUUIDValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptListUUIDValue extends SpecExtensions {
  def `Test property field type: Option[IndexedSeq[java.util.UUID]]`() =
    checkType(
      typeOf[Option[IndexedSeq[java.util.UUID]]]
    , typeOf[OptListUUIDValue].member("optListUUID": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptListUUIDValue().optListUUID === None)
  }
}
