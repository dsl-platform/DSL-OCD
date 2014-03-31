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
  , E"${"""'/\[](){}"""}"
  , E"${(1 to 9).map(_.toChar).mkString}"
  , E"${"x" * StringLengthConstraint}"
  )
}
