package com.dslplatform.ocd.values.SinglePropertyInValue.GuidTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import com.dslplatform.ocd.values.SinglePropertyInValue.OneGuidValue2
import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneGuidValue2
    extends OcdSpec {

    /* Testing the property field public access via reflection (no instantiation) */
    def `Test property field access`() =
      lock(
        typeOf[OneGuidValue2]
          .member("oneGuid": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.util.UUID]
      , typeOf[OneGuidValue2]
          .member("oneGuid": TermName)
          .asMethod.returnType
      )
}
