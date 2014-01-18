package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup
package StringTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneArrayOfOneStrings_4
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[OneArrayOfOneStrings_4]
          .member("oneArrayOfOneStrings": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Array[String]]
      , typeOf[OneArrayOfOneStrings_4]
          .member("oneArrayOfOneStrings": TermName)
          .asMethod.returnType
      )
}
