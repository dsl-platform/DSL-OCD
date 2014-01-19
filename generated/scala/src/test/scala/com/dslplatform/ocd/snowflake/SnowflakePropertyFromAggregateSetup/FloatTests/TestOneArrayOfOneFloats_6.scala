package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup
package FloatTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneArrayOfOneFloats_6
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[OneArrayOfOneFloats_6]
          .member("oneArrayOfOneFloats": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Array[Float]]
      , typeOf[OneArrayOfOneFloats_6]
          .member("oneArrayOfOneFloats": TermName)
          .asMethod.returnType
      )
}
