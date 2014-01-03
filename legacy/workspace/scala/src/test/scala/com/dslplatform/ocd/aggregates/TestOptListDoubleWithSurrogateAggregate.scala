package com.dslplatform.ocd.aggregates

import OptListDoubleWithSurrogateInAggregate.OptListDoubleWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptListDoubleWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[IndexedSeq[Double]]`() =
    checkType(
      typeOf[Option[IndexedSeq[Double]]]
    , typeOf[OptListDoubleWithSurrogateAggregate].member("optListDouble": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptListDoubleWithSurrogateAggregate().optListDouble === None)
  }
}
