package com.dslplatform.ocd
package impl
package dsl
package test

import types._

trait TestOnePropertyInValueDsl
    extends TestSinglePropertyInValueDsl {

  def propertyType: `box.One` with DslImpl
}
