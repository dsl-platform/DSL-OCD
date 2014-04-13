package com.dslplatform.ocd
package generator
package javas
package javatypes

import types._
import boxes._

object JavaText
  extends JavaStub {

  val classReference = "String"

  val defaultSingle: TestValue = E"${""}"

  val nonDefaultValues: Seq[TestValue] = Seq(
    E"${'"'}"
  , E"${"""Quote: ", Solidus /, Backslash: \, Aphos: ', Brackets: [] () {}"""}"
  , E"${(1 to 256).map(_.toChar).mkString}"
  )
}
