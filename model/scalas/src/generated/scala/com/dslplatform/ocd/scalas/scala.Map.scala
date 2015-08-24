package com.dslplatform.ocd
package scalas

import types._
import boxes._

sealed abstract class ScalaMap
    extends OcdScalaBoxType
    with `type.Map`

case object `scala.Map`
    extends ScalaMap with `box.One` {

  val scalaClass = "Map[String, String]"

  val defaultValue = "Map[String, String].empty"
}

case object `scala.Map?`
    extends ScalaMap with `box.Nullable` {

  val scalaClass = "Option[Map[String, String]]"

  val defaultValue = "None"
}

case object `scala.Map[]`
    extends ScalaMap with `box.OneArrayOfOne` {

  val scalaClass = "Array[Map[String, String]]"

  val defaultValue = "Array[Map[String, String]].empty"
}

case object `scala.Map[]?`
    extends ScalaMap with `box.NullableArrayOfOne` {

  val scalaClass = "Option[Array[Map[String, String]]]"

  val defaultValue = "None"
}

case object `scala.Map?[]`
    extends ScalaMap with `box.OneArrayOfNullable` {

  val scalaClass = "Array[Option[Map[String, String]]]"

  val defaultValue = "Array[Option[Map[String, String]]].empty"
}

case object `scala.Map?[]?`
    extends ScalaMap with `box.NullableArrayOfNullable` {

  val scalaClass = "Option[Array[Option[Map[String, String]]]]"

  val defaultValue = "None"
}

case object `scala.List<Map>`
    extends ScalaMap with `box.OneListOfOne` {

  val scalaClass = "IndexedSeq[Map[String, String]]"

  val defaultValue = "IndexedSeq[Map[String, String]].empty"
}

case object `scala.List<Map>?`
    extends ScalaMap with `box.NullableListOfOne` {

  val scalaClass = "Option[IndexedSeq[Map[String, String]]]"

  val defaultValue = "None"
}

case object `scala.List<Map?>`
    extends ScalaMap with `box.OneListOfNullable` {

  val scalaClass = "IndexedSeq[Option[Map[String, String]]]"

  val defaultValue = "IndexedSeq[Option[Map[String, String]]].empty"
}

case object `scala.List<Map?>?`
    extends ScalaMap with `box.NullableListOfNullable` {

  val scalaClass = "Option[IndexedSeq[Option[Map[String, String]]]]"

  val defaultValue = "None"
}

case object `scala.Set<Map>`
    extends ScalaMap with `box.OneSetOfOne` {

  val scalaClass = "Set[Map[String, String]]"

  val defaultValue = "Set[Map[String, String]].empty"
}

case object `scala.Set<Map>?`
    extends ScalaMap with `box.NullableSetOfOne` {

  val scalaClass = "Option[Set[Map[String, String]]]"

  val defaultValue = "None"
}

case object `scala.Set<Map?>`
    extends ScalaMap with `box.OneSetOfNullable` {

  val scalaClass = "Set[Option[Map[String, String]]]"

  val defaultValue = "Set[Option[Map[String, String]]].empty"
}

case object `scala.Set<Map?>?`
    extends ScalaMap with `box.NullableSetOfNullable` {

  val scalaClass = "Option[Set[Option[Map[String, String]]]]"

  val defaultValue = "None"
}

case object `scala.Queue<Map>`
    extends ScalaMap with `box.OneQueueOfOne` {

  val scalaClass = "Queue[Map[String, String]]"

  val defaultValue = "Queue[Map[String, String]].empty"
}

case object `scala.Queue<Map>?`
    extends ScalaMap with `box.NullableQueueOfOne` {

  val scalaClass = "Option[Queue[Map[String, String]]]"

  val defaultValue = "None"
}

case object `scala.Queue<Map?>`
    extends ScalaMap with `box.OneQueueOfNullable` {

  val scalaClass = "Queue[Option[Map[String, String]]]"

  val defaultValue = "Queue[Option[Map[String, String]]].empty"
}

case object `scala.Queue<Map?>?`
    extends ScalaMap with `box.NullableQueueOfNullable` {

  val scalaClass = "Option[Queue[Option[Map[String, String]]]]"

  val defaultValue = "None"
}

case object `scala.LinkedList<Map>`
    extends ScalaMap with `box.OneLinkedListOfOne` {

  val scalaClass = "LinkedList[Map[String, String]]"

  val defaultValue = "LinkedList[Map[String, String]].empty"
}

case object `scala.LinkedList<Map>?`
    extends ScalaMap with `box.NullableLinkedListOfOne` {

  val scalaClass = "Option[LinkedList[Map[String, String]]]"

  val defaultValue = "None"
}

case object `scala.LinkedList<Map?>`
    extends ScalaMap with `box.OneLinkedListOfNullable` {

  val scalaClass = "LinkedList[Option[Map[String, String]]]"

  val defaultValue = "LinkedList[Option[Map[String, String]]].empty"
}

case object `scala.LinkedList<Map?>?`
    extends ScalaMap with `box.NullableLinkedListOfNullable` {

  val scalaClass = "Option[LinkedList[Option[Map[String, String]]]]"

  val defaultValue = "None"
}

case object `scala.Stack<Map>`
    extends ScalaMap with `box.OneStackOfOne` {

  val scalaClass = "Stack[Map[String, String]]"

  val defaultValue = "Stack[Map[String, String]].empty"
}

case object `scala.Stack<Map>?`
    extends ScalaMap with `box.NullableStackOfOne` {

  val scalaClass = "Option[Stack[Map[String, String]]]"

  val defaultValue = "None"
}

case object `scala.Stack<Map?>`
    extends ScalaMap with `box.OneStackOfNullable` {

  val scalaClass = "Stack[Option[Map[String, String]]]"

  val defaultValue = "Stack[Option[Map[String, String]]].empty"
}

case object `scala.Stack<Map?>?`
    extends ScalaMap with `box.NullableStackOfNullable` {

  val scalaClass = "Option[Stack[Option[Map[String, String]]]]"

  val defaultValue = "None"
}

case object `scala.Vector<Map>`
    extends ScalaMap with `box.OneVectorOfOne` {

  val scalaClass = "Vector[Map[String, String]]"

  val defaultValue = "Vector[Map[String, String]].empty"
}

case object `scala.Vector<Map>?`
    extends ScalaMap with `box.NullableVectorOfOne` {

  val scalaClass = "Option[Vector[Map[String, String]]]"

  val defaultValue = "None"
}

case object `scala.Vector<Map?>`
    extends ScalaMap with `box.OneVectorOfNullable` {

  val scalaClass = "Vector[Option[Map[String, String]]]"

  val defaultValue = "Vector[Option[Map[String, String]]].empty"
}

case object `scala.Vector<Map?>?`
    extends ScalaMap with `box.NullableVectorOfNullable` {

  val scalaClass = "Option[Vector[Option[Map[String, String]]]]"

  val defaultValue = "None"
}
