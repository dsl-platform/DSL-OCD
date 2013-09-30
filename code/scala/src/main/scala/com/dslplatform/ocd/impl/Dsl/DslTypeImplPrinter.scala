package com.dslplatform.ocd

private object DslTypeImplPrinter {
  implicit class NullableSign(val predicate: Boolean) extends AnyVal {
    def ? = if (predicate) "?" else ""
  }
}

trait DslTypeImplPrinter { self: DslTypeImplStub =>
  import DslTypeImplPrinter._

  override val toString =
    (this match {
      case o: BoxOneType =>
        dslType

      case en: BoxElementNullnessType =>
        val underlying = dslType + en.areElementsNullable.?

        en match {
          case a: BoxArrayType =>
            underlying + "[]"

          case l: BoxListType =>
            "List<" + underlying + ">"

          case s: BoxSetType =>
            "Set<" + underlying + ">"
        }
    }) + isNullable.?
}
