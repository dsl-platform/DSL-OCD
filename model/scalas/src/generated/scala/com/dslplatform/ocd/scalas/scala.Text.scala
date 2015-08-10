package com.dslplatform.ocd
package scalas

import types._
import boxes._

sealed trait ScalaText
    extends OcdScalaBoxType
    with `type.Text`

case object `scala.Text`
    extends ScalaText with `box.One` {

  val scalaClass = "String"

  val defaultValue = ""
}

case object `scala.Text?`
    extends ScalaText with `box.Nullable` {

  val scalaClass = "Option[String]"

  val defaultValue = "None"
}

case object `scala.Text[]`
    extends ScalaText with `box.OneArrayOfOne` {

  val scalaClass = "Array[String]"

  val defaultValue = "Array[String].empty"
}

case object `scala.Text[]?`
    extends ScalaText with `box.NullableArrayOfOne` {

  val scalaClass = "Option[Array[String]]"

  val defaultValue = "None"
}

case object `scala.Text?[]`
    extends ScalaText with `box.OneArrayOfNullable` {

  val scalaClass = "Array[Option[String]]"

  val defaultValue = "Array[Option[String]].empty"
}

case object `scala.Text?[]?`
    extends ScalaText with `box.NullableArrayOfNullable` {

  val scalaClass = "Option[Array[Option[String]]]"

  val defaultValue = "None"
}

case object `scala.List<Text>`
    extends ScalaText with `box.OneListOfOne` {

  val scalaClass = "IndexedSeq[String]"

  val defaultValue = "IndexedSeq[String].empty"
}

case object `scala.List<Text>?`
    extends ScalaText with `box.NullableListOfOne` {

  val scalaClass = "Option[IndexedSeq[String]]"

  val defaultValue = "None"
}

case object `scala.List<Text?>`
    extends ScalaText with `box.OneListOfNullable` {

  val scalaClass = "IndexedSeq[Option[String]]"

  val defaultValue = "IndexedSeq[Option[String]].empty"
}

case object `scala.List<Text?>?`
    extends ScalaText with `box.NullableListOfNullable` {

  val scalaClass = "Option[IndexedSeq[Option[String]]]"

  val defaultValue = "None"
}

case object `scala.Queue<Text>`
    extends ScalaText with `box.OneQueueOfOne` {

  val scalaClass = "Queue[String]"

  val defaultValue = "Queue[String].empty"
}

case object `scala.Queue<Text>?`
    extends ScalaText with `box.NullableQueueOfOne` {

  val scalaClass = "Option[Queue[String]]"

  val defaultValue = "None"
}

case object `scala.Queue<Text?>`
    extends ScalaText with `box.OneQueueOfNullable` {

  val scalaClass = "Queue[Option[String]]"

  val defaultValue = "Queue[Option[String]].empty"
}

case object `scala.Queue<Text?>?`
    extends ScalaText with `box.NullableQueueOfNullable` {

  val scalaClass = "Option[Queue[Option[String]]]"

  val defaultValue = "None"
}

case object `scala.Set<Text>`
    extends ScalaText with `box.OneSetOfOne` {

  val scalaClass = "Set[String]"

  val defaultValue = "Set[String].empty"
}

case object `scala.Set<Text>?`
    extends ScalaText with `box.NullableSetOfOne` {

  val scalaClass = "Option[Set[String]]"

  val defaultValue = "None"
}

case object `scala.Set<Text?>`
    extends ScalaText with `box.OneSetOfNullable` {

  val scalaClass = "Set[Option[String]]"

  val defaultValue = "Set[Option[String]].empty"
}

case object `scala.Set<Text?>?`
    extends ScalaText with `box.NullableSetOfNullable` {

  val scalaClass = "Option[Set[Option[String]]]"

  val defaultValue = "None"
}
