package com.dslplatform.ocd.aggregates

import OptArrayFloatWithSurrogateInAggregate.OptArrayFloatWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptArrayFloatWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[Array[Float]]`() =
    checkType(
      typeOf[Option[Array[Float]]]
    , typeOf[OptArrayFloatWithSurrogateAggregate].member("optArrayFloat": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptArrayFloatWithSurrogateAggregate().optArrayFloat === None)
  }
}
