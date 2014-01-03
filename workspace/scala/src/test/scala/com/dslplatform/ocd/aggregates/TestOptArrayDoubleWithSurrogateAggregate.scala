package com.dslplatform.ocd.aggregates

import OptArrayDoubleWithSurrogateInAggregate.OptArrayDoubleWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptArrayDoubleWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[Array[Double]]`() =
    checkType(
      typeOf[Option[Array[Double]]]
    , typeOf[OptArrayDoubleWithSurrogateAggregate].member("optArrayDouble": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptArrayDoubleWithSurrogateAggregate().optArrayDouble === None)
  }
}
