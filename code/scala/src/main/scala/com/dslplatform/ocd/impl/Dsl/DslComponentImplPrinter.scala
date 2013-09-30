package com.dslplatform.ocd

trait DslComponentImplPrinter { this: DslComponentImplStub =>
  protected def separator = "\n"

  protected def toStringComponents =
    components.map(_.toString).mkString(separator)
}
