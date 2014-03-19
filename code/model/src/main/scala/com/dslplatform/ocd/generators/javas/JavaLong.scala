package com.dslplatform.ocd.generators
package javas

import Types._
import Boxes._
import java.lang.Long

object JavaLong
  extends JavaStub {

  override val classPrimitive = Some("long")
  val classReference = "Long"

  val defaultSingle = "0L"
  override val borderSingleValues =
    Seq(
      defaultSingle
    , "Long.MIN_VALUE"
    , "Long.MAX_VALUE"
    )

    // TODO: Pull up
    override def borderValues(box: Box): Seq[String] =
    box match {
      /* box.One */
      case Box(SingleType.One, None, _*) =>
        borderSingleValues
      /* box.Nullable */
      case Box(SingleType.Nullable, None, aliases@_*) =>
        "null" +: borderValues(Box(SingleType.One, None, aliases:_*))

      /* box.OneArrayOfOne,  box.OneListOfOne, box.OneSetOfOne*/
      case Box(SingleType.One, Some((_, SingleType.One)), _*) =>
        Seq(
          defaultValue(box)
        , defaultConcreteType(box, defaultSingle)
        , defaultConcreteType(box, borderSingleValues.last)
        , defaultConcreteType(box, borderSingleValues: _*)
        )
      /* box.NulableArrayOfOne, box.NulableSetOfOne, box.NulableListOfOne */
      case Box(SingleType.Nullable, Some((base, SingleType.One)), aliases@_*) =>
        "null" +:  borderValues(Box(SingleType.One, Some((base, SingleType.One)), aliases:_*))

      /* box.OneArrayOfNullable,  box.OneListOfNullable, box.OneSetOfNullable */
      case Box(SingleType.One, Some((_, SingleType.Nullable)), _*) =>
        Seq(
          defaultValue(box)
        , defaultConcreteType(box, "null")
        , defaultConcreteType(box, defaultSingle)
        , defaultConcreteType(box, borderSingleValues.last)
        , defaultConcreteType(box, borderSingleValues: _*)
        , defaultConcreteType(box, "null" +: borderSingleValues: _*)
        )
      /* box.NulableArrayOfNullable, box.NulableSetOfNullable, box.NulableListOfNullable */
      case Box(SingleType.Nullable, Some((base, SingleType.Nullable)), aliases@_*) =>
        "null" +: borderValues(Box(SingleType.One, Some((base, SingleType.Nullable)), aliases:_*))

      case _ =>
        Seq("dinamo", "hajduk") // TODO:
    }
}
