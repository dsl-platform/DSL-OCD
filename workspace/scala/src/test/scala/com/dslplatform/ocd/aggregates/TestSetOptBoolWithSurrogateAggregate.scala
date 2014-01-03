package com.dslplatform.ocd.aggregates

import SetOptBoolWithSurrogateInAggregate.SetOptBoolWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetOptBoolWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Set[Option[Boolean]]`() =
    checkType(
      typeOf[Set[Option[Boolean]]]
    , typeOf[SetOptBoolWithSurrogateAggregate].member("setOptBool": TermName).asMethod.returnType
    )

  def `Test property default value: Set.empty[Option[Boolean]]`() {
    assert(SetOptBoolWithSurrogateAggregate().setOptBool === Set.empty[Option[Boolean]])
  }
}
