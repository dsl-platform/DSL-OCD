package com.dslplatform.ocd.values.SinglePropertyInValue.XmlTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableXmlValue3
import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestNullableXmlValue3
    extends OcdSpec {

    /* Testing the property field public access via reflection (no instantiation) */
    def `Test property field access`() =
      lock(
        typeOf[NullableXmlValue3]
          .member("nullableXml": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Option[scala.xml.Elem]]
      , typeOf[NullableXmlValue3]
          .member("nullableXml": TermName)
          .asMethod.returnType
      )
}
