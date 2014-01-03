package com.dslplatform.ocd.aggregates

import OptSetOptMapWithSurrogateInAggregate.OptSetOptMapWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptSetOptMapWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[Set[Option[Map[String, String]]]]`() =
    checkType(
      typeOf[Option[Set[Option[Map[String, String]]]]]
    , typeOf[OptSetOptMapWithSurrogateAggregate].member("optSetOptMap": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptSetOptMapWithSurrogateAggregate().optSetOptMap === None)
  }
}
