package com.dslplatform.ocd.aggregates

import ArrayOptBoolWithSurrogateInAggregate.ArrayOptBoolWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayOptBoolWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Array[Option[Boolean]]`() =
    checkType(
      typeOf[Array[Option[Boolean]]]
    , typeOf[ArrayOptBoolWithSurrogateAggregate].member("arrayOptBool": TermName).asMethod.returnType
    )

  def `Test property default value: Array.empty[Option[Boolean]]`() {
    assert(ArrayOptBoolWithSurrogateAggregate().arrayOptBool === Array.empty[Option[Boolean]])
  }
}
