package com.dslplatform.ocd.aggregates

import OptSetMapWithSurrogateInAggregate.OptSetMapWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptSetMapWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[Set[Map[String, String]]]`() =
    checkType(
      typeOf[Option[Set[Map[String, String]]]]
    , typeOf[OptSetMapWithSurrogateAggregate].member("optSetMap": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptSetMapWithSurrogateAggregate().optSetMap === None)
  }
}
