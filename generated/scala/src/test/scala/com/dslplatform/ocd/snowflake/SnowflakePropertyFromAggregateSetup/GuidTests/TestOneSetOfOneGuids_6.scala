package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup
package GuidTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneSetOfOneGuids_6
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[OneSetOfOneGuids_6]
          .member("oneSetOfOneGuids": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Set[java.util.UUID]]
      , typeOf[OneSetOfOneGuids_6]
          .member("oneSetOfOneGuids": TermName)
          .asMethod.returnType
      )
}
