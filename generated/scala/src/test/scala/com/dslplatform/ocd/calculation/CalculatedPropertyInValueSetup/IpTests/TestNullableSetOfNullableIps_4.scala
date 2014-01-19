package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup
package IpTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestNullableSetOfNullableIps_4
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[NullableSetOfNullableIps_4]
          .member("nullableSetOfNullableIps": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Option[Set[Option[java.net.InetAddress]]]]
      , typeOf[NullableSetOfNullableIps_4]
          .member("nullableSetOfNullableIps": TermName)
          .asMethod.returnType
      )
}
