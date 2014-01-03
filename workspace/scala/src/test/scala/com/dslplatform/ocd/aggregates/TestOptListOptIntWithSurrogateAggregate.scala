package com.dslplatform.ocd.aggregates

import OptListOptIntWithSurrogateInAggregate.OptListOptIntWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptListOptIntWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[IndexedSeq[Option[Int]]]`() =
    checkType(
      typeOf[Option[IndexedSeq[Option[Int]]]]
    , typeOf[OptListOptIntWithSurrogateAggregate].member("optListOptInt": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptListOptIntWithSurrogateAggregate().optListOptInt === None)
  }
}
