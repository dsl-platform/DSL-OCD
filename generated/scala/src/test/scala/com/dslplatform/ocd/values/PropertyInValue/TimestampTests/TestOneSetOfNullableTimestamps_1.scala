package com.dslplatform.ocd.values.PropertyInValue
package TimestampTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneSetOfNullableTimestamps_1
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[OneSetOfNullableTimestamps_1]
          .member("oneSetOfNullableTimestamps": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Set[Option[org.joda.time.DateTime]]]
      , typeOf[OneSetOfNullableTimestamps_1]
          .member("oneSetOfNullableTimestamps": TermName)
          .asMethod.returnType
      )
}
