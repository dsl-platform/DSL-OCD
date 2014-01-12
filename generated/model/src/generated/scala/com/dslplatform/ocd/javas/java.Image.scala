package com.dslplatform.ocd
package javas

import types._
import boxes._

sealed trait JavaImage
    extends OcdJava
    with `type.Image`

case object `java.Image`
    extends JavaImage with `box.One` {

  val javaClass = "java.awt.image.BufferedImage"

  val defaultValue = "new java.awt.image.BufferedImage(0, 0, java.awt.image.BufferedImage.TYPE_4BYTE_ABGR)"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.Image[]`
    extends JavaImage with `box.OneArrayOfOne` {

  val javaClass = "java.awt.image.BufferedImage[]"

  val defaultValue = "new java.awt.image.BufferedImage[0]"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.Image?[]`
    extends JavaImage with `box.OneArrayOfNullable` {

  val javaClass = "java.awt.image.BufferedImage[]"

  val defaultValue = "new java.awt.image.BufferedImage[0]"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.List<Image>`
    extends JavaImage with `box.OneListOfOne` {

  val javaClass = "java.util.List<java.awt.image.BufferedImage>"

  val defaultValue = "new java.util.ArrayList<java.awt.image.BufferedImage>(0)"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.List<Image?>`
    extends JavaImage with `box.OneListOfNullable` {

  val javaClass = "java.util.List<java.awt.image.BufferedImage>"

  val defaultValue = "new java.util.ArrayList<java.awt.image.BufferedImage>(0)"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Set<Image>`
    extends JavaImage with `box.OneSetOfOne` {

  val javaClass = "java.util.Set<java.awt.image.BufferedImage>"

  val defaultValue = "new java.util.HashSet<java.awt.image.BufferedImage>(0)"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Set<Image?>`
    extends JavaImage with `box.OneSetOfNullable` {

  val javaClass = "java.util.Set<java.awt.image.BufferedImage>"

  val defaultValue = "new java.util.HashSet<java.awt.image.BufferedImage>(0)"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Image?`
    extends JavaImage with `box.Nullable` {

  val javaClass = "java.awt.image.BufferedImage"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.Image[]?`
    extends JavaImage with `box.NullableArrayOfOne` {

  val javaClass = "java.awt.image.BufferedImage[]"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.Image?[]?`
    extends JavaImage with `box.NullableArrayOfNullable` {

  val javaClass = "java.awt.image.BufferedImage[]"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.List<Image>?`
    extends JavaImage with `box.NullableListOfOne` {

  val javaClass = "java.util.List<java.awt.image.BufferedImage>"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.List<Image?>?`
    extends JavaImage with `box.NullableListOfNullable` {

  val javaClass = "java.util.List<java.awt.image.BufferedImage>"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Set<Image>?`
    extends JavaImage with `box.NullableSetOfOne` {

  val javaClass = "java.util.Set<java.awt.image.BufferedImage>"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Set<Image?>?`
    extends JavaImage with `box.NullableSetOfNullable` {

  val javaClass = "java.util.Set<java.awt.image.BufferedImage>"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = true
}
