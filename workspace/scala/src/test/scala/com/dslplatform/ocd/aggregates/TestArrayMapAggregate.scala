package com.dslplatform.ocd.aggregates

import ArrayMapInAggregate.ArrayMapAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayMapAggregate extends SpecExtensions {
  def `Test property field type: Array[Map[String, String]]`() =
    checkType(
      typeOf[Array[Map[String, String]]]
    , typeOf[ArrayMapAggregate].member("arrayMap": TermName).asMethod.returnType
    )

  def `Test property default value: Array.empty[Map[String, String]]`() {
    assert(ArrayMapAggregate().arrayMap === Array.empty[Map[String, String]])
  }
}
