package com.dslplatform.ocd
package javas

import types._
import boxes._

sealed trait JavaBinary
    extends OcdJavaBoxType
    with `type.Binary` {

  val isPrecise = false
  val isPrimitive = false
}

case object `java.Binary`
    extends JavaBinary with `box.One` {

  val javaClass = "byte[]"
  val javaType = JavaSimpleType("byte[]")
  val javaDescription = "OneBinary"

  def defaultValue = SingleJavaValue("new byte[0]")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    )
  , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    )
  , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
  )

  val hasGenerics = false
}

case object `java.Binary?`
    extends JavaBinary with `box.Nullable` {

  val javaClass = "byte[]"
  val javaType = JavaSimpleType("byte[]")
  val javaDescription = "NullableBinary"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    SingleJavaValue("new byte[0]")
  , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    )
  , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    )
  , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
  )

  val hasGenerics = false
}

case object `java.Binary[]`
    extends JavaBinary with `box.OneArrayOfOne` {

  val javaClass = "byte[][]"
  val javaType = JavaSimpleType("byte[][]")
  val javaDescription = "OneArrayOfOneBinaries"

  def defaultValue = SingleJavaValue("new byte[0][]")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("byte[]",
      SingleJavaValue("new byte[0]")
    )
  , ArrayOfJavaValues("byte[]",
      ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  , ArrayOfJavaValues("byte[]",
      SingleJavaValue("new byte[0]")
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  )

  val hasGenerics = false
}

case object `java.Binary[]?`
    extends JavaBinary with `box.NullableArrayOfOne` {

  val javaClass = "byte[][]"
  val javaType = JavaSimpleType("byte[][]")
  val javaDescription = "NullableArrayOfOneBinaries"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("byte[]",
      SingleJavaValue("new byte[0]")
    )
  , ArrayOfJavaValues("byte[]",
      ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  , ArrayOfJavaValues("byte[]",
      SingleJavaValue("new byte[0]")
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  )

  val hasGenerics = false
}

case object `java.Binary?[]`
    extends JavaBinary with `box.OneArrayOfNullable` {

  val javaClass = "byte[][]"
  val javaType = JavaSimpleType("byte[][]")
  val javaDescription = "OneArrayOfNullableBinaries"

  def defaultValue = SingleJavaValue("new byte[0][]")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("byte[]",
      SingleJavaValue("null")
    )
  , ArrayOfJavaValues("byte[]",
      SingleJavaValue("new byte[0]")
    )
  , ArrayOfJavaValues("byte[]",
      ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  , ArrayOfJavaValues("byte[]",
      SingleJavaValue("new byte[0]")
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  , ArrayOfJavaValues("byte[]",
      SingleJavaValue("null")
    , SingleJavaValue("new byte[0]")
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  )

  val hasGenerics = false
}

case object `java.Binary?[]?`
    extends JavaBinary with `box.NullableArrayOfNullable` {

  val javaClass = "byte[][]"
  val javaType = JavaSimpleType("byte[][]")
  val javaDescription = "NullableArrayOfNullableBinaries"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("byte[]",
      SingleJavaValue("null")
    )
  , ArrayOfJavaValues("byte[]",
      SingleJavaValue("new byte[0]")
    )
  , ArrayOfJavaValues("byte[]",
      ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  , ArrayOfJavaValues("byte[]",
      SingleJavaValue("new byte[0]")
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  , ArrayOfJavaValues("byte[]",
      SingleJavaValue("null")
    , SingleJavaValue("new byte[0]")
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  )

  val hasGenerics = false
}

case object `java.List<Binary>`
    extends JavaBinary with `box.OneListOfOne` {

  val javaClass = "java.util.List<byte[]>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("byte[]"))
  val javaDescription = "OneListOfOneBinaries"

  def defaultValue = SingleJavaValue("new java.util.ArrayList<byte[]>(0)")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("byte[]",
      SingleJavaValue("new byte[0]")
    )
  , ListOfJavaValues("byte[]",
      ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  , ListOfJavaValues("byte[]",
      SingleJavaValue("new byte[0]")
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  )

  val hasGenerics = true
}

case object `java.List<Binary>?`
    extends JavaBinary with `box.NullableListOfOne` {

  val javaClass = "java.util.List<byte[]>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("byte[]"))
  val javaDescription = "NullableListOfOneBinaries"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("byte[]",
      SingleJavaValue("new byte[0]")
    )
  , ListOfJavaValues("byte[]",
      ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  , ListOfJavaValues("byte[]",
      SingleJavaValue("new byte[0]")
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  )

  val hasGenerics = true
}

case object `java.List<Binary?>`
    extends JavaBinary with `box.OneListOfNullable` {

  val javaClass = "java.util.List<byte[]>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("byte[]"))
  val javaDescription = "OneListOfNullableBinaries"

  def defaultValue = SingleJavaValue("new java.util.ArrayList<byte[]>(0)")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("byte[]",
      SingleJavaValue("null")
    )
  , ListOfJavaValues("byte[]",
      SingleJavaValue("new byte[0]")
    )
  , ListOfJavaValues("byte[]",
      ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  , ListOfJavaValues("byte[]",
      SingleJavaValue("new byte[0]")
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  , ListOfJavaValues("byte[]",
      SingleJavaValue("null")
    , SingleJavaValue("new byte[0]")
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  )

  val hasGenerics = true
}

case object `java.List<Binary?>?`
    extends JavaBinary with `box.NullableListOfNullable` {

  val javaClass = "java.util.List<byte[]>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("byte[]"))
  val javaDescription = "NullableListOfNullableBinaries"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("byte[]",
      SingleJavaValue("null")
    )
  , ListOfJavaValues("byte[]",
      SingleJavaValue("new byte[0]")
    )
  , ListOfJavaValues("byte[]",
      ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  , ListOfJavaValues("byte[]",
      SingleJavaValue("new byte[0]")
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  , ListOfJavaValues("byte[]",
      SingleJavaValue("null")
    , SingleJavaValue("new byte[0]")
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  )

  val hasGenerics = true
}

case object `java.Set<Binary>`
    extends JavaBinary with `box.OneSetOfOne` {

  val javaClass = "java.util.Set<byte[]>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("byte[]"))
  val javaDescription = "OneSetOfOneBinaries"

  def defaultValue = SingleJavaValue("new java.util.HashSet<byte[]>(0)")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("byte[]",
      SingleJavaValue("new byte[0]")
    )
  , SetOfJavaValues("byte[]",
      ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  , SetOfJavaValues("byte[]",
      SingleJavaValue("new byte[0]")
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  )

  val hasGenerics = true
}

case object `java.Set<Binary>?`
    extends JavaBinary with `box.NullableSetOfOne` {

  val javaClass = "java.util.Set<byte[]>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("byte[]"))
  val javaDescription = "NullableSetOfOneBinaries"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("byte[]",
      SingleJavaValue("new byte[0]")
    )
  , SetOfJavaValues("byte[]",
      ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  , SetOfJavaValues("byte[]",
      SingleJavaValue("new byte[0]")
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  )

  val hasGenerics = true
}

case object `java.Set<Binary?>`
    extends JavaBinary with `box.OneSetOfNullable` {

  val javaClass = "java.util.Set<byte[]>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("byte[]"))
  val javaDescription = "OneSetOfNullableBinaries"

  def defaultValue = SingleJavaValue("new java.util.HashSet<byte[]>(0)")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("byte[]",
      SingleJavaValue("null")
    )
  , SetOfJavaValues("byte[]",
      SingleJavaValue("new byte[0]")
    )
  , SetOfJavaValues("byte[]",
      ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  , SetOfJavaValues("byte[]",
      SingleJavaValue("new byte[0]")
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  , SetOfJavaValues("byte[]",
      SingleJavaValue("null")
    , SingleJavaValue("new byte[0]")
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  )

  val hasGenerics = true
}

case object `java.Set<Binary?>?`
    extends JavaBinary with `box.NullableSetOfNullable` {

  val javaClass = "java.util.Set<byte[]>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("byte[]"))
  val javaDescription = "NullableSetOfNullableBinaries"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("byte[]",
      SingleJavaValue("null")
    )
  , SetOfJavaValues("byte[]",
      SingleJavaValue("new byte[0]")
    )
  , SetOfJavaValues("byte[]",
      ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  , SetOfJavaValues("byte[]",
      SingleJavaValue("new byte[0]")
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  , SetOfJavaValues("byte[]",
      SingleJavaValue("null")
    , SingleJavaValue("new byte[0]")
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  )

  val hasGenerics = true
}
