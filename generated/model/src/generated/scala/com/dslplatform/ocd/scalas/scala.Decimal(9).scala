package com.dslplatform.ocd
package scalas

import types._
import boxes._

sealed trait ScalaDecimalWithScaleOf9
    extends OcdScala
    with `type.Decimal(9)`

case object `scala.Decimal(9)`
    extends ScalaDecimalWithScaleOf9 with `box.One` {

  val scalaClass = "BigDecimal"

  val defaultValue = "BigDecimal(0).setScale(9)"
}

case object `scala.Decimal(9)[]`
    extends ScalaDecimalWithScaleOf9 with `box.OneArrayOfOne` {

  val scalaClass = "Array[BigDecimal]"

  val defaultValue = "Array[BigDecimal].empty"
}

case object `scala.Decimal(9)?[]`
    extends ScalaDecimalWithScaleOf9 with `box.OneArrayOfNullable` {

  val scalaClass = "Array[Option[BigDecimal]]"

  val defaultValue = "Array[Option[BigDecimal]].empty"
}

case object `scala.List<Decimal(9)>`
    extends ScalaDecimalWithScaleOf9 with `box.OneListOfOne` {

  val scalaClass = "List[BigDecimal]"

  val defaultValue = "List[BigDecimal].empty"
}

case object `scala.List<Decimal(9)?>`
    extends ScalaDecimalWithScaleOf9 with `box.OneListOfNullable` {

  val scalaClass = "List[Option[BigDecimal]]"

  val defaultValue = "List[Option[BigDecimal]].empty"
}

case object `scala.Set<Decimal(9)>`
    extends ScalaDecimalWithScaleOf9 with `box.OneSetOfOne` {

  val scalaClass = "Set[BigDecimal]"

  val defaultValue = "Set[BigDecimal].empty"
}

case object `scala.Set<Decimal(9)?>`
    extends ScalaDecimalWithScaleOf9 with `box.OneSetOfNullable` {

  val scalaClass = "Set[Option[BigDecimal]]"

  val defaultValue = "Set[Option[BigDecimal]].empty"
}

case object `scala.Decimal(9)?`
    extends ScalaDecimalWithScaleOf9 with `box.Nullable` {

  val scalaClass = "Option[BigDecimal]"

  val defaultValue = "None"
}

case object `scala.Decimal(9)[]?`
    extends ScalaDecimalWithScaleOf9 with `box.NullableArrayOfOne` {

  val scalaClass = "Option[Array[BigDecimal]]"

  val defaultValue = "None"
}

case object `scala.Decimal(9)?[]?`
    extends ScalaDecimalWithScaleOf9 with `box.NullableArrayOfNullable` {

  val scalaClass = "Option[Array[Option[BigDecimal]]]"

  val defaultValue = "None"
}

case object `scala.List<Decimal(9)>?`
    extends ScalaDecimalWithScaleOf9 with `box.NullableListOfOne` {

  val scalaClass = "Option[List[BigDecimal]]"

  val defaultValue = "None"
}

case object `scala.List<Decimal(9)?>?`
    extends ScalaDecimalWithScaleOf9 with `box.NullableListOfNullable` {

  val scalaClass = "Option[List[Option[BigDecimal]]]"

  val defaultValue = "None"
}

case object `scala.Set<Decimal(9)>?`
    extends ScalaDecimalWithScaleOf9 with `box.NullableSetOfOne` {

  val scalaClass = "Option[Set[BigDecimal]]"

  val defaultValue = "None"
}

case object `scala.Set<Decimal(9)?>?`
    extends ScalaDecimalWithScaleOf9 with `box.NullableSetOfNullable` {

  val scalaClass = "Option[Set[Option[BigDecimal]]]"

  val defaultValue = "None"
}
