package com.dslplatform.ocd.values.SinglePropertyInValue.TextTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import com.dslplatform.ocd.values.SinglePropertyInValue.OneTextValue3
import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneTextValue3
    extends OcdSpec {

    /* Testing the property field public access via reflection (no instantiation) */
    def `Test property field access`() =
      lock(
        typeOf[OneTextValue3]
          .member("oneText": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[String]
      , typeOf[OneTextValue3]
          .member("oneText": TermName)
          .asMethod.returnType
      )
}
