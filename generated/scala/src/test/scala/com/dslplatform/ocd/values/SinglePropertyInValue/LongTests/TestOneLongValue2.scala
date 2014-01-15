package com.dslplatform.ocd.values.SinglePropertyInValue.LongTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import com.dslplatform.ocd.values.SinglePropertyInValue.OneLongValue2
import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneLongValue2
    extends OcdSpec {

    /* Testing the property field public access via reflection (no instantiation) */
    def `Test property field access`() =
      lock(
        typeOf[OneLongValue2]
          .member("oneLong": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Long]
      , typeOf[OneLongValue2]
          .member("oneLong": TermName)
          .asMethod.returnType
      )
}
