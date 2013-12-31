package com.dslplatform.ocd.values

import ListUUIDInValue.ListUUIDValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListUUIDValue extends SpecExtensions {
  def `Test property field type: IndexedSeq[java.util.UUID]`() =
    checkType(
      typeOf[IndexedSeq[java.util.UUID]]
    , typeOf[ListUUIDValue].member("listUUID": TermName).asMethod.returnType
    )

  def `Test property default value: IndexedSeq.empty[java.util.UUID]`() {
    assert(ListUUIDValue().listUUID === IndexedSeq.empty[java.util.UUID])
  }
}
