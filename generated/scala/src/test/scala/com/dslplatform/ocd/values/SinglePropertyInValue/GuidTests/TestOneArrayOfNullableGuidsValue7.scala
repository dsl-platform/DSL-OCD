package com.dslplatform.ocd.values.SinglePropertyInValue.GuidTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfNullableGuidsValue7
import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneArrayOfNullableGuidsValue7
    extends OcdSpec {

    /* Testing the property field public access via reflection (no instantiation) */
    def `Test property field access`() =
      lock(
        typeOf[OneArrayOfNullableGuidsValue7]
          .member("oneArrayOfNullableGuids": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Array[Option[scala.util.UUID]]]
      , typeOf[OneArrayOfNullableGuidsValue7]
          .member("oneArrayOfNullableGuids": TermName)
          .asMethod.returnType
      )
}
