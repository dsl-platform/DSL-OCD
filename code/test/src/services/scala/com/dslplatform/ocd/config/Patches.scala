package com.dslplatform.ocd.config

private[config] object Patches {
  def fixTests(body: String) = {
    body.replace("java.net.URL", "java.net.URI")
  }
}
