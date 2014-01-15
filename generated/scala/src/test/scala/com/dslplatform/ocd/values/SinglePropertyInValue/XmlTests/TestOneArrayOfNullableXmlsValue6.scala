package com.dslplatform.ocd.values.SinglePropertyInValue.XmlTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfNullableXmlsValue6
import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneArrayOfNullableXmlsValue6
    extends OcdSpec {

    /* Testing the property field public access via reflection (no instantiation) */
    def `Test property field access`() =
      lock(
        typeOf[OneArrayOfNullableXmlsValue6]
          .member("oneArrayOfNullableXmls": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Array[Option[scala.xml.Elem]]]
      , typeOf[OneArrayOfNullableXmlsValue6]
          .member("oneArrayOfNullableXmls": TermName)
          .asMethod.returnType
      )
}
