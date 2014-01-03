package com.dslplatform.ocd.aggregates

import SetOptLongWithSurrogateInAggregate.SetOptLongWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetOptLongWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Set[Option[Long]]`() =
    checkType(
      typeOf[Set[Option[Long]]]
    , typeOf[SetOptLongWithSurrogateAggregate].member("setOptLong": TermName).asMethod.returnType
    )

  def `Test property default value: Set.empty[Option[Long]]`() {
    assert(SetOptLongWithSurrogateAggregate().setOptLong === Set.empty[Option[Long]])
  }
}
