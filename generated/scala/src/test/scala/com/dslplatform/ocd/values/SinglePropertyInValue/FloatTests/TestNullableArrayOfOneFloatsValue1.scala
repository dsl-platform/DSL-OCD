package com.dslplatform.ocd.values.SinglePropertyInValue.FloatTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfOneFloatsValue1
import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestNullableArrayOfOneFloatsValue1
    extends OcdSpec {

    /* Testing the property field public access via reflection (no instantiation) */
    def `Test property field access`() =
      lock(
        typeOf[NullableArrayOfOneFloatsValue1]
          .member("nullableArrayOfOneFloats": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Option[Array[Float]]]
      , typeOf[NullableArrayOfOneFloatsValue1]
          .member("nullableArrayOfOneFloats": TermName)
          .asMethod.returnType
      )
}
