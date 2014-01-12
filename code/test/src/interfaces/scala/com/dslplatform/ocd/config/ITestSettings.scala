package com.dslplatform.ocd
package config

import hr.element.etb.XKCD
import hr.element.etb.Workspace

trait ITestSettings {
  def username: String
  def password: Array[Byte]

  def apiProperties: com.dslplatform.compiler.client.api.ApiProperties

  def workspace: Workspace
  def xkcd: XKCD
}
