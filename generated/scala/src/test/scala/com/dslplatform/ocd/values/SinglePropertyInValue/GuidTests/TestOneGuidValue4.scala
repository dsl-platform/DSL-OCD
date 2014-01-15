package com.dslplatform.ocd.values.SinglePropertyInValue.GuidTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import com.dslplatform.ocd.values.SinglePropertyInValue.OneGuidValue4
import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneGuidValue4
    extends OcdSpec {

    /* Testing the property field public access via reflection (no instantiation) */
    def `Test property field access`() =
      lock(
        typeOf[OneGuidValue4]
          .member("oneGuid": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.util.UUID]
      , typeOf[OneGuidValue4]
          .member("oneGuid": TermName)
          .asMethod.returnType
      )
}
