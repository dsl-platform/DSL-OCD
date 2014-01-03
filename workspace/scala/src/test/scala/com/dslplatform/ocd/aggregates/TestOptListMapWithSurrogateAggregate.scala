package com.dslplatform.ocd.aggregates

import OptListMapWithSurrogateInAggregate.OptListMapWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptListMapWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[IndexedSeq[Map[String, String]]]`() =
    checkType(
      typeOf[Option[IndexedSeq[Map[String, String]]]]
    , typeOf[OptListMapWithSurrogateAggregate].member("optListMap": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptListMapWithSurrogateAggregate().optListMap === None)
  }
}
