package com.dslplatform.ocd.aggregates

import OneStringInAggregate.OneStringAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOneStringAggregate extends SpecExtensions {
  def `Test property field type: String`() =
    checkType(
      typeOf[String]
    , typeOf[OneStringAggregate].member("oneString": TermName).asMethod.returnType
    )

  def `Test property default value: ""`() {
    assert(OneStringAggregate().oneString === "")
  }
}
