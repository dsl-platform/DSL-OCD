package com.dslplatform.ocd.aggregates

import OptListIntWithSurrogateInAggregate.OptListIntWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptListIntWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[IndexedSeq[Int]]`() =
    checkType(
      typeOf[Option[IndexedSeq[Int]]]
    , typeOf[OptListIntWithSurrogateAggregate].member("optListInt": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptListIntWithSurrogateAggregate().optListInt === None)
  }
}
