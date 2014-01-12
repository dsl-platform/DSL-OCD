package com.dslplatform.ocd
package scalas

import types._
import boxes._

sealed trait ScalaGuid
    extends OcdScala
    with `type.Guid`

case object `scala.Guid`
    extends ScalaGuid with `box.One` {

  val scalaClass = "scala.util.UUID"

  val defaultValue = "scala.util.UUID.randomUUID"
}

case object `scala.Guid[]`
    extends ScalaGuid with `box.OneArrayOfOne` {

  val scalaClass = "Array[scala.util.UUID]"

  val defaultValue = "Array[scala.util.UUID].empty"
}

case object `scala.Guid?[]`
    extends ScalaGuid with `box.OneArrayOfNullable` {

  val scalaClass = "Array[Option[scala.util.UUID]]"

  val defaultValue = "Array[Option[scala.util.UUID]].empty"
}

case object `scala.List<Guid>`
    extends ScalaGuid with `box.OneListOfOne` {

  val scalaClass = "List[scala.util.UUID]"

  val defaultValue = "List[scala.util.UUID].empty"
}

case object `scala.List<Guid?>`
    extends ScalaGuid with `box.OneListOfNullable` {

  val scalaClass = "List[Option[scala.util.UUID]]"

  val defaultValue = "List[Option[scala.util.UUID]].empty"
}

case object `scala.Set<Guid>`
    extends ScalaGuid with `box.OneSetOfOne` {

  val scalaClass = "Set[scala.util.UUID]"

  val defaultValue = "Set[scala.util.UUID].empty"
}

case object `scala.Set<Guid?>`
    extends ScalaGuid with `box.OneSetOfNullable` {

  val scalaClass = "Set[Option[scala.util.UUID]]"

  val defaultValue = "Set[Option[scala.util.UUID]].empty"
}

case object `scala.Guid?`
    extends ScalaGuid with `box.Nullable` {

  val scalaClass = "Option[scala.util.UUID]"

  val defaultValue = "None"
}

case object `scala.Guid[]?`
    extends ScalaGuid with `box.NullableArrayOfOne` {

  val scalaClass = "Option[Array[scala.util.UUID]]"

  val defaultValue = "None"
}

case object `scala.Guid?[]?`
    extends ScalaGuid with `box.NullableArrayOfNullable` {

  val scalaClass = "Option[Array[Option[scala.util.UUID]]]"

  val defaultValue = "None"
}

case object `scala.List<Guid>?`
    extends ScalaGuid with `box.NullableListOfOne` {

  val scalaClass = "Option[List[scala.util.UUID]]"

  val defaultValue = "None"
}

case object `scala.List<Guid?>?`
    extends ScalaGuid with `box.NullableListOfNullable` {

  val scalaClass = "Option[List[Option[scala.util.UUID]]]"

  val defaultValue = "None"
}

case object `scala.Set<Guid>?`
    extends ScalaGuid with `box.NullableSetOfOne` {

  val scalaClass = "Option[Set[scala.util.UUID]]"

  val defaultValue = "None"
}

case object `scala.Set<Guid?>?`
    extends ScalaGuid with `box.NullableSetOfNullable` {

  val scalaClass = "Option[Set[Option[scala.util.UUID]]]"

  val defaultValue = "None"
}
