package com.dslplatform.ocd

trait TestValuePropertiesJava
    extends JavaTestImplTemplate
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
