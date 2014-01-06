package com.dslplatform.ocd
package javas

import types._
import boxes._

sealed trait `JavaString(9)`
    extends OcdJava
    with `type.String(9)`

case object `java.String(9)`
    extends `JavaString(9)` with `box.One` {

  val javaClass = "String"

  val defaultValue = ""

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.String(9)[]`
    extends `JavaString(9)` with `box.OneArrayOfOne` {

  val javaClass = "String[]"

  val defaultValue = "new String[0]"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.String(9)?[]`
    extends `JavaString(9)` with `box.OneArrayOfNullable` {

  val javaClass = "String[0]"

  val defaultValue = "new String[0]"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.List<String(9)>`
    extends `JavaString(9)` with `box.OneListOfOne` {

  val javaClass = "java.util.List<String>"

  val defaultValue = "new java.util.ArrayList<String>(0)"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.List<String(9)?>`
    extends `JavaString(9)` with `box.OneListOfNullable` {

  val javaClass = "java.util.List<String>"

  val defaultValue = "new java.util.ArrayList<String>(0)"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Set<String(9)>`
    extends `JavaString(9)` with `box.OneSetOfOne` {

  val javaClass = "java.util.Set<String>"

  val defaultValue = "new java.util.HashSet<String>(0)"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Set<String(9)?>`
    extends `JavaString(9)` with `box.OneSetOfNullable` {

  val javaClass = "java.util.Set<String>"

  val defaultValue = "new java.util.HashSet<String>(0)"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.String(9)?`
    extends `JavaString(9)` with `box.Nullable` {

  val javaClass = "String"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.String(9)[]?`
    extends `JavaString(9)` with `box.NullableArrayOfOne` {

  val javaClass = "String[]"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.String(9)?[]?`
    extends `JavaString(9)` with `box.NullableArrayOfNullable` {

  val javaClass = "String[0]"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.List<String(9)>?`
    extends `JavaString(9)` with `box.NullableListOfOne` {

  val javaClass = "java.util.List<String>"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.List<String(9)?>?`
    extends `JavaString(9)` with `box.NullableListOfNullable` {

  val javaClass = "java.util.List<String>"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Set<String(9)>?`
    extends `JavaString(9)` with `box.NullableSetOfOne` {

  val javaClass = "java.util.Set<String>"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Set<String(9)?>?`
    extends `JavaString(9)` with `box.NullableSetOfNullable` {

  val javaClass = "java.util.Set<String>"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = true
}
