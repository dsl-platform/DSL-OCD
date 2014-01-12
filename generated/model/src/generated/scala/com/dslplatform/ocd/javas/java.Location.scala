package com.dslplatform.ocd
package javas

import types._
import boxes._

sealed trait JavaLocation
    extends OcdJava
    with `type.Location`

case object `java.Location`
    extends JavaLocation with `box.One` {

  val javaClass = "java.awt.geom.Point2D"

  val defaultValue = "new java.awt.Point.Float()"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.Location[]`
    extends JavaLocation with `box.OneArrayOfOne` {

  val javaClass = "java.awt.geom.Point2D[]"

  val defaultValue = "new java.awt.geom.Point2D[0]"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.Location?[]`
    extends JavaLocation with `box.OneArrayOfNullable` {

  val javaClass = "java.awt.geom.Point2D[]"

  val defaultValue = "new java.awt.geom.Point2D[0]"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.List<Location>`
    extends JavaLocation with `box.OneListOfOne` {

  val javaClass = "java.util.List<java.awt.geom.Point2D>"

  val defaultValue = "new java.util.ArrayList<java.awt.geom.Point2D>(0)"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.List<Location?>`
    extends JavaLocation with `box.OneListOfNullable` {

  val javaClass = "java.util.List<java.awt.geom.Point2D>"

  val defaultValue = "new java.util.ArrayList<java.awt.geom.Point2D>(0)"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Set<Location>`
    extends JavaLocation with `box.OneSetOfOne` {

  val javaClass = "java.util.Set<java.awt.geom.Point2D>"

  val defaultValue = "new java.util.HashSet<java.awt.geom.Point2D>(0)"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Set<Location?>`
    extends JavaLocation with `box.OneSetOfNullable` {

  val javaClass = "java.util.Set<java.awt.geom.Point2D>"

  val defaultValue = "new java.util.HashSet<java.awt.geom.Point2D>(0)"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Location?`
    extends JavaLocation with `box.Nullable` {

  val javaClass = "java.awt.geom.Point2D"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.Location[]?`
    extends JavaLocation with `box.NullableArrayOfOne` {

  val javaClass = "java.awt.geom.Point2D[]"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.Location?[]?`
    extends JavaLocation with `box.NullableArrayOfNullable` {

  val javaClass = "java.awt.geom.Point2D[]"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.List<Location>?`
    extends JavaLocation with `box.NullableListOfOne` {

  val javaClass = "java.util.List<java.awt.geom.Point2D>"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.List<Location?>?`
    extends JavaLocation with `box.NullableListOfNullable` {

  val javaClass = "java.util.List<java.awt.geom.Point2D>"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Set<Location>?`
    extends JavaLocation with `box.NullableSetOfOne` {

  val javaClass = "java.util.Set<java.awt.geom.Point2D>"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Set<Location?>?`
    extends JavaLocation with `box.NullableSetOfNullable` {

  val javaClass = "java.util.Set<java.awt.geom.Point2D>"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = true
}
