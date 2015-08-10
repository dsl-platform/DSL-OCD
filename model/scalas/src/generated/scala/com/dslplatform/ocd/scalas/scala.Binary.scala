package com.dslplatform.ocd
package scalas

import types._
import boxes._

sealed trait ScalaBinary
    extends OcdScalaBoxType
    with `type.Binary`

case object `scala.Binary`
    extends ScalaBinary with `box.One` {

  val scalaClass = "Array[Byte]"

  val defaultValue = "Array[Byte].empty"
}

case object `scala.Binary?`
    extends ScalaBinary with `box.Nullable` {

  val scalaClass = "Option[Array[Byte]]"

  val defaultValue = "None"
}

case object `scala.Binary[]`
    extends ScalaBinary with `box.OneArrayOfOne` {

  val scalaClass = "Array[Array[Byte]]"

  val defaultValue = "Array[Array[Byte]].empty"
}

case object `scala.Binary[]?`
    extends ScalaBinary with `box.NullableArrayOfOne` {

  val scalaClass = "Option[Array[Array[Byte]]]"

  val defaultValue = "None"
}

case object `scala.Binary?[]`
    extends ScalaBinary with `box.OneArrayOfNullable` {

  val scalaClass = "Array[Option[Array[Byte]]]"

  val defaultValue = "Array[Option[Array[Byte]]].empty"
}

case object `scala.Binary?[]?`
    extends ScalaBinary with `box.NullableArrayOfNullable` {

  val scalaClass = "Option[Array[Option[Array[Byte]]]]"

  val defaultValue = "None"
}

case object `scala.List<Binary>`
    extends ScalaBinary with `box.OneListOfOne` {

  val scalaClass = "IndexedSeq[Array[Byte]]"

  val defaultValue = "IndexedSeq[Array[Byte]].empty"
}

case object `scala.List<Binary>?`
    extends ScalaBinary with `box.NullableListOfOne` {

  val scalaClass = "Option[IndexedSeq[Array[Byte]]]"

  val defaultValue = "None"
}

case object `scala.List<Binary?>`
    extends ScalaBinary with `box.OneListOfNullable` {

  val scalaClass = "IndexedSeq[Option[Array[Byte]]]"

  val defaultValue = "IndexedSeq[Option[Array[Byte]]].empty"
}

case object `scala.List<Binary?>?`
    extends ScalaBinary with `box.NullableListOfNullable` {

  val scalaClass = "Option[IndexedSeq[Option[Array[Byte]]]]"

  val defaultValue = "None"
}

case object `scala.Queue<Binary>`
    extends ScalaBinary with `box.OneQueueOfOne` {

  val scalaClass = "Queue[Array[Byte]]"

  val defaultValue = "Queue[Array[Byte]].empty"
}

case object `scala.Queue<Binary>?`
    extends ScalaBinary with `box.NullableQueueOfOne` {

  val scalaClass = "Option[Queue[Array[Byte]]]"

  val defaultValue = "None"
}

case object `scala.Queue<Binary?>`
    extends ScalaBinary with `box.OneQueueOfNullable` {

  val scalaClass = "Queue[Option[Array[Byte]]]"

  val defaultValue = "Queue[Option[Array[Byte]]].empty"
}

case object `scala.Queue<Binary?>?`
    extends ScalaBinary with `box.NullableQueueOfNullable` {

  val scalaClass = "Option[Queue[Option[Array[Byte]]]]"

  val defaultValue = "None"
}

case object `scala.Set<Binary>`
    extends ScalaBinary with `box.OneSetOfOne` {

  val scalaClass = "Set[Array[Byte]]"

  val defaultValue = "Set[Array[Byte]].empty"
}

case object `scala.Set<Binary>?`
    extends ScalaBinary with `box.NullableSetOfOne` {

  val scalaClass = "Option[Set[Array[Byte]]]"

  val defaultValue = "None"
}

case object `scala.Set<Binary?>`
    extends ScalaBinary with `box.OneSetOfNullable` {

  val scalaClass = "Set[Option[Array[Byte]]]"

  val defaultValue = "Set[Option[Array[Byte]]].empty"
}

case object `scala.Set<Binary?>?`
    extends ScalaBinary with `box.NullableSetOfNullable` {

  val scalaClass = "Option[Set[Option[Array[Byte]]]]"

  val defaultValue = "None"
}
