package com.dslplatform.ocd.aggregates

import SetMapWithSurrogateInAggregate.SetMapWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetMapWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Set[Map[String, String]]`() =
    checkType(
      typeOf[Set[Map[String, String]]]
    , typeOf[SetMapWithSurrogateAggregate].member("setMap": TermName).asMethod.returnType
    )

  def `Test property default value: Set.empty[Map[String, String]]`() {
    assert(SetMapWithSurrogateAggregate().setMap === Set.empty[Map[String, String]])
  }
}
