package com.dslplatform.ocd.aggregates

import OptSetOptStringWithSurrogateInAggregate.OptSetOptStringWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptSetOptStringWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[Set[Option[String]]]`() =
    checkType(
      typeOf[Option[Set[Option[String]]]]
    , typeOf[OptSetOptStringWithSurrogateAggregate].member("optSetOptString": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptSetOptStringWithSurrogateAggregate().optSetOptString === None)
  }
}
