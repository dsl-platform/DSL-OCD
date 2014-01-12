package com.dslplatform.ocd
package test

object PathResolver {
  private val JavaPath =
    """(?s)package ([^;]+?);.+?public class (\S+?)\s.*"""r

  def withJavaPath(body: String) = {
    val JavaPath(packageName, className) = body

    val path = "java/" +
      packageName.replace('.', '/') + '/' +
      className + ".java"

    path -> body
  }

  private val ScalaPath =
    """(?s)package (\S+?)\s.+?class (\S+?)\s.*"""r

  def withScalaPath(body: String) = {
    val ScalaPath(packageName, className) = body

    val path = "scala/" +
      packageName.replace('.', '/') + '/' +
      className + ".scala"

    path -> body
  }
}
