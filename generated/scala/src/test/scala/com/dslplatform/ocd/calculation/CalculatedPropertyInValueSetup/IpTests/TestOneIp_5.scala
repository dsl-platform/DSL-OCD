package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup
package IpTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneIp_5
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[OneIp_5]
          .member("oneIp": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[java.net.InetAddress]
      , typeOf[OneIp_5]
          .member("oneIp": TermName)
          .asMethod.returnType
      )
}
