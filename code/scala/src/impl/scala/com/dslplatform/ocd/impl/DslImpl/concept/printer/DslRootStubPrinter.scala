package com.dslplatform.ocd
package impl
package dsl
package printer

trait DslRootHeaderPrinter { this: DslRootHeader =>
  def withName(name: String) =
    this match {
      case StandardRootHeader =>
        s"""root ${name}"""

      case BigRootHeader =>
        s"""big root ${name}"""

      case GUIDRootHeader =>
        s"""guid root ${name}"""

      case KeysRootHeader(keys) =>
        s"""root ${name}(${keys mkString ", "})"""
    }
}

trait DslRootStubPrinter
    extends DslComponentPrinter { this: DslRootStub =>

  protected val toStringHeader =
    header.withName(name)
}
