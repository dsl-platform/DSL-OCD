package com.dslplatform.ocd.values.SinglePropertyInValue.StringWithMaxLengthOf9Tests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfOneStringsWithMaxLengthOf9Value1
import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneListOfOneStringsWithMaxLengthOf9Value1
    extends OcdSpec {

    /* Testing the property field public access via reflection (no instantiation) */
    def `Test property field access`() =
      lock(
        typeOf[OneListOfOneStringsWithMaxLengthOf9Value1]
          .member("oneListOfOneStringsWithMaxLengthOf9": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[List[String]]
      , typeOf[OneListOfOneStringsWithMaxLengthOf9Value1]
          .member("oneListOfOneStringsWithMaxLengthOf9": TermName)
          .asMethod.returnType
      )
}
