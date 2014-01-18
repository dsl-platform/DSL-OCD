package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup
package TimestampTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneSetOfOneTimestamps_4
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[OneSetOfOneTimestamps_4]
          .member("oneSetOfOneTimestamps": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Set[org.joda.time.DateTime]]
      , typeOf[OneSetOfOneTimestamps_4]
          .member("oneSetOfOneTimestamps": TermName)
          .asMethod.returnType
      )
}
