package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup
package XmlTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneSetOfOneXmls_4
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[OneSetOfOneXmls_4]
          .member("oneSetOfOneXmls": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Set[scala.xml.Elem]]
      , typeOf[OneSetOfOneXmls_4]
          .member("oneSetOfOneXmls": TermName)
          .asMethod.returnType
      )
}
