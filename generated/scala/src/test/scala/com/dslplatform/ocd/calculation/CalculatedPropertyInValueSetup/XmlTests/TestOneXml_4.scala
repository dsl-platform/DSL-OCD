package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup
package XmlTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneXml_4
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[OneXml_4]
          .member("oneXml": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.xml.Elem]
      , typeOf[OneXml_4]
          .member("oneXml": TermName)
          .asMethod.returnType
      )
}
