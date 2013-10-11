package com.dslplatform.ocd
package impl
package java
package test

import dsl.test._
import types._

trait TestValuePropertiesJava
    extends TestImplJavaTemplate
    with TestValuePropertiesDsl {

  def packageModel = ".model"
  def packageSub = ".values"
  def packageStub: String
  def packageTest: String

  def packageName = packageStub + packageSub + packageTest
  def ValueClass = packageStub + packageModel + "." + ModuleName

  def imports = s"""
import ${ValueClass};
"""

  def staticFields = ""
  def beforeClass = ""
  def afterClass = ""
  def beforeTest = ""
  def afterTest = ""
}
