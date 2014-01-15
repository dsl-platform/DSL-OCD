package com.dslplatform.ocd.values.SinglePropertyInValue.IntegerTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfOneIntegersValue1
import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneArrayOfOneIntegersValue1
    extends OcdSpec {

    /* Testing the property field public access via reflection (no instantiation) */
    def `Test property field access`() =
      lock(
        typeOf[OneArrayOfOneIntegersValue1]
          .member("oneArrayOfOneIntegers": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Array[Int]]
      , typeOf[OneArrayOfOneIntegersValue1]
          .member("oneArrayOfOneIntegers": TermName)
          .asMethod.returnType
      )
}
