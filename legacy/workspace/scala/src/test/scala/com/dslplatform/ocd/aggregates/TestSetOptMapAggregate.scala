package com.dslplatform.ocd.aggregates

import SetOptMapInAggregate.SetOptMapAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetOptMapAggregate extends SpecExtensions {
  def `Test property field type: Set[Option[Map[String, String]]]`() =
    checkType(
      typeOf[Set[Option[Map[String, String]]]]
    , typeOf[SetOptMapAggregate].member("setOptMap": TermName).asMethod.returnType
    )

  def `Test property default value: Set.empty[Option[Map[String, String]]]`() {
    assert(SetOptMapAggregate().setOptMap === Set.empty[Option[Map[String, String]]])
  }
}
