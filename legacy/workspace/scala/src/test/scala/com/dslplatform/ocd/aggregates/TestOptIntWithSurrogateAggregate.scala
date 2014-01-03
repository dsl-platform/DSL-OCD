package com.dslplatform.ocd.aggregates

import OptIntWithSurrogateInAggregate.OptIntWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptIntWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[Int]`() =
    checkType(
      typeOf[Option[Int]]
    , typeOf[OptIntWithSurrogateAggregate].member("optInt": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptIntWithSurrogateAggregate().optInt === None)
  }
}
