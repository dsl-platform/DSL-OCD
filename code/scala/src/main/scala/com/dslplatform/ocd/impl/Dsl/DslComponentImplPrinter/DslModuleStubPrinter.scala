package com.dslplatform.ocd

trait DslModuleStubPrinter
    extends DslComponentImplPrinter { this: DslModuleStub =>
  override def separator = "\n\n"

  private val formatHeader =
    s"""module ${name}"""

  override val toString =
    formatHeader +
    (if (components.isEmpty) {
      ";"
    }
    else {
      s"""
{
${toStringComponents}
}
"""
    })
}
