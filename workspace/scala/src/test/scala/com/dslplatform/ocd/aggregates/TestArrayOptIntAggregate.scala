package com.dslplatform.ocd.aggregates

import ArrayOptIntInAggregate.ArrayOptIntAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayOptIntAggregate extends SpecExtensions {
  def `Test property field type: Array[Option[Int]]`() =
    checkType(
      typeOf[Array[Option[Int]]]
    , typeOf[ArrayOptIntAggregate].member("arrayOptInt": TermName).asMethod.returnType
    )

  def `Test property default value: Array.empty[Option[Int]]`() {
    assert(ArrayOptIntAggregate().arrayOptInt === Array.empty[Option[Int]])
  }
}
