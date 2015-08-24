package com.dslplatform.ocd
package scalas

import types._
import boxes._

sealed abstract class ScalaInteger
    extends OcdScalaBoxType
    with `type.Integer`

case object `scala.Integer`
    extends ScalaInteger with `box.One` {

  val scalaClass = "Int"

  val defaultValue = "0"
}

case object `scala.Integer?`
    extends ScalaInteger with `box.Nullable` {

  val scalaClass = "Option[Int]"

  val defaultValue = "None"
}

case object `scala.Integer[]`
    extends ScalaInteger with `box.OneArrayOfOne` {

  val scalaClass = "Array[Int]"

  val defaultValue = "Array[Int].empty"
}

case object `scala.Integer[]?`
    extends ScalaInteger with `box.NullableArrayOfOne` {

  val scalaClass = "Option[Array[Int]]"

  val defaultValue = "None"
}

case object `scala.Integer?[]`
    extends ScalaInteger with `box.OneArrayOfNullable` {

  val scalaClass = "Array[Option[Int]]"

  val defaultValue = "Array[Option[Int]].empty"
}

case object `scala.Integer?[]?`
    extends ScalaInteger with `box.NullableArrayOfNullable` {

  val scalaClass = "Option[Array[Option[Int]]]"

  val defaultValue = "None"
}

case object `scala.List<Integer>`
    extends ScalaInteger with `box.OneListOfOne` {

  val scalaClass = "IndexedSeq[Int]"

  val defaultValue = "IndexedSeq[Int].empty"
}

case object `scala.List<Integer>?`
    extends ScalaInteger with `box.NullableListOfOne` {

  val scalaClass = "Option[IndexedSeq[Int]]"

  val defaultValue = "None"
}

case object `scala.List<Integer?>`
    extends ScalaInteger with `box.OneListOfNullable` {

  val scalaClass = "IndexedSeq[Option[Int]]"

  val defaultValue = "IndexedSeq[Option[Int]].empty"
}

case object `scala.List<Integer?>?`
    extends ScalaInteger with `box.NullableListOfNullable` {

  val scalaClass = "Option[IndexedSeq[Option[Int]]]"

  val defaultValue = "None"
}

case object `scala.Set<Integer>`
    extends ScalaInteger with `box.OneSetOfOne` {

  val scalaClass = "Set[Int]"

  val defaultValue = "Set[Int].empty"
}

case object `scala.Set<Integer>?`
    extends ScalaInteger with `box.NullableSetOfOne` {

  val scalaClass = "Option[Set[Int]]"

  val defaultValue = "None"
}

case object `scala.Set<Integer?>`
    extends ScalaInteger with `box.OneSetOfNullable` {

  val scalaClass = "Set[Option[Int]]"

  val defaultValue = "Set[Option[Int]].empty"
}

case object `scala.Set<Integer?>?`
    extends ScalaInteger with `box.NullableSetOfNullable` {

  val scalaClass = "Option[Set[Option[Int]]]"

  val defaultValue = "None"
}

case object `scala.Queue<Integer>`
    extends ScalaInteger with `box.OneQueueOfOne` {

  val scalaClass = "Queue[Int]"

  val defaultValue = "Queue[Int].empty"
}

case object `scala.Queue<Integer>?`
    extends ScalaInteger with `box.NullableQueueOfOne` {

  val scalaClass = "Option[Queue[Int]]"

  val defaultValue = "None"
}

case object `scala.Queue<Integer?>`
    extends ScalaInteger with `box.OneQueueOfNullable` {

  val scalaClass = "Queue[Option[Int]]"

  val defaultValue = "Queue[Option[Int]].empty"
}

case object `scala.Queue<Integer?>?`
    extends ScalaInteger with `box.NullableQueueOfNullable` {

  val scalaClass = "Option[Queue[Option[Int]]]"

  val defaultValue = "None"
}

case object `scala.LinkedList<Integer>`
    extends ScalaInteger with `box.OneLinkedListOfOne` {

  val scalaClass = "LinkedList[Int]"

  val defaultValue = "LinkedList[Int].empty"
}

case object `scala.LinkedList<Integer>?`
    extends ScalaInteger with `box.NullableLinkedListOfOne` {

  val scalaClass = "Option[LinkedList[Int]]"

  val defaultValue = "None"
}

case object `scala.LinkedList<Integer?>`
    extends ScalaInteger with `box.OneLinkedListOfNullable` {

  val scalaClass = "LinkedList[Option[Int]]"

  val defaultValue = "LinkedList[Option[Int]].empty"
}

case object `scala.LinkedList<Integer?>?`
    extends ScalaInteger with `box.NullableLinkedListOfNullable` {

  val scalaClass = "Option[LinkedList[Option[Int]]]"

  val defaultValue = "None"
}

case object `scala.Stack<Integer>`
    extends ScalaInteger with `box.OneStackOfOne` {

  val scalaClass = "Stack[Int]"

  val defaultValue = "Stack[Int].empty"
}

case object `scala.Stack<Integer>?`
    extends ScalaInteger with `box.NullableStackOfOne` {

  val scalaClass = "Option[Stack[Int]]"

  val defaultValue = "None"
}

case object `scala.Stack<Integer?>`
    extends ScalaInteger with `box.OneStackOfNullable` {

  val scalaClass = "Stack[Option[Int]]"

  val defaultValue = "Stack[Option[Int]].empty"
}

case object `scala.Stack<Integer?>?`
    extends ScalaInteger with `box.NullableStackOfNullable` {

  val scalaClass = "Option[Stack[Option[Int]]]"

  val defaultValue = "None"
}

case object `scala.Vector<Integer>`
    extends ScalaInteger with `box.OneVectorOfOne` {

  val scalaClass = "Vector[Int]"

  val defaultValue = "Vector[Int].empty"
}

case object `scala.Vector<Integer>?`
    extends ScalaInteger with `box.NullableVectorOfOne` {

  val scalaClass = "Option[Vector[Int]]"

  val defaultValue = "None"
}

case object `scala.Vector<Integer?>`
    extends ScalaInteger with `box.OneVectorOfNullable` {

  val scalaClass = "Vector[Option[Int]]"

  val defaultValue = "Vector[Option[Int]].empty"
}

case object `scala.Vector<Integer?>?`
    extends ScalaInteger with `box.NullableVectorOfNullable` {

  val scalaClass = "Option[Vector[Option[Int]]]"

  val defaultValue = "None"
}
