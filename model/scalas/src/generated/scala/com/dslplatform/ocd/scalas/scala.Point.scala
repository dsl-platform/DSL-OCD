package com.dslplatform.ocd
package scalas

import types._
import boxes._

sealed abstract class ScalaPoint
    extends OcdScalaBoxType
    with `type.Point`

case object `scala.Point`
    extends ScalaPoint with `box.One` {

  val scalaClass = "java.awt.Point"

  val defaultValue = "new java.awt.Point"
}

case object `scala.Point?`
    extends ScalaPoint with `box.Nullable` {

  val scalaClass = "Option[java.awt.Point]"

  val defaultValue = "None"
}

case object `scala.Point[]`
    extends ScalaPoint with `box.OneArrayOfOne` {

  val scalaClass = "Array[java.awt.Point]"

  val defaultValue = "Array[java.awt.Point].empty"
}

case object `scala.Point[]?`
    extends ScalaPoint with `box.NullableArrayOfOne` {

  val scalaClass = "Option[Array[java.awt.Point]]"

  val defaultValue = "None"
}

case object `scala.Point?[]`
    extends ScalaPoint with `box.OneArrayOfNullable` {

  val scalaClass = "Array[Option[java.awt.Point]]"

  val defaultValue = "Array[Option[java.awt.Point]].empty"
}

case object `scala.Point?[]?`
    extends ScalaPoint with `box.NullableArrayOfNullable` {

  val scalaClass = "Option[Array[Option[java.awt.Point]]]"

  val defaultValue = "None"
}

case object `scala.List<Point>`
    extends ScalaPoint with `box.OneListOfOne` {

  val scalaClass = "IndexedSeq[java.awt.Point]"

  val defaultValue = "IndexedSeq[java.awt.Point].empty"
}

case object `scala.List<Point>?`
    extends ScalaPoint with `box.NullableListOfOne` {

  val scalaClass = "Option[IndexedSeq[java.awt.Point]]"

  val defaultValue = "None"
}

case object `scala.List<Point?>`
    extends ScalaPoint with `box.OneListOfNullable` {

  val scalaClass = "IndexedSeq[Option[java.awt.Point]]"

  val defaultValue = "IndexedSeq[Option[java.awt.Point]].empty"
}

case object `scala.List<Point?>?`
    extends ScalaPoint with `box.NullableListOfNullable` {

  val scalaClass = "Option[IndexedSeq[Option[java.awt.Point]]]"

  val defaultValue = "None"
}

case object `scala.Set<Point>`
    extends ScalaPoint with `box.OneSetOfOne` {

  val scalaClass = "Set[java.awt.Point]"

  val defaultValue = "Set[java.awt.Point].empty"
}

case object `scala.Set<Point>?`
    extends ScalaPoint with `box.NullableSetOfOne` {

  val scalaClass = "Option[Set[java.awt.Point]]"

  val defaultValue = "None"
}

case object `scala.Set<Point?>`
    extends ScalaPoint with `box.OneSetOfNullable` {

  val scalaClass = "Set[Option[java.awt.Point]]"

  val defaultValue = "Set[Option[java.awt.Point]].empty"
}

case object `scala.Set<Point?>?`
    extends ScalaPoint with `box.NullableSetOfNullable` {

  val scalaClass = "Option[Set[Option[java.awt.Point]]]"

  val defaultValue = "None"
}

case object `scala.Queue<Point>`
    extends ScalaPoint with `box.OneQueueOfOne` {

  val scalaClass = "Queue[java.awt.Point]"

  val defaultValue = "Queue[java.awt.Point].empty"
}

case object `scala.Queue<Point>?`
    extends ScalaPoint with `box.NullableQueueOfOne` {

  val scalaClass = "Option[Queue[java.awt.Point]]"

  val defaultValue = "None"
}

case object `scala.Queue<Point?>`
    extends ScalaPoint with `box.OneQueueOfNullable` {

  val scalaClass = "Queue[Option[java.awt.Point]]"

  val defaultValue = "Queue[Option[java.awt.Point]].empty"
}

case object `scala.Queue<Point?>?`
    extends ScalaPoint with `box.NullableQueueOfNullable` {

  val scalaClass = "Option[Queue[Option[java.awt.Point]]]"

  val defaultValue = "None"
}

case object `scala.LinkedList<Point>`
    extends ScalaPoint with `box.OneLinkedListOfOne` {

  val scalaClass = "LinkedList[java.awt.Point]"

  val defaultValue = "LinkedList[java.awt.Point].empty"
}

case object `scala.LinkedList<Point>?`
    extends ScalaPoint with `box.NullableLinkedListOfOne` {

  val scalaClass = "Option[LinkedList[java.awt.Point]]"

  val defaultValue = "None"
}

case object `scala.LinkedList<Point?>`
    extends ScalaPoint with `box.OneLinkedListOfNullable` {

  val scalaClass = "LinkedList[Option[java.awt.Point]]"

  val defaultValue = "LinkedList[Option[java.awt.Point]].empty"
}

case object `scala.LinkedList<Point?>?`
    extends ScalaPoint with `box.NullableLinkedListOfNullable` {

  val scalaClass = "Option[LinkedList[Option[java.awt.Point]]]"

  val defaultValue = "None"
}

case object `scala.Stack<Point>`
    extends ScalaPoint with `box.OneStackOfOne` {

  val scalaClass = "Stack[java.awt.Point]"

  val defaultValue = "Stack[java.awt.Point].empty"
}

case object `scala.Stack<Point>?`
    extends ScalaPoint with `box.NullableStackOfOne` {

  val scalaClass = "Option[Stack[java.awt.Point]]"

  val defaultValue = "None"
}

case object `scala.Stack<Point?>`
    extends ScalaPoint with `box.OneStackOfNullable` {

  val scalaClass = "Stack[Option[java.awt.Point]]"

  val defaultValue = "Stack[Option[java.awt.Point]].empty"
}

case object `scala.Stack<Point?>?`
    extends ScalaPoint with `box.NullableStackOfNullable` {

  val scalaClass = "Option[Stack[Option[java.awt.Point]]]"

  val defaultValue = "None"
}

case object `scala.Vector<Point>`
    extends ScalaPoint with `box.OneVectorOfOne` {

  val scalaClass = "Vector[java.awt.Point]"

  val defaultValue = "Vector[java.awt.Point].empty"
}

case object `scala.Vector<Point>?`
    extends ScalaPoint with `box.NullableVectorOfOne` {

  val scalaClass = "Option[Vector[java.awt.Point]]"

  val defaultValue = "None"
}

case object `scala.Vector<Point?>`
    extends ScalaPoint with `box.OneVectorOfNullable` {

  val scalaClass = "Vector[Option[java.awt.Point]]"

  val defaultValue = "Vector[Option[java.awt.Point]].empty"
}

case object `scala.Vector<Point?>?`
    extends ScalaPoint with `box.NullableVectorOfNullable` {

  val scalaClass = "Option[Vector[Option[java.awt.Point]]]"

  val defaultValue = "None"
}
