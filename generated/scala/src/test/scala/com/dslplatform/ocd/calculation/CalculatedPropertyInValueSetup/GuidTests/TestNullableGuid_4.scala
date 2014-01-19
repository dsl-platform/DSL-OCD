package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup
package GuidTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestNullableGuid_4
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[NullableGuid_4]
          .member("nullableGuid": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Option[java.util.UUID]]
      , typeOf[NullableGuid_4]
          .member("nullableGuid": TermName)
          .asMethod.returnType
      )
}
