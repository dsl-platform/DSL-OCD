package com.dslplatform.ocd
package scalas

import types._
import boxes._

sealed trait ScalaText
    extends OcdScala
    with `type.Text`

case object `scala.Text`
    extends ScalaText with `box.One` {

  val scalaClass = "String"

  val defaultValue = ""
}

case object `scala.Text[]`
    extends ScalaText with `box.OneArrayOfOne` {

  val scalaClass = "Array[String]"

  val defaultValue = "Array[String].empty"
}

case object `scala.Text?[]`
    extends ScalaText with `box.OneArrayOfNullable` {

  val scalaClass = "Array[Option[String]]"

  val defaultValue = "Array[Option[String]].empty"
}

case object `scala.List<Text>`
    extends ScalaText with `box.OneListOfOne` {

  val scalaClass = "List[String]"

  val defaultValue = "List[String].empty"
}

case object `scala.List<Text?>`
    extends ScalaText with `box.OneListOfNullable` {

  val scalaClass = "List[Option[String]]"

  val defaultValue = "List[Option[String]].empty"
}

case object `scala.Set<Text>`
    extends ScalaText with `box.OneSetOfOne` {

  val scalaClass = "Set[String]"

  val defaultValue = "Set[String].empty"
}

case object `scala.Set<Text?>`
    extends ScalaText with `box.OneSetOfNullable` {

  val scalaClass = "Set[Option[String]]"

  val defaultValue = "Set[Option[String]].empty"
}

case object `scala.Text?`
    extends ScalaText with `box.Nullable` {

  val scalaClass = "Option[String]"

  val defaultValue = "None"
}

case object `scala.Text[]?`
    extends ScalaText with `box.NullableArrayOfOne` {

  val scalaClass = "Option[Array[String]]"

  val defaultValue = "None"
}

case object `scala.Text?[]?`
    extends ScalaText with `box.NullableArrayOfNullable` {

  val scalaClass = "Option[Array[Option[String]]]"

  val defaultValue = "None"
}

case object `scala.List<Text>?`
    extends ScalaText with `box.NullableListOfOne` {

  val scalaClass = "Option[List[String]]"

  val defaultValue = "None"
}

case object `scala.List<Text?>?`
    extends ScalaText with `box.NullableListOfNullable` {

  val scalaClass = "Option[List[Option[String]]]"

  val defaultValue = "None"
}

case object `scala.Set<Text>?`
    extends ScalaText with `box.NullableSetOfOne` {

  val scalaClass = "Option[Set[String]]"

  val defaultValue = "None"
}

case object `scala.Set<Text?>?`
    extends ScalaText with `box.NullableSetOfNullable` {

  val scalaClass = "Option[Set[Option[String]]]"

  val defaultValue = "None"
}
