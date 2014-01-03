package com.dslplatform.ocd.values

import ListLongInValue.ListLongValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListLongValue extends SpecExtensions {
  def `Test property field type: IndexedSeq[Long]`() =
    checkType(
      typeOf[IndexedSeq[Long]]
    , typeOf[ListLongValue].member("listLong": TermName).asMethod.returnType
    )

  def `Test property default value: IndexedSeq.empty[Long]`() {
    assert(ListLongValue().listLong === IndexedSeq.empty[Long])
  }
}
