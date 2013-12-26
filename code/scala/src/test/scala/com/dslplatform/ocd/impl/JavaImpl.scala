package com.dslplatform.ocd
package impl

import types._
import types.{ box => tbox }

trait JavaImpl
    extends OcdImpl
    with tbox.BoxOnenessType
    with tbox.BoxNullnessType
    with tipe.TipeConstrainnessType
    with tipe.TipeStablenessType
    with tipe.TipeComplexityType
    with `lang.Java` {

  def javaDesc: String
  def javaClass: String
  def constructor: String
  def defaultValue: String
}
