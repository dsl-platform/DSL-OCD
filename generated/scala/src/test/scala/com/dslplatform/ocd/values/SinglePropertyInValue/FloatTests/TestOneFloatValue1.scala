package com.dslplatform.ocd.values.SinglePropertyInValue.FloatTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import com.dslplatform.ocd.values.SinglePropertyInValue.OneFloatValue1
import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneFloatValue1
    extends OcdSpec {

    /* Testing the property field public access via reflection (no instantiation) */
    def `Test property field access`() =
      lock(
        typeOf[OneFloatValue1]
          .member("oneFloat": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Float]
      , typeOf[OneFloatValue1]
          .member("oneFloat": TermName)
          .asMethod.returnType
      )
}
