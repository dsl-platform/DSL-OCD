package com.dslplatform.ocd.values

import ListOptLongInValue.ListOptLongValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListOptLongValue extends SpecExtensions {
  def `Test property field type: IndexedSeq[Option[Long]]`() =
    checkType(
      typeOf[IndexedSeq[Option[Long]]]
    , typeOf[ListOptLongValue].member("listOptLong": TermName).asMethod.returnType
    )

  def `Test property default value: IndexedSeq.empty[Option[Long]]`() {
    assert(ListOptLongValue().listOptLong === IndexedSeq.empty[Option[Long]])
  }
}
