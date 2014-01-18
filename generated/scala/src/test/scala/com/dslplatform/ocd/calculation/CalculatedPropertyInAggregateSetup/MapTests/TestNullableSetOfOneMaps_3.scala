package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup
package MapTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestNullableSetOfOneMaps_3
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[NullableSetOfOneMaps_3]
          .member("nullableSetOfOneMaps": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Option[Set[Map[String, String]]]]
      , typeOf[NullableSetOfOneMaps_3]
          .member("nullableSetOfOneMaps": TermName)
          .asMethod.returnType
      )
}
