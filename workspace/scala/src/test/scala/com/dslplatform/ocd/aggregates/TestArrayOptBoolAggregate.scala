package com.dslplatform.ocd.aggregates

import ArrayOptBoolInAggregate.ArrayOptBoolAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayOptBoolAggregate extends SpecExtensions {
  def `Test property field type: Array[Option[Boolean]]`() =
    checkType(
      typeOf[Array[Option[Boolean]]]
    , typeOf[ArrayOptBoolAggregate].member("arrayOptBool": TermName).asMethod.returnType
    )

  def `Test property default value: Array.empty[Option[Boolean]]`() {
    assert(ArrayOptBoolAggregate().arrayOptBool === Array.empty[Option[Boolean]])
  }
}
