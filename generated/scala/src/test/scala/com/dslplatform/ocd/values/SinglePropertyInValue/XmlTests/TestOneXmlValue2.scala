package com.dslplatform.ocd.values.SinglePropertyInValue.XmlTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import com.dslplatform.ocd.values.SinglePropertyInValue.OneXmlValue2
import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneXmlValue2
    extends OcdSpec {

    /* Testing the property field public access via reflection (no instantiation) */
    def `Test property field access`() =
      lock(
        typeOf[OneXmlValue2]
          .member("oneXml": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.xml.Elem]
      , typeOf[OneXmlValue2]
          .member("oneXml": TermName)
          .asMethod.returnType
      )
}
