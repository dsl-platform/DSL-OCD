package com.dslplatform.ocd
package scalas

import types._
import boxes._

sealed trait ScalaLocation
    extends OcdScalaBoxType
    with `type.Location`

case object `scala.Location`
    extends ScalaLocation with `box.One` {

  val scalaClass = "java.awt.geom.Point2D"

  val defaultValue = "new java.awt.geom.Point2D.Float"
}

case object `scala.Location?`
    extends ScalaLocation with `box.Nullable` {

  val scalaClass = "Option[java.awt.geom.Point2D]"

  val defaultValue = "None"
}

case object `scala.Location[]`
    extends ScalaLocation with `box.OneArrayOfOne` {

  val scalaClass = "Array[java.awt.geom.Point2D]"

  val defaultValue = "Array[java.awt.geom.Point2D].empty"
}

case object `scala.Location[]?`
    extends ScalaLocation with `box.NullableArrayOfOne` {

  val scalaClass = "Option[Array[java.awt.geom.Point2D]]"

  val defaultValue = "None"
}

case object `scala.Location?[]`
    extends ScalaLocation with `box.OneArrayOfNullable` {

  val scalaClass = "Array[Option[java.awt.geom.Point2D]]"

  val defaultValue = "Array[Option[java.awt.geom.Point2D]].empty"
}

case object `scala.Location?[]?`
    extends ScalaLocation with `box.NullableArrayOfNullable` {

  val scalaClass = "Option[Array[Option[java.awt.geom.Point2D]]]"

  val defaultValue = "None"
}

case object `scala.List<Location>`
    extends ScalaLocation with `box.OneListOfOne` {

  val scalaClass = "IndexedSeq[java.awt.geom.Point2D]"

  val defaultValue = "IndexedSeq[java.awt.geom.Point2D].empty"
}

case object `scala.List<Location>?`
    extends ScalaLocation with `box.NullableListOfOne` {

  val scalaClass = "Option[IndexedSeq[java.awt.geom.Point2D]]"

  val defaultValue = "None"
}

case object `scala.List<Location?>`
    extends ScalaLocation with `box.OneListOfNullable` {

  val scalaClass = "IndexedSeq[Option[java.awt.geom.Point2D]]"

  val defaultValue = "IndexedSeq[Option[java.awt.geom.Point2D]].empty"
}

case object `scala.List<Location?>?`
    extends ScalaLocation with `box.NullableListOfNullable` {

  val scalaClass = "Option[IndexedSeq[Option[java.awt.geom.Point2D]]]"

  val defaultValue = "None"
}

case object `scala.Set<Location>`
    extends ScalaLocation with `box.OneSetOfOne` {

  val scalaClass = "Set[java.awt.geom.Point2D]"

  val defaultValue = "Set[java.awt.geom.Point2D].empty"
}

case object `scala.Set<Location>?`
    extends ScalaLocation with `box.NullableSetOfOne` {

  val scalaClass = "Option[Set[java.awt.geom.Point2D]]"

  val defaultValue = "None"
}

case object `scala.Set<Location?>`
    extends ScalaLocation with `box.OneSetOfNullable` {

  val scalaClass = "Set[Option[java.awt.geom.Point2D]]"

  val defaultValue = "Set[Option[java.awt.geom.Point2D]].empty"
}

case object `scala.Set<Location?>?`
    extends ScalaLocation with `box.NullableSetOfNullable` {

  val scalaClass = "Option[Set[Option[java.awt.geom.Point2D]]]"

  val defaultValue = "None"
}
