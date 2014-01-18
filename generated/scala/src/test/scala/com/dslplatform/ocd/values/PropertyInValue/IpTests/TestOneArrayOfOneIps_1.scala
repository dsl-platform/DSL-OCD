package com.dslplatform.ocd.values.PropertyInValue
package IpTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneArrayOfOneIps_1
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[OneArrayOfOneIps_1]
          .member("oneArrayOfOneIps": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Array[java.net.InetAddress]]
      , typeOf[OneArrayOfOneIps_1]
          .member("oneArrayOfOneIps": TermName)
          .asMethod.returnType
      )
}
