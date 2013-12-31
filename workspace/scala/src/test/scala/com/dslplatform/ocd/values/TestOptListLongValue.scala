package com.dslplatform.ocd.values

import OptListLongInValue.OptListLongValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptListLongValue extends SpecExtensions {
  def `Test property field type: Option[IndexedSeq[Long]]`() =
    checkType(
      typeOf[Option[IndexedSeq[Long]]]
    , typeOf[OptListLongValue].member("optListLong": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptListLongValue().optListLong === None)
  }
}
