package com.dslplatform.ocd.aggregates

import SetMapInAggregate.SetMapAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetMapAggregate extends SpecExtensions {
  def `Test property field type: Set[Map[String, String]]`() =
    checkType(
      typeOf[Set[Map[String, String]]]
    , typeOf[SetMapAggregate].member("setMap": TermName).asMethod.returnType
    )

  def `Test property default value: Set.empty[Map[String, String]]`() {
    assert(SetMapAggregate().setMap === Set.empty[Map[String, String]])
  }
}
