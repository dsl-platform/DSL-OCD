package com.dslplatform.ocd
package scalas

import types._
import boxes._

sealed trait ScalaRectangle
    extends OcdScalaBoxType
    with `type.Rectangle`

case object `scala.Rectangle`
    extends ScalaRectangle with `box.One` {

  val scalaClass = "java.awt.geom.Rectangle2D"

  val defaultValue = "new java.awt.geom.Rectangle2D.Float"
}

case object `scala.Rectangle?`
    extends ScalaRectangle with `box.Nullable` {

  val scalaClass = "Option[java.awt.geom.Rectangle2D]"

  val defaultValue = "None"
}

case object `scala.Rectangle[]`
    extends ScalaRectangle with `box.OneArrayOfOne` {

  val scalaClass = "Array[java.awt.geom.Rectangle2D]"

  val defaultValue = "Array[java.awt.geom.Rectangle2D].empty"
}

case object `scala.Rectangle[]?`
    extends ScalaRectangle with `box.NullableArrayOfOne` {

  val scalaClass = "Option[Array[java.awt.geom.Rectangle2D]]"

  val defaultValue = "None"
}

case object `scala.Rectangle?[]`
    extends ScalaRectangle with `box.OneArrayOfNullable` {

  val scalaClass = "Array[Option[java.awt.geom.Rectangle2D]]"

  val defaultValue = "Array[Option[java.awt.geom.Rectangle2D]].empty"
}

case object `scala.Rectangle?[]?`
    extends ScalaRectangle with `box.NullableArrayOfNullable` {

  val scalaClass = "Option[Array[Option[java.awt.geom.Rectangle2D]]]"

  val defaultValue = "None"
}

case object `scala.List<Rectangle>`
    extends ScalaRectangle with `box.OneListOfOne` {

  val scalaClass = "IndexedSeq[java.awt.geom.Rectangle2D]"

  val defaultValue = "IndexedSeq[java.awt.geom.Rectangle2D].empty"
}

case object `scala.List<Rectangle>?`
    extends ScalaRectangle with `box.NullableListOfOne` {

  val scalaClass = "Option[IndexedSeq[java.awt.geom.Rectangle2D]]"

  val defaultValue = "None"
}

case object `scala.List<Rectangle?>`
    extends ScalaRectangle with `box.OneListOfNullable` {

  val scalaClass = "IndexedSeq[Option[java.awt.geom.Rectangle2D]]"

  val defaultValue = "IndexedSeq[Option[java.awt.geom.Rectangle2D]].empty"
}

case object `scala.List<Rectangle?>?`
    extends ScalaRectangle with `box.NullableListOfNullable` {

  val scalaClass = "Option[IndexedSeq[Option[java.awt.geom.Rectangle2D]]]"

  val defaultValue = "None"
}

case object `scala.Queue<Rectangle>`
    extends ScalaRectangle with `box.OneQueueOfOne` {

  val scalaClass = "Queue[java.awt.geom.Rectangle2D]"

  val defaultValue = "Queue[java.awt.geom.Rectangle2D].empty"
}

case object `scala.Queue<Rectangle>?`
    extends ScalaRectangle with `box.NullableQueueOfOne` {

  val scalaClass = "Option[Queue[java.awt.geom.Rectangle2D]]"

  val defaultValue = "None"
}

case object `scala.Queue<Rectangle?>`
    extends ScalaRectangle with `box.OneQueueOfNullable` {

  val scalaClass = "Queue[Option[java.awt.geom.Rectangle2D]]"

  val defaultValue = "Queue[Option[java.awt.geom.Rectangle2D]].empty"
}

case object `scala.Queue<Rectangle?>?`
    extends ScalaRectangle with `box.NullableQueueOfNullable` {

  val scalaClass = "Option[Queue[Option[java.awt.geom.Rectangle2D]]]"

  val defaultValue = "None"
}

case object `scala.Set<Rectangle>`
    extends ScalaRectangle with `box.OneSetOfOne` {

  val scalaClass = "Set[java.awt.geom.Rectangle2D]"

  val defaultValue = "Set[java.awt.geom.Rectangle2D].empty"
}

case object `scala.Set<Rectangle>?`
    extends ScalaRectangle with `box.NullableSetOfOne` {

  val scalaClass = "Option[Set[java.awt.geom.Rectangle2D]]"

  val defaultValue = "None"
}

case object `scala.Set<Rectangle?>`
    extends ScalaRectangle with `box.OneSetOfNullable` {

  val scalaClass = "Set[Option[java.awt.geom.Rectangle2D]]"

  val defaultValue = "Set[Option[java.awt.geom.Rectangle2D]].empty"
}

case object `scala.Set<Rectangle?>?`
    extends ScalaRectangle with `box.NullableSetOfNullable` {

  val scalaClass = "Option[Set[Option[java.awt.geom.Rectangle2D]]]"

  val defaultValue = "None"
}
