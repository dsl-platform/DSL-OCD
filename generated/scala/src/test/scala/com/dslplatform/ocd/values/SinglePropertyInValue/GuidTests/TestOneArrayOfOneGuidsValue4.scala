package com.dslplatform.ocd.values.SinglePropertyInValue.GuidTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfOneGuidsValue4
import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneArrayOfOneGuidsValue4
    extends OcdSpec {

    /* Testing the property field public access via reflection (no instantiation) */
    def `Test property field access`() =
      lock(
        typeOf[OneArrayOfOneGuidsValue4]
          .member("oneArrayOfOneGuids": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Array[scala.util.UUID]]
      , typeOf[OneArrayOfOneGuidsValue4]
          .member("oneArrayOfOneGuids": TermName)
          .asMethod.returnType
      )
}
