package com.dslplatform.ocd.values.SinglePropertyInValue.UrlTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfNullableUrlsValue1
import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneSetOfNullableUrlsValue1
    extends OcdSpec {

    /* Testing the property field public access via reflection (no instantiation) */
    def `Test property field access`() =
      lock(
        typeOf[OneSetOfNullableUrlsValue1]
          .member("oneSetOfNullableUrls": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Set[Option[java.net.URL]]]
      , typeOf[OneSetOfNullableUrlsValue1]
          .member("oneSetOfNullableUrls": TermName)
          .asMethod.returnType
      )
}
