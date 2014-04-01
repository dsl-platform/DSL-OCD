package com.dslplatform.ocd
package projects

import Client._
import com.dslplatform.api.client.Bootstrap
import com.dslplatform.api.patterns.ServiceLocator
import scala.concurrent.ExecutionContext
import scala.concurrent.duration._
import org.joda.time.DateTime
import java.io.ByteArrayInputStream

class Projects(
    projectIni: ProjectIni
  , executionContext: ExecutionContext
  , duration: Duration) {

  private val locator = Bootstrap.init(new ByteArrayInputStream(projectIni.toByteArray))

  def shutdown() =
    locator.resolve[java.util.concurrent.ExecutorService].shutdown()

  def getAll =
    Client.Project.findAll(locator, duration)

  def delete(project: Project): Unit = {
    DeleteProject(project.ID.toString).submit()(locator, executionContext, duration)
  }
}
