package com.dslplatform.ocd.generators
package javas

import   java.net.InetAddress


import Types._
import Boxes._

object JavaIp
    extends JavaStub {
  val classReference = "java.net.InetAddress"

  val defaultSingle: TestValue = E"com.dslplatform.client.TypeFactory.buildIP(${"127.0.0.1"})"

  val nonDefaultValues: Seq[TestValue] = Seq(
    E"com.dslplatform.client.TypeFactory.buildIP(${"0"})"
  , E"com.dslplatform.client.TypeFactory.buildIP(${"255.255.255.255"})"
  , E"com.dslplatform.client.TypeFactory.buildIP(${"::1"})"
  , E"com.dslplatform.client.TypeFactory.buildIP(${"ffff::ffff"})"
  )
}
