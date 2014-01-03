package com.dslplatform.ocd.aggregates

import SetOptIntWithSurrogateInAggregate.SetOptIntWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetOptIntWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Set[Option[Int]]`() =
    checkType(
      typeOf[Set[Option[Int]]]
    , typeOf[SetOptIntWithSurrogateAggregate].member("setOptInt": TermName).asMethod.returnType
    )

  def `Test property default value: Set.empty[Option[Int]]`() {
    assert(SetOptIntWithSurrogateAggregate().setOptInt === Set.empty[Option[Int]])
  }
}
