package com.dslplatform.ocd.generators
package javas

import Types._
import Boxes._

object JavaString
    extends JavaStub {

  val classReference = "String"

  val defaultSingle = "new String()"

  val nonDefaultValues = Seq(
    E"${'"'}"
  , E"${"""Quote: ", Solidus /, Backslash: \, Aphos: ', Brackets: [] () {}"""}"
  , E"${(0 to 256).map(_.toChar).mkString}"
  )
}
