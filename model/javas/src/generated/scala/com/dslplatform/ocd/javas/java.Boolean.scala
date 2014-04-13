package com.dslplatform.ocd
package javas

import types._
import boxes._

sealed trait JavaBoolean
    extends OcdJavaBoxType
    with `type.Boolean` {

  val isPrecise = false
  val isPrimitive = true
}

case object `java.Boolean`
    extends JavaBoolean with `box.One` {

  val javaClass = "boolean"
  val javaType = JavaSimpleType("boolean")
  val javaDescription = "OneBoolean"

  def defaultValue = SingleJavaValue("false")

  def nonDefaultValues = IndexedSeq(
    SingleJavaValue("true")
  )

  val hasGenerics = false
}

case object `java.Boolean?`
    extends JavaBoolean with `box.Nullable` {

  val javaClass = "Boolean"
  val javaType = JavaSimpleType("Boolean")
  val javaDescription = "NullableBoolean"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    SingleJavaValue("false")
  , SingleJavaValue("true")
  )

  val hasGenerics = false
}

case object `java.Boolean[]`
    extends JavaBoolean with `box.OneArrayOfOne` {

  val javaClass = "boolean[]"
  val javaType = JavaSimpleType("boolean[]")
  val javaDescription = "OneArrayOfOneBooleans"

  def defaultValue = SingleJavaValue("new boolean[0]")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("boolean",
      SingleJavaValue("false")
    )
  , ArrayOfJavaValues("boolean",
      SingleJavaValue("true")
    )
  , ArrayOfJavaValues("boolean",
      SingleJavaValue("false")
    , SingleJavaValue("true")
    )
  )

  val hasGenerics = false
}

case object `java.Boolean[]?`
    extends JavaBoolean with `box.NullableArrayOfOne` {

  val javaClass = "boolean[]"
  val javaType = JavaSimpleType("boolean[]")
  val javaDescription = "NullableArrayOfOneBooleans"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("boolean",
      SingleJavaValue("false")
    )
  , ArrayOfJavaValues("boolean",
      SingleJavaValue("true")
    )
  , ArrayOfJavaValues("boolean",
      SingleJavaValue("false")
    , SingleJavaValue("true")
    )
  )

  val hasGenerics = false
}

case object `java.Boolean?[]`
    extends JavaBoolean with `box.OneArrayOfNullable` {

  val javaClass = "Boolean[]"
  val javaType = JavaSimpleType("Boolean[]")
  val javaDescription = "OneArrayOfNullableBooleans"

  def defaultValue = SingleJavaValue("new Boolean[0]")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("Boolean",
      SingleJavaValue("null")
    )
  , ArrayOfJavaValues("Boolean",
      SingleJavaValue("false")
    )
  , ArrayOfJavaValues("Boolean",
      SingleJavaValue("true")
    )
  , ArrayOfJavaValues("Boolean",
      SingleJavaValue("false")
    , SingleJavaValue("true")
    )
  , ArrayOfJavaValues("Boolean",
      SingleJavaValue("null")
    , SingleJavaValue("false")
    , SingleJavaValue("true")
    )
  )

  val hasGenerics = false
}

case object `java.Boolean?[]?`
    extends JavaBoolean with `box.NullableArrayOfNullable` {

  val javaClass = "Boolean[]"
  val javaType = JavaSimpleType("Boolean[]")
  val javaDescription = "NullableArrayOfNullableBooleans"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("Boolean",
      SingleJavaValue("null")
    )
  , ArrayOfJavaValues("Boolean",
      SingleJavaValue("false")
    )
  , ArrayOfJavaValues("Boolean",
      SingleJavaValue("true")
    )
  , ArrayOfJavaValues("Boolean",
      SingleJavaValue("false")
    , SingleJavaValue("true")
    )
  , ArrayOfJavaValues("Boolean",
      SingleJavaValue("null")
    , SingleJavaValue("false")
    , SingleJavaValue("true")
    )
  )

  val hasGenerics = false
}

case object `java.List<Boolean>`
    extends JavaBoolean with `box.OneListOfOne` {

  val javaClass = "java.util.List<Boolean>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("Boolean"))
  val javaDescription = "OneListOfOneBooleans"

  def defaultValue = SingleJavaValue("new java.util.ArrayList<Boolean>(0)")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("Boolean",
      SingleJavaValue("false")
    )
  , ListOfJavaValues("Boolean",
      SingleJavaValue("true")
    )
  , ListOfJavaValues("Boolean",
      SingleJavaValue("false")
    , SingleJavaValue("true")
    )
  )

  val hasGenerics = true
}

case object `java.List<Boolean>?`
    extends JavaBoolean with `box.NullableListOfOne` {

  val javaClass = "java.util.List<Boolean>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("Boolean"))
  val javaDescription = "NullableListOfOneBooleans"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("Boolean",
      SingleJavaValue("false")
    )
  , ListOfJavaValues("Boolean",
      SingleJavaValue("true")
    )
  , ListOfJavaValues("Boolean",
      SingleJavaValue("false")
    , SingleJavaValue("true")
    )
  )

  val hasGenerics = true
}

case object `java.List<Boolean?>`
    extends JavaBoolean with `box.OneListOfNullable` {

  val javaClass = "java.util.List<Boolean>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("Boolean"))
  val javaDescription = "OneListOfNullableBooleans"

  def defaultValue = SingleJavaValue("new java.util.ArrayList<Boolean>(0)")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("Boolean",
      SingleJavaValue("null")
    )
  , ListOfJavaValues("Boolean",
      SingleJavaValue("false")
    )
  , ListOfJavaValues("Boolean",
      SingleJavaValue("true")
    )
  , ListOfJavaValues("Boolean",
      SingleJavaValue("false")
    , SingleJavaValue("true")
    )
  , ListOfJavaValues("Boolean",
      SingleJavaValue("null")
    , SingleJavaValue("false")
    , SingleJavaValue("true")
    )
  )

  val hasGenerics = true
}

case object `java.List<Boolean?>?`
    extends JavaBoolean with `box.NullableListOfNullable` {

  val javaClass = "java.util.List<Boolean>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("Boolean"))
  val javaDescription = "NullableListOfNullableBooleans"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("Boolean",
      SingleJavaValue("null")
    )
  , ListOfJavaValues("Boolean",
      SingleJavaValue("false")
    )
  , ListOfJavaValues("Boolean",
      SingleJavaValue("true")
    )
  , ListOfJavaValues("Boolean",
      SingleJavaValue("false")
    , SingleJavaValue("true")
    )
  , ListOfJavaValues("Boolean",
      SingleJavaValue("null")
    , SingleJavaValue("false")
    , SingleJavaValue("true")
    )
  )

  val hasGenerics = true
}

case object `java.Set<Boolean>`
    extends JavaBoolean with `box.OneSetOfOne` {

  val javaClass = "java.util.Set<Boolean>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("Boolean"))
  val javaDescription = "OneSetOfOneBooleans"

  def defaultValue = SingleJavaValue("new java.util.HashSet<Boolean>(0)")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("Boolean",
      SingleJavaValue("false")
    )
  , SetOfJavaValues("Boolean",
      SingleJavaValue("true")
    )
  , SetOfJavaValues("Boolean",
      SingleJavaValue("false")
    , SingleJavaValue("true")
    )
  )

  val hasGenerics = true
}

case object `java.Set<Boolean>?`
    extends JavaBoolean with `box.NullableSetOfOne` {

  val javaClass = "java.util.Set<Boolean>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("Boolean"))
  val javaDescription = "NullableSetOfOneBooleans"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("Boolean",
      SingleJavaValue("false")
    )
  , SetOfJavaValues("Boolean",
      SingleJavaValue("true")
    )
  , SetOfJavaValues("Boolean",
      SingleJavaValue("false")
    , SingleJavaValue("true")
    )
  )

  val hasGenerics = true
}

case object `java.Set<Boolean?>`
    extends JavaBoolean with `box.OneSetOfNullable` {

  val javaClass = "java.util.Set<Boolean>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("Boolean"))
  val javaDescription = "OneSetOfNullableBooleans"

  def defaultValue = SingleJavaValue("new java.util.HashSet<Boolean>(0)")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("Boolean",
      SingleJavaValue("null")
    )
  , SetOfJavaValues("Boolean",
      SingleJavaValue("false")
    )
  , SetOfJavaValues("Boolean",
      SingleJavaValue("true")
    )
  , SetOfJavaValues("Boolean",
      SingleJavaValue("false")
    , SingleJavaValue("true")
    )
  , SetOfJavaValues("Boolean",
      SingleJavaValue("null")
    , SingleJavaValue("false")
    , SingleJavaValue("true")
    )
  )

  val hasGenerics = true
}

case object `java.Set<Boolean?>?`
    extends JavaBoolean with `box.NullableSetOfNullable` {

  val javaClass = "java.util.Set<Boolean>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("Boolean"))
  val javaDescription = "NullableSetOfNullableBooleans"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("Boolean",
      SingleJavaValue("null")
    )
  , SetOfJavaValues("Boolean",
      SingleJavaValue("false")
    )
  , SetOfJavaValues("Boolean",
      SingleJavaValue("true")
    )
  , SetOfJavaValues("Boolean",
      SingleJavaValue("false")
    , SingleJavaValue("true")
    )
  , SetOfJavaValues("Boolean",
      SingleJavaValue("null")
    , SingleJavaValue("false")
    , SingleJavaValue("true")
    )
  )

  val hasGenerics = true
}
