package com.dslplatform.ocd
package scalas

import types._
import boxes._

sealed trait ScalaStringWithMaxLengthOf9
    extends OcdScalaBoxType
    with `type.String(9)`

case object `scala.String(9)`
    extends ScalaStringWithMaxLengthOf9 with `box.One` {

  val scalaClass = "String"

  val defaultValue = ""
}

case object `scala.String(9)?`
    extends ScalaStringWithMaxLengthOf9 with `box.Nullable` {

  val scalaClass = "Option[String]"

  val defaultValue = "None"
}

case object `scala.String(9)[]`
    extends ScalaStringWithMaxLengthOf9 with `box.OneArrayOfOne` {

  val scalaClass = "Array[String]"

  val defaultValue = "Array[String].empty"
}

case object `scala.String(9)[]?`
    extends ScalaStringWithMaxLengthOf9 with `box.NullableArrayOfOne` {

  val scalaClass = "Option[Array[String]]"

  val defaultValue = "None"
}

case object `scala.String(9)?[]`
    extends ScalaStringWithMaxLengthOf9 with `box.OneArrayOfNullable` {

  val scalaClass = "Array[Option[String]]"

  val defaultValue = "Array[Option[String]].empty"
}

case object `scala.String(9)?[]?`
    extends ScalaStringWithMaxLengthOf9 with `box.NullableArrayOfNullable` {

  val scalaClass = "Option[Array[Option[String]]]"

  val defaultValue = "None"
}

case object `scala.List<String(9)>`
    extends ScalaStringWithMaxLengthOf9 with `box.OneListOfOne` {

  val scalaClass = "IndexedSeq[String]"

  val defaultValue = "IndexedSeq[String].empty"
}

case object `scala.List<String(9)>?`
    extends ScalaStringWithMaxLengthOf9 with `box.NullableListOfOne` {

  val scalaClass = "Option[IndexedSeq[String]]"

  val defaultValue = "None"
}

case object `scala.List<String(9)?>`
    extends ScalaStringWithMaxLengthOf9 with `box.OneListOfNullable` {

  val scalaClass = "IndexedSeq[Option[String]]"

  val defaultValue = "IndexedSeq[Option[String]].empty"
}

case object `scala.List<String(9)?>?`
    extends ScalaStringWithMaxLengthOf9 with `box.NullableListOfNullable` {

  val scalaClass = "Option[IndexedSeq[Option[String]]]"

  val defaultValue = "None"
}

case object `scala.Set<String(9)>`
    extends ScalaStringWithMaxLengthOf9 with `box.OneSetOfOne` {

  val scalaClass = "Set[String]"

  val defaultValue = "Set[String].empty"
}

case object `scala.Set<String(9)>?`
    extends ScalaStringWithMaxLengthOf9 with `box.NullableSetOfOne` {

  val scalaClass = "Option[Set[String]]"

  val defaultValue = "None"
}

case object `scala.Set<String(9)?>`
    extends ScalaStringWithMaxLengthOf9 with `box.OneSetOfNullable` {

  val scalaClass = "Set[Option[String]]"

  val defaultValue = "Set[Option[String]].empty"
}

case object `scala.Set<String(9)?>?`
    extends ScalaStringWithMaxLengthOf9 with `box.NullableSetOfNullable` {

  val scalaClass = "Option[Set[Option[String]]]"

  val defaultValue = "None"
}
