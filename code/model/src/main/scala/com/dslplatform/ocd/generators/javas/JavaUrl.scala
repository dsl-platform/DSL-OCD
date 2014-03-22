package com.dslplatform.ocd.generators
package javas

import Types._
import Boxes._

object JavaUrl
    extends JavaStub {

  val classReference = "java.net.URI"

  val defaultSingle = E"""com.dslplatform.TypeFactory.buildURI("http://127.0.0.1")"""

  val nonDefaultValues = Seq(
    E"""com.dslplatform.TypeFactory.buildURI("http://www.xyz.com")"""
  , E"""com.dslplatform.TypeFactory.buildURI("https://www.abc.com")"""
  , E"""com.dslplatform.TypeFactory.buildURI("ftp://www.pqr.com")"""
  , E"""com.dslplatform.TypeFactory.buildURI("https://localhost:8080")"""
  , E"""com.dslplatform.TypeFactory.buildURI("mailto:snail@mail.hu")"""
  , E"""com.dslplatform.TypeFactory.buildURI("file:///~/opt/somefile.md")"""
  , E"""com.dslplatform.TypeFactory.buildURI("tcp://localhost:8181")"""
  , E"""com.dslplatform.TypeFactory.buildURI("failover:(tcp://localhost:8181,tcp://localhost:8080)")"""
  )
}
