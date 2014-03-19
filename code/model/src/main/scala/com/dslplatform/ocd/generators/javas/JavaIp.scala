package com.dslplatform.ocd.generators
package javas

import Types._
import Boxes._

object JavaIp
    extends JavaStub {

  val classReference = "java.net.InetAddress"

  val defaultSingle = "null"

  //TODO:
  override val borderSingleValues = Seq(
       "dinamo"
     , "hajduk"
    )
}

