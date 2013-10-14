package com.dslplatform.ocd
package config

import com.dslplatform.compiler.client.api.params.Language

trait IApiActions {
  def create(projectName: String): ProjectIni

  def deployDsl(
      projectID: UUID
    , packageName: String
    , languages: Set[Language]
    , dslFiles: Map[String, String]): Map[Language, Map[String, String]]

  def delete(projectID: UUID): Unit
}
