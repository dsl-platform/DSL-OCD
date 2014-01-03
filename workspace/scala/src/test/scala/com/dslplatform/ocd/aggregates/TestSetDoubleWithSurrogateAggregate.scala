package com.dslplatform.ocd.aggregates

import SetDoubleWithSurrogateInAggregate.SetDoubleWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetDoubleWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Set[Double]`() =
    checkType(
      typeOf[Set[Double]]
    , typeOf[SetDoubleWithSurrogateAggregate].member("setDouble": TermName).asMethod.returnType
    )

  def `Test property default value: Set.empty[Double]`() {
    assert(SetDoubleWithSurrogateAggregate().setDouble === Set.empty[Double])
  }
}
