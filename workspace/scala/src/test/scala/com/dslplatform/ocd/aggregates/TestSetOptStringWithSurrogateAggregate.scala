package com.dslplatform.ocd.aggregates

import SetOptStringWithSurrogateInAggregate.SetOptStringWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetOptStringWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Set[Option[String]]`() =
    checkType(
      typeOf[Set[Option[String]]]
    , typeOf[SetOptStringWithSurrogateAggregate].member("setOptString": TermName).asMethod.returnType
    )

  def `Test property default value: Set.empty[Option[String]]`() {
    assert(SetOptStringWithSurrogateAggregate().setOptString === Set.empty[Option[String]])
  }
}
