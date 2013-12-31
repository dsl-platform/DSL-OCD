package com.dslplatform.ocd.aggregates

import ArrayOptStringInAggregate.ArrayOptStringAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayOptStringAggregate extends SpecExtensions {
  def `Test property field type: Array[Option[String]]`() =
    checkType(
      typeOf[Array[Option[String]]]
    , typeOf[ArrayOptStringAggregate].member("arrayOptString": TermName).asMethod.returnType
    )

  def `Test property default value: Array.empty[Option[String]]`() {
    assert(ArrayOptStringAggregate().arrayOptString === Array.empty[Option[String]])
  }
}
