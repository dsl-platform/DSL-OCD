package com.dslplatform.ocd
package scalas

import types._
import boxes._

sealed trait ScalaFloat
    extends OcdScala
    with `type.Float`

case object `scala.Float`
    extends ScalaFloat with `box.One` {

  val scalaClass = "Float"

  val defaultValue = "0.0f"
}

case object `scala.Float[]`
    extends ScalaFloat with `box.OneArrayOfOne` {

  val scalaClass = "Array[Float]"

  val defaultValue = "Array[Float].empty"
}

case object `scala.Float?[]`
    extends ScalaFloat with `box.OneArrayOfNullable` {

  val scalaClass = "Array[Option[Float]]"

  val defaultValue = "Array[Option[Float]].empty"
}

case object `scala.List<Float>`
    extends ScalaFloat with `box.OneListOfOne` {

  val scalaClass = "List[Float]"

  val defaultValue = "List[Float].empty"
}

case object `scala.List<Float?>`
    extends ScalaFloat with `box.OneListOfNullable` {

  val scalaClass = "List[Option[Float]]"

  val defaultValue = "List[Option[Float]].empty"
}

case object `scala.Set<Float>`
    extends ScalaFloat with `box.OneSetOfOne` {

  val scalaClass = "Set[Float]"

  val defaultValue = "Set[Float].empty"
}

case object `scala.Set<Float?>`
    extends ScalaFloat with `box.OneSetOfNullable` {

  val scalaClass = "Set[Option[Float]]"

  val defaultValue = "Set[Option[Float]].empty"
}

case object `scala.Float?`
    extends ScalaFloat with `box.Nullable` {

  val scalaClass = "Option[Float]"

  val defaultValue = "None"
}

case object `scala.Float[]?`
    extends ScalaFloat with `box.NullableArrayOfOne` {

  val scalaClass = "Option[Array[Float]]"

  val defaultValue = "None"
}

case object `scala.Float?[]?`
    extends ScalaFloat with `box.NullableArrayOfNullable` {

  val scalaClass = "Option[Array[Option[Float]]]"

  val defaultValue = "None"
}

case object `scala.List<Float>?`
    extends ScalaFloat with `box.NullableListOfOne` {

  val scalaClass = "Option[List[Float]]"

  val defaultValue = "None"
}

case object `scala.List<Float?>?`
    extends ScalaFloat with `box.NullableListOfNullable` {

  val scalaClass = "Option[List[Option[Float]]]"

  val defaultValue = "None"
}

case object `scala.Set<Float>?`
    extends ScalaFloat with `box.NullableSetOfOne` {

  val scalaClass = "Option[Set[Float]]"

  val defaultValue = "None"
}

case object `scala.Set<Float?>?`
    extends ScalaFloat with `box.NullableSetOfNullable` {

  val scalaClass = "Option[Set[Option[Float]]]"

  val defaultValue = "None"
}
