package com.dslplatform.ocd
package javas

import types._
import boxes._

sealed trait JavaInteger
    extends OcdJava
    with `type.Integer`

case object `java.Integer`
    extends JavaInteger with `box.One` {

  val javaClass = "int"

  val defaultValue = "0"

  val isPrimitive = true
  val hasGenerics = false
}

case object `java.Integer[]`
    extends JavaInteger with `box.OneArrayOfOne` {

  val javaClass = "int[]"

  val defaultValue = "new int[0]"

  val isPrimitive = true
  val hasGenerics = false
}

case object `java.Integer?[]`
    extends JavaInteger with `box.OneArrayOfNullable` {

  val javaClass = "Integer[]"

  val defaultValue = "new Integer[0]"

  val isPrimitive = true
  val hasGenerics = false
}

case object `java.List<Integer>`
    extends JavaInteger with `box.OneListOfOne` {

  val javaClass = "java.util.List<Integer>"

  val defaultValue = "new java.util.ArrayList<Integer>(0)"

  val isPrimitive = true
  val hasGenerics = true
}

case object `java.List<Integer?>`
    extends JavaInteger with `box.OneListOfNullable` {

  val javaClass = "java.util.List<Integer>"

  val defaultValue = "new java.util.ArrayList<Integer>(0)"

  val isPrimitive = true
  val hasGenerics = true
}

case object `java.Set<Integer>`
    extends JavaInteger with `box.OneSetOfOne` {

  val javaClass = "java.util.Set<Integer>"

  val defaultValue = "new java.util.HashSet<Integer>(0)"

  val isPrimitive = true
  val hasGenerics = true
}

case object `java.Set<Integer?>`
    extends JavaInteger with `box.OneSetOfNullable` {

  val javaClass = "java.util.Set<Integer>"

  val defaultValue = "new java.util.HashSet<Integer>(0)"

  val isPrimitive = true
  val hasGenerics = true
}

case object `java.Integer?`
    extends JavaInteger with `box.Nullable` {

  val javaClass = "Integer"

  val defaultValue = "null"

  val isPrimitive = true
  val hasGenerics = false
}

case object `java.Integer[]?`
    extends JavaInteger with `box.NullableArrayOfOne` {

  val javaClass = "int[]"

  val defaultValue = "null"

  val isPrimitive = true
  val hasGenerics = false
}

case object `java.Integer?[]?`
    extends JavaInteger with `box.NullableArrayOfNullable` {

  val javaClass = "Integer[]"

  val defaultValue = "null"

  val isPrimitive = true
  val hasGenerics = false
}

case object `java.List<Integer>?`
    extends JavaInteger with `box.NullableListOfOne` {

  val javaClass = "java.util.List<Integer>"

  val defaultValue = "null"

  val isPrimitive = true
  val hasGenerics = true
}

case object `java.List<Integer?>?`
    extends JavaInteger with `box.NullableListOfNullable` {

  val javaClass = "java.util.List<Integer>"

  val defaultValue = "null"

  val isPrimitive = true
  val hasGenerics = true
}

case object `java.Set<Integer>?`
    extends JavaInteger with `box.NullableSetOfOne` {

  val javaClass = "java.util.Set<Integer>"

  val defaultValue = "null"

  val isPrimitive = true
  val hasGenerics = true
}

case object `java.Set<Integer?>?`
    extends JavaInteger with `box.NullableSetOfNullable` {

  val javaClass = "java.util.Set<Integer>"

  val defaultValue = "null"

  val isPrimitive = true
  val hasGenerics = true
}
