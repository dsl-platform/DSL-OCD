package com.dslplatform.ocd
package config

import scala.concurrent.Future
import projects.Client.Project
import scala.collection.mutable.LinkedHashSet
import projects.Projects

private[config] case class ProjectAgeThreshold(threshold: DateTime)

private[config] class ProjectCache(
    logger: Logger
  , projects: Projects
  , threshold: ProjectAgeThreshold
  ) extends IProjectCache {

  private def getTestProjects() =
    projects.getAll.filter(_.Nick match {
      case Some(x) if x startsWith "Test_" => true
      case _ => false
    }).sortBy(_.ID).partition(_.CreatedAt < threshold.threshold)

  def cleanOld() = Future[Unit] {
    val toDelete = getTestProjects()._1
    if (toDelete.nonEmpty) {
      logger.debug(s"About to delete ${toDelete.size} test projects ...")

      toDelete foreach { project =>
        logger.debug(s"Deleting: ${project.Nick.get}")
        projects.delete(project)
      }
    }
  }

  private val usedProjects =
    LinkedHashSet.empty[UUID]

  def getFresh(): Option[Project] =
    if (CacheSettings.CacheProjects) {
      val ps = getTestProjects()._2

      usedProjects synchronized {
        ps find { p => !usedProjects(p.ID) } map { p =>
          logger.info("Marking project " + p.ID + "as used ...")
          usedProjects += p.ID
          p
        }
      }
    }
    else {
      None
    }
}
