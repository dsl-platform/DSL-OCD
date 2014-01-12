package com.dslplatform.ocd
package scalas

import types._
import boxes._

sealed trait ScalaMoney
    extends OcdScala
    with `type.Money`

case object `scala.Money`
    extends ScalaMoney with `box.One` {

  val scalaClass = "BigDecimal"

  val defaultValue = "BigDecimal(0).setScale(2)"
}

case object `scala.Money[]`
    extends ScalaMoney with `box.OneArrayOfOne` {

  val scalaClass = "Array[BigDecimal]"

  val defaultValue = "Array[BigDecimal].empty"
}

case object `scala.Money?[]`
    extends ScalaMoney with `box.OneArrayOfNullable` {

  val scalaClass = "Array[Option[BigDecimal]]"

  val defaultValue = "Array[Option[BigDecimal]].empty"
}

case object `scala.List<Money>`
    extends ScalaMoney with `box.OneListOfOne` {

  val scalaClass = "List[BigDecimal]"

  val defaultValue = "List[BigDecimal].empty"
}

case object `scala.List<Money?>`
    extends ScalaMoney with `box.OneListOfNullable` {

  val scalaClass = "List[Option[BigDecimal]]"

  val defaultValue = "List[Option[BigDecimal]].empty"
}

case object `scala.Set<Money>`
    extends ScalaMoney with `box.OneSetOfOne` {

  val scalaClass = "Set[BigDecimal]"

  val defaultValue = "Set[BigDecimal].empty"
}

case object `scala.Set<Money?>`
    extends ScalaMoney with `box.OneSetOfNullable` {

  val scalaClass = "Set[Option[BigDecimal]]"

  val defaultValue = "Set[Option[BigDecimal]].empty"
}

case object `scala.Money?`
    extends ScalaMoney with `box.Nullable` {

  val scalaClass = "Option[BigDecimal]"

  val defaultValue = "None"
}

case object `scala.Money[]?`
    extends ScalaMoney with `box.NullableArrayOfOne` {

  val scalaClass = "Option[Array[BigDecimal]]"

  val defaultValue = "None"
}

case object `scala.Money?[]?`
    extends ScalaMoney with `box.NullableArrayOfNullable` {

  val scalaClass = "Option[Array[Option[BigDecimal]]]"

  val defaultValue = "None"
}

case object `scala.List<Money>?`
    extends ScalaMoney with `box.NullableListOfOne` {

  val scalaClass = "Option[List[BigDecimal]]"

  val defaultValue = "None"
}

case object `scala.List<Money?>?`
    extends ScalaMoney with `box.NullableListOfNullable` {

  val scalaClass = "Option[List[Option[BigDecimal]]]"

  val defaultValue = "None"
}

case object `scala.Set<Money>?`
    extends ScalaMoney with `box.NullableSetOfOne` {

  val scalaClass = "Option[Set[BigDecimal]]"

  val defaultValue = "None"
}

case object `scala.Set<Money?>?`
    extends ScalaMoney with `box.NullableSetOfNullable` {

  val scalaClass = "Option[Set[Option[BigDecimal]]]"

  val defaultValue = "None"
}
