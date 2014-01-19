package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup
package UrlTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneUrl_6
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[OneUrl_6]
          .member("oneUrl": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[java.net.URI]
      , typeOf[OneUrl_6]
          .member("oneUrl": TermName)
          .asMethod.returnType
      )
}
