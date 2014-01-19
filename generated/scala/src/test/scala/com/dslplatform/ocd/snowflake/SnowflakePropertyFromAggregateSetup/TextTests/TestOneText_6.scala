package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup
package TextTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneText_6
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[OneText_6]
          .member("oneText": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[String]
      , typeOf[OneText_6]
          .member("oneText": TermName)
          .asMethod.returnType
      )
}
