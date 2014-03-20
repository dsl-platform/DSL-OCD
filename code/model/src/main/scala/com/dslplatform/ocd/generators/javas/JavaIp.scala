package com.dslplatform.ocd.generators
package javas

import Types._
import Boxes._

object JavaIp
    extends JavaStub {

  val classReference = "java.net.InetAddress"

  val defaultSingle = "java.net.InetAddress.getByAddress(new byte[]{(byte)127, (byte)0, (byte)0, (byte)1})"

  val nonDefaultValues = Seq(
      /* 0.0.0.0 */
    "java.net.InetAddress.getByAddress(new byte[]{(byte)0, (byte)0, (byte)0, (byte)0})"
      /* 0.0.0.1 */
  , "java.net.InetAddress.getByAddress(new byte[]{(byte)0, (byte)0, (byte)0, (byte)1})"
      /* 192.168.0.1 */
  , "java.net.InetAddress.getByAddress(new byte[]{(byte)192, (byte)168, (byte)0, (byte)1})"
      /*255.255.255.255 */
  , "java.net.InetAddress.getByAddress(new byte[]{(byte)255, (byte)255, (byte)255, (byte)255})"
  )
}

