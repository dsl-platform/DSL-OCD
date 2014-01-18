package com.dslplatform.ocd.config

object Patches {
  def fixTests(body: String) = {
    body.replace("java.net.URL", "java.net.URI")
  }
}
