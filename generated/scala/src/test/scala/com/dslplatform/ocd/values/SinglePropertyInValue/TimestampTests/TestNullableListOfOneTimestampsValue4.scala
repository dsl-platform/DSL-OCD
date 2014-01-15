package com.dslplatform.ocd.values.SinglePropertyInValue.TimestampTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfOneTimestampsValue4
import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestNullableListOfOneTimestampsValue4
    extends OcdSpec {

    /* Testing the property field public access via reflection (no instantiation) */
    def `Test property field access`() =
      lock(
        typeOf[NullableListOfOneTimestampsValue4]
          .member("nullableListOfOneTimestamps": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Option[List[org.joda.time.DateTime]]]
      , typeOf[NullableListOfOneTimestampsValue4]
          .member("nullableListOfOneTimestamps": TermName)
          .asMethod.returnType
      )
}
