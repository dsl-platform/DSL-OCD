package com.dslplatform.ocd
package projects

import Client._

import com.dslplatform.api.client.Bootstrap
import com.dslplatform.api.patterns.ServiceLocator
import scala.concurrent.ExecutionContext
import scala.concurrent.duration._
import org.joda.time.DateTime

object EntryPoint extends App {
  System.setProperty("org.slf4j.simpleLogger.defaultLogLevel", "trace");

  val username = "ocd@dsl-platform.com"
  val password = "ocdcdo"
  val apiUrl = "https://compiler.dsl-platform.com:8443/platform/"

  val projectIni = ProjectIni(
    username = username
  , projectID = password
  , apiUrl
  , packageName = "com.dslplatform.ocd.projects")

  val executionContext = ExecutionContext.fromExecutorService(
      java.util.concurrent.Executors.newCachedThreadPool)

  val duration = 30.seconds

  val projects = new Projects(projectIni, executionContext, duration)
  projects.getAll.foreach { p =>
    println("==================")
    println(p)
  }
}
