package com.dslplatform.ocd.values.SinglePropertyInValue.StringWithMaxLengthOf9Tests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfOneStringsWithMaxLengthOf9Value1
import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneSetOfOneStringsWithMaxLengthOf9Value1
    extends OcdSpec {

    /* Testing the property field public access via reflection (no instantiation) */
    def `Test property field access`() =
      lock(
        typeOf[OneSetOfOneStringsWithMaxLengthOf9Value1]
          .member("oneSetOfOneStringsWithMaxLengthOf9": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Set[String]]
      , typeOf[OneSetOfOneStringsWithMaxLengthOf9Value1]
          .member("oneSetOfOneStringsWithMaxLengthOf9": TermName)
          .asMethod.returnType
      )
}
