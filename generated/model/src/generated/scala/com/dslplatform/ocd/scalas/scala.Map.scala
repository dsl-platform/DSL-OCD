package com.dslplatform.ocd
package scalas

import types._
import boxes._

sealed trait ScalaMap
    extends OcdScala
    with `type.Map`

case object `scala.Map`
    extends ScalaMap with `box.One` {

  val scalaClass = "Map[String, String]"

  val defaultValue = "Map[String, String].empty"
}

case object `scala.Map[]`
    extends ScalaMap with `box.OneArrayOfOne` {

  val scalaClass = "Array[Map[String, String]]"

  val defaultValue = "Array[Map[String, String]].empty"
}

case object `scala.Map?[]`
    extends ScalaMap with `box.OneArrayOfNullable` {

  val scalaClass = "Array[Option[Map[String, String]]]"

  val defaultValue = "Array[Option[Map[String, String]]].empty"
}

case object `scala.List<Map>`
    extends ScalaMap with `box.OneListOfOne` {

  val scalaClass = "List[Map[String, String]]"

  val defaultValue = "List[Map[String, String]].empty"
}

case object `scala.List<Map?>`
    extends ScalaMap with `box.OneListOfNullable` {

  val scalaClass = "List[Option[Map[String, String]]]"

  val defaultValue = "List[Option[Map[String, String]]].empty"
}

case object `scala.Set<Map>`
    extends ScalaMap with `box.OneSetOfOne` {

  val scalaClass = "Set[Map[String, String]]"

  val defaultValue = "Set[Map[String, String]].empty"
}

case object `scala.Set<Map?>`
    extends ScalaMap with `box.OneSetOfNullable` {

  val scalaClass = "Set[Option[Map[String, String]]]"

  val defaultValue = "Set[Option[Map[String, String]]].empty"
}

case object `scala.Map?`
    extends ScalaMap with `box.Nullable` {

  val scalaClass = "Option[Map[String, String]]"

  val defaultValue = "None"
}

case object `scala.Map[]?`
    extends ScalaMap with `box.NullableArrayOfOne` {

  val scalaClass = "Option[Array[Map[String, String]]]"

  val defaultValue = "None"
}

case object `scala.Map?[]?`
    extends ScalaMap with `box.NullableArrayOfNullable` {

  val scalaClass = "Option[Array[Option[Map[String, String]]]]"

  val defaultValue = "None"
}

case object `scala.List<Map>?`
    extends ScalaMap with `box.NullableListOfOne` {

  val scalaClass = "Option[List[Map[String, String]]]"

  val defaultValue = "None"
}

case object `scala.List<Map?>?`
    extends ScalaMap with `box.NullableListOfNullable` {

  val scalaClass = "Option[List[Option[Map[String, String]]]]"

  val defaultValue = "None"
}

case object `scala.Set<Map>?`
    extends ScalaMap with `box.NullableSetOfOne` {

  val scalaClass = "Option[Set[Map[String, String]]]"

  val defaultValue = "None"
}

case object `scala.Set<Map?>?`
    extends ScalaMap with `box.NullableSetOfNullable` {

  val scalaClass = "Option[Set[Option[Map[String, String]]]]"

  val defaultValue = "None"
}
