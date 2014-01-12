package com.dslplatform.ocd
package scalas

import types._
import boxes._

sealed trait ScalaLong
    extends OcdScala
    with `type.Long`

case object `scala.Long`
    extends ScalaLong with `box.One` {

  val scalaClass = "Long"

  val defaultValue = "0L"
}

case object `scala.Long[]`
    extends ScalaLong with `box.OneArrayOfOne` {

  val scalaClass = "Array[Long]"

  val defaultValue = "Array[Long].empty"
}

case object `scala.Long?[]`
    extends ScalaLong with `box.OneArrayOfNullable` {

  val scalaClass = "Array[Option[Long]]"

  val defaultValue = "Array[Option[Long]].empty"
}

case object `scala.List<Long>`
    extends ScalaLong with `box.OneListOfOne` {

  val scalaClass = "List[Long]"

  val defaultValue = "List[Long].empty"
}

case object `scala.List<Long?>`
    extends ScalaLong with `box.OneListOfNullable` {

  val scalaClass = "List[Option[Long]]"

  val defaultValue = "List[Option[Long]].empty"
}

case object `scala.Set<Long>`
    extends ScalaLong with `box.OneSetOfOne` {

  val scalaClass = "Set[Long]"

  val defaultValue = "Set[Long].empty"
}

case object `scala.Set<Long?>`
    extends ScalaLong with `box.OneSetOfNullable` {

  val scalaClass = "Set[Option[Long]]"

  val defaultValue = "Set[Option[Long]].empty"
}

case object `scala.Long?`
    extends ScalaLong with `box.Nullable` {

  val scalaClass = "Option[Long]"

  val defaultValue = "None"
}

case object `scala.Long[]?`
    extends ScalaLong with `box.NullableArrayOfOne` {

  val scalaClass = "Option[Array[Long]]"

  val defaultValue = "None"
}

case object `scala.Long?[]?`
    extends ScalaLong with `box.NullableArrayOfNullable` {

  val scalaClass = "Option[Array[Option[Long]]]"

  val defaultValue = "None"
}

case object `scala.List<Long>?`
    extends ScalaLong with `box.NullableListOfOne` {

  val scalaClass = "Option[List[Long]]"

  val defaultValue = "None"
}

case object `scala.List<Long?>?`
    extends ScalaLong with `box.NullableListOfNullable` {

  val scalaClass = "Option[List[Option[Long]]]"

  val defaultValue = "None"
}

case object `scala.Set<Long>?`
    extends ScalaLong with `box.NullableSetOfOne` {

  val scalaClass = "Option[Set[Long]]"

  val defaultValue = "None"
}

case object `scala.Set<Long?>?`
    extends ScalaLong with `box.NullableSetOfNullable` {

  val scalaClass = "Option[Set[Option[Long]]]"

  val defaultValue = "None"
}
