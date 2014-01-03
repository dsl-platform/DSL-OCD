package com.dslplatform.ocd.aggregates

import OptMapWithSurrogateInAggregate.OptMapWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptMapWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[Map[String, String]]`() =
    checkType(
      typeOf[Option[Map[String, String]]]
    , typeOf[OptMapWithSurrogateAggregate].member("optMap": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptMapWithSurrogateAggregate().optMap === None)
  }
}
