package com.dslplatform.ocd.values.SinglePropertyInValue.GuidTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfOneGuidsValue6
import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneSetOfOneGuidsValue6
    extends OcdSpec {

    /* Testing the property field public access via reflection (no instantiation) */
    def `Test property field access`() =
      lock(
        typeOf[OneSetOfOneGuidsValue6]
          .member("oneSetOfOneGuids": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Set[scala.util.UUID]]
      , typeOf[OneSetOfOneGuidsValue6]
          .member("oneSetOfOneGuids": TermName)
          .asMethod.returnType
      )
}
