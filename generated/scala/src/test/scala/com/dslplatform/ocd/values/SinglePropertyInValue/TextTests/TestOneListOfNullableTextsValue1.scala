package com.dslplatform.ocd.values.SinglePropertyInValue.TextTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfNullableTextsValue1
import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneListOfNullableTextsValue1
    extends OcdSpec {

    /* Testing the property field public access via reflection (no instantiation) */
    def `Test property field access`() =
      lock(
        typeOf[OneListOfNullableTextsValue1]
          .member("oneListOfNullableTexts": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[List[Option[String]]]
      , typeOf[OneListOfNullableTextsValue1]
          .member("oneListOfNullableTexts": TermName)
          .asMethod.returnType
      )
}
