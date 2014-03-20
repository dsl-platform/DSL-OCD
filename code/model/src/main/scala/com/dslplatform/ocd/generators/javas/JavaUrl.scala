package com.dslplatform.ocd.generators
package javas

import Types._
import Boxes._

object JavaUrl
    extends JavaStub {

  val classReference = "java.net.URI"

  val defaultSingle = E"""com.dslplatform.ocd.tools.URIFactory.createUri("http://127.0.0.1")"""

  val nonDefaultValues = Seq(

      /* http */
        E"""com.dslplatform.ocd.tools.URIFactory.createUri("http://www.xyz.com")"""
      /* https */
      , E"""com.dslplatform.ocd.tools.URIFactory.createUri("https://www.abc.com")"""
      /* ftp */
      , E"""com.dslplatform.ocd.tools.URIFactory.createUri("ftp://www.pqr.com")"""
      /* localhost */
      , E"""com.dslplatform.ocd.tools.URIFactory.createUri("https://localhost:8080")"""
      /* mailto */
      , E"""com.dslplatform.ocd.tools.URIFactory.createUri("mailto:snail@mail.hu")"""
      /* file */
      , E"""com.dslplatform.ocd.tools.URIFactory.createUri("file://~/opt/somefile.md")"""
      /* tcp */
      , E"""com.dslplatform.ocd.tools.URIFactory.createUri("tcp://localhost:8181")"""
      /* complex */
      , E"""com.dslplatform.ocd.tools.URIFactory.createUri("failover:(tcp://localhost:8181,tcp://localhost:8080)")"""
  )
}
