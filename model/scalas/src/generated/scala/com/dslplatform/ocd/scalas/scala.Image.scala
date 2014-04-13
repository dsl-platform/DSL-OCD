package com.dslplatform.ocd
package scalas

import types._
import boxes._

sealed trait ScalaImage
    extends OcdScalaBoxType
    with `type.Image`

case object `scala.Image`
    extends ScalaImage with `box.One` {

  val scalaClass = "java.awt.image.BufferedImage"

  val defaultValue = "new java.awt.image.BufferedImage(1, 1, java.awt.image.BufferedImage.TYPE_4BYTE_ABGR)"
}

case object `scala.Image?`
    extends ScalaImage with `box.Nullable` {

  val scalaClass = "Option[java.awt.image.BufferedImage]"

  val defaultValue = "None"
}

case object `scala.Image[]`
    extends ScalaImage with `box.OneArrayOfOne` {

  val scalaClass = "Array[java.awt.image.BufferedImage]"

  val defaultValue = "Array[java.awt.image.BufferedImage].empty"
}

case object `scala.Image[]?`
    extends ScalaImage with `box.NullableArrayOfOne` {

  val scalaClass = "Option[Array[java.awt.image.BufferedImage]]"

  val defaultValue = "None"
}

case object `scala.Image?[]`
    extends ScalaImage with `box.OneArrayOfNullable` {

  val scalaClass = "Array[Option[java.awt.image.BufferedImage]]"

  val defaultValue = "Array[Option[java.awt.image.BufferedImage]].empty"
}

case object `scala.Image?[]?`
    extends ScalaImage with `box.NullableArrayOfNullable` {

  val scalaClass = "Option[Array[Option[java.awt.image.BufferedImage]]]"

  val defaultValue = "None"
}

case object `scala.List<Image>`
    extends ScalaImage with `box.OneListOfOne` {

  val scalaClass = "IndexedSeq[java.awt.image.BufferedImage]"

  val defaultValue = "IndexedSeq[java.awt.image.BufferedImage].empty"
}

case object `scala.List<Image>?`
    extends ScalaImage with `box.NullableListOfOne` {

  val scalaClass = "Option[IndexedSeq[java.awt.image.BufferedImage]]"

  val defaultValue = "None"
}

case object `scala.List<Image?>`
    extends ScalaImage with `box.OneListOfNullable` {

  val scalaClass = "IndexedSeq[Option[java.awt.image.BufferedImage]]"

  val defaultValue = "IndexedSeq[Option[java.awt.image.BufferedImage]].empty"
}

case object `scala.List<Image?>?`
    extends ScalaImage with `box.NullableListOfNullable` {

  val scalaClass = "Option[IndexedSeq[Option[java.awt.image.BufferedImage]]]"

  val defaultValue = "None"
}

case object `scala.Set<Image>`
    extends ScalaImage with `box.OneSetOfOne` {

  val scalaClass = "Set[java.awt.image.BufferedImage]"

  val defaultValue = "Set[java.awt.image.BufferedImage].empty"
}

case object `scala.Set<Image>?`
    extends ScalaImage with `box.NullableSetOfOne` {

  val scalaClass = "Option[Set[java.awt.image.BufferedImage]]"

  val defaultValue = "None"
}

case object `scala.Set<Image?>`
    extends ScalaImage with `box.OneSetOfNullable` {

  val scalaClass = "Set[Option[java.awt.image.BufferedImage]]"

  val defaultValue = "Set[Option[java.awt.image.BufferedImage]].empty"
}

case object `scala.Set<Image?>?`
    extends ScalaImage with `box.NullableSetOfNullable` {

  val scalaClass = "Option[Set[Option[java.awt.image.BufferedImage]]]"

  val defaultValue = "None"
}
