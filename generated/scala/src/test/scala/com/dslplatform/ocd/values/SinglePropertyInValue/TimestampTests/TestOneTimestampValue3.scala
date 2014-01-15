package com.dslplatform.ocd.values.SinglePropertyInValue.TimestampTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import com.dslplatform.ocd.values.SinglePropertyInValue.OneTimestampValue3
import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneTimestampValue3
    extends OcdSpec {

    /* Testing the property field public access via reflection (no instantiation) */
    def `Test property field access`() =
      lock(
        typeOf[OneTimestampValue3]
          .member("oneTimestamp": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[org.joda.time.DateTime]
      , typeOf[OneTimestampValue3]
          .member("oneTimestamp": TermName)
          .asMethod.returnType
      )
}
