package com.dslplatform.ocd.values.SinglePropertyInValue.IntegerTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import com.dslplatform.ocd.values.SinglePropertyInValue.OneIntegerValue5
import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneIntegerValue5
    extends OcdSpec {

    /* Testing the property field public access via reflection (no instantiation) */
    def `Test property field access`() =
      lock(
        typeOf[OneIntegerValue5]
          .member("oneInteger": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Int]
      , typeOf[OneIntegerValue5]
          .member("oneInteger": TermName)
          .asMethod.returnType
      )
}
