package com.dslplatform.ocd.aggregates

import OptArrayIntWithSurrogateInAggregate.OptArrayIntWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptArrayIntWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[Array[Int]]`() =
    checkType(
      typeOf[Option[Array[Int]]]
    , typeOf[OptArrayIntWithSurrogateAggregate].member("optArrayInt": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptArrayIntWithSurrogateAggregate().optArrayInt === None)
  }
}
