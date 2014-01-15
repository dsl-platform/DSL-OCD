package com.dslplatform.ocd.values.SinglePropertyInValue.DecimalWithScaleOf9Tests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableDecimalWithScaleOf9Value3
import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestNullableDecimalWithScaleOf9Value3
    extends OcdSpec {

    /* Testing the property field public access via reflection (no instantiation) */
    def `Test property field access`() =
      lock(
        typeOf[NullableDecimalWithScaleOf9Value3]
          .member("nullableDecimalWithScaleOf9": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Option[BigDecimal]]
      , typeOf[NullableDecimalWithScaleOf9Value3]
          .member("nullableDecimalWithScaleOf9": TermName)
          .asMethod.returnType
      )
}
