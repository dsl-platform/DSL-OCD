package com.dslplatform.ocd.values.SinglePropertyInValue.MoneyTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfNullableMoniesValue1
import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestNullableSetOfNullableMoniesValue1
    extends OcdSpec {

    /* Testing the property field public access via reflection (no instantiation) */
    def `Test property field access`() =
      lock(
        typeOf[NullableSetOfNullableMoniesValue1]
          .member("nullableSetOfNullableMonies": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Option[Set[Option[BigDecimal]]]]
      , typeOf[NullableSetOfNullableMoniesValue1]
          .member("nullableSetOfNullableMonies": TermName)
          .asMethod.returnType
      )
}
