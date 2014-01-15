package com.dslplatform.ocd.values.SinglePropertyInValue.BooleanTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import com.dslplatform.ocd.values.SinglePropertyInValue.OneBooleanValue2
import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneBooleanValue2
    extends OcdSpec {

    /* Testing the property field public access via reflection (no instantiation) */
    def `Test property field access`() =
      lock(
        typeOf[OneBooleanValue2]
          .member("oneBoolean": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Boolean]
      , typeOf[OneBooleanValue2]
          .member("oneBoolean": TermName)
          .asMethod.returnType
      )
}
