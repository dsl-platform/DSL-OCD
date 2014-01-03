package com.dslplatform.ocd
package impl
package dsl
package printer

trait DslModuleStubPrinter
    extends DslComponentPrinter { this: DslModuleStub =>

  override protected val headerSeparator = "\n{\n"
  override protected def bodySeparator   = "\n\n"

  protected val toStringHeader =
    "module " + name
}
