package com.dslplatform.ocd.aggregates

import OptSetIntWithSurrogateInAggregate.OptSetIntWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptSetIntWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[Set[Int]]`() =
    checkType(
      typeOf[Option[Set[Int]]]
    , typeOf[OptSetIntWithSurrogateAggregate].member("optSetInt": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptSetIntWithSurrogateAggregate().optSetInt === None)
  }
}
