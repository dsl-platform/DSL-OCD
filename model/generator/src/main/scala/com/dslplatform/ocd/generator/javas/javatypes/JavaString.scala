package com.dslplatform.ocd
package generator
package javas
package javatypes

import types._
import boxes._

object JavaString
    extends JavaStub {

  val classReference = "String"

  val defaultSingle: TestValue = E"${""}"

  val nonDefaultValues: Seq[TestValue] = Seq(
    E"${'"'}"
  , E"${"""Quote: ", Solidus /, Backslash: \, Aphos: ', Brackets: [] () {}"""}"
  , E"${(1 to 256).map(_.toChar).mkString}"
//  , E"${(0 to 256).map(_.toChar).mkString}" // PostgreSQL does not support unicode character of value 0
  )
}
