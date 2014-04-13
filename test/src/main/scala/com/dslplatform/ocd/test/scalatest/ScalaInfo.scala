//package com.dslplatform.ocd
//package test
//package scalatest
//
//object ScalaInfo {
//  private val SourceExtractor =
//    """(?s)package (\S+?)\spackage (\S+?)\s.*?class (\S+?)\s.*"""r
//
//  def apply(body: String) = {
//    val SourceExtractor(basePackageName, testPackageName, clazz) = body
//    new ScalaInfo(basePackageName, testPackageName, clazz, body)
//  }
//}
//
//class ScalaInfo private(val basePackageName: String, val testPackageName: String, val clazz: String, val body: String) {
//  val path = "scala/" + (basePackageName + '.' + testPackageName).replace('.', '/') + '/' + clazz + ".scala"
//  val toEntry = (path, body)
//}
