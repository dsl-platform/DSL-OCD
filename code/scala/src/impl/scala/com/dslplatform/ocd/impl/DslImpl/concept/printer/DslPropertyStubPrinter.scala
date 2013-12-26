package com.dslplatform.ocd
package impl
package dsl
package printer

import types.box.BoxNullableType

trait DslPropertyStubPrinter
    extends DslComponentPrinter { this: DslPropertyStub =>

  override protected def headerSeparator    = " { "
  override protected def bodySeparator      = " "
  override protected def footerSeparator    = " }"
  override protected def tabOption = identity

  private val tipeSpacing =
    tipe match {
      case n: BoxNullableType => " "
      case _ => "  "
    }

  protected val toStringHeader =
    tipe + tipeSpacing + name
}
