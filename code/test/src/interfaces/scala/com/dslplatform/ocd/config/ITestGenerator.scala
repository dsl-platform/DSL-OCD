package com.dslplatform.ocd
package config

trait ITestGenerator {
  def generateTest(): ITestProject
}
