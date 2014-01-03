package com.dslplatform.ocd.aggregates

import SetIntInAggregate.SetIntAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetIntAggregate extends SpecExtensions {
  def `Test property field type: Set[Int]`() =
    checkType(
      typeOf[Set[Int]]
    , typeOf[SetIntAggregate].member("setInt": TermName).asMethod.returnType
    )

  def `Test property default value: Set.empty[Int]`() {
    assert(SetIntAggregate().setInt === Set.empty[Int])
  }
}
