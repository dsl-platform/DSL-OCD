package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup
package GuidTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneArrayOfNullableGuids_4
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[OneArrayOfNullableGuids_4]
          .member("oneArrayOfNullableGuids": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Array[Option[java.util.UUID]]]
      , typeOf[OneArrayOfNullableGuids_4]
          .member("oneArrayOfNullableGuids": TermName)
          .asMethod.returnType
      )
}
