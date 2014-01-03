package com.dslplatform.ocd.aggregates

import OptListOptStringWithSurrogateInAggregate.OptListOptStringWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptListOptStringWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[IndexedSeq[Option[String]]]`() =
    checkType(
      typeOf[Option[IndexedSeq[Option[String]]]]
    , typeOf[OptListOptStringWithSurrogateAggregate].member("optListOptString": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptListOptStringWithSurrogateAggregate().optListOptString === None)
  }
}
