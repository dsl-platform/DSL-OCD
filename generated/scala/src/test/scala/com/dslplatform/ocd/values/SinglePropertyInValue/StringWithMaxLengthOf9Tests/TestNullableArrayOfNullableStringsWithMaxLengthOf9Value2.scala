package com.dslplatform.ocd.values.SinglePropertyInValue.StringWithMaxLengthOf9Tests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfNullableStringsWithMaxLengthOf9Value2
import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestNullableArrayOfNullableStringsWithMaxLengthOf9Value2
    extends OcdSpec {

    /* Testing the property field public access via reflection (no instantiation) */
    def `Test property field access`() =
      lock(
        typeOf[NullableArrayOfNullableStringsWithMaxLengthOf9Value2]
          .member("nullableArrayOfNullableStringsWithMaxLengthOf9": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Option[Array[Option[String]]]]
      , typeOf[NullableArrayOfNullableStringsWithMaxLengthOf9Value2]
          .member("nullableArrayOfNullableStringsWithMaxLengthOf9": TermName)
          .asMethod.returnType
      )
}
