package com.dslplatform.ocd
package scalas

import types._
import boxes._

sealed abstract class ScalaGuid
    extends OcdScalaBoxType
    with `type.Guid`

case object `scala.Guid`
    extends ScalaGuid with `box.One` {

  val scalaClass = "java.util.UUID"

  val defaultValue = "java.util.UUID.randomUUID"
}

case object `scala.Guid?`
    extends ScalaGuid with `box.Nullable` {

  val scalaClass = "Option[java.util.UUID]"

  val defaultValue = "None"
}

case object `scala.Guid[]`
    extends ScalaGuid with `box.OneArrayOfOne` {

  val scalaClass = "Array[java.util.UUID]"

  val defaultValue = "Array[java.util.UUID].empty"
}

case object `scala.Guid[]?`
    extends ScalaGuid with `box.NullableArrayOfOne` {

  val scalaClass = "Option[Array[java.util.UUID]]"

  val defaultValue = "None"
}

case object `scala.Guid?[]`
    extends ScalaGuid with `box.OneArrayOfNullable` {

  val scalaClass = "Array[Option[java.util.UUID]]"

  val defaultValue = "Array[Option[java.util.UUID]].empty"
}

case object `scala.Guid?[]?`
    extends ScalaGuid with `box.NullableArrayOfNullable` {

  val scalaClass = "Option[Array[Option[java.util.UUID]]]"

  val defaultValue = "None"
}

case object `scala.List<Guid>`
    extends ScalaGuid with `box.OneListOfOne` {

  val scalaClass = "IndexedSeq[java.util.UUID]"

  val defaultValue = "IndexedSeq[java.util.UUID].empty"
}

case object `scala.List<Guid>?`
    extends ScalaGuid with `box.NullableListOfOne` {

  val scalaClass = "Option[IndexedSeq[java.util.UUID]]"

  val defaultValue = "None"
}

case object `scala.List<Guid?>`
    extends ScalaGuid with `box.OneListOfNullable` {

  val scalaClass = "IndexedSeq[Option[java.util.UUID]]"

  val defaultValue = "IndexedSeq[Option[java.util.UUID]].empty"
}

case object `scala.List<Guid?>?`
    extends ScalaGuid with `box.NullableListOfNullable` {

  val scalaClass = "Option[IndexedSeq[Option[java.util.UUID]]]"

  val defaultValue = "None"
}

case object `scala.Set<Guid>`
    extends ScalaGuid with `box.OneSetOfOne` {

  val scalaClass = "Set[java.util.UUID]"

  val defaultValue = "Set[java.util.UUID].empty"
}

case object `scala.Set<Guid>?`
    extends ScalaGuid with `box.NullableSetOfOne` {

  val scalaClass = "Option[Set[java.util.UUID]]"

  val defaultValue = "None"
}

case object `scala.Set<Guid?>`
    extends ScalaGuid with `box.OneSetOfNullable` {

  val scalaClass = "Set[Option[java.util.UUID]]"

  val defaultValue = "Set[Option[java.util.UUID]].empty"
}

case object `scala.Set<Guid?>?`
    extends ScalaGuid with `box.NullableSetOfNullable` {

  val scalaClass = "Option[Set[Option[java.util.UUID]]]"

  val defaultValue = "None"
}

case object `scala.Queue<Guid>`
    extends ScalaGuid with `box.OneQueueOfOne` {

  val scalaClass = "Queue[java.util.UUID]"

  val defaultValue = "Queue[java.util.UUID].empty"
}

case object `scala.Queue<Guid>?`
    extends ScalaGuid with `box.NullableQueueOfOne` {

  val scalaClass = "Option[Queue[java.util.UUID]]"

  val defaultValue = "None"
}

case object `scala.Queue<Guid?>`
    extends ScalaGuid with `box.OneQueueOfNullable` {

  val scalaClass = "Queue[Option[java.util.UUID]]"

  val defaultValue = "Queue[Option[java.util.UUID]].empty"
}

case object `scala.Queue<Guid?>?`
    extends ScalaGuid with `box.NullableQueueOfNullable` {

  val scalaClass = "Option[Queue[Option[java.util.UUID]]]"

  val defaultValue = "None"
}

case object `scala.LinkedList<Guid>`
    extends ScalaGuid with `box.OneLinkedListOfOne` {

  val scalaClass = "LinkedList[java.util.UUID]"

  val defaultValue = "LinkedList[java.util.UUID].empty"
}

case object `scala.LinkedList<Guid>?`
    extends ScalaGuid with `box.NullableLinkedListOfOne` {

  val scalaClass = "Option[LinkedList[java.util.UUID]]"

  val defaultValue = "None"
}

case object `scala.LinkedList<Guid?>`
    extends ScalaGuid with `box.OneLinkedListOfNullable` {

  val scalaClass = "LinkedList[Option[java.util.UUID]]"

  val defaultValue = "LinkedList[Option[java.util.UUID]].empty"
}

case object `scala.LinkedList<Guid?>?`
    extends ScalaGuid with `box.NullableLinkedListOfNullable` {

  val scalaClass = "Option[LinkedList[Option[java.util.UUID]]]"

  val defaultValue = "None"
}

case object `scala.Stack<Guid>`
    extends ScalaGuid with `box.OneStackOfOne` {

  val scalaClass = "Stack[java.util.UUID]"

  val defaultValue = "Stack[java.util.UUID].empty"
}

case object `scala.Stack<Guid>?`
    extends ScalaGuid with `box.NullableStackOfOne` {

  val scalaClass = "Option[Stack[java.util.UUID]]"

  val defaultValue = "None"
}

case object `scala.Stack<Guid?>`
    extends ScalaGuid with `box.OneStackOfNullable` {

  val scalaClass = "Stack[Option[java.util.UUID]]"

  val defaultValue = "Stack[Option[java.util.UUID]].empty"
}

case object `scala.Stack<Guid?>?`
    extends ScalaGuid with `box.NullableStackOfNullable` {

  val scalaClass = "Option[Stack[Option[java.util.UUID]]]"

  val defaultValue = "None"
}

case object `scala.Vector<Guid>`
    extends ScalaGuid with `box.OneVectorOfOne` {

  val scalaClass = "Vector[java.util.UUID]"

  val defaultValue = "Vector[java.util.UUID].empty"
}

case object `scala.Vector<Guid>?`
    extends ScalaGuid with `box.NullableVectorOfOne` {

  val scalaClass = "Option[Vector[java.util.UUID]]"

  val defaultValue = "None"
}

case object `scala.Vector<Guid?>`
    extends ScalaGuid with `box.OneVectorOfNullable` {

  val scalaClass = "Vector[Option[java.util.UUID]]"

  val defaultValue = "Vector[Option[java.util.UUID]].empty"
}

case object `scala.Vector<Guid?>?`
    extends ScalaGuid with `box.NullableVectorOfNullable` {

  val scalaClass = "Option[Vector[Option[java.util.UUID]]]"

  val defaultValue = "None"
}
