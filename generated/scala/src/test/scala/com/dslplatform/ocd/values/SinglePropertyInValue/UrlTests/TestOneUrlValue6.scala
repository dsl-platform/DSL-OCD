package com.dslplatform.ocd.values.SinglePropertyInValue.UrlTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import com.dslplatform.ocd.values.SinglePropertyInValue.OneUrlValue6
import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneUrlValue6
    extends OcdSpec {

    /* Testing the property field public access via reflection (no instantiation) */
    def `Test property field access`() =
      lock(
        typeOf[OneUrlValue6]
          .member("oneUrl": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[java.net.URL]
      , typeOf[OneUrlValue6]
          .member("oneUrl": TermName)
          .asMethod.returnType
      )
}
