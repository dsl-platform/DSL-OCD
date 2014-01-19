package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup
package DoubleTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneListOfNullableDoubles_5
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[OneListOfNullableDoubles_5]
          .member("oneListOfNullableDoubles": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[IndexedSeq[Option[Double]]]
      , typeOf[OneListOfNullableDoubles_5]
          .member("oneListOfNullableDoubles": TermName)
          .asMethod.returnType
      )
}
