package com.dslplatform.ocd.values.SinglePropertyInValue.IntegerTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfNullableIntegersValue5
import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneSetOfNullableIntegersValue5
    extends OcdSpec {

    /* Testing the property field public access via reflection (no instantiation) */
    def `Test property field access`() =
      lock(
        typeOf[OneSetOfNullableIntegersValue5]
          .member("oneSetOfNullableIntegers": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Set[Option[Int]]]
      , typeOf[OneSetOfNullableIntegersValue5]
          .member("oneSetOfNullableIntegers": TermName)
          .asMethod.returnType
      )
}
