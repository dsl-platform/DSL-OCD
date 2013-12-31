package com.dslplatform.ocd.aggregates

import OneIntInAggregate.OneIntAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOneIntAggregate extends SpecExtensions {
  def `Test property field type: Int`() =
    checkType(
      typeOf[Int]
    , typeOf[OneIntAggregate].member("oneInt": TermName).asMethod.returnType
    )

  def `Test property default value: 0`() {
    assert(OneIntAggregate().oneInt === 0)
  }
}
