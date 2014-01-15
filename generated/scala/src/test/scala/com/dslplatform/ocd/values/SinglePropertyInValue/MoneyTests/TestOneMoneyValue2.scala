package com.dslplatform.ocd.values.SinglePropertyInValue.MoneyTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import com.dslplatform.ocd.values.SinglePropertyInValue.OneMoneyValue2
import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneMoneyValue2
    extends OcdSpec {

    /* Testing the property field public access via reflection (no instantiation) */
    def `Test property field access`() =
      lock(
        typeOf[OneMoneyValue2]
          .member("oneMoney": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[BigDecimal]
      , typeOf[OneMoneyValue2]
          .member("oneMoney": TermName)
          .asMethod.returnType
      )
}
