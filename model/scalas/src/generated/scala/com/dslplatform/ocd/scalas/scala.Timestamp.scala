package com.dslplatform.ocd
package scalas

import types._
import boxes._

sealed abstract class ScalaTimestamp
    extends OcdScalaBoxType
    with `type.Timestamp`

case object `scala.Timestamp`
    extends ScalaTimestamp with `box.One` {

  val scalaClass = "org.joda.time.DateTime"

  val defaultValue = "org.joda.time.DateTime.now"
}

case object `scala.Timestamp?`
    extends ScalaTimestamp with `box.Nullable` {

  val scalaClass = "Option[org.joda.time.DateTime]"

  val defaultValue = "None"
}

case object `scala.Timestamp[]`
    extends ScalaTimestamp with `box.OneArrayOfOne` {

  val scalaClass = "Array[org.joda.time.DateTime]"

  val defaultValue = "Array[org.joda.time.DateTime].empty"
}

case object `scala.Timestamp[]?`
    extends ScalaTimestamp with `box.NullableArrayOfOne` {

  val scalaClass = "Option[Array[org.joda.time.DateTime]]"

  val defaultValue = "None"
}

case object `scala.Timestamp?[]`
    extends ScalaTimestamp with `box.OneArrayOfNullable` {

  val scalaClass = "Array[Option[org.joda.time.DateTime]]"

  val defaultValue = "Array[Option[org.joda.time.DateTime]].empty"
}

case object `scala.Timestamp?[]?`
    extends ScalaTimestamp with `box.NullableArrayOfNullable` {

  val scalaClass = "Option[Array[Option[org.joda.time.DateTime]]]"

  val defaultValue = "None"
}

case object `scala.List<Timestamp>`
    extends ScalaTimestamp with `box.OneListOfOne` {

  val scalaClass = "IndexedSeq[org.joda.time.DateTime]"

  val defaultValue = "IndexedSeq[org.joda.time.DateTime].empty"
}

case object `scala.List<Timestamp>?`
    extends ScalaTimestamp with `box.NullableListOfOne` {

  val scalaClass = "Option[IndexedSeq[org.joda.time.DateTime]]"

  val defaultValue = "None"
}

case object `scala.List<Timestamp?>`
    extends ScalaTimestamp with `box.OneListOfNullable` {

  val scalaClass = "IndexedSeq[Option[org.joda.time.DateTime]]"

  val defaultValue = "IndexedSeq[Option[org.joda.time.DateTime]].empty"
}

case object `scala.List<Timestamp?>?`
    extends ScalaTimestamp with `box.NullableListOfNullable` {

  val scalaClass = "Option[IndexedSeq[Option[org.joda.time.DateTime]]]"

  val defaultValue = "None"
}

case object `scala.Set<Timestamp>`
    extends ScalaTimestamp with `box.OneSetOfOne` {

  val scalaClass = "Set[org.joda.time.DateTime]"

  val defaultValue = "Set[org.joda.time.DateTime].empty"
}

case object `scala.Set<Timestamp>?`
    extends ScalaTimestamp with `box.NullableSetOfOne` {

  val scalaClass = "Option[Set[org.joda.time.DateTime]]"

  val defaultValue = "None"
}

case object `scala.Set<Timestamp?>`
    extends ScalaTimestamp with `box.OneSetOfNullable` {

  val scalaClass = "Set[Option[org.joda.time.DateTime]]"

  val defaultValue = "Set[Option[org.joda.time.DateTime]].empty"
}

case object `scala.Set<Timestamp?>?`
    extends ScalaTimestamp with `box.NullableSetOfNullable` {

  val scalaClass = "Option[Set[Option[org.joda.time.DateTime]]]"

  val defaultValue = "None"
}

case object `scala.Queue<Timestamp>`
    extends ScalaTimestamp with `box.OneQueueOfOne` {

  val scalaClass = "Queue[org.joda.time.DateTime]"

  val defaultValue = "Queue[org.joda.time.DateTime].empty"
}

case object `scala.Queue<Timestamp>?`
    extends ScalaTimestamp with `box.NullableQueueOfOne` {

  val scalaClass = "Option[Queue[org.joda.time.DateTime]]"

  val defaultValue = "None"
}

case object `scala.Queue<Timestamp?>`
    extends ScalaTimestamp with `box.OneQueueOfNullable` {

  val scalaClass = "Queue[Option[org.joda.time.DateTime]]"

  val defaultValue = "Queue[Option[org.joda.time.DateTime]].empty"
}

case object `scala.Queue<Timestamp?>?`
    extends ScalaTimestamp with `box.NullableQueueOfNullable` {

  val scalaClass = "Option[Queue[Option[org.joda.time.DateTime]]]"

  val defaultValue = "None"
}

case object `scala.LinkedList<Timestamp>`
    extends ScalaTimestamp with `box.OneLinkedListOfOne` {

  val scalaClass = "LinkedList[org.joda.time.DateTime]"

  val defaultValue = "LinkedList[org.joda.time.DateTime].empty"
}

case object `scala.LinkedList<Timestamp>?`
    extends ScalaTimestamp with `box.NullableLinkedListOfOne` {

  val scalaClass = "Option[LinkedList[org.joda.time.DateTime]]"

  val defaultValue = "None"
}

case object `scala.LinkedList<Timestamp?>`
    extends ScalaTimestamp with `box.OneLinkedListOfNullable` {

  val scalaClass = "LinkedList[Option[org.joda.time.DateTime]]"

  val defaultValue = "LinkedList[Option[org.joda.time.DateTime]].empty"
}

case object `scala.LinkedList<Timestamp?>?`
    extends ScalaTimestamp with `box.NullableLinkedListOfNullable` {

  val scalaClass = "Option[LinkedList[Option[org.joda.time.DateTime]]]"

  val defaultValue = "None"
}

case object `scala.Stack<Timestamp>`
    extends ScalaTimestamp with `box.OneStackOfOne` {

  val scalaClass = "Stack[org.joda.time.DateTime]"

  val defaultValue = "Stack[org.joda.time.DateTime].empty"
}

case object `scala.Stack<Timestamp>?`
    extends ScalaTimestamp with `box.NullableStackOfOne` {

  val scalaClass = "Option[Stack[org.joda.time.DateTime]]"

  val defaultValue = "None"
}

case object `scala.Stack<Timestamp?>`
    extends ScalaTimestamp with `box.OneStackOfNullable` {

  val scalaClass = "Stack[Option[org.joda.time.DateTime]]"

  val defaultValue = "Stack[Option[org.joda.time.DateTime]].empty"
}

case object `scala.Stack<Timestamp?>?`
    extends ScalaTimestamp with `box.NullableStackOfNullable` {

  val scalaClass = "Option[Stack[Option[org.joda.time.DateTime]]]"

  val defaultValue = "None"
}

case object `scala.Vector<Timestamp>`
    extends ScalaTimestamp with `box.OneVectorOfOne` {

  val scalaClass = "Vector[org.joda.time.DateTime]"

  val defaultValue = "Vector[org.joda.time.DateTime].empty"
}

case object `scala.Vector<Timestamp>?`
    extends ScalaTimestamp with `box.NullableVectorOfOne` {

  val scalaClass = "Option[Vector[org.joda.time.DateTime]]"

  val defaultValue = "None"
}

case object `scala.Vector<Timestamp?>`
    extends ScalaTimestamp with `box.OneVectorOfNullable` {

  val scalaClass = "Vector[Option[org.joda.time.DateTime]]"

  val defaultValue = "Vector[Option[org.joda.time.DateTime]].empty"
}

case object `scala.Vector<Timestamp?>?`
    extends ScalaTimestamp with `box.NullableVectorOfNullable` {

  val scalaClass = "Option[Vector[Option[org.joda.time.DateTime]]]"

  val defaultValue = "None"
}
