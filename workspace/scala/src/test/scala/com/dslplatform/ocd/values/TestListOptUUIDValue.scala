package com.dslplatform.ocd.values

import ListOptUUIDInValue.ListOptUUIDValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListOptUUIDValue extends SpecExtensions {
  def `Test property field type: IndexedSeq[Option[java.util.UUID]]`() =
    checkType(
      typeOf[IndexedSeq[Option[java.util.UUID]]]
    , typeOf[ListOptUUIDValue].member("listOptUUID": TermName).asMethod.returnType
    )

  def `Test property default value: IndexedSeq.empty[Option[java.util.UUID]]`() {
    assert(ListOptUUIDValue().listOptUUID === IndexedSeq.empty[Option[java.util.UUID]])
  }
}
