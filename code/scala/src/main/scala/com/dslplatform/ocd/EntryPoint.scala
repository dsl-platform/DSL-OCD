package com.dslplatform.ocd

object EntryPoint extends App {
  val packageNamePrefix = "com.dslplatform.ocd.stub"

  Locator[ITestDeployer].deploy(
//    new TestOneBoolInValueJava { def packageStub = packageNamePrefix }
//  , new TestOptSetOptBoolInValueJava { def packageStub = packageNamePrefix }
  )
}
