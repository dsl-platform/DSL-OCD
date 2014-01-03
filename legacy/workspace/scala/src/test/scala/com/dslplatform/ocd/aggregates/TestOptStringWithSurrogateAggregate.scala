package com.dslplatform.ocd.aggregates

import OptStringWithSurrogateInAggregate.OptStringWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptStringWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[String]`() =
    checkType(
      typeOf[Option[String]]
    , typeOf[OptStringWithSurrogateAggregate].member("optString": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptStringWithSurrogateAggregate().optString === None)
  }
}
