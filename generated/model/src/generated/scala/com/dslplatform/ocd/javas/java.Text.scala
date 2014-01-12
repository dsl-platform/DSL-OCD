package com.dslplatform.ocd
package javas

import types._
import boxes._

sealed trait JavaText
    extends OcdJava
    with `type.Text`

case object `java.Text`
    extends JavaText with `box.One` {

  val javaClass = "String"

  val defaultValue = ""

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.Text[]`
    extends JavaText with `box.OneArrayOfOne` {

  val javaClass = "String[]"

  val defaultValue = "new String[0]"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.Text?[]`
    extends JavaText with `box.OneArrayOfNullable` {

  val javaClass = "String[]"

  val defaultValue = "new String[0]"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.List<Text>`
    extends JavaText with `box.OneListOfOne` {

  val javaClass = "java.util.List<String>"

  val defaultValue = "new java.util.ArrayList<String>(0)"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.List<Text?>`
    extends JavaText with `box.OneListOfNullable` {

  val javaClass = "java.util.List<String>"

  val defaultValue = "new java.util.ArrayList<String>(0)"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Set<Text>`
    extends JavaText with `box.OneSetOfOne` {

  val javaClass = "java.util.Set<String>"

  val defaultValue = "new java.util.HashSet<String>(0)"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Set<Text?>`
    extends JavaText with `box.OneSetOfNullable` {

  val javaClass = "java.util.Set<String>"

  val defaultValue = "new java.util.HashSet<String>(0)"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Text?`
    extends JavaText with `box.Nullable` {

  val javaClass = "String"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.Text[]?`
    extends JavaText with `box.NullableArrayOfOne` {

  val javaClass = "String[]"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.Text?[]?`
    extends JavaText with `box.NullableArrayOfNullable` {

  val javaClass = "String[]"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.List<Text>?`
    extends JavaText with `box.NullableListOfOne` {

  val javaClass = "java.util.List<String>"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.List<Text?>?`
    extends JavaText with `box.NullableListOfNullable` {

  val javaClass = "java.util.List<String>"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Set<Text>?`
    extends JavaText with `box.NullableSetOfOne` {

  val javaClass = "java.util.Set<String>"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Set<Text?>?`
    extends JavaText with `box.NullableSetOfNullable` {

  val javaClass = "java.util.Set<String>"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = true
}
