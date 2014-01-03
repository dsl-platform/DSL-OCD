package com.dslplatform.ocd.aggregates

import SetLongWithSurrogateInAggregate.SetLongWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetLongWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Set[Long]`() =
    checkType(
      typeOf[Set[Long]]
    , typeOf[SetLongWithSurrogateAggregate].member("setLong": TermName).asMethod.returnType
    )

  def `Test property default value: Set.empty[Long]`() {
    assert(SetLongWithSurrogateAggregate().setLong === Set.empty[Long])
  }
}
