package com.dslplatform.ocd
package scalas

import types._
import boxes._

sealed trait ScalaDecimal
    extends OcdScalaBoxType
    with `type.Decimal`

case object `scala.Decimal`
    extends ScalaDecimal with `box.One` {

  val scalaClass = "BigDecimal"

  val defaultValue = "BigDecimal(0)"
}

case object `scala.Decimal?`
    extends ScalaDecimal with `box.Nullable` {

  val scalaClass = "Option[BigDecimal]"

  val defaultValue = "None"
}

case object `scala.Decimal[]`
    extends ScalaDecimal with `box.OneArrayOfOne` {

  val scalaClass = "Array[BigDecimal]"

  val defaultValue = "Array[BigDecimal].empty"
}

case object `scala.Decimal[]?`
    extends ScalaDecimal with `box.NullableArrayOfOne` {

  val scalaClass = "Option[Array[BigDecimal]]"

  val defaultValue = "None"
}

case object `scala.Decimal?[]`
    extends ScalaDecimal with `box.OneArrayOfNullable` {

  val scalaClass = "Array[Option[BigDecimal]]"

  val defaultValue = "Array[Option[BigDecimal]].empty"
}

case object `scala.Decimal?[]?`
    extends ScalaDecimal with `box.NullableArrayOfNullable` {

  val scalaClass = "Option[Array[Option[BigDecimal]]]"

  val defaultValue = "None"
}

case object `scala.List<Decimal>`
    extends ScalaDecimal with `box.OneListOfOne` {

  val scalaClass = "IndexedSeq[BigDecimal]"

  val defaultValue = "IndexedSeq[BigDecimal].empty"
}

case object `scala.List<Decimal>?`
    extends ScalaDecimal with `box.NullableListOfOne` {

  val scalaClass = "Option[IndexedSeq[BigDecimal]]"

  val defaultValue = "None"
}

case object `scala.List<Decimal?>`
    extends ScalaDecimal with `box.OneListOfNullable` {

  val scalaClass = "IndexedSeq[Option[BigDecimal]]"

  val defaultValue = "IndexedSeq[Option[BigDecimal]].empty"
}

case object `scala.List<Decimal?>?`
    extends ScalaDecimal with `box.NullableListOfNullable` {

  val scalaClass = "Option[IndexedSeq[Option[BigDecimal]]]"

  val defaultValue = "None"
}

case object `scala.Queue<Decimal>`
    extends ScalaDecimal with `box.OneQueueOfOne` {

  val scalaClass = "Queue[BigDecimal]"

  val defaultValue = "Queue[BigDecimal].empty"
}

case object `scala.Queue<Decimal>?`
    extends ScalaDecimal with `box.NullableQueueOfOne` {

  val scalaClass = "Option[Queue[BigDecimal]]"

  val defaultValue = "None"
}

case object `scala.Queue<Decimal?>`
    extends ScalaDecimal with `box.OneQueueOfNullable` {

  val scalaClass = "Queue[Option[BigDecimal]]"

  val defaultValue = "Queue[Option[BigDecimal]].empty"
}

case object `scala.Queue<Decimal?>?`
    extends ScalaDecimal with `box.NullableQueueOfNullable` {

  val scalaClass = "Option[Queue[Option[BigDecimal]]]"

  val defaultValue = "None"
}

case object `scala.Set<Decimal>`
    extends ScalaDecimal with `box.OneSetOfOne` {

  val scalaClass = "Set[BigDecimal]"

  val defaultValue = "Set[BigDecimal].empty"
}

case object `scala.Set<Decimal>?`
    extends ScalaDecimal with `box.NullableSetOfOne` {

  val scalaClass = "Option[Set[BigDecimal]]"

  val defaultValue = "None"
}

case object `scala.Set<Decimal?>`
    extends ScalaDecimal with `box.OneSetOfNullable` {

  val scalaClass = "Set[Option[BigDecimal]]"

  val defaultValue = "Set[Option[BigDecimal]].empty"
}

case object `scala.Set<Decimal?>?`
    extends ScalaDecimal with `box.NullableSetOfNullable` {

  val scalaClass = "Option[Set[Option[BigDecimal]]]"

  val defaultValue = "None"
}
