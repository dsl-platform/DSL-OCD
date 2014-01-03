package com.dslplatform.ocd
package impl
package box

import types._

trait JavaPrimitiveType
    extends JavaImpl {

  def scalarClass: String
  def referenceClass: String
}
