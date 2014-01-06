package com.dslplatform.ocd
package javas

import types._
import boxes._

sealed trait `JavaFloat`
    extends OcdJava
    with `type.Float`

case object `java.Float`
    extends `JavaFloat` with `box.One` {

  val javaClass = "float"

  val defaultValue = "0.0f"

  val isPrimitive = true
  val hasGenerics = false
}

case object `java.Float[]`
    extends `JavaFloat` with `box.OneArrayOfOne` {

  val javaClass = "float[]"

  val defaultValue = "new float[0]"

  val isPrimitive = true
  val hasGenerics = false
}

case object `java.Float?[]`
    extends `JavaFloat` with `box.OneArrayOfNullable` {

  val javaClass = "Float[0]"

  val defaultValue = "new Float[0]"

  val isPrimitive = true
  val hasGenerics = false
}

case object `java.List<Float>`
    extends `JavaFloat` with `box.OneListOfOne` {

  val javaClass = "java.util.List<Float>"

  val defaultValue = "new java.util.ArrayList<Float>(0)"

  val isPrimitive = true
  val hasGenerics = true
}

case object `java.List<Float?>`
    extends `JavaFloat` with `box.OneListOfNullable` {

  val javaClass = "java.util.List<Float>"

  val defaultValue = "new java.util.ArrayList<Float>(0)"

  val isPrimitive = true
  val hasGenerics = true
}

case object `java.Set<Float>`
    extends `JavaFloat` with `box.OneSetOfOne` {

  val javaClass = "java.util.Set<Float>"

  val defaultValue = "new java.util.HashSet<Float>(0)"

  val isPrimitive = true
  val hasGenerics = true
}

case object `java.Set<Float?>`
    extends `JavaFloat` with `box.OneSetOfNullable` {

  val javaClass = "java.util.Set<Float>"

  val defaultValue = "new java.util.HashSet<Float>(0)"

  val isPrimitive = true
  val hasGenerics = true
}

case object `java.Float?`
    extends `JavaFloat` with `box.Nullable` {

  val javaClass = "Float"

  val defaultValue = "null"

  val isPrimitive = true
  val hasGenerics = false
}

case object `java.Float[]?`
    extends `JavaFloat` with `box.NullableArrayOfOne` {

  val javaClass = "float[]"

  val defaultValue = "null"

  val isPrimitive = true
  val hasGenerics = false
}

case object `java.Float?[]?`
    extends `JavaFloat` with `box.NullableArrayOfNullable` {

  val javaClass = "Float[0]"

  val defaultValue = "null"

  val isPrimitive = true
  val hasGenerics = false
}

case object `java.List<Float>?`
    extends `JavaFloat` with `box.NullableListOfOne` {

  val javaClass = "java.util.List<Float>"

  val defaultValue = "null"

  val isPrimitive = true
  val hasGenerics = true
}

case object `java.List<Float?>?`
    extends `JavaFloat` with `box.NullableListOfNullable` {

  val javaClass = "java.util.List<Float>"

  val defaultValue = "null"

  val isPrimitive = true
  val hasGenerics = true
}

case object `java.Set<Float>?`
    extends `JavaFloat` with `box.NullableSetOfOne` {

  val javaClass = "java.util.Set<Float>"

  val defaultValue = "null"

  val isPrimitive = true
  val hasGenerics = true
}

case object `java.Set<Float?>?`
    extends `JavaFloat` with `box.NullableSetOfNullable` {

  val javaClass = "java.util.Set<Float>"

  val defaultValue = "null"

  val isPrimitive = true
  val hasGenerics = true
}
