package com.dslplatform.ocd
package config

import hr.element.etb.XKCD
import hr.element.etb.Workspace

trait ITestSettings {
  def workspace: Workspace
  def xkcd: XKCD
  def revenj: Revenj
  def database: Database
}
