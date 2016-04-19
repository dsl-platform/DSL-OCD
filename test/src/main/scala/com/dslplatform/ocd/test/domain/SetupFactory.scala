package com.dslplatform.ocd
package test
package domain

import config._

abstract class SetupFactory(testSettings: ITestSettings) {
  val isPostgres = testSettings.database eq Database.PostgreSQL
  val isOracle = testSettings.database eq Database.Oracle
}
