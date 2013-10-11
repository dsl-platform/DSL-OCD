package com.dslplatform.ocd
package impl
package dsl
package printer

import types._

private object DslImplPrinter {
  implicit class NullableSign(val predicate: Boolean) extends AnyVal {
    def ? = if (predicate) "?" else ""
  }
}

trait DslImplPrinter { self: DslImpl =>
  import DslImplPrinter.NullableSign

  override val toString =
    (this match {
      case o: box.BoxSingleType =>
        dslDesc

      case en: box.BoxElementNullnessType =>
        val underlying = dslDesc + en.areElementsNullable.?

        en match {
          case a: box.BoxArrayType =>
            underlying + "[]"

          case l: box.BoxListType =>
            "List<" + underlying + ">"

          case s: box.BoxSetType  =>
            "Set<" + underlying + ">"
        }
    }) + isNullable.?
}
