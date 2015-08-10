package com.dslplatform.ocd
package scalas

import types._
import boxes._

sealed trait ScalaDate
    extends OcdScalaBoxType
    with `type.Date`

case object `scala.Date`
    extends ScalaDate with `box.One` {

  val scalaClass = "org.joda.time.LocalDate"

  val defaultValue = "org.joda.time.LocalDate.now"
}

case object `scala.Date?`
    extends ScalaDate with `box.Nullable` {

  val scalaClass = "Option[org.joda.time.LocalDate]"

  val defaultValue = "None"
}

case object `scala.Date[]`
    extends ScalaDate with `box.OneArrayOfOne` {

  val scalaClass = "Array[org.joda.time.LocalDate]"

  val defaultValue = "Array[org.joda.time.LocalDate].empty"
}

case object `scala.Date[]?`
    extends ScalaDate with `box.NullableArrayOfOne` {

  val scalaClass = "Option[Array[org.joda.time.LocalDate]]"

  val defaultValue = "None"
}

case object `scala.Date?[]`
    extends ScalaDate with `box.OneArrayOfNullable` {

  val scalaClass = "Array[Option[org.joda.time.LocalDate]]"

  val defaultValue = "Array[Option[org.joda.time.LocalDate]].empty"
}

case object `scala.Date?[]?`
    extends ScalaDate with `box.NullableArrayOfNullable` {

  val scalaClass = "Option[Array[Option[org.joda.time.LocalDate]]]"

  val defaultValue = "None"
}

case object `scala.List<Date>`
    extends ScalaDate with `box.OneListOfOne` {

  val scalaClass = "IndexedSeq[org.joda.time.LocalDate]"

  val defaultValue = "IndexedSeq[org.joda.time.LocalDate].empty"
}

case object `scala.List<Date>?`
    extends ScalaDate with `box.NullableListOfOne` {

  val scalaClass = "Option[IndexedSeq[org.joda.time.LocalDate]]"

  val defaultValue = "None"
}

case object `scala.List<Date?>`
    extends ScalaDate with `box.OneListOfNullable` {

  val scalaClass = "IndexedSeq[Option[org.joda.time.LocalDate]]"

  val defaultValue = "IndexedSeq[Option[org.joda.time.LocalDate]].empty"
}

case object `scala.List<Date?>?`
    extends ScalaDate with `box.NullableListOfNullable` {

  val scalaClass = "Option[IndexedSeq[Option[org.joda.time.LocalDate]]]"

  val defaultValue = "None"
}

case object `scala.Queue<Date>`
    extends ScalaDate with `box.OneQueueOfOne` {

  val scalaClass = "Queue[org.joda.time.LocalDate]"

  val defaultValue = "Queue[org.joda.time.LocalDate].empty"
}

case object `scala.Queue<Date>?`
    extends ScalaDate with `box.NullableQueueOfOne` {

  val scalaClass = "Option[Queue[org.joda.time.LocalDate]]"

  val defaultValue = "None"
}

case object `scala.Queue<Date?>`
    extends ScalaDate with `box.OneQueueOfNullable` {

  val scalaClass = "Queue[Option[org.joda.time.LocalDate]]"

  val defaultValue = "Queue[Option[org.joda.time.LocalDate]].empty"
}

case object `scala.Queue<Date?>?`
    extends ScalaDate with `box.NullableQueueOfNullable` {

  val scalaClass = "Option[Queue[Option[org.joda.time.LocalDate]]]"

  val defaultValue = "None"
}

case object `scala.Set<Date>`
    extends ScalaDate with `box.OneSetOfOne` {

  val scalaClass = "Set[org.joda.time.LocalDate]"

  val defaultValue = "Set[org.joda.time.LocalDate].empty"
}

case object `scala.Set<Date>?`
    extends ScalaDate with `box.NullableSetOfOne` {

  val scalaClass = "Option[Set[org.joda.time.LocalDate]]"

  val defaultValue = "None"
}

case object `scala.Set<Date?>`
    extends ScalaDate with `box.OneSetOfNullable` {

  val scalaClass = "Set[Option[org.joda.time.LocalDate]]"

  val defaultValue = "Set[Option[org.joda.time.LocalDate]].empty"
}

case object `scala.Set<Date?>?`
    extends ScalaDate with `box.NullableSetOfNullable` {

  val scalaClass = "Option[Set[Option[org.joda.time.LocalDate]]]"

  val defaultValue = "None"
}
