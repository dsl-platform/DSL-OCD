package com.dslplatform.ocd.aggregates

import SetLongInAggregate.SetLongAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetLongAggregate extends SpecExtensions {
  def `Test property field type: Set[Long]`() =
    checkType(
      typeOf[Set[Long]]
    , typeOf[SetLongAggregate].member("setLong": TermName).asMethod.returnType
    )

  def `Test property default value: Set.empty[Long]`() {
    assert(SetLongAggregate().setLong === Set.empty[Long])
  }
}
