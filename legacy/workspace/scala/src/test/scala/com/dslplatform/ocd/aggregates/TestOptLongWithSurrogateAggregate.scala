package com.dslplatform.ocd.aggregates

import OptLongWithSurrogateInAggregate.OptLongWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptLongWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[Long]`() =
    checkType(
      typeOf[Option[Long]]
    , typeOf[OptLongWithSurrogateAggregate].member("optLong": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptLongWithSurrogateAggregate().optLong === None)
  }
}
