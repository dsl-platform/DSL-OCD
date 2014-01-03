package com.dslplatform.ocd.aggregates

import SetStringWithSurrogateInAggregate.SetStringWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetStringWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Set[String]`() =
    checkType(
      typeOf[Set[String]]
    , typeOf[SetStringWithSurrogateAggregate].member("setString": TermName).asMethod.returnType
    )

  def `Test property default value: Set.empty[String]`() {
    assert(SetStringWithSurrogateAggregate().setString === Set.empty[String])
  }
}
