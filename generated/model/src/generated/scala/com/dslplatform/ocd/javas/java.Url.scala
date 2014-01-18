package com.dslplatform.ocd
package javas

import types._
import boxes._

sealed trait JavaUrl
    extends OcdJava
    with `type.Url`

case object `java.Url`
    extends JavaUrl with `box.One` {

  val javaClass = "java.net.URI"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.Url[]`
    extends JavaUrl with `box.OneArrayOfOne` {

  val javaClass = "java.net.URI[]"

  val defaultValue = "new java.net.URI[0]"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.Url?[]`
    extends JavaUrl with `box.OneArrayOfNullable` {

  val javaClass = "java.net.URI[]"

  val defaultValue = "new java.net.URI[0]"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.List<Url>`
    extends JavaUrl with `box.OneListOfOne` {

  val javaClass = "java.util.List<java.net.URI>"

  val defaultValue = "new java.util.ArrayList<java.net.URI>(0)"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.List<Url?>`
    extends JavaUrl with `box.OneListOfNullable` {

  val javaClass = "java.util.List<java.net.URI>"

  val defaultValue = "new java.util.ArrayList<java.net.URI>(0)"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Set<Url>`
    extends JavaUrl with `box.OneSetOfOne` {

  val javaClass = "java.util.Set<java.net.URI>"

  val defaultValue = "new java.util.HashSet<java.net.URI>(0)"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Set<Url?>`
    extends JavaUrl with `box.OneSetOfNullable` {

  val javaClass = "java.util.Set<java.net.URI>"

  val defaultValue = "new java.util.HashSet<java.net.URI>(0)"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Url?`
    extends JavaUrl with `box.Nullable` {

  val javaClass = "java.net.URI"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.Url[]?`
    extends JavaUrl with `box.NullableArrayOfOne` {

  val javaClass = "java.net.URI[]"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.Url?[]?`
    extends JavaUrl with `box.NullableArrayOfNullable` {

  val javaClass = "java.net.URI[]"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.List<Url>?`
    extends JavaUrl with `box.NullableListOfOne` {

  val javaClass = "java.util.List<java.net.URI>"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.List<Url?>?`
    extends JavaUrl with `box.NullableListOfNullable` {

  val javaClass = "java.util.List<java.net.URI>"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Set<Url>?`
    extends JavaUrl with `box.NullableSetOfOne` {

  val javaClass = "java.util.Set<java.net.URI>"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Set<Url?>?`
    extends JavaUrl with `box.NullableSetOfNullable` {

  val javaClass = "java.util.Set<java.net.URI>"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = true
}
