package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup
package StringWithMaxLengthOf9Tests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneArrayOfNullableStringsWithMaxLengthOf9_5
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[OneArrayOfNullableStringsWithMaxLengthOf9_5]
          .member("oneArrayOfNullableStringsWithMaxLengthOf9": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Array[Option[String]]]
      , typeOf[OneArrayOfNullableStringsWithMaxLengthOf9_5]
          .member("oneArrayOfNullableStringsWithMaxLengthOf9": TermName)
          .asMethod.returnType
      )
}
