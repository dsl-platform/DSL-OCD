package com.dslplatform.ocd.values.SinglePropertyInValue.DoubleTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import com.dslplatform.ocd.values.SinglePropertyInValue.OneDoubleValue1
import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneDoubleValue1
    extends OcdSpec {

    /* Testing the property field public access via reflection (no instantiation) */
    def `Test property field access`() =
      lock(
        typeOf[OneDoubleValue1]
          .member("oneDouble": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Double]
      , typeOf[OneDoubleValue1]
          .member("oneDouble": TermName)
          .asMethod.returnType
      )
}
