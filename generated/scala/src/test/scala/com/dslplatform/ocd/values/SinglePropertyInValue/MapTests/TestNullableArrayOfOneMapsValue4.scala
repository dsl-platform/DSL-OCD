package com.dslplatform.ocd.values.SinglePropertyInValue.MapTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfOneMapsValue4
import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestNullableArrayOfOneMapsValue4
    extends OcdSpec {

    /* Testing the property field public access via reflection (no instantiation) */
    def `Test property field access`() =
      lock(
        typeOf[NullableArrayOfOneMapsValue4]
          .member("nullableArrayOfOneMaps": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Option[Array[Map[String, String]]]]
      , typeOf[NullableArrayOfOneMapsValue4]
          .member("nullableArrayOfOneMaps": TermName)
          .asMethod.returnType
      )
}
