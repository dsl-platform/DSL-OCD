package com.dslplatform.ocd
package scalas

import types._
import boxes._

sealed abstract class ScalaString
    extends OcdScalaBoxType
    with `type.String`

case object `scala.String`
    extends ScalaString with `box.One` {

  val scalaClass = "String"

  val defaultValue = ""
}

case object `scala.String?`
    extends ScalaString with `box.Nullable` {

  val scalaClass = "Option[String]"

  val defaultValue = "None"
}

case object `scala.String[]`
    extends ScalaString with `box.OneArrayOfOne` {

  val scalaClass = "Array[String]"

  val defaultValue = "Array[String].empty"
}

case object `scala.String[]?`
    extends ScalaString with `box.NullableArrayOfOne` {

  val scalaClass = "Option[Array[String]]"

  val defaultValue = "None"
}

case object `scala.String?[]`
    extends ScalaString with `box.OneArrayOfNullable` {

  val scalaClass = "Array[Option[String]]"

  val defaultValue = "Array[Option[String]].empty"
}

case object `scala.String?[]?`
    extends ScalaString with `box.NullableArrayOfNullable` {

  val scalaClass = "Option[Array[Option[String]]]"

  val defaultValue = "None"
}

case object `scala.List<String>`
    extends ScalaString with `box.OneListOfOne` {

  val scalaClass = "IndexedSeq[String]"

  val defaultValue = "IndexedSeq[String].empty"
}

case object `scala.List<String>?`
    extends ScalaString with `box.NullableListOfOne` {

  val scalaClass = "Option[IndexedSeq[String]]"

  val defaultValue = "None"
}

case object `scala.List<String?>`
    extends ScalaString with `box.OneListOfNullable` {

  val scalaClass = "IndexedSeq[Option[String]]"

  val defaultValue = "IndexedSeq[Option[String]].empty"
}

case object `scala.List<String?>?`
    extends ScalaString with `box.NullableListOfNullable` {

  val scalaClass = "Option[IndexedSeq[Option[String]]]"

  val defaultValue = "None"
}

case object `scala.Set<String>`
    extends ScalaString with `box.OneSetOfOne` {

  val scalaClass = "Set[String]"

  val defaultValue = "Set[String].empty"
}

case object `scala.Set<String>?`
    extends ScalaString with `box.NullableSetOfOne` {

  val scalaClass = "Option[Set[String]]"

  val defaultValue = "None"
}

case object `scala.Set<String?>`
    extends ScalaString with `box.OneSetOfNullable` {

  val scalaClass = "Set[Option[String]]"

  val defaultValue = "Set[Option[String]].empty"
}

case object `scala.Set<String?>?`
    extends ScalaString with `box.NullableSetOfNullable` {

  val scalaClass = "Option[Set[Option[String]]]"

  val defaultValue = "None"
}

case object `scala.Queue<String>`
    extends ScalaString with `box.OneQueueOfOne` {

  val scalaClass = "Queue[String]"

  val defaultValue = "Queue[String].empty"
}

case object `scala.Queue<String>?`
    extends ScalaString with `box.NullableQueueOfOne` {

  val scalaClass = "Option[Queue[String]]"

  val defaultValue = "None"
}

case object `scala.Queue<String?>`
    extends ScalaString with `box.OneQueueOfNullable` {

  val scalaClass = "Queue[Option[String]]"

  val defaultValue = "Queue[Option[String]].empty"
}

case object `scala.Queue<String?>?`
    extends ScalaString with `box.NullableQueueOfNullable` {

  val scalaClass = "Option[Queue[Option[String]]]"

  val defaultValue = "None"
}

case object `scala.LinkedList<String>`
    extends ScalaString with `box.OneLinkedListOfOne` {

  val scalaClass = "LinkedList[String]"

  val defaultValue = "LinkedList[String].empty"
}

case object `scala.LinkedList<String>?`
    extends ScalaString with `box.NullableLinkedListOfOne` {

  val scalaClass = "Option[LinkedList[String]]"

  val defaultValue = "None"
}

case object `scala.LinkedList<String?>`
    extends ScalaString with `box.OneLinkedListOfNullable` {

  val scalaClass = "LinkedList[Option[String]]"

  val defaultValue = "LinkedList[Option[String]].empty"
}

case object `scala.LinkedList<String?>?`
    extends ScalaString with `box.NullableLinkedListOfNullable` {

  val scalaClass = "Option[LinkedList[Option[String]]]"

  val defaultValue = "None"
}

case object `scala.Stack<String>`
    extends ScalaString with `box.OneStackOfOne` {

  val scalaClass = "Stack[String]"

  val defaultValue = "Stack[String].empty"
}

case object `scala.Stack<String>?`
    extends ScalaString with `box.NullableStackOfOne` {

  val scalaClass = "Option[Stack[String]]"

  val defaultValue = "None"
}

case object `scala.Stack<String?>`
    extends ScalaString with `box.OneStackOfNullable` {

  val scalaClass = "Stack[Option[String]]"

  val defaultValue = "Stack[Option[String]].empty"
}

case object `scala.Stack<String?>?`
    extends ScalaString with `box.NullableStackOfNullable` {

  val scalaClass = "Option[Stack[Option[String]]]"

  val defaultValue = "None"
}

case object `scala.Vector<String>`
    extends ScalaString with `box.OneVectorOfOne` {

  val scalaClass = "Vector[String]"

  val defaultValue = "Vector[String].empty"
}

case object `scala.Vector<String>?`
    extends ScalaString with `box.NullableVectorOfOne` {

  val scalaClass = "Option[Vector[String]]"

  val defaultValue = "None"
}

case object `scala.Vector<String?>`
    extends ScalaString with `box.OneVectorOfNullable` {

  val scalaClass = "Vector[Option[String]]"

  val defaultValue = "Vector[Option[String]].empty"
}

case object `scala.Vector<String?>?`
    extends ScalaString with `box.NullableVectorOfNullable` {

  val scalaClass = "Option[Vector[Option[String]]]"

  val defaultValue = "None"
}
