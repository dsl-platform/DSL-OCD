package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup
package GuidTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneGuid_2
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[OneGuid_2]
          .member("oneGuid": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[java.util.UUID]
      , typeOf[OneGuid_2]
          .member("oneGuid": TermName)
          .asMethod.returnType
      )
}
