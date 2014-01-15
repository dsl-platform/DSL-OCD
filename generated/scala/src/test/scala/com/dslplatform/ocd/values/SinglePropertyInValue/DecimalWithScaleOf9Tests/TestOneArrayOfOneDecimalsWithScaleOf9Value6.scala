package com.dslplatform.ocd.values.SinglePropertyInValue.DecimalWithScaleOf9Tests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfOneDecimalsWithScaleOf9Value6
import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneArrayOfOneDecimalsWithScaleOf9Value6
    extends OcdSpec {

    /* Testing the property field public access via reflection (no instantiation) */
    def `Test property field access`() =
      lock(
        typeOf[OneArrayOfOneDecimalsWithScaleOf9Value6]
          .member("oneArrayOfOneDecimalsWithScaleOf9": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Array[BigDecimal]]
      , typeOf[OneArrayOfOneDecimalsWithScaleOf9Value6]
          .member("oneArrayOfOneDecimalsWithScaleOf9": TermName)
          .asMethod.returnType
      )
}
