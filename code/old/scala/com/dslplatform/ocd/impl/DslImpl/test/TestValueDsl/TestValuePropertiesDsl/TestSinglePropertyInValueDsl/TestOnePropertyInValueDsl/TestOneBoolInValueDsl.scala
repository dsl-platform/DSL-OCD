package com.dslplatform.ocd
package impl
package dsl
package test

import types._

trait TestOneBoolInValueDsl
    extends TestOnePropertyInValueDsl {

  def testDesc = "hehe"


  def propertyType = `Bool`
}
