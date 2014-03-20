package com.dslplatform.ocd.generators
package javas

import Types._
import Boxes._

object JavaText
    extends JavaStub {

  val classReference = "String"

  val defaultSingle = "new String()"

  /* A string of length Types.StringLengthConstraints */
  val maxLenString = ("x" * Types.StringLengthConstraint).mkString("\\\"","","\\\"")

  /* A string containing unicode characters 0-255 */
  val unicode255 = (for(i <- 0 to 255) yield i.toHexString).map(
      hex =>
        "\\u" + "0"*(4 - hex.length()) + hex
    )
    .mkString("\\\"","","\\\"")

  val singleCharacterString = "\\\"{\\\""

  val nonDefaultValues = Seq(
        defaultSingle
      , maxLenString
      , unicode255
      , singleCharacterString
      )}
