package com.dslplatform.ocd

trait DslRootStubPrinter
    extends DslComponentImplPrinter { this: DslRootStub =>

  private val formatHeader =
    header match {
      case RootHeader =>
        s"""root ${name}"""

      case BigRootHeader =>
        s"""big root ${name}"""

      case UUIDRootHeader =>
        s"""uuid root ${name}"""

      case KeysRootHeader(keys) =>
        s"""root ${name}(${keys mkString ", "})"""
    }

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
