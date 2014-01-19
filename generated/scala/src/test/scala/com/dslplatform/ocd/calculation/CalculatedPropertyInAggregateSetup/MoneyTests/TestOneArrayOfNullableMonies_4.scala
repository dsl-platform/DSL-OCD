package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup
package MoneyTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneArrayOfNullableMonies_4
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[OneArrayOfNullableMonies_4]
          .member("oneArrayOfNullableMonies": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Array[Option[BigDecimal]]]
      , typeOf[OneArrayOfNullableMonies_4]
          .member("oneArrayOfNullableMonies": TermName)
          .asMethod.returnType
      )
}
