package com.dslplatform.ocd.values.SinglePropertyInValue.IpTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import com.dslplatform.ocd.values.SinglePropertyInValue.OneIpValue1
import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneIpValue1
    extends OcdSpec {

    /* Testing the property field public access via reflection (no instantiation) */
    def `Test property field access`() =
      lock(
        typeOf[OneIpValue1]
          .member("oneIp": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[java.net.InetAddress]
      , typeOf[OneIpValue1]
          .member("oneIp": TermName)
          .asMethod.returnType
      )
}
