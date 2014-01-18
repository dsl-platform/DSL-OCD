package com.dslplatform.ocd
package config

import scala.concurrent.Future
import projects.Client.Project

trait IProjectCache {
  def cleanOld(): Future[Unit]
  def getFresh(): Option[Project]
}
