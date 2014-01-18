package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup
package DecimalWithScaleOf9Tests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneSetOfNullableDecimalsWithScaleOf9_2
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[OneSetOfNullableDecimalsWithScaleOf9_2]
          .member("oneSetOfNullableDecimalsWithScaleOf9": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Set[Option[BigDecimal]]]
      , typeOf[OneSetOfNullableDecimalsWithScaleOf9_2]
          .member("oneSetOfNullableDecimalsWithScaleOf9": TermName)
          .asMethod.returnType
      )
}
