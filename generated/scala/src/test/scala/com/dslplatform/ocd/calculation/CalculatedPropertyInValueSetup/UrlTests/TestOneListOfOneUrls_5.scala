package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup
package UrlTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneListOfOneUrls_5
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[OneListOfOneUrls_5]
          .member("oneListOfOneUrls": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[IndexedSeq[java.net.URI]]
      , typeOf[OneListOfOneUrls_5]
          .member("oneListOfOneUrls": TermName)
          .asMethod.returnType
      )
}
