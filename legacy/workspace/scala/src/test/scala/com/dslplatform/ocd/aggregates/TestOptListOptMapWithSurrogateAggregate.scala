package com.dslplatform.ocd.aggregates

import OptListOptMapWithSurrogateInAggregate.OptListOptMapWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptListOptMapWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[IndexedSeq[Option[Map[String, String]]]]`() =
    checkType(
      typeOf[Option[IndexedSeq[Option[Map[String, String]]]]]
    , typeOf[OptListOptMapWithSurrogateAggregate].member("optListOptMap": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptListOptMapWithSurrogateAggregate().optListOptMap === None)
  }
}
