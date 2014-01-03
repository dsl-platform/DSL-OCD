package com.dslplatform.ocd.aggregates

import OptSetStringWithSurrogateInAggregate.OptSetStringWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptSetStringWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[Set[String]]`() =
    checkType(
      typeOf[Option[Set[String]]]
    , typeOf[OptSetStringWithSurrogateAggregate].member("optSetString": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptSetStringWithSurrogateAggregate().optSetString === None)
  }
}
