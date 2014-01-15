package com.dslplatform.ocd.values.SinglePropertyInValue.LongTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfOneLongsValue2
import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestNullableSetOfOneLongsValue2
    extends OcdSpec {

    /* Testing the property field public access via reflection (no instantiation) */
    def `Test property field access`() =
      lock(
        typeOf[NullableSetOfOneLongsValue2]
          .member("nullableSetOfOneLongs": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Option[Set[Long]]]
      , typeOf[NullableSetOfOneLongsValue2]
          .member("nullableSetOfOneLongs": TermName)
          .asMethod.returnType
      )
}
