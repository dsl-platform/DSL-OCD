package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup
package BinaryTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneBinary_4
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[OneBinary_4]
          .member("oneBinary": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Array[Byte]]
      , typeOf[OneBinary_4]
          .member("oneBinary": TermName)
          .asMethod.returnType
      )
}
