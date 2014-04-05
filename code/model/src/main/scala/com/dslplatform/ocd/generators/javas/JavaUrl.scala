package com.dslplatform.ocd.generators
package javas

import Types._
import Boxes._

object JavaUrl
    extends JavaStub {

  val classReference = "java.net.URI"

  val defaultSingle: TestValue = "null"

  val nonDefaultValues: Seq[TestValue] = Seq(
    E"""com.dslplatform.client.TypeFactory.buildURI("http://127.0.0.1/")"""
  , E"""com.dslplatform.client.TypeFactory.buildURI("http://www.xyz.com/")"""
  , E"""com.dslplatform.client.TypeFactory.buildURI("https://www.abc.com/")"""
  , E"""com.dslplatform.client.TypeFactory.buildURI("ftp://www.pqr.com/")"""
  , E"""com.dslplatform.client.TypeFactory.buildURI("https://localhost:8080/")"""
  , E"""com.dslplatform.client.TypeFactory.buildURI("mailto:snail@mail.hu")"""
  , E"""com.dslplatform.client.TypeFactory.buildURI("file:///~/opt/somefile.md")"""
  , E"""com.dslplatform.client.TypeFactory.buildURI("tcp://localhost:8181/")"""
  , E"""com.dslplatform.client.TypeFactory.buildURI("failover:(tcp://localhost:8181,tcp://localhost:8080/)")"""
  )
}
