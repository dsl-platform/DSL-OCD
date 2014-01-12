package com.dslplatform.ocd
package scalas

import types._
import boxes._

sealed trait ScalaUrl
    extends OcdScala
    with `type.Url`

case object `scala.Url`
    extends ScalaUrl with `box.One` {

  val scalaClass = "java.net.URL"

  val defaultValue = "null"
}

case object `scala.Url[]`
    extends ScalaUrl with `box.OneArrayOfOne` {

  val scalaClass = "Array[java.net.URL]"

  val defaultValue = "Array[java.net.URL].empty"
}

case object `scala.Url?[]`
    extends ScalaUrl with `box.OneArrayOfNullable` {

  val scalaClass = "Array[Option[java.net.URL]]"

  val defaultValue = "Array[Option[java.net.URL]].empty"
}

case object `scala.List<Url>`
    extends ScalaUrl with `box.OneListOfOne` {

  val scalaClass = "List[java.net.URL]"

  val defaultValue = "List[java.net.URL].empty"
}

case object `scala.List<Url?>`
    extends ScalaUrl with `box.OneListOfNullable` {

  val scalaClass = "List[Option[java.net.URL]]"

  val defaultValue = "List[Option[java.net.URL]].empty"
}

case object `scala.Set<Url>`
    extends ScalaUrl with `box.OneSetOfOne` {

  val scalaClass = "Set[java.net.URL]"

  val defaultValue = "Set[java.net.URL].empty"
}

case object `scala.Set<Url?>`
    extends ScalaUrl with `box.OneSetOfNullable` {

  val scalaClass = "Set[Option[java.net.URL]]"

  val defaultValue = "Set[Option[java.net.URL]].empty"
}

case object `scala.Url?`
    extends ScalaUrl with `box.Nullable` {

  val scalaClass = "Option[java.net.URL]"

  val defaultValue = "None"
}

case object `scala.Url[]?`
    extends ScalaUrl with `box.NullableArrayOfOne` {

  val scalaClass = "Option[Array[java.net.URL]]"

  val defaultValue = "None"
}

case object `scala.Url?[]?`
    extends ScalaUrl with `box.NullableArrayOfNullable` {

  val scalaClass = "Option[Array[Option[java.net.URL]]]"

  val defaultValue = "None"
}

case object `scala.List<Url>?`
    extends ScalaUrl with `box.NullableListOfOne` {

  val scalaClass = "Option[List[java.net.URL]]"

  val defaultValue = "None"
}

case object `scala.List<Url?>?`
    extends ScalaUrl with `box.NullableListOfNullable` {

  val scalaClass = "Option[List[Option[java.net.URL]]]"

  val defaultValue = "None"
}

case object `scala.Set<Url>?`
    extends ScalaUrl with `box.NullableSetOfOne` {

  val scalaClass = "Option[Set[java.net.URL]]"

  val defaultValue = "None"
}

case object `scala.Set<Url?>?`
    extends ScalaUrl with `box.NullableSetOfNullable` {

  val scalaClass = "Option[Set[Option[java.net.URL]]]"

  val defaultValue = "None"
}
