package com.dslplatform.ocd.aggregates

import ArrayOptMapWithSurrogateInAggregate.ArrayOptMapWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayOptMapWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Array[Option[Map[String, String]]]`() =
    checkType(
      typeOf[Array[Option[Map[String, String]]]]
    , typeOf[ArrayOptMapWithSurrogateAggregate].member("arrayOptMap": TermName).asMethod.returnType
    )

  def `Test property default value: Array.empty[Option[Map[String, String]]]`() {
    assert(ArrayOptMapWithSurrogateAggregate().arrayOptMap === Array.empty[Option[Map[String, String]]])
  }
}
