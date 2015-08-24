package com.dslplatform.ocd
package scalas

import types._
import boxes._

sealed abstract class ScalaIp
    extends OcdScalaBoxType
    with `type.Ip`

case object `scala.Ip`
    extends ScalaIp with `box.One` {

  val scalaClass = "java.net.InetAddress"

  val defaultValue = "null"
}

case object `scala.Ip?`
    extends ScalaIp with `box.Nullable` {

  val scalaClass = "Option[java.net.InetAddress]"

  val defaultValue = "None"
}

case object `scala.Ip[]`
    extends ScalaIp with `box.OneArrayOfOne` {

  val scalaClass = "Array[java.net.InetAddress]"

  val defaultValue = "Array[java.net.InetAddress].empty"
}

case object `scala.Ip[]?`
    extends ScalaIp with `box.NullableArrayOfOne` {

  val scalaClass = "Option[Array[java.net.InetAddress]]"

  val defaultValue = "None"
}

case object `scala.Ip?[]`
    extends ScalaIp with `box.OneArrayOfNullable` {

  val scalaClass = "Array[Option[java.net.InetAddress]]"

  val defaultValue = "Array[Option[java.net.InetAddress]].empty"
}

case object `scala.Ip?[]?`
    extends ScalaIp with `box.NullableArrayOfNullable` {

  val scalaClass = "Option[Array[Option[java.net.InetAddress]]]"

  val defaultValue = "None"
}

case object `scala.List<Ip>`
    extends ScalaIp with `box.OneListOfOne` {

  val scalaClass = "IndexedSeq[java.net.InetAddress]"

  val defaultValue = "IndexedSeq[java.net.InetAddress].empty"
}

case object `scala.List<Ip>?`
    extends ScalaIp with `box.NullableListOfOne` {

  val scalaClass = "Option[IndexedSeq[java.net.InetAddress]]"

  val defaultValue = "None"
}

case object `scala.List<Ip?>`
    extends ScalaIp with `box.OneListOfNullable` {

  val scalaClass = "IndexedSeq[Option[java.net.InetAddress]]"

  val defaultValue = "IndexedSeq[Option[java.net.InetAddress]].empty"
}

case object `scala.List<Ip?>?`
    extends ScalaIp with `box.NullableListOfNullable` {

  val scalaClass = "Option[IndexedSeq[Option[java.net.InetAddress]]]"

  val defaultValue = "None"
}

case object `scala.Set<Ip>`
    extends ScalaIp with `box.OneSetOfOne` {

  val scalaClass = "Set[java.net.InetAddress]"

  val defaultValue = "Set[java.net.InetAddress].empty"
}

case object `scala.Set<Ip>?`
    extends ScalaIp with `box.NullableSetOfOne` {

  val scalaClass = "Option[Set[java.net.InetAddress]]"

  val defaultValue = "None"
}

case object `scala.Set<Ip?>`
    extends ScalaIp with `box.OneSetOfNullable` {

  val scalaClass = "Set[Option[java.net.InetAddress]]"

  val defaultValue = "Set[Option[java.net.InetAddress]].empty"
}

case object `scala.Set<Ip?>?`
    extends ScalaIp with `box.NullableSetOfNullable` {

  val scalaClass = "Option[Set[Option[java.net.InetAddress]]]"

  val defaultValue = "None"
}

case object `scala.Queue<Ip>`
    extends ScalaIp with `box.OneQueueOfOne` {

  val scalaClass = "Queue[java.net.InetAddress]"

  val defaultValue = "Queue[java.net.InetAddress].empty"
}

case object `scala.Queue<Ip>?`
    extends ScalaIp with `box.NullableQueueOfOne` {

  val scalaClass = "Option[Queue[java.net.InetAddress]]"

  val defaultValue = "None"
}

case object `scala.Queue<Ip?>`
    extends ScalaIp with `box.OneQueueOfNullable` {

  val scalaClass = "Queue[Option[java.net.InetAddress]]"

  val defaultValue = "Queue[Option[java.net.InetAddress]].empty"
}

case object `scala.Queue<Ip?>?`
    extends ScalaIp with `box.NullableQueueOfNullable` {

  val scalaClass = "Option[Queue[Option[java.net.InetAddress]]]"

  val defaultValue = "None"
}

case object `scala.LinkedList<Ip>`
    extends ScalaIp with `box.OneLinkedListOfOne` {

  val scalaClass = "LinkedList[java.net.InetAddress]"

  val defaultValue = "LinkedList[java.net.InetAddress].empty"
}

case object `scala.LinkedList<Ip>?`
    extends ScalaIp with `box.NullableLinkedListOfOne` {

  val scalaClass = "Option[LinkedList[java.net.InetAddress]]"

  val defaultValue = "None"
}

case object `scala.LinkedList<Ip?>`
    extends ScalaIp with `box.OneLinkedListOfNullable` {

  val scalaClass = "LinkedList[Option[java.net.InetAddress]]"

  val defaultValue = "LinkedList[Option[java.net.InetAddress]].empty"
}

case object `scala.LinkedList<Ip?>?`
    extends ScalaIp with `box.NullableLinkedListOfNullable` {

  val scalaClass = "Option[LinkedList[Option[java.net.InetAddress]]]"

  val defaultValue = "None"
}

case object `scala.Stack<Ip>`
    extends ScalaIp with `box.OneStackOfOne` {

  val scalaClass = "Stack[java.net.InetAddress]"

  val defaultValue = "Stack[java.net.InetAddress].empty"
}

case object `scala.Stack<Ip>?`
    extends ScalaIp with `box.NullableStackOfOne` {

  val scalaClass = "Option[Stack[java.net.InetAddress]]"

  val defaultValue = "None"
}

case object `scala.Stack<Ip?>`
    extends ScalaIp with `box.OneStackOfNullable` {

  val scalaClass = "Stack[Option[java.net.InetAddress]]"

  val defaultValue = "Stack[Option[java.net.InetAddress]].empty"
}

case object `scala.Stack<Ip?>?`
    extends ScalaIp with `box.NullableStackOfNullable` {

  val scalaClass = "Option[Stack[Option[java.net.InetAddress]]]"

  val defaultValue = "None"
}

case object `scala.Vector<Ip>`
    extends ScalaIp with `box.OneVectorOfOne` {

  val scalaClass = "Vector[java.net.InetAddress]"

  val defaultValue = "Vector[java.net.InetAddress].empty"
}

case object `scala.Vector<Ip>?`
    extends ScalaIp with `box.NullableVectorOfOne` {

  val scalaClass = "Option[Vector[java.net.InetAddress]]"

  val defaultValue = "None"
}

case object `scala.Vector<Ip?>`
    extends ScalaIp with `box.OneVectorOfNullable` {

  val scalaClass = "Vector[Option[java.net.InetAddress]]"

  val defaultValue = "Vector[Option[java.net.InetAddress]].empty"
}

case object `scala.Vector<Ip?>?`
    extends ScalaIp with `box.NullableVectorOfNullable` {

  val scalaClass = "Option[Vector[Option[java.net.InetAddress]]]"

  val defaultValue = "None"
}
