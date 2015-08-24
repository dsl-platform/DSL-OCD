package com.dslplatform.ocd
package scalas

import types._
import boxes._

sealed abstract class ScalaUrl
    extends OcdScalaBoxType
    with `type.Url`

case object `scala.Url`
    extends ScalaUrl with `box.One` {

  val scalaClass = "java.net.URI"

  val defaultValue = "null"
}

case object `scala.Url?`
    extends ScalaUrl with `box.Nullable` {

  val scalaClass = "Option[java.net.URI]"

  val defaultValue = "None"
}

case object `scala.Url[]`
    extends ScalaUrl with `box.OneArrayOfOne` {

  val scalaClass = "Array[java.net.URI]"

  val defaultValue = "Array[java.net.URI].empty"
}

case object `scala.Url[]?`
    extends ScalaUrl with `box.NullableArrayOfOne` {

  val scalaClass = "Option[Array[java.net.URI]]"

  val defaultValue = "None"
}

case object `scala.Url?[]`
    extends ScalaUrl with `box.OneArrayOfNullable` {

  val scalaClass = "Array[Option[java.net.URI]]"

  val defaultValue = "Array[Option[java.net.URI]].empty"
}

case object `scala.Url?[]?`
    extends ScalaUrl with `box.NullableArrayOfNullable` {

  val scalaClass = "Option[Array[Option[java.net.URI]]]"

  val defaultValue = "None"
}

case object `scala.List<Url>`
    extends ScalaUrl with `box.OneListOfOne` {

  val scalaClass = "IndexedSeq[java.net.URI]"

  val defaultValue = "IndexedSeq[java.net.URI].empty"
}

case object `scala.List<Url>?`
    extends ScalaUrl with `box.NullableListOfOne` {

  val scalaClass = "Option[IndexedSeq[java.net.URI]]"

  val defaultValue = "None"
}

case object `scala.List<Url?>`
    extends ScalaUrl with `box.OneListOfNullable` {

  val scalaClass = "IndexedSeq[Option[java.net.URI]]"

  val defaultValue = "IndexedSeq[Option[java.net.URI]].empty"
}

case object `scala.List<Url?>?`
    extends ScalaUrl with `box.NullableListOfNullable` {

  val scalaClass = "Option[IndexedSeq[Option[java.net.URI]]]"

  val defaultValue = "None"
}

case object `scala.Set<Url>`
    extends ScalaUrl with `box.OneSetOfOne` {

  val scalaClass = "Set[java.net.URI]"

  val defaultValue = "Set[java.net.URI].empty"
}

case object `scala.Set<Url>?`
    extends ScalaUrl with `box.NullableSetOfOne` {

  val scalaClass = "Option[Set[java.net.URI]]"

  val defaultValue = "None"
}

case object `scala.Set<Url?>`
    extends ScalaUrl with `box.OneSetOfNullable` {

  val scalaClass = "Set[Option[java.net.URI]]"

  val defaultValue = "Set[Option[java.net.URI]].empty"
}

case object `scala.Set<Url?>?`
    extends ScalaUrl with `box.NullableSetOfNullable` {

  val scalaClass = "Option[Set[Option[java.net.URI]]]"

  val defaultValue = "None"
}

case object `scala.Queue<Url>`
    extends ScalaUrl with `box.OneQueueOfOne` {

  val scalaClass = "Queue[java.net.URI]"

  val defaultValue = "Queue[java.net.URI].empty"
}

case object `scala.Queue<Url>?`
    extends ScalaUrl with `box.NullableQueueOfOne` {

  val scalaClass = "Option[Queue[java.net.URI]]"

  val defaultValue = "None"
}

case object `scala.Queue<Url?>`
    extends ScalaUrl with `box.OneQueueOfNullable` {

  val scalaClass = "Queue[Option[java.net.URI]]"

  val defaultValue = "Queue[Option[java.net.URI]].empty"
}

case object `scala.Queue<Url?>?`
    extends ScalaUrl with `box.NullableQueueOfNullable` {

  val scalaClass = "Option[Queue[Option[java.net.URI]]]"

  val defaultValue = "None"
}

case object `scala.LinkedList<Url>`
    extends ScalaUrl with `box.OneLinkedListOfOne` {

  val scalaClass = "LinkedList[java.net.URI]"

  val defaultValue = "LinkedList[java.net.URI].empty"
}

case object `scala.LinkedList<Url>?`
    extends ScalaUrl with `box.NullableLinkedListOfOne` {

  val scalaClass = "Option[LinkedList[java.net.URI]]"

  val defaultValue = "None"
}

case object `scala.LinkedList<Url?>`
    extends ScalaUrl with `box.OneLinkedListOfNullable` {

  val scalaClass = "LinkedList[Option[java.net.URI]]"

  val defaultValue = "LinkedList[Option[java.net.URI]].empty"
}

case object `scala.LinkedList<Url?>?`
    extends ScalaUrl with `box.NullableLinkedListOfNullable` {

  val scalaClass = "Option[LinkedList[Option[java.net.URI]]]"

  val defaultValue = "None"
}

case object `scala.Stack<Url>`
    extends ScalaUrl with `box.OneStackOfOne` {

  val scalaClass = "Stack[java.net.URI]"

  val defaultValue = "Stack[java.net.URI].empty"
}

case object `scala.Stack<Url>?`
    extends ScalaUrl with `box.NullableStackOfOne` {

  val scalaClass = "Option[Stack[java.net.URI]]"

  val defaultValue = "None"
}

case object `scala.Stack<Url?>`
    extends ScalaUrl with `box.OneStackOfNullable` {

  val scalaClass = "Stack[Option[java.net.URI]]"

  val defaultValue = "Stack[Option[java.net.URI]].empty"
}

case object `scala.Stack<Url?>?`
    extends ScalaUrl with `box.NullableStackOfNullable` {

  val scalaClass = "Option[Stack[Option[java.net.URI]]]"

  val defaultValue = "None"
}

case object `scala.Vector<Url>`
    extends ScalaUrl with `box.OneVectorOfOne` {

  val scalaClass = "Vector[java.net.URI]"

  val defaultValue = "Vector[java.net.URI].empty"
}

case object `scala.Vector<Url>?`
    extends ScalaUrl with `box.NullableVectorOfOne` {

  val scalaClass = "Option[Vector[java.net.URI]]"

  val defaultValue = "None"
}

case object `scala.Vector<Url?>`
    extends ScalaUrl with `box.OneVectorOfNullable` {

  val scalaClass = "Vector[Option[java.net.URI]]"

  val defaultValue = "Vector[Option[java.net.URI]].empty"
}

case object `scala.Vector<Url?>?`
    extends ScalaUrl with `box.NullableVectorOfNullable` {

  val scalaClass = "Option[Vector[Option[java.net.URI]]]"

  val defaultValue = "None"
}
