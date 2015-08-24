package com.dslplatform.ocd
package scalas

import types._
import boxes._

sealed abstract class ScalaDouble
    extends OcdScalaBoxType
    with `type.Double`

case object `scala.Double`
    extends ScalaDouble with `box.One` {

  val scalaClass = "Double"

  val defaultValue = "0.0"
}

case object `scala.Double?`
    extends ScalaDouble with `box.Nullable` {

  val scalaClass = "Option[Double]"

  val defaultValue = "None"
}

case object `scala.Double[]`
    extends ScalaDouble with `box.OneArrayOfOne` {

  val scalaClass = "Array[Double]"

  val defaultValue = "Array[Double].empty"
}

case object `scala.Double[]?`
    extends ScalaDouble with `box.NullableArrayOfOne` {

  val scalaClass = "Option[Array[Double]]"

  val defaultValue = "None"
}

case object `scala.Double?[]`
    extends ScalaDouble with `box.OneArrayOfNullable` {

  val scalaClass = "Array[Option[Double]]"

  val defaultValue = "Array[Option[Double]].empty"
}

case object `scala.Double?[]?`
    extends ScalaDouble with `box.NullableArrayOfNullable` {

  val scalaClass = "Option[Array[Option[Double]]]"

  val defaultValue = "None"
}

case object `scala.List<Double>`
    extends ScalaDouble with `box.OneListOfOne` {

  val scalaClass = "IndexedSeq[Double]"

  val defaultValue = "IndexedSeq[Double].empty"
}

case object `scala.List<Double>?`
    extends ScalaDouble with `box.NullableListOfOne` {

  val scalaClass = "Option[IndexedSeq[Double]]"

  val defaultValue = "None"
}

case object `scala.List<Double?>`
    extends ScalaDouble with `box.OneListOfNullable` {

  val scalaClass = "IndexedSeq[Option[Double]]"

  val defaultValue = "IndexedSeq[Option[Double]].empty"
}

case object `scala.List<Double?>?`
    extends ScalaDouble with `box.NullableListOfNullable` {

  val scalaClass = "Option[IndexedSeq[Option[Double]]]"

  val defaultValue = "None"
}

case object `scala.Set<Double>`
    extends ScalaDouble with `box.OneSetOfOne` {

  val scalaClass = "Set[Double]"

  val defaultValue = "Set[Double].empty"
}

case object `scala.Set<Double>?`
    extends ScalaDouble with `box.NullableSetOfOne` {

  val scalaClass = "Option[Set[Double]]"

  val defaultValue = "None"
}

case object `scala.Set<Double?>`
    extends ScalaDouble with `box.OneSetOfNullable` {

  val scalaClass = "Set[Option[Double]]"

  val defaultValue = "Set[Option[Double]].empty"
}

case object `scala.Set<Double?>?`
    extends ScalaDouble with `box.NullableSetOfNullable` {

  val scalaClass = "Option[Set[Option[Double]]]"

  val defaultValue = "None"
}

case object `scala.Queue<Double>`
    extends ScalaDouble with `box.OneQueueOfOne` {

  val scalaClass = "Queue[Double]"

  val defaultValue = "Queue[Double].empty"
}

case object `scala.Queue<Double>?`
    extends ScalaDouble with `box.NullableQueueOfOne` {

  val scalaClass = "Option[Queue[Double]]"

  val defaultValue = "None"
}

case object `scala.Queue<Double?>`
    extends ScalaDouble with `box.OneQueueOfNullable` {

  val scalaClass = "Queue[Option[Double]]"

  val defaultValue = "Queue[Option[Double]].empty"
}

case object `scala.Queue<Double?>?`
    extends ScalaDouble with `box.NullableQueueOfNullable` {

  val scalaClass = "Option[Queue[Option[Double]]]"

  val defaultValue = "None"
}

case object `scala.LinkedList<Double>`
    extends ScalaDouble with `box.OneLinkedListOfOne` {

  val scalaClass = "LinkedList[Double]"

  val defaultValue = "LinkedList[Double].empty"
}

case object `scala.LinkedList<Double>?`
    extends ScalaDouble with `box.NullableLinkedListOfOne` {

  val scalaClass = "Option[LinkedList[Double]]"

  val defaultValue = "None"
}

case object `scala.LinkedList<Double?>`
    extends ScalaDouble with `box.OneLinkedListOfNullable` {

  val scalaClass = "LinkedList[Option[Double]]"

  val defaultValue = "LinkedList[Option[Double]].empty"
}

case object `scala.LinkedList<Double?>?`
    extends ScalaDouble with `box.NullableLinkedListOfNullable` {

  val scalaClass = "Option[LinkedList[Option[Double]]]"

  val defaultValue = "None"
}

case object `scala.Stack<Double>`
    extends ScalaDouble with `box.OneStackOfOne` {

  val scalaClass = "Stack[Double]"

  val defaultValue = "Stack[Double].empty"
}

case object `scala.Stack<Double>?`
    extends ScalaDouble with `box.NullableStackOfOne` {

  val scalaClass = "Option[Stack[Double]]"

  val defaultValue = "None"
}

case object `scala.Stack<Double?>`
    extends ScalaDouble with `box.OneStackOfNullable` {

  val scalaClass = "Stack[Option[Double]]"

  val defaultValue = "Stack[Option[Double]].empty"
}

case object `scala.Stack<Double?>?`
    extends ScalaDouble with `box.NullableStackOfNullable` {

  val scalaClass = "Option[Stack[Option[Double]]]"

  val defaultValue = "None"
}

case object `scala.Vector<Double>`
    extends ScalaDouble with `box.OneVectorOfOne` {

  val scalaClass = "Vector[Double]"

  val defaultValue = "Vector[Double].empty"
}

case object `scala.Vector<Double>?`
    extends ScalaDouble with `box.NullableVectorOfOne` {

  val scalaClass = "Option[Vector[Double]]"

  val defaultValue = "None"
}

case object `scala.Vector<Double?>`
    extends ScalaDouble with `box.OneVectorOfNullable` {

  val scalaClass = "Vector[Option[Double]]"

  val defaultValue = "Vector[Option[Double]].empty"
}

case object `scala.Vector<Double?>?`
    extends ScalaDouble with `box.NullableVectorOfNullable` {

  val scalaClass = "Option[Vector[Option[Double]]]"

  val defaultValue = "None"
}
