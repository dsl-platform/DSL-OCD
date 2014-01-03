package com.dslplatform.ocd.aggregates

import ArrayOptLongInAggregate.ArrayOptLongAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayOptLongAggregate extends SpecExtensions {
  def `Test property field type: Array[Option[Long]]`() =
    checkType(
      typeOf[Array[Option[Long]]]
    , typeOf[ArrayOptLongAggregate].member("arrayOptLong": TermName).asMethod.returnType
    )

  def `Test property default value: Array.empty[Option[Long]]`() {
    assert(ArrayOptLongAggregate().arrayOptLong === Array.empty[Option[Long]])
  }
}
