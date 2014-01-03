package com.dslplatform.ocd
package impl
package dsl
package printer

trait DslPropertyComponentPrinter
    extends DslComponentPrinter { this: DslPropertyComponent =>

  protected val toStringHeader = body
}
