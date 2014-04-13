package com.dslplatform.ocd
package generator
package scalas

import types._
import boxes._

trait ScalaStub {
  val clazz: String

  def boxToScalaBox = (_: CollectionFamily) match {
    case CollectionFamily.List => "IndexedSeq"
    case ct => ct.toString
  }

  def classValue = (_: Box) match {
    case Box(SingleFamily.One, None, _*) =>
      clazz

    case Box(SingleFamily.Nullable, None, _*) =>
      s"Option[${clazz}]"

    case Box(SingleFamily.One, Some((ct, SingleFamily.One)), _*) =>
      s"${boxToScalaBox(ct)}[${clazz}]"

    case Box(SingleFamily.One, Some((ct, SingleFamily.Nullable)), _*) =>
      s"${boxToScalaBox(ct)}[Option[${clazz}]]"

    case Box(SingleFamily.Nullable, Some((ct, SingleFamily.One)), _*) =>
      s"Option[${boxToScalaBox(ct)}[${clazz}]]"

    case Box(SingleFamily.Nullable, Some((ct, SingleFamily.Nullable)), _*) =>
      s"Option[${boxToScalaBox(ct)}[Option[${clazz}]]]"
  }


  val defaultSingle: String

  def defaultValue = (_: Box) match {
    case Box(SingleFamily.One, None, _*) =>
      defaultSingle

    case Box(SingleFamily.Nullable, _, _*) =>
      s"None"

    case Box(SingleFamily.One, Some((ct, SingleFamily.One)), _*) =>
      s"${boxToScalaBox(ct)}[${clazz}].empty"

    case Box(SingleFamily.One, Some((ct, SingleFamily.Nullable)), _*) =>
      s"${boxToScalaBox(ct)}[Option[${clazz}]].empty"
  }
}
