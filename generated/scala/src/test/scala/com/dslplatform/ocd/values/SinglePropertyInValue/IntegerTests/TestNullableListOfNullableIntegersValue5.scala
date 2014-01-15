package com.dslplatform.ocd.values.SinglePropertyInValue.IntegerTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfNullableIntegersValue5
import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestNullableListOfNullableIntegersValue5
    extends OcdSpec {

    /* Testing the property field public access via reflection (no instantiation) */
    def `Test property field access`() =
      lock(
        typeOf[NullableListOfNullableIntegersValue5]
          .member("nullableListOfNullableIntegers": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Option[List[Option[Int]]]]
      , typeOf[NullableListOfNullableIntegersValue5]
          .member("nullableListOfNullableIntegers": TermName)
          .asMethod.returnType
      )
}
