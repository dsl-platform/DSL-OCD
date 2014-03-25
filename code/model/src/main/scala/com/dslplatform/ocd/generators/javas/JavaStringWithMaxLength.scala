package com.dslplatform.ocd.generators
package javas

import Types._
import Boxes._

object JavaStringWithMaxLength
    extends JavaStub {

  val classReference = "String"

  val defaultSingle: TestValue = E"${""}"

  val nonDefaultValues: Seq[TestValue] = Seq(
    E"${'"'}"
  , E"${"""Quote: ", Solidus /, Backslash: \, Aphos: ', Brackets: [] () {}"""}"
  , E"${(0 to 256).map(_.toChar).mkString}"
  , E"${"x" * StringLengthConstraint}"
  )
}
