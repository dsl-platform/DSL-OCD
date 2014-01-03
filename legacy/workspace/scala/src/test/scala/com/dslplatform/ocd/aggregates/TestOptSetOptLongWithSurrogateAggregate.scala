package com.dslplatform.ocd.aggregates

import OptSetOptLongWithSurrogateInAggregate.OptSetOptLongWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptSetOptLongWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[Set[Option[Long]]]`() =
    checkType(
      typeOf[Option[Set[Option[Long]]]]
    , typeOf[OptSetOptLongWithSurrogateAggregate].member("optSetOptLong": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptSetOptLongWithSurrogateAggregate().optSetOptLong === None)
  }
}
