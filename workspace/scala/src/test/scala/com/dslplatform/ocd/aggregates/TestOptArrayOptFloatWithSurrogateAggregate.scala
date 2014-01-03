package com.dslplatform.ocd.aggregates

import OptArrayOptFloatWithSurrogateInAggregate.OptArrayOptFloatWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptArrayOptFloatWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[Array[Option[Float]]]`() =
    checkType(
      typeOf[Option[Array[Option[Float]]]]
    , typeOf[OptArrayOptFloatWithSurrogateAggregate].member("optArrayOptFloat": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptArrayOptFloatWithSurrogateAggregate().optArrayOptFloat === None)
  }
}
