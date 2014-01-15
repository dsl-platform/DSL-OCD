package com.dslplatform.ocd.values.SinglePropertyInValue.IpTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import com.dslplatform.ocd.values.SinglePropertyInValue.OneIpValue3
import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneIpValue3
    extends OcdSpec {

    /* Testing the property field public access via reflection (no instantiation) */
    def `Test property field access`() =
      lock(
        typeOf[OneIpValue3]
          .member("oneIp": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[java.net.InetAddress]
      , typeOf[OneIpValue3]
          .member("oneIp": TermName)
          .asMethod.returnType
      )
}
