package com.dslplatform.ocd.values.SinglePropertyInValue.DecimalWithScaleOf9Tests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfOneDecimalsWithScaleOf9Value2
import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestNullableArrayOfOneDecimalsWithScaleOf9Value2
    extends OcdSpec {

    /* Testing the property field public access via reflection (no instantiation) */
    def `Test property field access`() =
      lock(
        typeOf[NullableArrayOfOneDecimalsWithScaleOf9Value2]
          .member("nullableArrayOfOneDecimalsWithScaleOf9": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Option[Array[BigDecimal]]]
      , typeOf[NullableArrayOfOneDecimalsWithScaleOf9Value2]
          .member("nullableArrayOfOneDecimalsWithScaleOf9": TermName)
          .asMethod.returnType
      )
}
