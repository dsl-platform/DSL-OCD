package com.dslplatform.ocd.aggregates

import ArrayOptMapInAggregate.ArrayOptMapAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayOptMapAggregate extends SpecExtensions {
  def `Test property field type: Array[Option[Map[String, String]]]`() =
    checkType(
      typeOf[Array[Option[Map[String, String]]]]
    , typeOf[ArrayOptMapAggregate].member("arrayOptMap": TermName).asMethod.returnType
    )

  def `Test property default value: Array.empty[Option[Map[String, String]]]`() {
    assert(ArrayOptMapAggregate().arrayOptMap === Array.empty[Option[Map[String, String]]])
  }
}
