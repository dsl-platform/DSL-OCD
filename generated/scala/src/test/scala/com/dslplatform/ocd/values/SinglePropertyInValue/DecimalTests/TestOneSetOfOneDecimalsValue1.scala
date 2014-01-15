package com.dslplatform.ocd.values.SinglePropertyInValue.DecimalTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfOneDecimalsValue1
import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneSetOfOneDecimalsValue1
    extends OcdSpec {

    /* Testing the property field public access via reflection (no instantiation) */
    def `Test property field access`() =
      lock(
        typeOf[OneSetOfOneDecimalsValue1]
          .member("oneSetOfOneDecimals": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Set[BigDecimal]]
      , typeOf[OneSetOfOneDecimalsValue1]
          .member("oneSetOfOneDecimals": TermName)
          .asMethod.returnType
      )
}
