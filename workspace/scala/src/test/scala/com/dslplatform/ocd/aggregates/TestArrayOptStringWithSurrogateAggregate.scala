package com.dslplatform.ocd.aggregates

import ArrayOptStringWithSurrogateInAggregate.ArrayOptStringWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayOptStringWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Array[Option[String]]`() =
    checkType(
      typeOf[Array[Option[String]]]
    , typeOf[ArrayOptStringWithSurrogateAggregate].member("arrayOptString": TermName).asMethod.returnType
    )

  def `Test property default value: Array.empty[Option[String]]`() {
    assert(ArrayOptStringWithSurrogateAggregate().arrayOptString === Array.empty[Option[String]])
  }
}
