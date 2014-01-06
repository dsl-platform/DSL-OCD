package com.dslplatform.ocd
package javas

import types._
import boxes._

sealed trait `JavaString`
    extends OcdJava
    with `type.String`

case object `java.String`
    extends `JavaString` with `box.One` {

  val javaClass = "String"

  val defaultValue = ""

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.String[]`
    extends `JavaString` with `box.OneArrayOfOne` {

  val javaClass = "String[]"

  val defaultValue = "new String[0]"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.String?[]`
    extends `JavaString` with `box.OneArrayOfNullable` {

  val javaClass = "String[0]"

  val defaultValue = "new String[0]"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.List<String>`
    extends `JavaString` with `box.OneListOfOne` {

  val javaClass = "java.util.List<String>"

  val defaultValue = "new java.util.ArrayList<String>(0)"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.List<String?>`
    extends `JavaString` with `box.OneListOfNullable` {

  val javaClass = "java.util.List<String>"

  val defaultValue = "new java.util.ArrayList<String>(0)"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Set<String>`
    extends `JavaString` with `box.OneSetOfOne` {

  val javaClass = "java.util.Set<String>"

  val defaultValue = "new java.util.HashSet<String>(0)"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Set<String?>`
    extends `JavaString` with `box.OneSetOfNullable` {

  val javaClass = "java.util.Set<String>"

  val defaultValue = "new java.util.HashSet<String>(0)"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.String?`
    extends `JavaString` with `box.Nullable` {

  val javaClass = "String"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.String[]?`
    extends `JavaString` with `box.NullableArrayOfOne` {

  val javaClass = "String[]"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.String?[]?`
    extends `JavaString` with `box.NullableArrayOfNullable` {

  val javaClass = "String[0]"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.List<String>?`
    extends `JavaString` with `box.NullableListOfOne` {

  val javaClass = "java.util.List<String>"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.List<String?>?`
    extends `JavaString` with `box.NullableListOfNullable` {

  val javaClass = "java.util.List<String>"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Set<String>?`
    extends `JavaString` with `box.NullableSetOfOne` {

  val javaClass = "java.util.Set<String>"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Set<String?>?`
    extends `JavaString` with `box.NullableSetOfNullable` {

  val javaClass = "java.util.Set<String>"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = true
}
