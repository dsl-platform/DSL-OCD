package com.dslplatform.ocd
package test
package domain

import config._

abstract class ProjectFactory(testSettings: ITestSettings) {
  def projects: Seq[ITestProject]
}
