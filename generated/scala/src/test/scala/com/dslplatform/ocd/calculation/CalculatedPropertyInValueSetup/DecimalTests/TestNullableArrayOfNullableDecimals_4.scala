package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup
package DecimalTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestNullableArrayOfNullableDecimals_4
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[NullableArrayOfNullableDecimals_4]
          .member("nullableArrayOfNullableDecimals": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Option[Array[Option[BigDecimal]]]]
      , typeOf[NullableArrayOfNullableDecimals_4]
          .member("nullableArrayOfNullableDecimals": TermName)
          .asMethod.returnType
      )
}
