package com.dslplatform

import org.apache.commons.lang3.StringEscapeUtils.escapeJava

package object ocd {
  implicit class JavaEscaper(val sc: StringContext) extends AnyVal {
    def E(args: Any*): String = {
      sc.checkLengths(args)

      val pi = sc.parts.iterator
      val ai = args.iterator
      val sb = new StringBuilder(pi.next())

      while (ai.hasNext) {
        (sb += '"'
            ++= escapeJava(ai.next().toString)
            += '"'
            ++= pi.next())
      }

      sb.toString
    }
  }

  implicit class RichBoolean(val value: Boolean) extends AnyVal {
    def ifTrue(trueText: String, falseText: String = "") = if (value) trueText else falseText
  }

  implicit class RichString(val value: String) extends AnyVal {
    def fciu = value.head.toUpper + value.tail
    def fcil = value.head.toLower + value.tail
  }
}
