package com.dslplatform.ocd.aggregates

import OneIntWithSurrogateInAggregate.OneIntWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOneIntWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Int`() =
    checkType(
      typeOf[Int]
    , typeOf[OneIntWithSurrogateAggregate].member("oneInt": TermName).asMethod.returnType
    )

  def `Test property default value: 0`() {
    assert(OneIntWithSurrogateAggregate().oneInt === 0)
  }
}
