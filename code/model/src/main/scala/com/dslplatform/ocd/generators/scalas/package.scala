package com.dslplatform.ocd.generators
package scalas

import Types._
import Boxes._

trait ScalaStub {
  val clazz: String

  def boxToScalaBox = (_: CollectionType) match {
    case CollectionType.List => "IndexedSeq"
    case ct => ct.toString
  }

  def classValue = (_: Box) match {
    case Box(SingleType.One, None, _*) =>
      clazz

    case Box(SingleType.Nullable, None, _*) =>
      s"Option[${clazz}]"

    case Box(SingleType.One, Some((ct, SingleType.One)), _*) =>
      s"${boxToScalaBox(ct)}[${clazz}]"

    case Box(SingleType.One, Some((ct, SingleType.Nullable)), _*) =>
      s"${boxToScalaBox(ct)}[Option[${clazz}]]"

    case Box(SingleType.Nullable, Some((ct, SingleType.One)), _*) =>
      s"Option[${boxToScalaBox(ct)}[${clazz}]]"

    case Box(SingleType.Nullable, Some((ct, SingleType.Nullable)), _*) =>
      s"Option[${boxToScalaBox(ct)}[Option[${clazz}]]]"
  }


  val defaultSingle: String

  def defaultValue = (_: Box) match {
    case Box(SingleType.One, None, _*) =>
      defaultSingle

    case Box(SingleType.Nullable, _, _*) =>
      s"None"

    case Box(SingleType.One, Some((ct, SingleType.One)), _*) =>
      s"${boxToScalaBox(ct)}[${clazz}].empty"

    case Box(SingleType.One, Some((ct, SingleType.Nullable)), _*) =>
      s"${boxToScalaBox(ct)}[Option[${clazz}]].empty"
  }
}
