package com.dslplatform.ocd.values.SinglePropertyInValue.IntegerTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import com.dslplatform.ocd.values.SinglePropertyInValue.OneIntegerValue3
import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneIntegerValue3
    extends OcdSpec {

    /* Testing the property field public access via reflection (no instantiation) */
    def `Test property field access`() =
      lock(
        typeOf[OneIntegerValue3]
          .member("oneInteger": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Int]
      , typeOf[OneIntegerValue3]
          .member("oneInteger": TermName)
          .asMethod.returnType
      )
}
