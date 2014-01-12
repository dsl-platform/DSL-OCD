package com.dslplatform.ocd
package scalas

import types._
import boxes._

sealed trait ScalaInteger
    extends OcdScala
    with `type.Integer`

case object `scala.Integer`
    extends ScalaInteger with `box.One` {

  val scalaClass = "Int"

  val defaultValue = "0"
}

case object `scala.Integer[]`
    extends ScalaInteger with `box.OneArrayOfOne` {

  val scalaClass = "Array[Int]"

  val defaultValue = "Array[Int].empty"
}

case object `scala.Integer?[]`
    extends ScalaInteger with `box.OneArrayOfNullable` {

  val scalaClass = "Array[Option[Int]]"

  val defaultValue = "Array[Option[Int]].empty"
}

case object `scala.List<Integer>`
    extends ScalaInteger with `box.OneListOfOne` {

  val scalaClass = "List[Int]"

  val defaultValue = "List[Int].empty"
}

case object `scala.List<Integer?>`
    extends ScalaInteger with `box.OneListOfNullable` {

  val scalaClass = "List[Option[Int]]"

  val defaultValue = "List[Option[Int]].empty"
}

case object `scala.Set<Integer>`
    extends ScalaInteger with `box.OneSetOfOne` {

  val scalaClass = "Set[Int]"

  val defaultValue = "Set[Int].empty"
}

case object `scala.Set<Integer?>`
    extends ScalaInteger with `box.OneSetOfNullable` {

  val scalaClass = "Set[Option[Int]]"

  val defaultValue = "Set[Option[Int]].empty"
}

case object `scala.Integer?`
    extends ScalaInteger with `box.Nullable` {

  val scalaClass = "Option[Int]"

  val defaultValue = "None"
}

case object `scala.Integer[]?`
    extends ScalaInteger with `box.NullableArrayOfOne` {

  val scalaClass = "Option[Array[Int]]"

  val defaultValue = "None"
}

case object `scala.Integer?[]?`
    extends ScalaInteger with `box.NullableArrayOfNullable` {

  val scalaClass = "Option[Array[Option[Int]]]"

  val defaultValue = "None"
}

case object `scala.List<Integer>?`
    extends ScalaInteger with `box.NullableListOfOne` {

  val scalaClass = "Option[List[Int]]"

  val defaultValue = "None"
}

case object `scala.List<Integer?>?`
    extends ScalaInteger with `box.NullableListOfNullable` {

  val scalaClass = "Option[List[Option[Int]]]"

  val defaultValue = "None"
}

case object `scala.Set<Integer>?`
    extends ScalaInteger with `box.NullableSetOfOne` {

  val scalaClass = "Option[Set[Int]]"

  val defaultValue = "None"
}

case object `scala.Set<Integer?>?`
    extends ScalaInteger with `box.NullableSetOfNullable` {

  val scalaClass = "Option[Set[Option[Int]]]"

  val defaultValue = "None"
}
