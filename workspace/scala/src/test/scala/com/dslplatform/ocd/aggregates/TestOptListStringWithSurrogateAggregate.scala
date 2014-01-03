package com.dslplatform.ocd.aggregates

import OptListStringWithSurrogateInAggregate.OptListStringWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptListStringWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[IndexedSeq[String]]`() =
    checkType(
      typeOf[Option[IndexedSeq[String]]]
    , typeOf[OptListStringWithSurrogateAggregate].member("optListString": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptListStringWithSurrogateAggregate().optListString === None)
  }
}
