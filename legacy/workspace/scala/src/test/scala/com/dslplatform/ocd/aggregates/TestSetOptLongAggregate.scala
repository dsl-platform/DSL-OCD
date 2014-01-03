package com.dslplatform.ocd.aggregates

import SetOptLongInAggregate.SetOptLongAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetOptLongAggregate extends SpecExtensions {
  def `Test property field type: Set[Option[Long]]`() =
    checkType(
      typeOf[Set[Option[Long]]]
    , typeOf[SetOptLongAggregate].member("setOptLong": TermName).asMethod.returnType
    )

  def `Test property default value: Set.empty[Option[Long]]`() {
    assert(SetOptLongAggregate().setOptLong === Set.empty[Option[Long]])
  }
}
