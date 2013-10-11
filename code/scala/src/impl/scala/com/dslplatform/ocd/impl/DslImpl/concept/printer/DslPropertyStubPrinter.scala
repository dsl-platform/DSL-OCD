package com.dslplatform.ocd
package impl
package dsl
package printer

trait DslPropertyStubPrinter
    extends DslComponentPrinter { this: DslPropertyStub =>

  override protected def headerSeparator    = " { "
  override protected def bodySeparator      = " "
  override protected def footerSeparator    = " }"
  override protected def tabOption = identity

  private val tipeSpacing =
    if (tipe.endsWith("?")) " " else "  "

  protected val toStringHeader =
    tipe + tipeSpacing + name
}
