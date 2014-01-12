package com.dslplatform.ocd
package javas

import types._
import boxes._

sealed trait JavaRectangle
    extends OcdJava
    with `type.Rectangle`

case object `java.Rectangle`
    extends JavaRectangle with `box.One` {

  val javaClass = "java.awt.geom.Rectangle2D"

  val defaultValue = "new java.awt.Rectangle.Float()"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.Rectangle[]`
    extends JavaRectangle with `box.OneArrayOfOne` {

  val javaClass = "java.awt.geom.Rectangle2D[]"

  val defaultValue = "new java.awt.geom.Rectangle2D[0]"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.Rectangle?[]`
    extends JavaRectangle with `box.OneArrayOfNullable` {

  val javaClass = "java.awt.geom.Rectangle2D[]"

  val defaultValue = "new java.awt.geom.Rectangle2D[0]"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.List<Rectangle>`
    extends JavaRectangle with `box.OneListOfOne` {

  val javaClass = "java.util.List<java.awt.geom.Rectangle2D>"

  val defaultValue = "new java.util.ArrayList<java.awt.geom.Rectangle2D>(0)"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.List<Rectangle?>`
    extends JavaRectangle with `box.OneListOfNullable` {

  val javaClass = "java.util.List<java.awt.geom.Rectangle2D>"

  val defaultValue = "new java.util.ArrayList<java.awt.geom.Rectangle2D>(0)"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Set<Rectangle>`
    extends JavaRectangle with `box.OneSetOfOne` {

  val javaClass = "java.util.Set<java.awt.geom.Rectangle2D>"

  val defaultValue = "new java.util.HashSet<java.awt.geom.Rectangle2D>(0)"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Set<Rectangle?>`
    extends JavaRectangle with `box.OneSetOfNullable` {

  val javaClass = "java.util.Set<java.awt.geom.Rectangle2D>"

  val defaultValue = "new java.util.HashSet<java.awt.geom.Rectangle2D>(0)"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Rectangle?`
    extends JavaRectangle with `box.Nullable` {

  val javaClass = "java.awt.geom.Rectangle2D"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.Rectangle[]?`
    extends JavaRectangle with `box.NullableArrayOfOne` {

  val javaClass = "java.awt.geom.Rectangle2D[]"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.Rectangle?[]?`
    extends JavaRectangle with `box.NullableArrayOfNullable` {

  val javaClass = "java.awt.geom.Rectangle2D[]"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.List<Rectangle>?`
    extends JavaRectangle with `box.NullableListOfOne` {

  val javaClass = "java.util.List<java.awt.geom.Rectangle2D>"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.List<Rectangle?>?`
    extends JavaRectangle with `box.NullableListOfNullable` {

  val javaClass = "java.util.List<java.awt.geom.Rectangle2D>"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Set<Rectangle>?`
    extends JavaRectangle with `box.NullableSetOfOne` {

  val javaClass = "java.util.Set<java.awt.geom.Rectangle2D>"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Set<Rectangle?>?`
    extends JavaRectangle with `box.NullableSetOfNullable` {

  val javaClass = "java.util.Set<java.awt.geom.Rectangle2D>"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = true
}
