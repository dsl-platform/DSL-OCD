package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup
package StringWithMaxLengthOf9Tests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestNullableArrayOfNullableStringsWithMaxLengthOf9_3
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[NullableArrayOfNullableStringsWithMaxLengthOf9_3]
          .member("nullableArrayOfNullableStringsWithMaxLengthOf9": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Option[Array[Option[String]]]]
      , typeOf[NullableArrayOfNullableStringsWithMaxLengthOf9_3]
          .member("nullableArrayOfNullableStringsWithMaxLengthOf9": TermName)
          .asMethod.returnType
      )
}
