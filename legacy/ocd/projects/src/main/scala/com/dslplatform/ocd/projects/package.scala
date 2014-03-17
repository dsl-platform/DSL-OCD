package com.dslplatform.ocd
package object projects {

implicit class RichProject(project: Client.Project) {
  def toProjectIni(packageName: String = "model") =
    ProjectIni(
      username = project.UserID
    , projectID = project.ID
    , apiUrl = s"https://${project.ApplicationServer}/${project.ApplicationName}"
    , packageName = packageName
    )
}

}
