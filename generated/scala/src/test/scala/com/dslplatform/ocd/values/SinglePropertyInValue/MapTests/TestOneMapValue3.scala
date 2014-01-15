package com.dslplatform.ocd.values.SinglePropertyInValue.MapTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import com.dslplatform.ocd.values.SinglePropertyInValue.OneMapValue3
import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneMapValue3
    extends OcdSpec {

    /* Testing the property field public access via reflection (no instantiation) */
    def `Test property field access`() =
      lock(
        typeOf[OneMapValue3]
          .member("oneMap": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Map[String, String]]
      , typeOf[OneMapValue3]
          .member("oneMap": TermName)
          .asMethod.returnType
      )
}
