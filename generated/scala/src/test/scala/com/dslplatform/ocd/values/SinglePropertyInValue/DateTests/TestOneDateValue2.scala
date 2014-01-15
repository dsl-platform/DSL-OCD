package com.dslplatform.ocd.values.SinglePropertyInValue.DateTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import com.dslplatform.ocd.values.SinglePropertyInValue.OneDateValue2
import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneDateValue2
    extends OcdSpec {

    /* Testing the property field public access via reflection (no instantiation) */
    def `Test property field access`() =
      lock(
        typeOf[OneDateValue2]
          .member("oneDate": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[org.joda.time.LocalDate]
      , typeOf[OneDateValue2]
          .member("oneDate": TermName)
          .asMethod.returnType
      )
}
