package com.dslplatform.ocd
package generator
package javas
package javatypes

import types._
import boxes._

object JavaStringWithMaxLength
    extends JavaStub {

  val classReference = "String"

  val defaultSingle: TestValue = E"${""}"

  val nonDefaultValues: Seq[TestValue] = Seq(
    E"${'"'}"
  , E"${"""'/\[](){}"""}"
  , E"${(1 to 9).map(_.toChar).mkString}"
  , E"${"x" * TypeDefaults.DefaultStringLength}"
//  , E"${(0 until 9).map(_.toChar).mkString}" // PostgreSQL does not support unicode character of value 0
  )
}
