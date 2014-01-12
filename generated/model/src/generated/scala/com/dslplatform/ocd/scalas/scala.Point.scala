package com.dslplatform.ocd
package scalas

import types._
import boxes._

sealed trait ScalaPoint
    extends OcdScala
    with `type.Point`

case object `scala.Point`
    extends ScalaPoint with `box.One` {

  val scalaClass = "java.awt.geom.Point2D"

  val defaultValue = "new java.awt.Point"
}

case object `scala.Point[]`
    extends ScalaPoint with `box.OneArrayOfOne` {

  val scalaClass = "Array[java.awt.geom.Point2D]"

  val defaultValue = "Array[java.awt.geom.Point2D].empty"
}

case object `scala.Point?[]`
    extends ScalaPoint with `box.OneArrayOfNullable` {

  val scalaClass = "Array[Option[java.awt.geom.Point2D]]"

  val defaultValue = "Array[Option[java.awt.geom.Point2D]].empty"
}

case object `scala.List<Point>`
    extends ScalaPoint with `box.OneListOfOne` {

  val scalaClass = "List[java.awt.geom.Point2D]"

  val defaultValue = "List[java.awt.geom.Point2D].empty"
}

case object `scala.List<Point?>`
    extends ScalaPoint with `box.OneListOfNullable` {

  val scalaClass = "List[Option[java.awt.geom.Point2D]]"

  val defaultValue = "List[Option[java.awt.geom.Point2D]].empty"
}

case object `scala.Set<Point>`
    extends ScalaPoint with `box.OneSetOfOne` {

  val scalaClass = "Set[java.awt.geom.Point2D]"

  val defaultValue = "Set[java.awt.geom.Point2D].empty"
}

case object `scala.Set<Point?>`
    extends ScalaPoint with `box.OneSetOfNullable` {

  val scalaClass = "Set[Option[java.awt.geom.Point2D]]"

  val defaultValue = "Set[Option[java.awt.geom.Point2D]].empty"
}

case object `scala.Point?`
    extends ScalaPoint with `box.Nullable` {

  val scalaClass = "Option[java.awt.geom.Point2D]"

  val defaultValue = "None"
}

case object `scala.Point[]?`
    extends ScalaPoint with `box.NullableArrayOfOne` {

  val scalaClass = "Option[Array[java.awt.geom.Point2D]]"

  val defaultValue = "None"
}

case object `scala.Point?[]?`
    extends ScalaPoint with `box.NullableArrayOfNullable` {

  val scalaClass = "Option[Array[Option[java.awt.geom.Point2D]]]"

  val defaultValue = "None"
}

case object `scala.List<Point>?`
    extends ScalaPoint with `box.NullableListOfOne` {

  val scalaClass = "Option[List[java.awt.geom.Point2D]]"

  val defaultValue = "None"
}

case object `scala.List<Point?>?`
    extends ScalaPoint with `box.NullableListOfNullable` {

  val scalaClass = "Option[List[Option[java.awt.geom.Point2D]]]"

  val defaultValue = "None"
}

case object `scala.Set<Point>?`
    extends ScalaPoint with `box.NullableSetOfOne` {

  val scalaClass = "Option[Set[java.awt.geom.Point2D]]"

  val defaultValue = "None"
}

case object `scala.Set<Point?>?`
    extends ScalaPoint with `box.NullableSetOfNullable` {

  val scalaClass = "Option[Set[Option[java.awt.geom.Point2D]]]"

  val defaultValue = "None"
}
