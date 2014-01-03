package com.dslplatform.ocd.aggregates

import OptListFloatWithSurrogateInAggregate.OptListFloatWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptListFloatWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[IndexedSeq[Float]]`() =
    checkType(
      typeOf[Option[IndexedSeq[Float]]]
    , typeOf[OptListFloatWithSurrogateAggregate].member("optListFloat": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptListFloatWithSurrogateAggregate().optListFloat === None)
  }
}
