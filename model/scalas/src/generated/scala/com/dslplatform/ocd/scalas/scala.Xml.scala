package com.dslplatform.ocd
package scalas

import types._
import boxes._

sealed abstract class ScalaXml
    extends OcdScalaBoxType
    with `type.Xml`

case object `scala.Xml`
    extends ScalaXml with `box.One` {

  val scalaClass = "scala.xml.Elem"

  val defaultValue = "null"
}

case object `scala.Xml?`
    extends ScalaXml with `box.Nullable` {

  val scalaClass = "Option[scala.xml.Elem]"

  val defaultValue = "None"
}

case object `scala.Xml[]`
    extends ScalaXml with `box.OneArrayOfOne` {

  val scalaClass = "Array[scala.xml.Elem]"

  val defaultValue = "Array[scala.xml.Elem].empty"
}

case object `scala.Xml[]?`
    extends ScalaXml with `box.NullableArrayOfOne` {

  val scalaClass = "Option[Array[scala.xml.Elem]]"

  val defaultValue = "None"
}

case object `scala.Xml?[]`
    extends ScalaXml with `box.OneArrayOfNullable` {

  val scalaClass = "Array[Option[scala.xml.Elem]]"

  val defaultValue = "Array[Option[scala.xml.Elem]].empty"
}

case object `scala.Xml?[]?`
    extends ScalaXml with `box.NullableArrayOfNullable` {

  val scalaClass = "Option[Array[Option[scala.xml.Elem]]]"

  val defaultValue = "None"
}

case object `scala.List<Xml>`
    extends ScalaXml with `box.OneListOfOne` {

  val scalaClass = "IndexedSeq[scala.xml.Elem]"

  val defaultValue = "IndexedSeq[scala.xml.Elem].empty"
}

case object `scala.List<Xml>?`
    extends ScalaXml with `box.NullableListOfOne` {

  val scalaClass = "Option[IndexedSeq[scala.xml.Elem]]"

  val defaultValue = "None"
}

case object `scala.List<Xml?>`
    extends ScalaXml with `box.OneListOfNullable` {

  val scalaClass = "IndexedSeq[Option[scala.xml.Elem]]"

  val defaultValue = "IndexedSeq[Option[scala.xml.Elem]].empty"
}

case object `scala.List<Xml?>?`
    extends ScalaXml with `box.NullableListOfNullable` {

  val scalaClass = "Option[IndexedSeq[Option[scala.xml.Elem]]]"

  val defaultValue = "None"
}

case object `scala.Set<Xml>`
    extends ScalaXml with `box.OneSetOfOne` {

  val scalaClass = "Set[scala.xml.Elem]"

  val defaultValue = "Set[scala.xml.Elem].empty"
}

case object `scala.Set<Xml>?`
    extends ScalaXml with `box.NullableSetOfOne` {

  val scalaClass = "Option[Set[scala.xml.Elem]]"

  val defaultValue = "None"
}

case object `scala.Set<Xml?>`
    extends ScalaXml with `box.OneSetOfNullable` {

  val scalaClass = "Set[Option[scala.xml.Elem]]"

  val defaultValue = "Set[Option[scala.xml.Elem]].empty"
}

case object `scala.Set<Xml?>?`
    extends ScalaXml with `box.NullableSetOfNullable` {

  val scalaClass = "Option[Set[Option[scala.xml.Elem]]]"

  val defaultValue = "None"
}

case object `scala.Queue<Xml>`
    extends ScalaXml with `box.OneQueueOfOne` {

  val scalaClass = "Queue[scala.xml.Elem]"

  val defaultValue = "Queue[scala.xml.Elem].empty"
}

case object `scala.Queue<Xml>?`
    extends ScalaXml with `box.NullableQueueOfOne` {

  val scalaClass = "Option[Queue[scala.xml.Elem]]"

  val defaultValue = "None"
}

case object `scala.Queue<Xml?>`
    extends ScalaXml with `box.OneQueueOfNullable` {

  val scalaClass = "Queue[Option[scala.xml.Elem]]"

  val defaultValue = "Queue[Option[scala.xml.Elem]].empty"
}

case object `scala.Queue<Xml?>?`
    extends ScalaXml with `box.NullableQueueOfNullable` {

  val scalaClass = "Option[Queue[Option[scala.xml.Elem]]]"

  val defaultValue = "None"
}

case object `scala.LinkedList<Xml>`
    extends ScalaXml with `box.OneLinkedListOfOne` {

  val scalaClass = "LinkedList[scala.xml.Elem]"

  val defaultValue = "LinkedList[scala.xml.Elem].empty"
}

case object `scala.LinkedList<Xml>?`
    extends ScalaXml with `box.NullableLinkedListOfOne` {

  val scalaClass = "Option[LinkedList[scala.xml.Elem]]"

  val defaultValue = "None"
}

case object `scala.LinkedList<Xml?>`
    extends ScalaXml with `box.OneLinkedListOfNullable` {

  val scalaClass = "LinkedList[Option[scala.xml.Elem]]"

  val defaultValue = "LinkedList[Option[scala.xml.Elem]].empty"
}

case object `scala.LinkedList<Xml?>?`
    extends ScalaXml with `box.NullableLinkedListOfNullable` {

  val scalaClass = "Option[LinkedList[Option[scala.xml.Elem]]]"

  val defaultValue = "None"
}

case object `scala.Stack<Xml>`
    extends ScalaXml with `box.OneStackOfOne` {

  val scalaClass = "Stack[scala.xml.Elem]"

  val defaultValue = "Stack[scala.xml.Elem].empty"
}

case object `scala.Stack<Xml>?`
    extends ScalaXml with `box.NullableStackOfOne` {

  val scalaClass = "Option[Stack[scala.xml.Elem]]"

  val defaultValue = "None"
}

case object `scala.Stack<Xml?>`
    extends ScalaXml with `box.OneStackOfNullable` {

  val scalaClass = "Stack[Option[scala.xml.Elem]]"

  val defaultValue = "Stack[Option[scala.xml.Elem]].empty"
}

case object `scala.Stack<Xml?>?`
    extends ScalaXml with `box.NullableStackOfNullable` {

  val scalaClass = "Option[Stack[Option[scala.xml.Elem]]]"

  val defaultValue = "None"
}

case object `scala.Vector<Xml>`
    extends ScalaXml with `box.OneVectorOfOne` {

  val scalaClass = "Vector[scala.xml.Elem]"

  val defaultValue = "Vector[scala.xml.Elem].empty"
}

case object `scala.Vector<Xml>?`
    extends ScalaXml with `box.NullableVectorOfOne` {

  val scalaClass = "Option[Vector[scala.xml.Elem]]"

  val defaultValue = "None"
}

case object `scala.Vector<Xml?>`
    extends ScalaXml with `box.OneVectorOfNullable` {

  val scalaClass = "Vector[Option[scala.xml.Elem]]"

  val defaultValue = "Vector[Option[scala.xml.Elem]].empty"
}

case object `scala.Vector<Xml?>?`
    extends ScalaXml with `box.NullableVectorOfNullable` {

  val scalaClass = "Option[Vector[Option[scala.xml.Elem]]]"

  val defaultValue = "None"
}
