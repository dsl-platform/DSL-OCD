package com.dslplatform.ocd.generators
package scalas

import Types._
import Boxes._

trait ScalaStub {
  val clazz: String

  def classValue = (_: Box) match {
    case Box(SingleType.One, None, _*) =>
      clazz

    case Box(SingleType.Nullable, None, _*) =>
      s"Option[${clazz}]"

    case Box(SingleType.One, Some((ct, SingleType.One)), _*) =>
      s"${ct}[${clazz}]"

    case Box(SingleType.One, Some((ct, SingleType.Nullable)), _*) =>
      s"${ct}[Option[${clazz}]]"

    case Box(SingleType.Nullable, Some((ct, SingleType.One)), _*) =>
      s"Option[${ct}[${clazz}]]"

    case Box(SingleType.Nullable, Some((ct, SingleType.Nullable)), _*) =>
      s"Option[${ct}[Option[${clazz}]]]"
  }


  val defaultSingle: String

  def defaultValue = (_: Box) match {
    case Box(SingleType.One, None, _*) =>
      defaultSingle

    case Box(SingleType.Nullable, _, _*) =>
      s"None"

    case Box(SingleType.One, Some((ct, SingleType.One)), _*) =>
      s"${ct}[${clazz}].empty"

    case Box(SingleType.One, Some((ct, SingleType.Nullable)), _*) =>
      s"${ct}[Option[${clazz}]].empty"
  }
}
