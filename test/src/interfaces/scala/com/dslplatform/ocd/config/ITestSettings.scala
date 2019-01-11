package com.dslplatform.ocd
package config

trait ITestSettings {
  def xkcd: XKCD
  def workspace: Workspace
  def templates: File

  def revenj: Revenj
  def database: Database

  def turtles: Boolean
  def projectPattern: Regex
  def typePattern: Regex
  def boxPattern: Regex
}
