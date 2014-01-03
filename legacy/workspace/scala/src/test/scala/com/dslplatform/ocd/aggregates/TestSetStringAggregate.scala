package com.dslplatform.ocd.aggregates

import SetStringInAggregate.SetStringAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetStringAggregate extends SpecExtensions {
  def `Test property field type: Set[String]`() =
    checkType(
      typeOf[Set[String]]
    , typeOf[SetStringAggregate].member("setString": TermName).asMethod.returnType
    )

  def `Test property default value: Set.empty[String]`() {
    assert(SetStringAggregate().setString === Set.empty[String])
  }
}
