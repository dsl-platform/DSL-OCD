package com.dslplatform.ocd.aggregates

import OneMapInAggregate.OneMapAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOneMapAggregate extends SpecExtensions {
  def `Test property field type: Map[String, String]`() =
    checkType(
      typeOf[Map[String, String]]
    , typeOf[OneMapAggregate].member("oneMap": TermName).asMethod.returnType
    )

  def `Test property default value: Map.empty[String, String]`() {
    assert(OneMapAggregate().oneMap === Map.empty[String, String])
  }
}
