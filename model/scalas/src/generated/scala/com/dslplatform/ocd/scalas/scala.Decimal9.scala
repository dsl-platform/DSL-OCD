package com.dslplatform.ocd
package scalas

import types._
import boxes._

sealed abstract class ScalaDecimalWithScaleOf9
    extends OcdScalaBoxType
    with `type.Decimal(9)`

case object `scala.Decimal(9)`
    extends ScalaDecimalWithScaleOf9 with `box.One` {

  val scalaClass = "BigDecimal"

  val defaultValue = "BigDecimal(0).setScale(9)"
}

case object `scala.Decimal(9)?`
    extends ScalaDecimalWithScaleOf9 with `box.Nullable` {

  val scalaClass = "Option[BigDecimal]"

  val defaultValue = "None"
}

case object `scala.Decimal(9)[]`
    extends ScalaDecimalWithScaleOf9 with `box.OneArrayOfOne` {

  val scalaClass = "Array[BigDecimal]"

  val defaultValue = "Array[BigDecimal].empty"
}

case object `scala.Decimal(9)[]?`
    extends ScalaDecimalWithScaleOf9 with `box.NullableArrayOfOne` {

  val scalaClass = "Option[Array[BigDecimal]]"

  val defaultValue = "None"
}

case object `scala.Decimal(9)?[]`
    extends ScalaDecimalWithScaleOf9 with `box.OneArrayOfNullable` {

  val scalaClass = "Array[Option[BigDecimal]]"

  val defaultValue = "Array[Option[BigDecimal]].empty"
}

case object `scala.Decimal(9)?[]?`
    extends ScalaDecimalWithScaleOf9 with `box.NullableArrayOfNullable` {

  val scalaClass = "Option[Array[Option[BigDecimal]]]"

  val defaultValue = "None"
}

case object `scala.List<Decimal(9)>`
    extends ScalaDecimalWithScaleOf9 with `box.OneListOfOne` {

  val scalaClass = "IndexedSeq[BigDecimal]"

  val defaultValue = "IndexedSeq[BigDecimal].empty"
}

case object `scala.List<Decimal(9)>?`
    extends ScalaDecimalWithScaleOf9 with `box.NullableListOfOne` {

  val scalaClass = "Option[IndexedSeq[BigDecimal]]"

  val defaultValue = "None"
}

case object `scala.List<Decimal(9)?>`
    extends ScalaDecimalWithScaleOf9 with `box.OneListOfNullable` {

  val scalaClass = "IndexedSeq[Option[BigDecimal]]"

  val defaultValue = "IndexedSeq[Option[BigDecimal]].empty"
}

case object `scala.List<Decimal(9)?>?`
    extends ScalaDecimalWithScaleOf9 with `box.NullableListOfNullable` {

  val scalaClass = "Option[IndexedSeq[Option[BigDecimal]]]"

  val defaultValue = "None"
}

case object `scala.Set<Decimal(9)>`
    extends ScalaDecimalWithScaleOf9 with `box.OneSetOfOne` {

  val scalaClass = "Set[BigDecimal]"

  val defaultValue = "Set[BigDecimal].empty"
}

case object `scala.Set<Decimal(9)>?`
    extends ScalaDecimalWithScaleOf9 with `box.NullableSetOfOne` {

  val scalaClass = "Option[Set[BigDecimal]]"

  val defaultValue = "None"
}

case object `scala.Set<Decimal(9)?>`
    extends ScalaDecimalWithScaleOf9 with `box.OneSetOfNullable` {

  val scalaClass = "Set[Option[BigDecimal]]"

  val defaultValue = "Set[Option[BigDecimal]].empty"
}

case object `scala.Set<Decimal(9)?>?`
    extends ScalaDecimalWithScaleOf9 with `box.NullableSetOfNullable` {

  val scalaClass = "Option[Set[Option[BigDecimal]]]"

  val defaultValue = "None"
}

case object `scala.Queue<Decimal(9)>`
    extends ScalaDecimalWithScaleOf9 with `box.OneQueueOfOne` {

  val scalaClass = "Queue[BigDecimal]"

  val defaultValue = "Queue[BigDecimal].empty"
}

case object `scala.Queue<Decimal(9)>?`
    extends ScalaDecimalWithScaleOf9 with `box.NullableQueueOfOne` {

  val scalaClass = "Option[Queue[BigDecimal]]"

  val defaultValue = "None"
}

case object `scala.Queue<Decimal(9)?>`
    extends ScalaDecimalWithScaleOf9 with `box.OneQueueOfNullable` {

  val scalaClass = "Queue[Option[BigDecimal]]"

  val defaultValue = "Queue[Option[BigDecimal]].empty"
}

case object `scala.Queue<Decimal(9)?>?`
    extends ScalaDecimalWithScaleOf9 with `box.NullableQueueOfNullable` {

  val scalaClass = "Option[Queue[Option[BigDecimal]]]"

  val defaultValue = "None"
}

case object `scala.LinkedList<Decimal(9)>`
    extends ScalaDecimalWithScaleOf9 with `box.OneLinkedListOfOne` {

  val scalaClass = "LinkedList[BigDecimal]"

  val defaultValue = "LinkedList[BigDecimal].empty"
}

case object `scala.LinkedList<Decimal(9)>?`
    extends ScalaDecimalWithScaleOf9 with `box.NullableLinkedListOfOne` {

  val scalaClass = "Option[LinkedList[BigDecimal]]"

  val defaultValue = "None"
}

case object `scala.LinkedList<Decimal(9)?>`
    extends ScalaDecimalWithScaleOf9 with `box.OneLinkedListOfNullable` {

  val scalaClass = "LinkedList[Option[BigDecimal]]"

  val defaultValue = "LinkedList[Option[BigDecimal]].empty"
}

case object `scala.LinkedList<Decimal(9)?>?`
    extends ScalaDecimalWithScaleOf9 with `box.NullableLinkedListOfNullable` {

  val scalaClass = "Option[LinkedList[Option[BigDecimal]]]"

  val defaultValue = "None"
}

case object `scala.Stack<Decimal(9)>`
    extends ScalaDecimalWithScaleOf9 with `box.OneStackOfOne` {

  val scalaClass = "Stack[BigDecimal]"

  val defaultValue = "Stack[BigDecimal].empty"
}

case object `scala.Stack<Decimal(9)>?`
    extends ScalaDecimalWithScaleOf9 with `box.NullableStackOfOne` {

  val scalaClass = "Option[Stack[BigDecimal]]"

  val defaultValue = "None"
}

case object `scala.Stack<Decimal(9)?>`
    extends ScalaDecimalWithScaleOf9 with `box.OneStackOfNullable` {

  val scalaClass = "Stack[Option[BigDecimal]]"

  val defaultValue = "Stack[Option[BigDecimal]].empty"
}

case object `scala.Stack<Decimal(9)?>?`
    extends ScalaDecimalWithScaleOf9 with `box.NullableStackOfNullable` {

  val scalaClass = "Option[Stack[Option[BigDecimal]]]"

  val defaultValue = "None"
}

case object `scala.Vector<Decimal(9)>`
    extends ScalaDecimalWithScaleOf9 with `box.OneVectorOfOne` {

  val scalaClass = "Vector[BigDecimal]"

  val defaultValue = "Vector[BigDecimal].empty"
}

case object `scala.Vector<Decimal(9)>?`
    extends ScalaDecimalWithScaleOf9 with `box.NullableVectorOfOne` {

  val scalaClass = "Option[Vector[BigDecimal]]"

  val defaultValue = "None"
}

case object `scala.Vector<Decimal(9)?>`
    extends ScalaDecimalWithScaleOf9 with `box.OneVectorOfNullable` {

  val scalaClass = "Vector[Option[BigDecimal]]"

  val defaultValue = "Vector[Option[BigDecimal]].empty"
}

case object `scala.Vector<Decimal(9)?>?`
    extends ScalaDecimalWithScaleOf9 with `box.NullableVectorOfNullable` {

  val scalaClass = "Option[Vector[Option[BigDecimal]]]"

  val defaultValue = "None"
}
