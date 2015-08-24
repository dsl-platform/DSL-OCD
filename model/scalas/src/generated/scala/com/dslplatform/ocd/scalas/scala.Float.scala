package com.dslplatform.ocd
package scalas

import types._
import boxes._

sealed abstract class ScalaFloat
    extends OcdScalaBoxType
    with `type.Float`

case object `scala.Float`
    extends ScalaFloat with `box.One` {

  val scalaClass = "Float"

  val defaultValue = "0.0f"
}

case object `scala.Float?`
    extends ScalaFloat with `box.Nullable` {

  val scalaClass = "Option[Float]"

  val defaultValue = "None"
}

case object `scala.Float[]`
    extends ScalaFloat with `box.OneArrayOfOne` {

  val scalaClass = "Array[Float]"

  val defaultValue = "Array[Float].empty"
}

case object `scala.Float[]?`
    extends ScalaFloat with `box.NullableArrayOfOne` {

  val scalaClass = "Option[Array[Float]]"

  val defaultValue = "None"
}

case object `scala.Float?[]`
    extends ScalaFloat with `box.OneArrayOfNullable` {

  val scalaClass = "Array[Option[Float]]"

  val defaultValue = "Array[Option[Float]].empty"
}

case object `scala.Float?[]?`
    extends ScalaFloat with `box.NullableArrayOfNullable` {

  val scalaClass = "Option[Array[Option[Float]]]"

  val defaultValue = "None"
}

case object `scala.List<Float>`
    extends ScalaFloat with `box.OneListOfOne` {

  val scalaClass = "IndexedSeq[Float]"

  val defaultValue = "IndexedSeq[Float].empty"
}

case object `scala.List<Float>?`
    extends ScalaFloat with `box.NullableListOfOne` {

  val scalaClass = "Option[IndexedSeq[Float]]"

  val defaultValue = "None"
}

case object `scala.List<Float?>`
    extends ScalaFloat with `box.OneListOfNullable` {

  val scalaClass = "IndexedSeq[Option[Float]]"

  val defaultValue = "IndexedSeq[Option[Float]].empty"
}

case object `scala.List<Float?>?`
    extends ScalaFloat with `box.NullableListOfNullable` {

  val scalaClass = "Option[IndexedSeq[Option[Float]]]"

  val defaultValue = "None"
}

case object `scala.Set<Float>`
    extends ScalaFloat with `box.OneSetOfOne` {

  val scalaClass = "Set[Float]"

  val defaultValue = "Set[Float].empty"
}

case object `scala.Set<Float>?`
    extends ScalaFloat with `box.NullableSetOfOne` {

  val scalaClass = "Option[Set[Float]]"

  val defaultValue = "None"
}

case object `scala.Set<Float?>`
    extends ScalaFloat with `box.OneSetOfNullable` {

  val scalaClass = "Set[Option[Float]]"

  val defaultValue = "Set[Option[Float]].empty"
}

case object `scala.Set<Float?>?`
    extends ScalaFloat with `box.NullableSetOfNullable` {

  val scalaClass = "Option[Set[Option[Float]]]"

  val defaultValue = "None"
}

case object `scala.Queue<Float>`
    extends ScalaFloat with `box.OneQueueOfOne` {

  val scalaClass = "Queue[Float]"

  val defaultValue = "Queue[Float].empty"
}

case object `scala.Queue<Float>?`
    extends ScalaFloat with `box.NullableQueueOfOne` {

  val scalaClass = "Option[Queue[Float]]"

  val defaultValue = "None"
}

case object `scala.Queue<Float?>`
    extends ScalaFloat with `box.OneQueueOfNullable` {

  val scalaClass = "Queue[Option[Float]]"

  val defaultValue = "Queue[Option[Float]].empty"
}

case object `scala.Queue<Float?>?`
    extends ScalaFloat with `box.NullableQueueOfNullable` {

  val scalaClass = "Option[Queue[Option[Float]]]"

  val defaultValue = "None"
}

case object `scala.LinkedList<Float>`
    extends ScalaFloat with `box.OneLinkedListOfOne` {

  val scalaClass = "LinkedList[Float]"

  val defaultValue = "LinkedList[Float].empty"
}

case object `scala.LinkedList<Float>?`
    extends ScalaFloat with `box.NullableLinkedListOfOne` {

  val scalaClass = "Option[LinkedList[Float]]"

  val defaultValue = "None"
}

case object `scala.LinkedList<Float?>`
    extends ScalaFloat with `box.OneLinkedListOfNullable` {

  val scalaClass = "LinkedList[Option[Float]]"

  val defaultValue = "LinkedList[Option[Float]].empty"
}

case object `scala.LinkedList<Float?>?`
    extends ScalaFloat with `box.NullableLinkedListOfNullable` {

  val scalaClass = "Option[LinkedList[Option[Float]]]"

  val defaultValue = "None"
}

case object `scala.Stack<Float>`
    extends ScalaFloat with `box.OneStackOfOne` {

  val scalaClass = "Stack[Float]"

  val defaultValue = "Stack[Float].empty"
}

case object `scala.Stack<Float>?`
    extends ScalaFloat with `box.NullableStackOfOne` {

  val scalaClass = "Option[Stack[Float]]"

  val defaultValue = "None"
}

case object `scala.Stack<Float?>`
    extends ScalaFloat with `box.OneStackOfNullable` {

  val scalaClass = "Stack[Option[Float]]"

  val defaultValue = "Stack[Option[Float]].empty"
}

case object `scala.Stack<Float?>?`
    extends ScalaFloat with `box.NullableStackOfNullable` {

  val scalaClass = "Option[Stack[Option[Float]]]"

  val defaultValue = "None"
}

case object `scala.Vector<Float>`
    extends ScalaFloat with `box.OneVectorOfOne` {

  val scalaClass = "Vector[Float]"

  val defaultValue = "Vector[Float].empty"
}

case object `scala.Vector<Float>?`
    extends ScalaFloat with `box.NullableVectorOfOne` {

  val scalaClass = "Option[Vector[Float]]"

  val defaultValue = "None"
}

case object `scala.Vector<Float?>`
    extends ScalaFloat with `box.OneVectorOfNullable` {

  val scalaClass = "Vector[Option[Float]]"

  val defaultValue = "Vector[Option[Float]].empty"
}

case object `scala.Vector<Float?>?`
    extends ScalaFloat with `box.NullableVectorOfNullable` {

  val scalaClass = "Option[Vector[Option[Float]]]"

  val defaultValue = "None"
}
