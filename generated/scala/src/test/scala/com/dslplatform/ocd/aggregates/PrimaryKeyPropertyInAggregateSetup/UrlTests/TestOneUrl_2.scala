package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup
package UrlTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneUrl_2
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[OneUrl_2]
          .member("oneUrl": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[java.net.URI]
      , typeOf[OneUrl_2]
          .member("oneUrl": TermName)
          .asMethod.returnType
      )
}
