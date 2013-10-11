package com.dslplatform.ocd
package impl
package dsl
package printer

trait DslComponentPrinter { this: DslComponent =>
  protected def headerSeparator    = " {\n"
  protected def bodySeparator      = "\n"
  protected def footerSeparator    = "\n}"
  protected def tabOption = (_: String).tab

  protected def toStringHeader: String

  override def toString =
    toStringHeader + (components match {
      case Some(comps) if comps.isEmpty =>
        " {}"

      case Some(comps) =>
        comps.map(s => tabOption(s.toString))
          .mkString(
            headerSeparator
          , bodySeparator
          , footerSeparator
          )

      case _ =>
        ";"
    })
}
