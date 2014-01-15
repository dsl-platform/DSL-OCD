package com.dslplatform.ocd
package scalas

import types._
import boxes._

sealed trait ScalaGuid
    extends OcdScala
    with `type.Guid`

case object `scala.Guid`
    extends ScalaGuid with `box.One` {

  val scalaClass = "java.util.UUID"

  val defaultValue = "java.util.UUID.randomUUID"
}

case object `scala.Guid[]`
    extends ScalaGuid with `box.OneArrayOfOne` {

  val scalaClass = "Array[java.util.UUID]"

  val defaultValue = "Array[java.util.UUID].empty"
}

case object `scala.Guid?[]`
    extends ScalaGuid with `box.OneArrayOfNullable` {

  val scalaClass = "Array[Option[java.util.UUID]]"

  val defaultValue = "Array[Option[java.util.UUID]].empty"
}

case object `scala.List<Guid>`
    extends ScalaGuid with `box.OneListOfOne` {

  val scalaClass = "IndexedSeq[java.util.UUID]"

  val defaultValue = "IndexedSeq[java.util.UUID].empty"
}

case object `scala.List<Guid?>`
    extends ScalaGuid with `box.OneListOfNullable` {

  val scalaClass = "IndexedSeq[Option[java.util.UUID]]"

  val defaultValue = "IndexedSeq[Option[java.util.UUID]].empty"
}

case object `scala.Set<Guid>`
    extends ScalaGuid with `box.OneSetOfOne` {

  val scalaClass = "Set[java.util.UUID]"

  val defaultValue = "Set[java.util.UUID].empty"
}

case object `scala.Set<Guid?>`
    extends ScalaGuid with `box.OneSetOfNullable` {

  val scalaClass = "Set[Option[java.util.UUID]]"

  val defaultValue = "Set[Option[java.util.UUID]].empty"
}

case object `scala.Guid?`
    extends ScalaGuid with `box.Nullable` {

  val scalaClass = "Option[java.util.UUID]"

  val defaultValue = "None"
}

case object `scala.Guid[]?`
    extends ScalaGuid with `box.NullableArrayOfOne` {

  val scalaClass = "Option[Array[java.util.UUID]]"

  val defaultValue = "None"
}

case object `scala.Guid?[]?`
    extends ScalaGuid with `box.NullableArrayOfNullable` {

  val scalaClass = "Option[Array[Option[java.util.UUID]]]"

  val defaultValue = "None"
}

case object `scala.List<Guid>?`
    extends ScalaGuid with `box.NullableListOfOne` {

  val scalaClass = "Option[IndexedSeq[java.util.UUID]]"

  val defaultValue = "None"
}

case object `scala.List<Guid?>?`
    extends ScalaGuid with `box.NullableListOfNullable` {

  val scalaClass = "Option[IndexedSeq[Option[java.util.UUID]]]"

  val defaultValue = "None"
}

case object `scala.Set<Guid>?`
    extends ScalaGuid with `box.NullableSetOfOne` {

  val scalaClass = "Option[Set[java.util.UUID]]"

  val defaultValue = "None"
}

case object `scala.Set<Guid?>?`
    extends ScalaGuid with `box.NullableSetOfNullable` {

  val scalaClass = "Option[Set[Option[java.util.UUID]]]"

  val defaultValue = "None"
}
