package com.dslplatform.ocd.aggregates

import OneStringWithSurrogateInAggregate.OneStringWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOneStringWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: String`() =
    checkType(
      typeOf[String]
    , typeOf[OneStringWithSurrogateAggregate].member("oneString": TermName).asMethod.returnType
    )

  def `Test property default value: ""`() {
    assert(OneStringWithSurrogateAggregate().oneString === "")
  }
}
