package com.dslplatform.ocd.values.SinglePropertyInValue.BooleanTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfNullableBooleansValue2
import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestNullableSetOfNullableBooleansValue2
    extends OcdSpec {

    /* Testing the property field public access via reflection (no instantiation) */
    def `Test property field access`() =
      lock(
        typeOf[NullableSetOfNullableBooleansValue2]
          .member("nullableSetOfNullableBooleans": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Option[Set[Option[Boolean]]]]
      , typeOf[NullableSetOfNullableBooleansValue2]
          .member("nullableSetOfNullableBooleans": TermName)
          .asMethod.returnType
      )
}
