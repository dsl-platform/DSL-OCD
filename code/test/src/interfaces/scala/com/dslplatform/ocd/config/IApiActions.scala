package com.dslplatform.ocd
package config

import projects.ProjectIni
import com.dslplatform.compiler.client.api.params.Language

trait IApiActions {
  def create(
      projectName: String
    , packageName: String): ProjectIni

  def deployDsl(
      projectID: UUID
    , packageName: String
    , languages: Set[Language]
    , dslFiles: Files): Map[Language, Files]

  def upgradeDatabase(
      projectID: UUID
    , dslFiles: Files): Unit

  def delete(projectID: UUID): Unit
}
