package com.dslplatform.ocd
package impl
package dsl
package setup

import types._

trait SetupOptSetOptPropertyInValueDsl
    extends SetupSinglePropertyInValueDsl {

  def propertyType: `box.OptSetOpt` with DslImpl
}
