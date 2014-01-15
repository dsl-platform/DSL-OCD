package com.dslplatform.ocd.values.SinglePropertyInValue.LongTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfOneLongsValue2
import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneArrayOfOneLongsValue2
    extends OcdSpec {

    /* Testing the property field public access via reflection (no instantiation) */
    def `Test property field access`() =
      lock(
        typeOf[OneArrayOfOneLongsValue2]
          .member("oneArrayOfOneLongs": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Array[Long]]
      , typeOf[OneArrayOfOneLongsValue2]
          .member("oneArrayOfOneLongs": TermName)
          .asMethod.returnType
      )
}
