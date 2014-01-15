package com.dslplatform.ocd.values.SinglePropertyInValue.TimestampTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfOneTimestampsValue6
import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneListOfOneTimestampsValue6
    extends OcdSpec {

    /* Testing the property field public access via reflection (no instantiation) */
    def `Test property field access`() =
      lock(
        typeOf[OneListOfOneTimestampsValue6]
          .member("oneListOfOneTimestamps": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[List[org.joda.time.DateTime]]
      , typeOf[OneListOfOneTimestampsValue6]
          .member("oneListOfOneTimestamps": TermName)
          .asMethod.returnType
      )
}
