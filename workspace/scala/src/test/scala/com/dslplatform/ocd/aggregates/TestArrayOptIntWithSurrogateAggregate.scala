package com.dslplatform.ocd.aggregates

import ArrayOptIntWithSurrogateInAggregate.ArrayOptIntWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayOptIntWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Array[Option[Int]]`() =
    checkType(
      typeOf[Array[Option[Int]]]
    , typeOf[ArrayOptIntWithSurrogateAggregate].member("arrayOptInt": TermName).asMethod.returnType
    )

  def `Test property default value: Array.empty[Option[Int]]`() {
    assert(ArrayOptIntWithSurrogateAggregate().arrayOptInt === Array.empty[Option[Int]])
  }
}
