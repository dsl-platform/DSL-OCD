package com.dslplatform.ocd
package impl
package dsl
package setup

import types._

trait SetupOptPropertyInValueDsl
    extends SetupSinglePropertyInValueDsl {

  def propertyType: `box.Opt` with DslImpl
}
