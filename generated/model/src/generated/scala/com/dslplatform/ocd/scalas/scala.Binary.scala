package com.dslplatform.ocd
package scalas

import types._
import boxes._

sealed trait ScalaBinary
    extends OcdScala
    with `type.Binary`

case object `scala.Binary`
    extends ScalaBinary with `box.One` {

  val scalaClass = "Array[Byte]"

  val defaultValue = "Array[Byte].empty"
}

case object `scala.Binary[]`
    extends ScalaBinary with `box.OneArrayOfOne` {

  val scalaClass = "Array[Array[Byte]]"

  val defaultValue = "Array[Array[Byte]].empty"
}

case object `scala.Binary?[]`
    extends ScalaBinary with `box.OneArrayOfNullable` {

  val scalaClass = "Array[Option[Array[Byte]]]"

  val defaultValue = "Array[Option[Array[Byte]]].empty"
}

case object `scala.List<Binary>`
    extends ScalaBinary with `box.OneListOfOne` {

  val scalaClass = "List[Array[Byte]]"

  val defaultValue = "List[Array[Byte]].empty"
}

case object `scala.List<Binary?>`
    extends ScalaBinary with `box.OneListOfNullable` {

  val scalaClass = "List[Option[Array[Byte]]]"

  val defaultValue = "List[Option[Array[Byte]]].empty"
}

case object `scala.Set<Binary>`
    extends ScalaBinary with `box.OneSetOfOne` {

  val scalaClass = "Set[Array[Byte]]"

  val defaultValue = "Set[Array[Byte]].empty"
}

case object `scala.Set<Binary?>`
    extends ScalaBinary with `box.OneSetOfNullable` {

  val scalaClass = "Set[Option[Array[Byte]]]"

  val defaultValue = "Set[Option[Array[Byte]]].empty"
}

case object `scala.Binary?`
    extends ScalaBinary with `box.Nullable` {

  val scalaClass = "Option[Array[Byte]]"

  val defaultValue = "None"
}

case object `scala.Binary[]?`
    extends ScalaBinary with `box.NullableArrayOfOne` {

  val scalaClass = "Option[Array[Array[Byte]]]"

  val defaultValue = "None"
}

case object `scala.Binary?[]?`
    extends ScalaBinary with `box.NullableArrayOfNullable` {

  val scalaClass = "Option[Array[Option[Array[Byte]]]]"

  val defaultValue = "None"
}

case object `scala.List<Binary>?`
    extends ScalaBinary with `box.NullableListOfOne` {

  val scalaClass = "Option[List[Array[Byte]]]"

  val defaultValue = "None"
}

case object `scala.List<Binary?>?`
    extends ScalaBinary with `box.NullableListOfNullable` {

  val scalaClass = "Option[List[Option[Array[Byte]]]]"

  val defaultValue = "None"
}

case object `scala.Set<Binary>?`
    extends ScalaBinary with `box.NullableSetOfOne` {

  val scalaClass = "Option[Set[Array[Byte]]]"

  val defaultValue = "None"
}

case object `scala.Set<Binary?>?`
    extends ScalaBinary with `box.NullableSetOfNullable` {

  val scalaClass = "Option[Set[Option[Array[Byte]]]]"

  val defaultValue = "None"
}
