package com.dslplatform.ocd
package javas

import types._
import boxes._

sealed trait JavaMap
    extends OcdJava
    with `type.Map`

case object `java.Map`
    extends JavaMap with `box.One` {

  val javaClass = "java.util.Map<String, String>"

  val defaultValue = "new java.util.HashMap<String, String>(0)"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Map[]`
    extends JavaMap with `box.OneArrayOfOne` {

  val javaClass = "java.util.Map<String, String>[]"

  val defaultValue = "new java.util.HashMap[0]"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Map?[]`
    extends JavaMap with `box.OneArrayOfNullable` {

  val javaClass = "java.util.Map<String, String>[]"

  val defaultValue = "new java.util.HashMap[0]"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.List<Map>`
    extends JavaMap with `box.OneListOfOne` {

  val javaClass = "java.util.List<java.util.Map<String, String>>"

  val defaultValue = "new java.util.ArrayList<java.util.Map<String, String>>(0)"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.List<Map?>`
    extends JavaMap with `box.OneListOfNullable` {

  val javaClass = "java.util.List<java.util.Map<String, String>>"

  val defaultValue = "new java.util.ArrayList<java.util.Map<String, String>>(0)"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Set<Map>`
    extends JavaMap with `box.OneSetOfOne` {

  val javaClass = "java.util.Set<java.util.Map<String, String>>"

  val defaultValue = "new java.util.HashSet<java.util.Map<String, String>>(0)"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Set<Map?>`
    extends JavaMap with `box.OneSetOfNullable` {

  val javaClass = "java.util.Set<java.util.Map<String, String>>"

  val defaultValue = "new java.util.HashSet<java.util.Map<String, String>>(0)"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Map?`
    extends JavaMap with `box.Nullable` {

  val javaClass = "java.util.Map<String, String>"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Map[]?`
    extends JavaMap with `box.NullableArrayOfOne` {

  val javaClass = "java.util.Map<String, String>[]"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Map?[]?`
    extends JavaMap with `box.NullableArrayOfNullable` {

  val javaClass = "java.util.Map<String, String>[]"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.List<Map>?`
    extends JavaMap with `box.NullableListOfOne` {

  val javaClass = "java.util.List<java.util.Map<String, String>>"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.List<Map?>?`
    extends JavaMap with `box.NullableListOfNullable` {

  val javaClass = "java.util.List<java.util.Map<String, String>>"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Set<Map>?`
    extends JavaMap with `box.NullableSetOfOne` {

  val javaClass = "java.util.Set<java.util.Map<String, String>>"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Set<Map?>?`
    extends JavaMap with `box.NullableSetOfNullable` {

  val javaClass = "java.util.Set<java.util.Map<String, String>>"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = true
}
