package com.dslplatform.ocd
package javas

import types._
import boxes._

sealed trait `JavaPoint`
    extends OcdJava
    with `type.Point`

case object `java.Point`
    extends `JavaPoint` with `box.One` {

  val javaClass = "java.awt.geom.Point2D"

  val defaultValue = "new java.awt.Point()"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.Point[]`
    extends `JavaPoint` with `box.OneArrayOfOne` {

  val javaClass = "java.awt.geom.Point2D[]"

  val defaultValue = "new java.awt.geom.Point2D[0]"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.Point?[]`
    extends `JavaPoint` with `box.OneArrayOfNullable` {

  val javaClass = "java.awt.geom.Point2D[0]"

  val defaultValue = "new java.awt.geom.Point2D[0]"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.List<Point>`
    extends `JavaPoint` with `box.OneListOfOne` {

  val javaClass = "java.util.List<java.awt.geom.Point2D>"

  val defaultValue = "new java.util.ArrayList<java.awt.geom.Point2D>(0)"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.List<Point?>`
    extends `JavaPoint` with `box.OneListOfNullable` {

  val javaClass = "java.util.List<java.awt.geom.Point2D>"

  val defaultValue = "new java.util.ArrayList<java.awt.geom.Point2D>(0)"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Set<Point>`
    extends `JavaPoint` with `box.OneSetOfOne` {

  val javaClass = "java.util.Set<java.awt.geom.Point2D>"

  val defaultValue = "new java.util.HashSet<java.awt.geom.Point2D>(0)"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Set<Point?>`
    extends `JavaPoint` with `box.OneSetOfNullable` {

  val javaClass = "java.util.Set<java.awt.geom.Point2D>"

  val defaultValue = "new java.util.HashSet<java.awt.geom.Point2D>(0)"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Point?`
    extends `JavaPoint` with `box.Nullable` {

  val javaClass = "java.awt.geom.Point2D"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.Point[]?`
    extends `JavaPoint` with `box.NullableArrayOfOne` {

  val javaClass = "java.awt.geom.Point2D[]"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.Point?[]?`
    extends `JavaPoint` with `box.NullableArrayOfNullable` {

  val javaClass = "java.awt.geom.Point2D[0]"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.List<Point>?`
    extends `JavaPoint` with `box.NullableListOfOne` {

  val javaClass = "java.util.List<java.awt.geom.Point2D>"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.List<Point?>?`
    extends `JavaPoint` with `box.NullableListOfNullable` {

  val javaClass = "java.util.List<java.awt.geom.Point2D>"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Set<Point>?`
    extends `JavaPoint` with `box.NullableSetOfOne` {

  val javaClass = "java.util.Set<java.awt.geom.Point2D>"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Set<Point?>?`
    extends `JavaPoint` with `box.NullableSetOfNullable` {

  val javaClass = "java.util.Set<java.awt.geom.Point2D>"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = true
}
