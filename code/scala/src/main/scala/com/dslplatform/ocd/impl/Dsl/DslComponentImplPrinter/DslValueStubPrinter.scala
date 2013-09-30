package com.dslplatform.ocd

trait DslValueStubPrinter
    extends DslComponentImplPrinter { this: DslValueStub =>

  private val formatHeader =
    s"""value ${name}"""

  override val toString =
    formatHeader +
    (if (components.isEmpty) {
      ";"
    }
    else {
      s""" {
${toStringComponents}
}
"""
    }) tab
}
