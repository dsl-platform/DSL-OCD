package com.dslplatform.ocd
package scalas

import types._
import boxes._

sealed abstract class ScalaStringWithMaxLengthOf9
    extends OcdScalaBoxType
    with `type.String(9)`

case object `scala.String(9)`
    extends ScalaStringWithMaxLengthOf9 with `box.One` {

  val scalaClass = "String"

  val defaultValue = ""
}

case object `scala.String(9)?`
    extends ScalaStringWithMaxLengthOf9 with `box.Nullable` {

  val scalaClass = "Option[String]"

  val defaultValue = "None"
}

case object `scala.String(9)[]`
    extends ScalaStringWithMaxLengthOf9 with `box.OneArrayOfOne` {

  val scalaClass = "Array[String]"

  val defaultValue = "Array[String].empty"
}

case object `scala.String(9)[]?`
    extends ScalaStringWithMaxLengthOf9 with `box.NullableArrayOfOne` {

  val scalaClass = "Option[Array[String]]"

  val defaultValue = "None"
}

case object `scala.String(9)?[]`
    extends ScalaStringWithMaxLengthOf9 with `box.OneArrayOfNullable` {

  val scalaClass = "Array[Option[String]]"

  val defaultValue = "Array[Option[String]].empty"
}

case object `scala.String(9)?[]?`
    extends ScalaStringWithMaxLengthOf9 with `box.NullableArrayOfNullable` {

  val scalaClass = "Option[Array[Option[String]]]"

  val defaultValue = "None"
}

case object `scala.List<String(9)>`
    extends ScalaStringWithMaxLengthOf9 with `box.OneListOfOne` {

  val scalaClass = "IndexedSeq[String]"

  val defaultValue = "IndexedSeq[String].empty"
}

case object `scala.List<String(9)>?`
    extends ScalaStringWithMaxLengthOf9 with `box.NullableListOfOne` {

  val scalaClass = "Option[IndexedSeq[String]]"

  val defaultValue = "None"
}

case object `scala.List<String(9)?>`
    extends ScalaStringWithMaxLengthOf9 with `box.OneListOfNullable` {

  val scalaClass = "IndexedSeq[Option[String]]"

  val defaultValue = "IndexedSeq[Option[String]].empty"
}

case object `scala.List<String(9)?>?`
    extends ScalaStringWithMaxLengthOf9 with `box.NullableListOfNullable` {

  val scalaClass = "Option[IndexedSeq[Option[String]]]"

  val defaultValue = "None"
}

case object `scala.Set<String(9)>`
    extends ScalaStringWithMaxLengthOf9 with `box.OneSetOfOne` {

  val scalaClass = "Set[String]"

  val defaultValue = "Set[String].empty"
}

case object `scala.Set<String(9)>?`
    extends ScalaStringWithMaxLengthOf9 with `box.NullableSetOfOne` {

  val scalaClass = "Option[Set[String]]"

  val defaultValue = "None"
}

case object `scala.Set<String(9)?>`
    extends ScalaStringWithMaxLengthOf9 with `box.OneSetOfNullable` {

  val scalaClass = "Set[Option[String]]"

  val defaultValue = "Set[Option[String]].empty"
}

case object `scala.Set<String(9)?>?`
    extends ScalaStringWithMaxLengthOf9 with `box.NullableSetOfNullable` {

  val scalaClass = "Option[Set[Option[String]]]"

  val defaultValue = "None"
}

case object `scala.Queue<String(9)>`
    extends ScalaStringWithMaxLengthOf9 with `box.OneQueueOfOne` {

  val scalaClass = "Queue[String]"

  val defaultValue = "Queue[String].empty"
}

case object `scala.Queue<String(9)>?`
    extends ScalaStringWithMaxLengthOf9 with `box.NullableQueueOfOne` {

  val scalaClass = "Option[Queue[String]]"

  val defaultValue = "None"
}

case object `scala.Queue<String(9)?>`
    extends ScalaStringWithMaxLengthOf9 with `box.OneQueueOfNullable` {

  val scalaClass = "Queue[Option[String]]"

  val defaultValue = "Queue[Option[String]].empty"
}

case object `scala.Queue<String(9)?>?`
    extends ScalaStringWithMaxLengthOf9 with `box.NullableQueueOfNullable` {

  val scalaClass = "Option[Queue[Option[String]]]"

  val defaultValue = "None"
}

case object `scala.LinkedList<String(9)>`
    extends ScalaStringWithMaxLengthOf9 with `box.OneLinkedListOfOne` {

  val scalaClass = "LinkedList[String]"

  val defaultValue = "LinkedList[String].empty"
}

case object `scala.LinkedList<String(9)>?`
    extends ScalaStringWithMaxLengthOf9 with `box.NullableLinkedListOfOne` {

  val scalaClass = "Option[LinkedList[String]]"

  val defaultValue = "None"
}

case object `scala.LinkedList<String(9)?>`
    extends ScalaStringWithMaxLengthOf9 with `box.OneLinkedListOfNullable` {

  val scalaClass = "LinkedList[Option[String]]"

  val defaultValue = "LinkedList[Option[String]].empty"
}

case object `scala.LinkedList<String(9)?>?`
    extends ScalaStringWithMaxLengthOf9 with `box.NullableLinkedListOfNullable` {

  val scalaClass = "Option[LinkedList[Option[String]]]"

  val defaultValue = "None"
}

case object `scala.Stack<String(9)>`
    extends ScalaStringWithMaxLengthOf9 with `box.OneStackOfOne` {

  val scalaClass = "Stack[String]"

  val defaultValue = "Stack[String].empty"
}

case object `scala.Stack<String(9)>?`
    extends ScalaStringWithMaxLengthOf9 with `box.NullableStackOfOne` {

  val scalaClass = "Option[Stack[String]]"

  val defaultValue = "None"
}

case object `scala.Stack<String(9)?>`
    extends ScalaStringWithMaxLengthOf9 with `box.OneStackOfNullable` {

  val scalaClass = "Stack[Option[String]]"

  val defaultValue = "Stack[Option[String]].empty"
}

case object `scala.Stack<String(9)?>?`
    extends ScalaStringWithMaxLengthOf9 with `box.NullableStackOfNullable` {

  val scalaClass = "Option[Stack[Option[String]]]"

  val defaultValue = "None"
}

case object `scala.Vector<String(9)>`
    extends ScalaStringWithMaxLengthOf9 with `box.OneVectorOfOne` {

  val scalaClass = "Vector[String]"

  val defaultValue = "Vector[String].empty"
}

case object `scala.Vector<String(9)>?`
    extends ScalaStringWithMaxLengthOf9 with `box.NullableVectorOfOne` {

  val scalaClass = "Option[Vector[String]]"

  val defaultValue = "None"
}

case object `scala.Vector<String(9)?>`
    extends ScalaStringWithMaxLengthOf9 with `box.OneVectorOfNullable` {

  val scalaClass = "Vector[Option[String]]"

  val defaultValue = "Vector[Option[String]].empty"
}

case object `scala.Vector<String(9)?>?`
    extends ScalaStringWithMaxLengthOf9 with `box.NullableVectorOfNullable` {

  val scalaClass = "Option[Vector[Option[String]]]"

  val defaultValue = "None"
}
