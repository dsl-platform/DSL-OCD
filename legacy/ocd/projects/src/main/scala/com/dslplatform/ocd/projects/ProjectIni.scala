package com.dslplatform.ocd.projects

import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.InputStream
import java.io.OutputStream
import java.util.Properties

case class ProjectIni(
  username: String
, projectID: java.util.UUID
, apiUrl: String
, packageName: String) {

  def toProperties = {
    val props = new Properties()
    props.put("username", username)
    props.put("project-id", projectID.toString)
    props.put("api-url", apiUrl)
    props.put("package-name", packageName)
    props
  }

  def toOutputStream(os: OutputStream) = {
    val props = toProperties
    props.store(os, null)
  }

  def toByteArray = {
    val baos = new ByteArrayOutputStream
    toOutputStream(baos)
    baos.toByteArray
  }
}

object ProjectIni {
  def fromByteArray(body: Array[Byte]) = {
    val bais = new ByteArrayInputStream(body)
    fromInputStream(bais)
  }

  def fromInputStream(is: InputStream) = {
    val props = new Properties
    props.load(is)
    is.close()

    fromProperties(props)
  }

  def fromProperties(props: Properties) =
    ProjectIni(
      username = props.getProperty("username")
    , projectID = java.util.UUID.fromString(props.getProperty("project-id"))
    , apiUrl = props.getProperty("api-url")
    , packageName = props.getProperty("package-name")
    )
}
