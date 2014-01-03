package com.dslplatform.ocd.aggregates

import OptSetOptIntWithSurrogateInAggregate.OptSetOptIntWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptSetOptIntWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[Set[Option[Int]]]`() =
    checkType(
      typeOf[Option[Set[Option[Int]]]]
    , typeOf[OptSetOptIntWithSurrogateAggregate].member("optSetOptInt": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptSetOptIntWithSurrogateAggregate().optSetOptInt === None)
  }
}
