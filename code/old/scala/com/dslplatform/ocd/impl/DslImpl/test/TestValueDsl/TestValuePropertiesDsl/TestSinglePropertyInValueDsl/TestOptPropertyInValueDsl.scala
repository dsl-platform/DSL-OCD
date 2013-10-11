package com.dslplatform.ocd
package impl
package dsl
package test

import types._

trait TestOptPropertyInValueDsl
    extends TestSinglePropertyInValueDsl {

  def propertyType: `box.Opt` with DslImpl
}
