package com.dslplatform.ocd.values.SinglePropertyInValue.MapTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfNullableMapsValue1
import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneSetOfNullableMapsValue1
    extends OcdSpec {

    /* Testing the property field public access via reflection (no instantiation) */
    def `Test property field access`() =
      lock(
        typeOf[OneSetOfNullableMapsValue1]
          .member("oneSetOfNullableMaps": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Set[Option[Map[String, String]]]]
      , typeOf[OneSetOfNullableMapsValue1]
          .member("oneSetOfNullableMaps": TermName)
          .asMethod.returnType
      )
}
