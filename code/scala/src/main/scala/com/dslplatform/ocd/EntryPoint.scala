package com.dslplatform.ocd

import setup._

object EntryPoint extends App {
  Locator[ITestDeployer].deploy()
}
