package com.dslplatform.ocd
package generator
package javas
package javatypes

import types._
import boxes._

object JavaIp
    extends JavaStub {
  val classReference = "java.net.InetAddress"

  val defaultSingle: TestValue = "com.dslplatform.client.Utils.LOOPBACK"

  val nonDefaultValues: Seq[TestValue] = Seq(
    E"com.dslplatform.ocd.test.TypeFactory.buildIP(${"127.0.0.1"})"
  , E"com.dslplatform.ocd.test.TypeFactory.buildIP(${"0"})"
  , E"com.dslplatform.ocd.test.TypeFactory.buildIP(${"255.255.255.255"})"
  , E"com.dslplatform.ocd.test.TypeFactory.buildIP(${"::1"})"
  , E"com.dslplatform.ocd.test.TypeFactory.buildIP(${"ffff::ffff"})"
  )
}
