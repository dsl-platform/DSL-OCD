package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup
package ImageTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneArrayOfOneImages_4
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[OneArrayOfOneImages_4]
          .member("oneArrayOfOneImages": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Array[java.awt.image.BufferedImage]]
      , typeOf[OneArrayOfOneImages_4]
          .member("oneArrayOfOneImages": TermName)
          .asMethod.returnType
      )
}
