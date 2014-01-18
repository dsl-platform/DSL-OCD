package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup
package FloatTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneListOfOneFloats_4
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[OneListOfOneFloats_4]
          .member("oneListOfOneFloats": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[IndexedSeq[Float]]
      , typeOf[OneListOfOneFloats_4]
          .member("oneListOfOneFloats": TermName)
          .asMethod.returnType
      )
}
