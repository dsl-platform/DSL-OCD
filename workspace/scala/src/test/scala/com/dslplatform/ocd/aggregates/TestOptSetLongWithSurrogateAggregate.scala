package com.dslplatform.ocd.aggregates

import OptSetLongWithSurrogateInAggregate.OptSetLongWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptSetLongWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[Set[Long]]`() =
    checkType(
      typeOf[Option[Set[Long]]]
    , typeOf[OptSetLongWithSurrogateAggregate].member("optSetLong": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptSetLongWithSurrogateAggregate().optSetLong === None)
  }
}
