package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup
package DateTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneDate_5
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[OneDate_5]
          .member("oneDate": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[org.joda.time.LocalDate]
      , typeOf[OneDate_5]
          .member("oneDate": TermName)
          .asMethod.returnType
      )
}
