package com.dslplatform.ocd
package javas

import types._
import boxes._

sealed trait JavaBoolean
    extends OcdJava
    with `type.Boolean`

case object `java.Boolean`
    extends JavaBoolean with `box.One` {

  val javaClass = "boolean"

  val defaultValue = "false"

  val isPrimitive = true
  val hasGenerics = false
}

case object `java.Boolean[]`
    extends JavaBoolean with `box.OneArrayOfOne` {

  val javaClass = "boolean[]"

  val defaultValue = "new boolean[0]"

  val isPrimitive = true
  val hasGenerics = false
}

case object `java.Boolean?[]`
    extends JavaBoolean with `box.OneArrayOfNullable` {

  val javaClass = "Boolean[]"

  val defaultValue = "new Boolean[0]"

  val isPrimitive = true
  val hasGenerics = false
}

case object `java.List<Boolean>`
    extends JavaBoolean with `box.OneListOfOne` {

  val javaClass = "java.util.List<Boolean>"

  val defaultValue = "new java.util.ArrayList<Boolean>(0)"

  val isPrimitive = true
  val hasGenerics = true
}

case object `java.List<Boolean?>`
    extends JavaBoolean with `box.OneListOfNullable` {

  val javaClass = "java.util.List<Boolean>"

  val defaultValue = "new java.util.ArrayList<Boolean>(0)"

  val isPrimitive = true
  val hasGenerics = true
}

case object `java.Set<Boolean>`
    extends JavaBoolean with `box.OneSetOfOne` {

  val javaClass = "java.util.Set<Boolean>"

  val defaultValue = "new java.util.HashSet<Boolean>(0)"

  val isPrimitive = true
  val hasGenerics = true
}

case object `java.Set<Boolean?>`
    extends JavaBoolean with `box.OneSetOfNullable` {

  val javaClass = "java.util.Set<Boolean>"

  val defaultValue = "new java.util.HashSet<Boolean>(0)"

  val isPrimitive = true
  val hasGenerics = true
}

case object `java.Boolean?`
    extends JavaBoolean with `box.Nullable` {

  val javaClass = "Boolean"

  val defaultValue = "null"

  val isPrimitive = true
  val hasGenerics = false
}

case object `java.Boolean[]?`
    extends JavaBoolean with `box.NullableArrayOfOne` {

  val javaClass = "boolean[]"

  val defaultValue = "null"

  val isPrimitive = true
  val hasGenerics = false
}

case object `java.Boolean?[]?`
    extends JavaBoolean with `box.NullableArrayOfNullable` {

  val javaClass = "Boolean[]"

  val defaultValue = "null"

  val isPrimitive = true
  val hasGenerics = false
}

case object `java.List<Boolean>?`
    extends JavaBoolean with `box.NullableListOfOne` {

  val javaClass = "java.util.List<Boolean>"

  val defaultValue = "null"

  val isPrimitive = true
  val hasGenerics = true
}

case object `java.List<Boolean?>?`
    extends JavaBoolean with `box.NullableListOfNullable` {

  val javaClass = "java.util.List<Boolean>"

  val defaultValue = "null"

  val isPrimitive = true
  val hasGenerics = true
}

case object `java.Set<Boolean>?`
    extends JavaBoolean with `box.NullableSetOfOne` {

  val javaClass = "java.util.Set<Boolean>"

  val defaultValue = "null"

  val isPrimitive = true
  val hasGenerics = true
}

case object `java.Set<Boolean?>?`
    extends JavaBoolean with `box.NullableSetOfNullable` {

  val javaClass = "java.util.Set<Boolean>"

  val defaultValue = "null"

  val isPrimitive = true
  val hasGenerics = true
}
