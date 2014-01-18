package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup
package DecimalWithScaleOf9Tests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestNullableListOfOneDecimalsWithScaleOf9_3
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[NullableListOfOneDecimalsWithScaleOf9_3]
          .member("nullableListOfOneDecimalsWithScaleOf9": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Option[IndexedSeq[BigDecimal]]]
      , typeOf[NullableListOfOneDecimalsWithScaleOf9_3]
          .member("nullableListOfOneDecimalsWithScaleOf9": TermName)
          .asMethod.returnType
      )
}
