package com.dslplatform.ocd.values

import ListOptIntInValue.ListOptIntValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListOptIntValue extends SpecExtensions {
  def `Test property field type: IndexedSeq[Option[Int]]`() =
    checkType(
      typeOf[IndexedSeq[Option[Int]]]
    , typeOf[ListOptIntValue].member("listOptInt": TermName).asMethod.returnType
    )

  def `Test property default value: IndexedSeq.empty[Option[Int]]`() {
    assert(ListOptIntValue().listOptInt === IndexedSeq.empty[Option[Int]])
  }
}
