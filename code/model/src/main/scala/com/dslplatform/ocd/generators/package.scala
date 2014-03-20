package com.dslplatform.ocd

import org.apache.commons.lang3.StringEscapeUtils.escapeJava

package object generators {
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

  val Pi = "3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679"
}
