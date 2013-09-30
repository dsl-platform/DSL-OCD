package com.dslplatform.ocd

trait DslPropertyStubPrinter
    extends DslComponentImplPrinter { this: DslPropertyStub =>

  private val formatHeader =
    s"""${tipe} ${name}"""

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
