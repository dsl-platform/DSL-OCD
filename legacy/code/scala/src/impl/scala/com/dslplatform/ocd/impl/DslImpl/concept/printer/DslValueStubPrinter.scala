package com.dslplatform.ocd
package impl
package dsl
package printer

trait DslValueStubPrinter
    extends DslComponentPrinter { this: DslValueStub =>

  protected val toStringHeader =
    "value " + name
}
