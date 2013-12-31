package com.dslplatform.ocd
package config

import com.dslplatform.compiler.client.api.params.Language

trait IApiActions {
  def create(
      projectName: String
    , packageName: String): ProjectIni

  def deployDsl(
      projectID: UUID
    , packageName: String
    , languages: Set[Language]
    , dslFiles: Map[String, String]): Map[Language, Map[String, String]]

  def upgradeDatabase(
      projectID: UUID
    , dslFiles: Map[String, String]): Unit

  def delete(projectID: UUID): Unit
}
