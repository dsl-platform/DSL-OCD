package com.dslplatform.ocd.aggregates

import SetOptIntInAggregate.SetOptIntAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetOptIntAggregate extends SpecExtensions {
  def `Test property field type: Set[Option[Int]]`() =
    checkType(
      typeOf[Set[Option[Int]]]
    , typeOf[SetOptIntAggregate].member("setOptInt": TermName).asMethod.returnType
    )

  def `Test property default value: Set.empty[Option[Int]]`() {
    assert(SetOptIntAggregate().setOptInt === Set.empty[Option[Int]])
  }
}
