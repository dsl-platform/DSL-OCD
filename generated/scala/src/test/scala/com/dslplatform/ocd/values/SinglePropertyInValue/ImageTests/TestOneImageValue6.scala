package com.dslplatform.ocd.values.SinglePropertyInValue.ImageTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import com.dslplatform.ocd.values.SinglePropertyInValue.OneImageValue6
import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneImageValue6
    extends OcdSpec {

    /* Testing the property field public access via reflection (no instantiation) */
    def `Test property field access`() =
      lock(
        typeOf[OneImageValue6]
          .member("oneImage": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[java.awt.image.BufferedImage]
      , typeOf[OneImageValue6]
          .member("oneImage": TermName)
          .asMethod.returnType
      )
}
