package com.dslplatform.ocd.values.PropertyInValue
package DecimalWithScaleOf9Tests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestNullableListOfNullableDecimalsWithScaleOf9_1
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[NullableListOfNullableDecimalsWithScaleOf9_1]
          .member("nullableListOfNullableDecimalsWithScaleOf9": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Option[IndexedSeq[Option[BigDecimal]]]]
      , typeOf[NullableListOfNullableDecimalsWithScaleOf9_1]
          .member("nullableListOfNullableDecimalsWithScaleOf9": TermName)
          .asMethod.returnType
      )
}
