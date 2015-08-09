package com.dslplatform.ocd
package javas

import types._
import boxes._

sealed trait JavaImage
    extends OcdJavaBoxType
    with `type.Image` {

  val isPrecise = false
  val isPrimitive = false
  val isEqualable = false
}

case object `java.Image`
    extends JavaImage with `box.One` {

  val javaClass = "java.awt.image.BufferedImage"
  val javaType = JavaSimpleType("java.awt.image.BufferedImage")
  val javaDescription = "OneImage"

  def defaultValue = SingleJavaValue("new java.awt.image.BufferedImage(1, 1, java.awt.image.BufferedImage.TYPE_4BYTE_ABGR)")

  def nonDefaultValues = IndexedSeq(
    SingleJavaValue("new java.awt.image.BufferedImage(2, 2, java.awt.image.BufferedImage.TYPE_3BYTE_BGR)")
  , SingleJavaValue("new java.awt.image.BufferedImage(3, 3, java.awt.image.BufferedImage.TYPE_BYTE_BINARY)")
  , SingleJavaValue("new java.awt.image.BufferedImage(4, 4, java.awt.image.BufferedImage.TYPE_BYTE_GRAY)")
  , SingleJavaValue("new java.awt.image.BufferedImage(5, 5, java.awt.image.BufferedImage.TYPE_BYTE_INDEXED)")
  , SingleJavaValue("new java.awt.image.BufferedImage(6, 6, java.awt.image.BufferedImage.TYPE_INT_RGB)")
  )

  val hasGenerics = false
}

case object `java.Image?`
    extends JavaImage with `box.Nullable` {

  val javaClass = "java.awt.image.BufferedImage"
  val javaType = JavaSimpleType("java.awt.image.BufferedImage")
  val javaDescription = "NullableImage"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    SingleJavaValue("new java.awt.image.BufferedImage(1, 1, java.awt.image.BufferedImage.TYPE_4BYTE_ABGR)")
  , SingleJavaValue("new java.awt.image.BufferedImage(2, 2, java.awt.image.BufferedImage.TYPE_3BYTE_BGR)")
  , SingleJavaValue("new java.awt.image.BufferedImage(3, 3, java.awt.image.BufferedImage.TYPE_BYTE_BINARY)")
  , SingleJavaValue("new java.awt.image.BufferedImage(4, 4, java.awt.image.BufferedImage.TYPE_BYTE_GRAY)")
  , SingleJavaValue("new java.awt.image.BufferedImage(5, 5, java.awt.image.BufferedImage.TYPE_BYTE_INDEXED)")
  , SingleJavaValue("new java.awt.image.BufferedImage(6, 6, java.awt.image.BufferedImage.TYPE_INT_RGB)")
  )

  val hasGenerics = false
}

case object `java.Image[]`
    extends JavaImage with `box.OneArrayOfOne` {

  val javaClass = "java.awt.image.BufferedImage[]"
  val javaType = JavaSimpleType("java.awt.image.BufferedImage[]")
  val javaDescription = "OneArrayOfOneImages"

  def defaultValue = SingleJavaValue("new java.awt.image.BufferedImage[0]")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("java.awt.image.BufferedImage",
      SingleJavaValue("new java.awt.image.BufferedImage(1, 1, java.awt.image.BufferedImage.TYPE_4BYTE_ABGR)")
    )
  , ArrayOfJavaValues("java.awt.image.BufferedImage",
      SingleJavaValue("new java.awt.image.BufferedImage(6, 6, java.awt.image.BufferedImage.TYPE_INT_RGB)")
    )
  , ArrayOfJavaValues("java.awt.image.BufferedImage",
      SingleJavaValue("new java.awt.image.BufferedImage(1, 1, java.awt.image.BufferedImage.TYPE_4BYTE_ABGR)")
    , SingleJavaValue("new java.awt.image.BufferedImage(2, 2, java.awt.image.BufferedImage.TYPE_3BYTE_BGR)")
    , SingleJavaValue("new java.awt.image.BufferedImage(3, 3, java.awt.image.BufferedImage.TYPE_BYTE_BINARY)")
    , SingleJavaValue("new java.awt.image.BufferedImage(4, 4, java.awt.image.BufferedImage.TYPE_BYTE_GRAY)")
    , SingleJavaValue("new java.awt.image.BufferedImage(5, 5, java.awt.image.BufferedImage.TYPE_BYTE_INDEXED)")
    , SingleJavaValue("new java.awt.image.BufferedImage(6, 6, java.awt.image.BufferedImage.TYPE_INT_RGB)")
    )
  )

  val hasGenerics = false
}

case object `java.Image[]?`
    extends JavaImage with `box.NullableArrayOfOne` {

  val javaClass = "java.awt.image.BufferedImage[]"
  val javaType = JavaSimpleType("java.awt.image.BufferedImage[]")
  val javaDescription = "NullableArrayOfOneImages"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("java.awt.image.BufferedImage",
      SingleJavaValue("new java.awt.image.BufferedImage(1, 1, java.awt.image.BufferedImage.TYPE_4BYTE_ABGR)")
    )
  , ArrayOfJavaValues("java.awt.image.BufferedImage",
      SingleJavaValue("new java.awt.image.BufferedImage(6, 6, java.awt.image.BufferedImage.TYPE_INT_RGB)")
    )
  , ArrayOfJavaValues("java.awt.image.BufferedImage",
      SingleJavaValue("new java.awt.image.BufferedImage(1, 1, java.awt.image.BufferedImage.TYPE_4BYTE_ABGR)")
    , SingleJavaValue("new java.awt.image.BufferedImage(2, 2, java.awt.image.BufferedImage.TYPE_3BYTE_BGR)")
    , SingleJavaValue("new java.awt.image.BufferedImage(3, 3, java.awt.image.BufferedImage.TYPE_BYTE_BINARY)")
    , SingleJavaValue("new java.awt.image.BufferedImage(4, 4, java.awt.image.BufferedImage.TYPE_BYTE_GRAY)")
    , SingleJavaValue("new java.awt.image.BufferedImage(5, 5, java.awt.image.BufferedImage.TYPE_BYTE_INDEXED)")
    , SingleJavaValue("new java.awt.image.BufferedImage(6, 6, java.awt.image.BufferedImage.TYPE_INT_RGB)")
    )
  )

  val hasGenerics = false
}

case object `java.Image?[]`
    extends JavaImage with `box.OneArrayOfNullable` {

  val javaClass = "java.awt.image.BufferedImage[]"
  val javaType = JavaSimpleType("java.awt.image.BufferedImage[]")
  val javaDescription = "OneArrayOfNullableImages"

  def defaultValue = SingleJavaValue("new java.awt.image.BufferedImage[0]")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("java.awt.image.BufferedImage",
      SingleJavaValue("null")
    )
  , ArrayOfJavaValues("java.awt.image.BufferedImage",
      SingleJavaValue("new java.awt.image.BufferedImage(1, 1, java.awt.image.BufferedImage.TYPE_4BYTE_ABGR)")
    )
  , ArrayOfJavaValues("java.awt.image.BufferedImage",
      SingleJavaValue("new java.awt.image.BufferedImage(6, 6, java.awt.image.BufferedImage.TYPE_INT_RGB)")
    )
  , ArrayOfJavaValues("java.awt.image.BufferedImage",
      SingleJavaValue("new java.awt.image.BufferedImage(1, 1, java.awt.image.BufferedImage.TYPE_4BYTE_ABGR)")
    , SingleJavaValue("new java.awt.image.BufferedImage(2, 2, java.awt.image.BufferedImage.TYPE_3BYTE_BGR)")
    , SingleJavaValue("new java.awt.image.BufferedImage(3, 3, java.awt.image.BufferedImage.TYPE_BYTE_BINARY)")
    , SingleJavaValue("new java.awt.image.BufferedImage(4, 4, java.awt.image.BufferedImage.TYPE_BYTE_GRAY)")
    , SingleJavaValue("new java.awt.image.BufferedImage(5, 5, java.awt.image.BufferedImage.TYPE_BYTE_INDEXED)")
    , SingleJavaValue("new java.awt.image.BufferedImage(6, 6, java.awt.image.BufferedImage.TYPE_INT_RGB)")
    )
  , ArrayOfJavaValues("java.awt.image.BufferedImage",
      SingleJavaValue("null")
    , SingleJavaValue("new java.awt.image.BufferedImage(1, 1, java.awt.image.BufferedImage.TYPE_4BYTE_ABGR)")
    , SingleJavaValue("new java.awt.image.BufferedImage(2, 2, java.awt.image.BufferedImage.TYPE_3BYTE_BGR)")
    , SingleJavaValue("new java.awt.image.BufferedImage(3, 3, java.awt.image.BufferedImage.TYPE_BYTE_BINARY)")
    , SingleJavaValue("new java.awt.image.BufferedImage(4, 4, java.awt.image.BufferedImage.TYPE_BYTE_GRAY)")
    , SingleJavaValue("new java.awt.image.BufferedImage(5, 5, java.awt.image.BufferedImage.TYPE_BYTE_INDEXED)")
    , SingleJavaValue("new java.awt.image.BufferedImage(6, 6, java.awt.image.BufferedImage.TYPE_INT_RGB)")
    )
  )

  val hasGenerics = false
}

case object `java.Image?[]?`
    extends JavaImage with `box.NullableArrayOfNullable` {

  val javaClass = "java.awt.image.BufferedImage[]"
  val javaType = JavaSimpleType("java.awt.image.BufferedImage[]")
  val javaDescription = "NullableArrayOfNullableImages"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("java.awt.image.BufferedImage",
      SingleJavaValue("null")
    )
  , ArrayOfJavaValues("java.awt.image.BufferedImage",
      SingleJavaValue("new java.awt.image.BufferedImage(1, 1, java.awt.image.BufferedImage.TYPE_4BYTE_ABGR)")
    )
  , ArrayOfJavaValues("java.awt.image.BufferedImage",
      SingleJavaValue("new java.awt.image.BufferedImage(6, 6, java.awt.image.BufferedImage.TYPE_INT_RGB)")
    )
  , ArrayOfJavaValues("java.awt.image.BufferedImage",
      SingleJavaValue("new java.awt.image.BufferedImage(1, 1, java.awt.image.BufferedImage.TYPE_4BYTE_ABGR)")
    , SingleJavaValue("new java.awt.image.BufferedImage(2, 2, java.awt.image.BufferedImage.TYPE_3BYTE_BGR)")
    , SingleJavaValue("new java.awt.image.BufferedImage(3, 3, java.awt.image.BufferedImage.TYPE_BYTE_BINARY)")
    , SingleJavaValue("new java.awt.image.BufferedImage(4, 4, java.awt.image.BufferedImage.TYPE_BYTE_GRAY)")
    , SingleJavaValue("new java.awt.image.BufferedImage(5, 5, java.awt.image.BufferedImage.TYPE_BYTE_INDEXED)")
    , SingleJavaValue("new java.awt.image.BufferedImage(6, 6, java.awt.image.BufferedImage.TYPE_INT_RGB)")
    )
  , ArrayOfJavaValues("java.awt.image.BufferedImage",
      SingleJavaValue("null")
    , SingleJavaValue("new java.awt.image.BufferedImage(1, 1, java.awt.image.BufferedImage.TYPE_4BYTE_ABGR)")
    , SingleJavaValue("new java.awt.image.BufferedImage(2, 2, java.awt.image.BufferedImage.TYPE_3BYTE_BGR)")
    , SingleJavaValue("new java.awt.image.BufferedImage(3, 3, java.awt.image.BufferedImage.TYPE_BYTE_BINARY)")
    , SingleJavaValue("new java.awt.image.BufferedImage(4, 4, java.awt.image.BufferedImage.TYPE_BYTE_GRAY)")
    , SingleJavaValue("new java.awt.image.BufferedImage(5, 5, java.awt.image.BufferedImage.TYPE_BYTE_INDEXED)")
    , SingleJavaValue("new java.awt.image.BufferedImage(6, 6, java.awt.image.BufferedImage.TYPE_INT_RGB)")
    )
  )

  val hasGenerics = false
}

case object `java.List<Image>`
    extends JavaImage with `box.OneListOfOne` {

  val javaClass = "java.util.List<java.awt.image.BufferedImage>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("java.awt.image.BufferedImage"))
  val javaDescription = "OneListOfOneImages"

  def defaultValue = SingleJavaValue("new java.util.ArrayList<java.awt.image.BufferedImage>(0)")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("java.awt.image.BufferedImage",
      SingleJavaValue("new java.awt.image.BufferedImage(1, 1, java.awt.image.BufferedImage.TYPE_4BYTE_ABGR)")
    )
  , ListOfJavaValues("java.awt.image.BufferedImage",
      SingleJavaValue("new java.awt.image.BufferedImage(6, 6, java.awt.image.BufferedImage.TYPE_INT_RGB)")
    )
  , ListOfJavaValues("java.awt.image.BufferedImage",
      SingleJavaValue("new java.awt.image.BufferedImage(1, 1, java.awt.image.BufferedImage.TYPE_4BYTE_ABGR)")
    , SingleJavaValue("new java.awt.image.BufferedImage(2, 2, java.awt.image.BufferedImage.TYPE_3BYTE_BGR)")
    , SingleJavaValue("new java.awt.image.BufferedImage(3, 3, java.awt.image.BufferedImage.TYPE_BYTE_BINARY)")
    , SingleJavaValue("new java.awt.image.BufferedImage(4, 4, java.awt.image.BufferedImage.TYPE_BYTE_GRAY)")
    , SingleJavaValue("new java.awt.image.BufferedImage(5, 5, java.awt.image.BufferedImage.TYPE_BYTE_INDEXED)")
    , SingleJavaValue("new java.awt.image.BufferedImage(6, 6, java.awt.image.BufferedImage.TYPE_INT_RGB)")
    )
  )

  val hasGenerics = true
}

case object `java.List<Image>?`
    extends JavaImage with `box.NullableListOfOne` {

  val javaClass = "java.util.List<java.awt.image.BufferedImage>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("java.awt.image.BufferedImage"))
  val javaDescription = "NullableListOfOneImages"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("java.awt.image.BufferedImage",
      SingleJavaValue("new java.awt.image.BufferedImage(1, 1, java.awt.image.BufferedImage.TYPE_4BYTE_ABGR)")
    )
  , ListOfJavaValues("java.awt.image.BufferedImage",
      SingleJavaValue("new java.awt.image.BufferedImage(6, 6, java.awt.image.BufferedImage.TYPE_INT_RGB)")
    )
  , ListOfJavaValues("java.awt.image.BufferedImage",
      SingleJavaValue("new java.awt.image.BufferedImage(1, 1, java.awt.image.BufferedImage.TYPE_4BYTE_ABGR)")
    , SingleJavaValue("new java.awt.image.BufferedImage(2, 2, java.awt.image.BufferedImage.TYPE_3BYTE_BGR)")
    , SingleJavaValue("new java.awt.image.BufferedImage(3, 3, java.awt.image.BufferedImage.TYPE_BYTE_BINARY)")
    , SingleJavaValue("new java.awt.image.BufferedImage(4, 4, java.awt.image.BufferedImage.TYPE_BYTE_GRAY)")
    , SingleJavaValue("new java.awt.image.BufferedImage(5, 5, java.awt.image.BufferedImage.TYPE_BYTE_INDEXED)")
    , SingleJavaValue("new java.awt.image.BufferedImage(6, 6, java.awt.image.BufferedImage.TYPE_INT_RGB)")
    )
  )

  val hasGenerics = true
}

case object `java.List<Image?>`
    extends JavaImage with `box.OneListOfNullable` {

  val javaClass = "java.util.List<java.awt.image.BufferedImage>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("java.awt.image.BufferedImage"))
  val javaDescription = "OneListOfNullableImages"

  def defaultValue = SingleJavaValue("new java.util.ArrayList<java.awt.image.BufferedImage>(0)")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("java.awt.image.BufferedImage",
      SingleJavaValue("null")
    )
  , ListOfJavaValues("java.awt.image.BufferedImage",
      SingleJavaValue("new java.awt.image.BufferedImage(1, 1, java.awt.image.BufferedImage.TYPE_4BYTE_ABGR)")
    )
  , ListOfJavaValues("java.awt.image.BufferedImage",
      SingleJavaValue("new java.awt.image.BufferedImage(6, 6, java.awt.image.BufferedImage.TYPE_INT_RGB)")
    )
  , ListOfJavaValues("java.awt.image.BufferedImage",
      SingleJavaValue("new java.awt.image.BufferedImage(1, 1, java.awt.image.BufferedImage.TYPE_4BYTE_ABGR)")
    , SingleJavaValue("new java.awt.image.BufferedImage(2, 2, java.awt.image.BufferedImage.TYPE_3BYTE_BGR)")
    , SingleJavaValue("new java.awt.image.BufferedImage(3, 3, java.awt.image.BufferedImage.TYPE_BYTE_BINARY)")
    , SingleJavaValue("new java.awt.image.BufferedImage(4, 4, java.awt.image.BufferedImage.TYPE_BYTE_GRAY)")
    , SingleJavaValue("new java.awt.image.BufferedImage(5, 5, java.awt.image.BufferedImage.TYPE_BYTE_INDEXED)")
    , SingleJavaValue("new java.awt.image.BufferedImage(6, 6, java.awt.image.BufferedImage.TYPE_INT_RGB)")
    )
  , ListOfJavaValues("java.awt.image.BufferedImage",
      SingleJavaValue("null")
    , SingleJavaValue("new java.awt.image.BufferedImage(1, 1, java.awt.image.BufferedImage.TYPE_4BYTE_ABGR)")
    , SingleJavaValue("new java.awt.image.BufferedImage(2, 2, java.awt.image.BufferedImage.TYPE_3BYTE_BGR)")
    , SingleJavaValue("new java.awt.image.BufferedImage(3, 3, java.awt.image.BufferedImage.TYPE_BYTE_BINARY)")
    , SingleJavaValue("new java.awt.image.BufferedImage(4, 4, java.awt.image.BufferedImage.TYPE_BYTE_GRAY)")
    , SingleJavaValue("new java.awt.image.BufferedImage(5, 5, java.awt.image.BufferedImage.TYPE_BYTE_INDEXED)")
    , SingleJavaValue("new java.awt.image.BufferedImage(6, 6, java.awt.image.BufferedImage.TYPE_INT_RGB)")
    )
  )

  val hasGenerics = true
}

case object `java.List<Image?>?`
    extends JavaImage with `box.NullableListOfNullable` {

  val javaClass = "java.util.List<java.awt.image.BufferedImage>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("java.awt.image.BufferedImage"))
  val javaDescription = "NullableListOfNullableImages"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("java.awt.image.BufferedImage",
      SingleJavaValue("null")
    )
  , ListOfJavaValues("java.awt.image.BufferedImage",
      SingleJavaValue("new java.awt.image.BufferedImage(1, 1, java.awt.image.BufferedImage.TYPE_4BYTE_ABGR)")
    )
  , ListOfJavaValues("java.awt.image.BufferedImage",
      SingleJavaValue("new java.awt.image.BufferedImage(6, 6, java.awt.image.BufferedImage.TYPE_INT_RGB)")
    )
  , ListOfJavaValues("java.awt.image.BufferedImage",
      SingleJavaValue("new java.awt.image.BufferedImage(1, 1, java.awt.image.BufferedImage.TYPE_4BYTE_ABGR)")
    , SingleJavaValue("new java.awt.image.BufferedImage(2, 2, java.awt.image.BufferedImage.TYPE_3BYTE_BGR)")
    , SingleJavaValue("new java.awt.image.BufferedImage(3, 3, java.awt.image.BufferedImage.TYPE_BYTE_BINARY)")
    , SingleJavaValue("new java.awt.image.BufferedImage(4, 4, java.awt.image.BufferedImage.TYPE_BYTE_GRAY)")
    , SingleJavaValue("new java.awt.image.BufferedImage(5, 5, java.awt.image.BufferedImage.TYPE_BYTE_INDEXED)")
    , SingleJavaValue("new java.awt.image.BufferedImage(6, 6, java.awt.image.BufferedImage.TYPE_INT_RGB)")
    )
  , ListOfJavaValues("java.awt.image.BufferedImage",
      SingleJavaValue("null")
    , SingleJavaValue("new java.awt.image.BufferedImage(1, 1, java.awt.image.BufferedImage.TYPE_4BYTE_ABGR)")
    , SingleJavaValue("new java.awt.image.BufferedImage(2, 2, java.awt.image.BufferedImage.TYPE_3BYTE_BGR)")
    , SingleJavaValue("new java.awt.image.BufferedImage(3, 3, java.awt.image.BufferedImage.TYPE_BYTE_BINARY)")
    , SingleJavaValue("new java.awt.image.BufferedImage(4, 4, java.awt.image.BufferedImage.TYPE_BYTE_GRAY)")
    , SingleJavaValue("new java.awt.image.BufferedImage(5, 5, java.awt.image.BufferedImage.TYPE_BYTE_INDEXED)")
    , SingleJavaValue("new java.awt.image.BufferedImage(6, 6, java.awt.image.BufferedImage.TYPE_INT_RGB)")
    )
  )

  val hasGenerics = true
}

case object `java.Set<Image>`
    extends JavaImage with `box.OneSetOfOne` {

  val javaClass = "java.util.Set<java.awt.image.BufferedImage>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("java.awt.image.BufferedImage"))
  val javaDescription = "OneSetOfOneImages"

  def defaultValue = SingleJavaValue("new java.util.HashSet<java.awt.image.BufferedImage>(0)")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("java.awt.image.BufferedImage",
      SingleJavaValue("new java.awt.image.BufferedImage(1, 1, java.awt.image.BufferedImage.TYPE_4BYTE_ABGR)")
    )
  , SetOfJavaValues("java.awt.image.BufferedImage",
      SingleJavaValue("new java.awt.image.BufferedImage(6, 6, java.awt.image.BufferedImage.TYPE_INT_RGB)")
    )
  , SetOfJavaValues("java.awt.image.BufferedImage",
      SingleJavaValue("new java.awt.image.BufferedImage(1, 1, java.awt.image.BufferedImage.TYPE_4BYTE_ABGR)")
    , SingleJavaValue("new java.awt.image.BufferedImage(2, 2, java.awt.image.BufferedImage.TYPE_3BYTE_BGR)")
    , SingleJavaValue("new java.awt.image.BufferedImage(3, 3, java.awt.image.BufferedImage.TYPE_BYTE_BINARY)")
    , SingleJavaValue("new java.awt.image.BufferedImage(4, 4, java.awt.image.BufferedImage.TYPE_BYTE_GRAY)")
    , SingleJavaValue("new java.awt.image.BufferedImage(5, 5, java.awt.image.BufferedImage.TYPE_BYTE_INDEXED)")
    , SingleJavaValue("new java.awt.image.BufferedImage(6, 6, java.awt.image.BufferedImage.TYPE_INT_RGB)")
    )
  )

  val hasGenerics = true
}

case object `java.Set<Image>?`
    extends JavaImage with `box.NullableSetOfOne` {

  val javaClass = "java.util.Set<java.awt.image.BufferedImage>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("java.awt.image.BufferedImage"))
  val javaDescription = "NullableSetOfOneImages"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("java.awt.image.BufferedImage",
      SingleJavaValue("new java.awt.image.BufferedImage(1, 1, java.awt.image.BufferedImage.TYPE_4BYTE_ABGR)")
    )
  , SetOfJavaValues("java.awt.image.BufferedImage",
      SingleJavaValue("new java.awt.image.BufferedImage(6, 6, java.awt.image.BufferedImage.TYPE_INT_RGB)")
    )
  , SetOfJavaValues("java.awt.image.BufferedImage",
      SingleJavaValue("new java.awt.image.BufferedImage(1, 1, java.awt.image.BufferedImage.TYPE_4BYTE_ABGR)")
    , SingleJavaValue("new java.awt.image.BufferedImage(2, 2, java.awt.image.BufferedImage.TYPE_3BYTE_BGR)")
    , SingleJavaValue("new java.awt.image.BufferedImage(3, 3, java.awt.image.BufferedImage.TYPE_BYTE_BINARY)")
    , SingleJavaValue("new java.awt.image.BufferedImage(4, 4, java.awt.image.BufferedImage.TYPE_BYTE_GRAY)")
    , SingleJavaValue("new java.awt.image.BufferedImage(5, 5, java.awt.image.BufferedImage.TYPE_BYTE_INDEXED)")
    , SingleJavaValue("new java.awt.image.BufferedImage(6, 6, java.awt.image.BufferedImage.TYPE_INT_RGB)")
    )
  )

  val hasGenerics = true
}

case object `java.Set<Image?>`
    extends JavaImage with `box.OneSetOfNullable` {

  val javaClass = "java.util.Set<java.awt.image.BufferedImage>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("java.awt.image.BufferedImage"))
  val javaDescription = "OneSetOfNullableImages"

  def defaultValue = SingleJavaValue("new java.util.HashSet<java.awt.image.BufferedImage>(0)")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("java.awt.image.BufferedImage",
      SingleJavaValue("null")
    )
  , SetOfJavaValues("java.awt.image.BufferedImage",
      SingleJavaValue("new java.awt.image.BufferedImage(1, 1, java.awt.image.BufferedImage.TYPE_4BYTE_ABGR)")
    )
  , SetOfJavaValues("java.awt.image.BufferedImage",
      SingleJavaValue("new java.awt.image.BufferedImage(6, 6, java.awt.image.BufferedImage.TYPE_INT_RGB)")
    )
  , SetOfJavaValues("java.awt.image.BufferedImage",
      SingleJavaValue("new java.awt.image.BufferedImage(1, 1, java.awt.image.BufferedImage.TYPE_4BYTE_ABGR)")
    , SingleJavaValue("new java.awt.image.BufferedImage(2, 2, java.awt.image.BufferedImage.TYPE_3BYTE_BGR)")
    , SingleJavaValue("new java.awt.image.BufferedImage(3, 3, java.awt.image.BufferedImage.TYPE_BYTE_BINARY)")
    , SingleJavaValue("new java.awt.image.BufferedImage(4, 4, java.awt.image.BufferedImage.TYPE_BYTE_GRAY)")
    , SingleJavaValue("new java.awt.image.BufferedImage(5, 5, java.awt.image.BufferedImage.TYPE_BYTE_INDEXED)")
    , SingleJavaValue("new java.awt.image.BufferedImage(6, 6, java.awt.image.BufferedImage.TYPE_INT_RGB)")
    )
  , SetOfJavaValues("java.awt.image.BufferedImage",
      SingleJavaValue("null")
    , SingleJavaValue("new java.awt.image.BufferedImage(1, 1, java.awt.image.BufferedImage.TYPE_4BYTE_ABGR)")
    , SingleJavaValue("new java.awt.image.BufferedImage(2, 2, java.awt.image.BufferedImage.TYPE_3BYTE_BGR)")
    , SingleJavaValue("new java.awt.image.BufferedImage(3, 3, java.awt.image.BufferedImage.TYPE_BYTE_BINARY)")
    , SingleJavaValue("new java.awt.image.BufferedImage(4, 4, java.awt.image.BufferedImage.TYPE_BYTE_GRAY)")
    , SingleJavaValue("new java.awt.image.BufferedImage(5, 5, java.awt.image.BufferedImage.TYPE_BYTE_INDEXED)")
    , SingleJavaValue("new java.awt.image.BufferedImage(6, 6, java.awt.image.BufferedImage.TYPE_INT_RGB)")
    )
  )

  val hasGenerics = true
}

case object `java.Set<Image?>?`
    extends JavaImage with `box.NullableSetOfNullable` {

  val javaClass = "java.util.Set<java.awt.image.BufferedImage>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("java.awt.image.BufferedImage"))
  val javaDescription = "NullableSetOfNullableImages"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("java.awt.image.BufferedImage",
      SingleJavaValue("null")
    )
  , SetOfJavaValues("java.awt.image.BufferedImage",
      SingleJavaValue("new java.awt.image.BufferedImage(1, 1, java.awt.image.BufferedImage.TYPE_4BYTE_ABGR)")
    )
  , SetOfJavaValues("java.awt.image.BufferedImage",
      SingleJavaValue("new java.awt.image.BufferedImage(6, 6, java.awt.image.BufferedImage.TYPE_INT_RGB)")
    )
  , SetOfJavaValues("java.awt.image.BufferedImage",
      SingleJavaValue("new java.awt.image.BufferedImage(1, 1, java.awt.image.BufferedImage.TYPE_4BYTE_ABGR)")
    , SingleJavaValue("new java.awt.image.BufferedImage(2, 2, java.awt.image.BufferedImage.TYPE_3BYTE_BGR)")
    , SingleJavaValue("new java.awt.image.BufferedImage(3, 3, java.awt.image.BufferedImage.TYPE_BYTE_BINARY)")
    , SingleJavaValue("new java.awt.image.BufferedImage(4, 4, java.awt.image.BufferedImage.TYPE_BYTE_GRAY)")
    , SingleJavaValue("new java.awt.image.BufferedImage(5, 5, java.awt.image.BufferedImage.TYPE_BYTE_INDEXED)")
    , SingleJavaValue("new java.awt.image.BufferedImage(6, 6, java.awt.image.BufferedImage.TYPE_INT_RGB)")
    )
  , SetOfJavaValues("java.awt.image.BufferedImage",
      SingleJavaValue("null")
    , SingleJavaValue("new java.awt.image.BufferedImage(1, 1, java.awt.image.BufferedImage.TYPE_4BYTE_ABGR)")
    , SingleJavaValue("new java.awt.image.BufferedImage(2, 2, java.awt.image.BufferedImage.TYPE_3BYTE_BGR)")
    , SingleJavaValue("new java.awt.image.BufferedImage(3, 3, java.awt.image.BufferedImage.TYPE_BYTE_BINARY)")
    , SingleJavaValue("new java.awt.image.BufferedImage(4, 4, java.awt.image.BufferedImage.TYPE_BYTE_GRAY)")
    , SingleJavaValue("new java.awt.image.BufferedImage(5, 5, java.awt.image.BufferedImage.TYPE_BYTE_INDEXED)")
    , SingleJavaValue("new java.awt.image.BufferedImage(6, 6, java.awt.image.BufferedImage.TYPE_INT_RGB)")
    )
  )

  val hasGenerics = true
}
