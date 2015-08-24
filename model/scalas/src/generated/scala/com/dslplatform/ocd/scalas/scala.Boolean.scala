package com.dslplatform.ocd
package scalas

import types._
import boxes._

sealed abstract class ScalaBoolean
    extends OcdScalaBoxType
    with `type.Boolean`

case object `scala.Boolean`
    extends ScalaBoolean with `box.One` {

  val scalaClass = "Boolean"

  val defaultValue = "false"
}

case object `scala.Boolean?`
    extends ScalaBoolean with `box.Nullable` {

  val scalaClass = "Option[Boolean]"

  val defaultValue = "None"
}

case object `scala.Boolean[]`
    extends ScalaBoolean with `box.OneArrayOfOne` {

  val scalaClass = "Array[Boolean]"

  val defaultValue = "Array[Boolean].empty"
}

case object `scala.Boolean[]?`
    extends ScalaBoolean with `box.NullableArrayOfOne` {

  val scalaClass = "Option[Array[Boolean]]"

  val defaultValue = "None"
}

case object `scala.Boolean?[]`
    extends ScalaBoolean with `box.OneArrayOfNullable` {

  val scalaClass = "Array[Option[Boolean]]"

  val defaultValue = "Array[Option[Boolean]].empty"
}

case object `scala.Boolean?[]?`
    extends ScalaBoolean with `box.NullableArrayOfNullable` {

  val scalaClass = "Option[Array[Option[Boolean]]]"

  val defaultValue = "None"
}

case object `scala.List<Boolean>`
    extends ScalaBoolean with `box.OneListOfOne` {

  val scalaClass = "IndexedSeq[Boolean]"

  val defaultValue = "IndexedSeq[Boolean].empty"
}

case object `scala.List<Boolean>?`
    extends ScalaBoolean with `box.NullableListOfOne` {

  val scalaClass = "Option[IndexedSeq[Boolean]]"

  val defaultValue = "None"
}

case object `scala.List<Boolean?>`
    extends ScalaBoolean with `box.OneListOfNullable` {

  val scalaClass = "IndexedSeq[Option[Boolean]]"

  val defaultValue = "IndexedSeq[Option[Boolean]].empty"
}

case object `scala.List<Boolean?>?`
    extends ScalaBoolean with `box.NullableListOfNullable` {

  val scalaClass = "Option[IndexedSeq[Option[Boolean]]]"

  val defaultValue = "None"
}

case object `scala.Set<Boolean>`
    extends ScalaBoolean with `box.OneSetOfOne` {

  val scalaClass = "Set[Boolean]"

  val defaultValue = "Set[Boolean].empty"
}

case object `scala.Set<Boolean>?`
    extends ScalaBoolean with `box.NullableSetOfOne` {

  val scalaClass = "Option[Set[Boolean]]"

  val defaultValue = "None"
}

case object `scala.Set<Boolean?>`
    extends ScalaBoolean with `box.OneSetOfNullable` {

  val scalaClass = "Set[Option[Boolean]]"

  val defaultValue = "Set[Option[Boolean]].empty"
}

case object `scala.Set<Boolean?>?`
    extends ScalaBoolean with `box.NullableSetOfNullable` {

  val scalaClass = "Option[Set[Option[Boolean]]]"

  val defaultValue = "None"
}

case object `scala.Queue<Boolean>`
    extends ScalaBoolean with `box.OneQueueOfOne` {

  val scalaClass = "Queue[Boolean]"

  val defaultValue = "Queue[Boolean].empty"
}

case object `scala.Queue<Boolean>?`
    extends ScalaBoolean with `box.NullableQueueOfOne` {

  val scalaClass = "Option[Queue[Boolean]]"

  val defaultValue = "None"
}

case object `scala.Queue<Boolean?>`
    extends ScalaBoolean with `box.OneQueueOfNullable` {

  val scalaClass = "Queue[Option[Boolean]]"

  val defaultValue = "Queue[Option[Boolean]].empty"
}

case object `scala.Queue<Boolean?>?`
    extends ScalaBoolean with `box.NullableQueueOfNullable` {

  val scalaClass = "Option[Queue[Option[Boolean]]]"

  val defaultValue = "None"
}

case object `scala.LinkedList<Boolean>`
    extends ScalaBoolean with `box.OneLinkedListOfOne` {

  val scalaClass = "LinkedList[Boolean]"

  val defaultValue = "LinkedList[Boolean].empty"
}

case object `scala.LinkedList<Boolean>?`
    extends ScalaBoolean with `box.NullableLinkedListOfOne` {

  val scalaClass = "Option[LinkedList[Boolean]]"

  val defaultValue = "None"
}

case object `scala.LinkedList<Boolean?>`
    extends ScalaBoolean with `box.OneLinkedListOfNullable` {

  val scalaClass = "LinkedList[Option[Boolean]]"

  val defaultValue = "LinkedList[Option[Boolean]].empty"
}

case object `scala.LinkedList<Boolean?>?`
    extends ScalaBoolean with `box.NullableLinkedListOfNullable` {

  val scalaClass = "Option[LinkedList[Option[Boolean]]]"

  val defaultValue = "None"
}

case object `scala.Stack<Boolean>`
    extends ScalaBoolean with `box.OneStackOfOne` {

  val scalaClass = "Stack[Boolean]"

  val defaultValue = "Stack[Boolean].empty"
}

case object `scala.Stack<Boolean>?`
    extends ScalaBoolean with `box.NullableStackOfOne` {

  val scalaClass = "Option[Stack[Boolean]]"

  val defaultValue = "None"
}

case object `scala.Stack<Boolean?>`
    extends ScalaBoolean with `box.OneStackOfNullable` {

  val scalaClass = "Stack[Option[Boolean]]"

  val defaultValue = "Stack[Option[Boolean]].empty"
}

case object `scala.Stack<Boolean?>?`
    extends ScalaBoolean with `box.NullableStackOfNullable` {

  val scalaClass = "Option[Stack[Option[Boolean]]]"

  val defaultValue = "None"
}

case object `scala.Vector<Boolean>`
    extends ScalaBoolean with `box.OneVectorOfOne` {

  val scalaClass = "Vector[Boolean]"

  val defaultValue = "Vector[Boolean].empty"
}

case object `scala.Vector<Boolean>?`
    extends ScalaBoolean with `box.NullableVectorOfOne` {

  val scalaClass = "Option[Vector[Boolean]]"

  val defaultValue = "None"
}

case object `scala.Vector<Boolean?>`
    extends ScalaBoolean with `box.OneVectorOfNullable` {

  val scalaClass = "Vector[Option[Boolean]]"

  val defaultValue = "Vector[Option[Boolean]].empty"
}

case object `scala.Vector<Boolean?>?`
    extends ScalaBoolean with `box.NullableVectorOfNullable` {

  val scalaClass = "Option[Vector[Option[Boolean]]]"

  val defaultValue = "None"
}
