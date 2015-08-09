package com.dslplatform.ocd
package javas

import types._
import boxes._

sealed trait JavaGuid
    extends OcdJavaBoxType
    with `type.Guid` {

  val isPrecise = false
  val isPrimitive = false
  val isEqualable = true
}

case object `java.Guid`
    extends JavaGuid with `box.One` {

  val javaClass = "java.util.UUID"
  val javaType = JavaSimpleType("java.util.UUID")
  val javaDescription = "OneGuid"

  def defaultValue = SingleJavaValue("java.util.UUID.randomUUID()", Unstable)

  def nonDefaultValues = IndexedSeq(
    SingleJavaValue("java.util.UUID.fromString(\"1-2-3-4-5\")")
  , SingleJavaValue("new java.util.UUID(0L, 0L)")
  )

  val hasGenerics = false
}

case object `java.Guid?`
    extends JavaGuid with `box.Nullable` {

  val javaClass = "java.util.UUID"
  val javaType = JavaSimpleType("java.util.UUID")
  val javaDescription = "NullableGuid"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
  , SingleJavaValue("java.util.UUID.fromString(\"1-2-3-4-5\")")
  , SingleJavaValue("new java.util.UUID(0L, 0L)")
  )

  val hasGenerics = false
}

case object `java.Guid[]`
    extends JavaGuid with `box.OneArrayOfOne` {

  val javaClass = "java.util.UUID[]"
  val javaType = JavaSimpleType("java.util.UUID[]")
  val javaDescription = "OneArrayOfOneGuids"

  def defaultValue = SingleJavaValue("new java.util.UUID[0]")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("java.util.UUID",
      SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    )
  , ArrayOfJavaValues("java.util.UUID",
      SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  , ArrayOfJavaValues("java.util.UUID",
      SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    , SingleJavaValue("java.util.UUID.fromString(\"1-2-3-4-5\")")
    , SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  )

  val hasGenerics = false
}

case object `java.Guid[]?`
    extends JavaGuid with `box.NullableArrayOfOne` {

  val javaClass = "java.util.UUID[]"
  val javaType = JavaSimpleType("java.util.UUID[]")
  val javaDescription = "NullableArrayOfOneGuids"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("java.util.UUID",
      SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    )
  , ArrayOfJavaValues("java.util.UUID",
      SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  , ArrayOfJavaValues("java.util.UUID",
      SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    , SingleJavaValue("java.util.UUID.fromString(\"1-2-3-4-5\")")
    , SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  )

  val hasGenerics = false
}

case object `java.Guid?[]`
    extends JavaGuid with `box.OneArrayOfNullable` {

  val javaClass = "java.util.UUID[]"
  val javaType = JavaSimpleType("java.util.UUID[]")
  val javaDescription = "OneArrayOfNullableGuids"

  def defaultValue = SingleJavaValue("new java.util.UUID[0]")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("java.util.UUID",
      SingleJavaValue("null")
    )
  , ArrayOfJavaValues("java.util.UUID",
      SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    )
  , ArrayOfJavaValues("java.util.UUID",
      SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  , ArrayOfJavaValues("java.util.UUID",
      SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    , SingleJavaValue("java.util.UUID.fromString(\"1-2-3-4-5\")")
    , SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  , ArrayOfJavaValues("java.util.UUID",
      SingleJavaValue("null")
    , SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    , SingleJavaValue("java.util.UUID.fromString(\"1-2-3-4-5\")")
    , SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  )

  val hasGenerics = false
}

case object `java.Guid?[]?`
    extends JavaGuid with `box.NullableArrayOfNullable` {

  val javaClass = "java.util.UUID[]"
  val javaType = JavaSimpleType("java.util.UUID[]")
  val javaDescription = "NullableArrayOfNullableGuids"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("java.util.UUID",
      SingleJavaValue("null")
    )
  , ArrayOfJavaValues("java.util.UUID",
      SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    )
  , ArrayOfJavaValues("java.util.UUID",
      SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  , ArrayOfJavaValues("java.util.UUID",
      SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    , SingleJavaValue("java.util.UUID.fromString(\"1-2-3-4-5\")")
    , SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  , ArrayOfJavaValues("java.util.UUID",
      SingleJavaValue("null")
    , SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    , SingleJavaValue("java.util.UUID.fromString(\"1-2-3-4-5\")")
    , SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  )

  val hasGenerics = false
}

case object `java.List<Guid>`
    extends JavaGuid with `box.OneListOfOne` {

  val javaClass = "java.util.List<java.util.UUID>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("java.util.UUID"))
  val javaDescription = "OneListOfOneGuids"

  def defaultValue = SingleJavaValue("new java.util.ArrayList<java.util.UUID>(0)")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("java.util.UUID",
      SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    )
  , ListOfJavaValues("java.util.UUID",
      SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  , ListOfJavaValues("java.util.UUID",
      SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    , SingleJavaValue("java.util.UUID.fromString(\"1-2-3-4-5\")")
    , SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  )

  val hasGenerics = true
}

case object `java.List<Guid>?`
    extends JavaGuid with `box.NullableListOfOne` {

  val javaClass = "java.util.List<java.util.UUID>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("java.util.UUID"))
  val javaDescription = "NullableListOfOneGuids"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("java.util.UUID",
      SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    )
  , ListOfJavaValues("java.util.UUID",
      SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  , ListOfJavaValues("java.util.UUID",
      SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    , SingleJavaValue("java.util.UUID.fromString(\"1-2-3-4-5\")")
    , SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  )

  val hasGenerics = true
}

case object `java.List<Guid?>`
    extends JavaGuid with `box.OneListOfNullable` {

  val javaClass = "java.util.List<java.util.UUID>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("java.util.UUID"))
  val javaDescription = "OneListOfNullableGuids"

  def defaultValue = SingleJavaValue("new java.util.ArrayList<java.util.UUID>(0)")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("java.util.UUID",
      SingleJavaValue("null")
    )
  , ListOfJavaValues("java.util.UUID",
      SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    )
  , ListOfJavaValues("java.util.UUID",
      SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  , ListOfJavaValues("java.util.UUID",
      SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    , SingleJavaValue("java.util.UUID.fromString(\"1-2-3-4-5\")")
    , SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  , ListOfJavaValues("java.util.UUID",
      SingleJavaValue("null")
    , SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    , SingleJavaValue("java.util.UUID.fromString(\"1-2-3-4-5\")")
    , SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  )

  val hasGenerics = true
}

case object `java.List<Guid?>?`
    extends JavaGuid with `box.NullableListOfNullable` {

  val javaClass = "java.util.List<java.util.UUID>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("java.util.UUID"))
  val javaDescription = "NullableListOfNullableGuids"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("java.util.UUID",
      SingleJavaValue("null")
    )
  , ListOfJavaValues("java.util.UUID",
      SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    )
  , ListOfJavaValues("java.util.UUID",
      SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  , ListOfJavaValues("java.util.UUID",
      SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    , SingleJavaValue("java.util.UUID.fromString(\"1-2-3-4-5\")")
    , SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  , ListOfJavaValues("java.util.UUID",
      SingleJavaValue("null")
    , SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    , SingleJavaValue("java.util.UUID.fromString(\"1-2-3-4-5\")")
    , SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  )

  val hasGenerics = true
}

case object `java.Set<Guid>`
    extends JavaGuid with `box.OneSetOfOne` {

  val javaClass = "java.util.Set<java.util.UUID>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("java.util.UUID"))
  val javaDescription = "OneSetOfOneGuids"

  def defaultValue = SingleJavaValue("new java.util.HashSet<java.util.UUID>(0)")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("java.util.UUID",
      SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    )
  , SetOfJavaValues("java.util.UUID",
      SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  , SetOfJavaValues("java.util.UUID",
      SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    , SingleJavaValue("java.util.UUID.fromString(\"1-2-3-4-5\")")
    , SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  )

  val hasGenerics = true
}

case object `java.Set<Guid>?`
    extends JavaGuid with `box.NullableSetOfOne` {

  val javaClass = "java.util.Set<java.util.UUID>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("java.util.UUID"))
  val javaDescription = "NullableSetOfOneGuids"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("java.util.UUID",
      SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    )
  , SetOfJavaValues("java.util.UUID",
      SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  , SetOfJavaValues("java.util.UUID",
      SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    , SingleJavaValue("java.util.UUID.fromString(\"1-2-3-4-5\")")
    , SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  )

  val hasGenerics = true
}

case object `java.Set<Guid?>`
    extends JavaGuid with `box.OneSetOfNullable` {

  val javaClass = "java.util.Set<java.util.UUID>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("java.util.UUID"))
  val javaDescription = "OneSetOfNullableGuids"

  def defaultValue = SingleJavaValue("new java.util.HashSet<java.util.UUID>(0)")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("java.util.UUID",
      SingleJavaValue("null")
    )
  , SetOfJavaValues("java.util.UUID",
      SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    )
  , SetOfJavaValues("java.util.UUID",
      SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  , SetOfJavaValues("java.util.UUID",
      SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    , SingleJavaValue("java.util.UUID.fromString(\"1-2-3-4-5\")")
    , SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  , SetOfJavaValues("java.util.UUID",
      SingleJavaValue("null")
    , SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    , SingleJavaValue("java.util.UUID.fromString(\"1-2-3-4-5\")")
    , SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  )

  val hasGenerics = true
}

case object `java.Set<Guid?>?`
    extends JavaGuid with `box.NullableSetOfNullable` {

  val javaClass = "java.util.Set<java.util.UUID>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("java.util.UUID"))
  val javaDescription = "NullableSetOfNullableGuids"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("java.util.UUID",
      SingleJavaValue("null")
    )
  , SetOfJavaValues("java.util.UUID",
      SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    )
  , SetOfJavaValues("java.util.UUID",
      SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  , SetOfJavaValues("java.util.UUID",
      SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    , SingleJavaValue("java.util.UUID.fromString(\"1-2-3-4-5\")")
    , SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  , SetOfJavaValues("java.util.UUID",
      SingleJavaValue("null")
    , SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    , SingleJavaValue("java.util.UUID.fromString(\"1-2-3-4-5\")")
    , SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  )

  val hasGenerics = true
}
