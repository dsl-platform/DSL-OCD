package com.dslplatform.ocd.values.SinglePropertyInValue.DecimalTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfNullableDecimalsValue4
import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneArrayOfNullableDecimalsValue4
    extends OcdSpec {

    /* Testing the property field public access via reflection (no instantiation) */
    def `Test property field access`() =
      lock(
        typeOf[OneArrayOfNullableDecimalsValue4]
          .member("oneArrayOfNullableDecimals": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Array[Option[BigDecimal]]]
      , typeOf[OneArrayOfNullableDecimalsValue4]
          .member("oneArrayOfNullableDecimals": TermName)
          .asMethod.returnType
      )
}
