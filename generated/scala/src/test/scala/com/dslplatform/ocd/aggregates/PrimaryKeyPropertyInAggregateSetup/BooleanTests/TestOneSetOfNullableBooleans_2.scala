package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup
package BooleanTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneSetOfNullableBooleans_2
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[OneSetOfNullableBooleans_2]
          .member("oneSetOfNullableBooleans": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Set[Option[Boolean]]]
      , typeOf[OneSetOfNullableBooleans_2]
          .member("oneSetOfNullableBooleans": TermName)
          .asMethod.returnType
      )
}
