package com.dslplatform.ocd.aggregates

import ArrayOptLongWithSurrogateInAggregate.ArrayOptLongWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayOptLongWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Array[Option[Long]]`() =
    checkType(
      typeOf[Array[Option[Long]]]
    , typeOf[ArrayOptLongWithSurrogateAggregate].member("arrayOptLong": TermName).asMethod.returnType
    )

  def `Test property default value: Array.empty[Option[Long]]`() {
    assert(ArrayOptLongWithSurrogateAggregate().arrayOptLong === Array.empty[Option[Long]])
  }
}
