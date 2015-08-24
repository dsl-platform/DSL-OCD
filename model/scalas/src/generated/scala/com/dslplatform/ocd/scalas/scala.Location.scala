package com.dslplatform.ocd
package scalas

import types._
import boxes._

sealed abstract class ScalaLocation
    extends OcdScalaBoxType
    with `type.Location`

case object `scala.Location`
    extends ScalaLocation with `box.One` {

  val scalaClass = "java.awt.geom.Point2D"

  val defaultValue = "new java.awt.geom.Point2D.Float"
}

case object `scala.Location?`
    extends ScalaLocation with `box.Nullable` {

  val scalaClass = "Option[java.awt.geom.Point2D]"

  val defaultValue = "None"
}

case object `scala.Location[]`
    extends ScalaLocation with `box.OneArrayOfOne` {

  val scalaClass = "Array[java.awt.geom.Point2D]"

  val defaultValue = "Array[java.awt.geom.Point2D].empty"
}

case object `scala.Location[]?`
    extends ScalaLocation with `box.NullableArrayOfOne` {

  val scalaClass = "Option[Array[java.awt.geom.Point2D]]"

  val defaultValue = "None"
}

case object `scala.Location?[]`
    extends ScalaLocation with `box.OneArrayOfNullable` {

  val scalaClass = "Array[Option[java.awt.geom.Point2D]]"

  val defaultValue = "Array[Option[java.awt.geom.Point2D]].empty"
}

case object `scala.Location?[]?`
    extends ScalaLocation with `box.NullableArrayOfNullable` {

  val scalaClass = "Option[Array[Option[java.awt.geom.Point2D]]]"

  val defaultValue = "None"
}

case object `scala.List<Location>`
    extends ScalaLocation with `box.OneListOfOne` {

  val scalaClass = "IndexedSeq[java.awt.geom.Point2D]"

  val defaultValue = "IndexedSeq[java.awt.geom.Point2D].empty"
}

case object `scala.List<Location>?`
    extends ScalaLocation with `box.NullableListOfOne` {

  val scalaClass = "Option[IndexedSeq[java.awt.geom.Point2D]]"

  val defaultValue = "None"
}

case object `scala.List<Location?>`
    extends ScalaLocation with `box.OneListOfNullable` {

  val scalaClass = "IndexedSeq[Option[java.awt.geom.Point2D]]"

  val defaultValue = "IndexedSeq[Option[java.awt.geom.Point2D]].empty"
}

case object `scala.List<Location?>?`
    extends ScalaLocation with `box.NullableListOfNullable` {

  val scalaClass = "Option[IndexedSeq[Option[java.awt.geom.Point2D]]]"

  val defaultValue = "None"
}

case object `scala.Set<Location>`
    extends ScalaLocation with `box.OneSetOfOne` {

  val scalaClass = "Set[java.awt.geom.Point2D]"

  val defaultValue = "Set[java.awt.geom.Point2D].empty"
}

case object `scala.Set<Location>?`
    extends ScalaLocation with `box.NullableSetOfOne` {

  val scalaClass = "Option[Set[java.awt.geom.Point2D]]"

  val defaultValue = "None"
}

case object `scala.Set<Location?>`
    extends ScalaLocation with `box.OneSetOfNullable` {

  val scalaClass = "Set[Option[java.awt.geom.Point2D]]"

  val defaultValue = "Set[Option[java.awt.geom.Point2D]].empty"
}

case object `scala.Set<Location?>?`
    extends ScalaLocation with `box.NullableSetOfNullable` {

  val scalaClass = "Option[Set[Option[java.awt.geom.Point2D]]]"

  val defaultValue = "None"
}

case object `scala.Queue<Location>`
    extends ScalaLocation with `box.OneQueueOfOne` {

  val scalaClass = "Queue[java.awt.geom.Point2D]"

  val defaultValue = "Queue[java.awt.geom.Point2D].empty"
}

case object `scala.Queue<Location>?`
    extends ScalaLocation with `box.NullableQueueOfOne` {

  val scalaClass = "Option[Queue[java.awt.geom.Point2D]]"

  val defaultValue = "None"
}

case object `scala.Queue<Location?>`
    extends ScalaLocation with `box.OneQueueOfNullable` {

  val scalaClass = "Queue[Option[java.awt.geom.Point2D]]"

  val defaultValue = "Queue[Option[java.awt.geom.Point2D]].empty"
}

case object `scala.Queue<Location?>?`
    extends ScalaLocation with `box.NullableQueueOfNullable` {

  val scalaClass = "Option[Queue[Option[java.awt.geom.Point2D]]]"

  val defaultValue = "None"
}

case object `scala.LinkedList<Location>`
    extends ScalaLocation with `box.OneLinkedListOfOne` {

  val scalaClass = "LinkedList[java.awt.geom.Point2D]"

  val defaultValue = "LinkedList[java.awt.geom.Point2D].empty"
}

case object `scala.LinkedList<Location>?`
    extends ScalaLocation with `box.NullableLinkedListOfOne` {

  val scalaClass = "Option[LinkedList[java.awt.geom.Point2D]]"

  val defaultValue = "None"
}

case object `scala.LinkedList<Location?>`
    extends ScalaLocation with `box.OneLinkedListOfNullable` {

  val scalaClass = "LinkedList[Option[java.awt.geom.Point2D]]"

  val defaultValue = "LinkedList[Option[java.awt.geom.Point2D]].empty"
}

case object `scala.LinkedList<Location?>?`
    extends ScalaLocation with `box.NullableLinkedListOfNullable` {

  val scalaClass = "Option[LinkedList[Option[java.awt.geom.Point2D]]]"

  val defaultValue = "None"
}

case object `scala.Stack<Location>`
    extends ScalaLocation with `box.OneStackOfOne` {

  val scalaClass = "Stack[java.awt.geom.Point2D]"

  val defaultValue = "Stack[java.awt.geom.Point2D].empty"
}

case object `scala.Stack<Location>?`
    extends ScalaLocation with `box.NullableStackOfOne` {

  val scalaClass = "Option[Stack[java.awt.geom.Point2D]]"

  val defaultValue = "None"
}

case object `scala.Stack<Location?>`
    extends ScalaLocation with `box.OneStackOfNullable` {

  val scalaClass = "Stack[Option[java.awt.geom.Point2D]]"

  val defaultValue = "Stack[Option[java.awt.geom.Point2D]].empty"
}

case object `scala.Stack<Location?>?`
    extends ScalaLocation with `box.NullableStackOfNullable` {

  val scalaClass = "Option[Stack[Option[java.awt.geom.Point2D]]]"

  val defaultValue = "None"
}

case object `scala.Vector<Location>`
    extends ScalaLocation with `box.OneVectorOfOne` {

  val scalaClass = "Vector[java.awt.geom.Point2D]"

  val defaultValue = "Vector[java.awt.geom.Point2D].empty"
}

case object `scala.Vector<Location>?`
    extends ScalaLocation with `box.NullableVectorOfOne` {

  val scalaClass = "Option[Vector[java.awt.geom.Point2D]]"

  val defaultValue = "None"
}

case object `scala.Vector<Location?>`
    extends ScalaLocation with `box.OneVectorOfNullable` {

  val scalaClass = "Vector[Option[java.awt.geom.Point2D]]"

  val defaultValue = "Vector[Option[java.awt.geom.Point2D]].empty"
}

case object `scala.Vector<Location?>?`
    extends ScalaLocation with `box.NullableVectorOfNullable` {

  val scalaClass = "Option[Vector[Option[java.awt.geom.Point2D]]]"

  val defaultValue = "None"
}
