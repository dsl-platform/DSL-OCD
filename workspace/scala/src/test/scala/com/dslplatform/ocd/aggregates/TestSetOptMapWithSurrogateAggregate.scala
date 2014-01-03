package com.dslplatform.ocd.aggregates

import SetOptMapWithSurrogateInAggregate.SetOptMapWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetOptMapWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Set[Option[Map[String, String]]]`() =
    checkType(
      typeOf[Set[Option[Map[String, String]]]]
    , typeOf[SetOptMapWithSurrogateAggregate].member("setOptMap": TermName).asMethod.returnType
    )

  def `Test property default value: Set.empty[Option[Map[String, String]]]`() {
    assert(SetOptMapWithSurrogateAggregate().setOptMap === Set.empty[Option[Map[String, String]]])
  }
}
