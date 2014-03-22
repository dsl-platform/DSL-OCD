package com.dslplatform.ocd
package test
package javatest

object JavaInfo {
  private val SourceExtractor =
    """(?s)package ([^;]+?);.+?public class (\S+?)\s.*"""r

  def apply(body: String) = {
    val SourceExtractor(packageName, clazz) = body
    new JavaInfo(packageName, clazz, body)
  }
}

class JavaInfo private(val packageName: String, val clazz: String, val body: String) {
  val path = "java/" + packageName.replace('.', '/') + '/' + clazz + ".java"
  val toEntry = (path, body)
  val classPath = packageName + '.' + clazz
}
