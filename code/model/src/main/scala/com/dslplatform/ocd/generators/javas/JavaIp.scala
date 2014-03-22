package com.dslplatform.ocd.generators
package javas

import   java.net.InetAddress


import Types._
import Boxes._

object JavaIp
    extends JavaStub {
  val classReference = "java.net.InetAddress"

  val defaultSingle = E"com.dslplatform.TypeFactory.buildIP(${"127.0.0.1"})"

  val nonDefaultValues = Seq(
    E"com.dslplatform.TypeFactory.buildIP(${"0"})"
  , E"com.dslplatform.TypeFactory.buildIP(${"255.255.255.255"})"
  , E"com.dslplatform.TypeFactory.buildIP(${"::1"})"
  , E"com.dslplatform.TypeFactory.buildIP(${"ffff::ffff"})"
  )
}
