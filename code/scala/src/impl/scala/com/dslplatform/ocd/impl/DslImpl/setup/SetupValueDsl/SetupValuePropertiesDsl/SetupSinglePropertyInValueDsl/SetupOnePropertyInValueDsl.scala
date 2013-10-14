package com.dslplatform.ocd
package impl
package dsl
package setup

import types._

trait SetupOnePropertyInValueDsl
    extends SetupSinglePropertyInValueDsl {

  def propertyType: `box.One` with DslImpl
}
