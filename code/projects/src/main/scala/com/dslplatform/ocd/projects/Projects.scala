package com.dslplatform.ocd
package projects

import Client._

import com.dslplatform.api.client.Bootstrap
import com.dslplatform.api.patterns.ServiceLocator
import scala.concurrent.ExecutionContext
import scala.concurrent.duration._
import org.joda.time.DateTime

class Projects(
    projectsConfigurationPath: String
  , executionContext: ExecutionContext
  , duration: Duration) {

  private implicit val locator = Bootstrap.init(projectsConfigurationPath)
  private implicit val _executionContext = executionContext
  private implicit val _duration = duration

  def shutdown() =
    locator.resolve[java.util.concurrent.ExecutorService].shutdown()

  def getAll =
    Client.Project.findAll

  def delete(project: Project): Unit = {
    DeleteProject(project.ID.toString).submit()
  }
}
