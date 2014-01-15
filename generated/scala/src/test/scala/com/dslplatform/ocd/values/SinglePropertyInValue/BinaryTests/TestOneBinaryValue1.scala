package com.dslplatform.ocd.values.SinglePropertyInValue.BinaryTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import com.dslplatform.ocd.values.SinglePropertyInValue.OneBinaryValue1
import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneBinaryValue1
    extends OcdSpec {

    /* Testing the property field public access via reflection (no instantiation) */
    def `Test property field access`() =
      lock(
        typeOf[OneBinaryValue1]
          .member("oneBinary": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Array[Byte]]
      , typeOf[OneBinaryValue1]
          .member("oneBinary": TermName)
          .asMethod.returnType
      )
}
