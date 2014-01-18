package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup
package DoubleTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneArrayOfNullableDoubles_4
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[OneArrayOfNullableDoubles_4]
          .member("oneArrayOfNullableDoubles": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Array[Option[Double]]]
      , typeOf[OneArrayOfNullableDoubles_4]
          .member("oneArrayOfNullableDoubles": TermName)
          .asMethod.returnType
      )
}
