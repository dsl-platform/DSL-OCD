package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup
package DecimalWithScaleOf9Tests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestNullableDecimalWithScaleOf9_4
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[NullableDecimalWithScaleOf9_4]
          .member("nullableDecimalWithScaleOf9": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Option[BigDecimal]]
      , typeOf[NullableDecimalWithScaleOf9_4]
          .member("nullableDecimalWithScaleOf9": TermName)
          .asMethod.returnType
      )
}
