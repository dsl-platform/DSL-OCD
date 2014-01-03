package com.dslplatform.ocd.aggregates

import SetOptStringInAggregate.SetOptStringAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetOptStringAggregate extends SpecExtensions {
  def `Test property field type: Set[Option[String]]`() =
    checkType(
      typeOf[Set[Option[String]]]
    , typeOf[SetOptStringAggregate].member("setOptString": TermName).asMethod.returnType
    )

  def `Test property default value: Set.empty[Option[String]]`() {
    assert(SetOptStringAggregate().setOptString === Set.empty[Option[String]])
  }
}
