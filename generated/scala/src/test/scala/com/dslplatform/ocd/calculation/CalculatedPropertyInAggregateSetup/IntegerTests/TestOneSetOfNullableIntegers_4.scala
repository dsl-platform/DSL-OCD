package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup
package IntegerTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneSetOfNullableIntegers_4
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[OneSetOfNullableIntegers_4]
          .member("oneSetOfNullableIntegers": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Set[Option[Int]]]
      , typeOf[OneSetOfNullableIntegers_4]
          .member("oneSetOfNullableIntegers": TermName)
          .asMethod.returnType
      )
}
