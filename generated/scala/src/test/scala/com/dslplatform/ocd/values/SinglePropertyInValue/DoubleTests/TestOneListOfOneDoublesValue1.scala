package com.dslplatform.ocd.values.SinglePropertyInValue.DoubleTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfOneDoublesValue1
import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneListOfOneDoublesValue1
    extends OcdSpec {

    /* Testing the property field public access via reflection (no instantiation) */
    def `Test property field access`() =
      lock(
        typeOf[OneListOfOneDoublesValue1]
          .member("oneListOfOneDoubles": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[List[Double]]
      , typeOf[OneListOfOneDoublesValue1]
          .member("oneListOfOneDoubles": TermName)
          .asMethod.returnType
      )
}
