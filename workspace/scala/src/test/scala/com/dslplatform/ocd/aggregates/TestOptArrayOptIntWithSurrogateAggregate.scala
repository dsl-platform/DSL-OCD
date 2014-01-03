package com.dslplatform.ocd.aggregates

import OptArrayOptIntWithSurrogateInAggregate.OptArrayOptIntWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptArrayOptIntWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[Array[Option[Int]]]`() =
    checkType(
      typeOf[Option[Array[Option[Int]]]]
    , typeOf[OptArrayOptIntWithSurrogateAggregate].member("optArrayOptInt": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptArrayOptIntWithSurrogateAggregate().optArrayOptInt === None)
  }
}
