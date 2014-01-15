package com.dslplatform.ocd.values.SinglePropertyInValue.IpTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfOneIpsValue5
import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestNullableArrayOfOneIpsValue5
    extends OcdSpec {

    /* Testing the property field public access via reflection (no instantiation) */
    def `Test property field access`() =
      lock(
        typeOf[NullableArrayOfOneIpsValue5]
          .member("nullableArrayOfOneIps": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Option[Array[java.net.InetAddress]]]
      , typeOf[NullableArrayOfOneIpsValue5]
          .member("nullableArrayOfOneIps": TermName)
          .asMethod.returnType
      )
}
