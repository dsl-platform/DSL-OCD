package com.dslplatform.ocd.aggregates

import SetIntWithSurrogateInAggregate.SetIntWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetIntWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Set[Int]`() =
    checkType(
      typeOf[Set[Int]]
    , typeOf[SetIntWithSurrogateAggregate].member("setInt": TermName).asMethod.returnType
    )

  def `Test property default value: Set.empty[Int]`() {
    assert(SetIntWithSurrogateAggregate().setInt === Set.empty[Int])
  }
}
