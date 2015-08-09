package com.dslplatform.ocd
package javas

import types._
import boxes._

sealed trait JavaFloat
    extends OcdJavaBoxType
    with `type.Float` {

  val isPrecise = true
  val isPrimitive = true
  val isEqualable = true
}

case object `java.Float`
    extends JavaFloat with `box.One` {

  val javaClass = "float"
  val javaType = JavaSimpleType("float")
  val javaDescription = "OneFloat"

  def defaultValue = SingleJavaValue("0.0f")

  def nonDefaultValues = IndexedSeq(
    SingleJavaValue("-1.2345E-10f")
  , SingleJavaValue("1.2345E20f")
  , SingleJavaValue("-1E-5f")
  , SingleJavaValue("Float.NaN")
  , SingleJavaValue("Float.NEGATIVE_INFINITY")
  , SingleJavaValue("Float.POSITIVE_INFINITY")
  )

  val hasGenerics = false
}

case object `java.Float?`
    extends JavaFloat with `box.Nullable` {

  val javaClass = "Float"
  val javaType = JavaSimpleType("Float")
  val javaDescription = "NullableFloat"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    SingleJavaValue("0.0f")
  , SingleJavaValue("-1.2345E-10f")
  , SingleJavaValue("1.2345E20f")
  , SingleJavaValue("-1E-5f")
  , SingleJavaValue("Float.NaN")
  , SingleJavaValue("Float.NEGATIVE_INFINITY")
  , SingleJavaValue("Float.POSITIVE_INFINITY")
  )

  val hasGenerics = false
}

case object `java.Float[]`
    extends JavaFloat with `box.OneArrayOfOne` {

  val javaClass = "float[]"
  val javaType = JavaSimpleType("float[]")
  val javaDescription = "OneArrayOfOneFloats"

  def defaultValue = SingleJavaValue("new float[0]")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("float",
      SingleJavaValue("0.0f")
    )
  , ArrayOfJavaValues("float",
      SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  , ArrayOfJavaValues("float",
      SingleJavaValue("0.0f")
    , SingleJavaValue("-1.2345E-10f")
    , SingleJavaValue("1.2345E20f")
    , SingleJavaValue("-1E-5f")
    , SingleJavaValue("Float.NaN")
    , SingleJavaValue("Float.NEGATIVE_INFINITY")
    , SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  )

  val hasGenerics = false
}

case object `java.Float[]?`
    extends JavaFloat with `box.NullableArrayOfOne` {

  val javaClass = "float[]"
  val javaType = JavaSimpleType("float[]")
  val javaDescription = "NullableArrayOfOneFloats"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("float",
      SingleJavaValue("0.0f")
    )
  , ArrayOfJavaValues("float",
      SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  , ArrayOfJavaValues("float",
      SingleJavaValue("0.0f")
    , SingleJavaValue("-1.2345E-10f")
    , SingleJavaValue("1.2345E20f")
    , SingleJavaValue("-1E-5f")
    , SingleJavaValue("Float.NaN")
    , SingleJavaValue("Float.NEGATIVE_INFINITY")
    , SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  )

  val hasGenerics = false
}

case object `java.Float?[]`
    extends JavaFloat with `box.OneArrayOfNullable` {

  val javaClass = "Float[]"
  val javaType = JavaSimpleType("Float[]")
  val javaDescription = "OneArrayOfNullableFloats"

  def defaultValue = SingleJavaValue("new Float[0]")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("Float",
      SingleJavaValue("null")
    )
  , ArrayOfJavaValues("Float",
      SingleJavaValue("0.0f")
    )
  , ArrayOfJavaValues("Float",
      SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  , ArrayOfJavaValues("Float",
      SingleJavaValue("0.0f")
    , SingleJavaValue("-1.2345E-10f")
    , SingleJavaValue("1.2345E20f")
    , SingleJavaValue("-1E-5f")
    , SingleJavaValue("Float.NaN")
    , SingleJavaValue("Float.NEGATIVE_INFINITY")
    , SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  , ArrayOfJavaValues("Float",
      SingleJavaValue("null")
    , SingleJavaValue("0.0f")
    , SingleJavaValue("-1.2345E-10f")
    , SingleJavaValue("1.2345E20f")
    , SingleJavaValue("-1E-5f")
    , SingleJavaValue("Float.NaN")
    , SingleJavaValue("Float.NEGATIVE_INFINITY")
    , SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  )

  val hasGenerics = false
}

case object `java.Float?[]?`
    extends JavaFloat with `box.NullableArrayOfNullable` {

  val javaClass = "Float[]"
  val javaType = JavaSimpleType("Float[]")
  val javaDescription = "NullableArrayOfNullableFloats"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("Float",
      SingleJavaValue("null")
    )
  , ArrayOfJavaValues("Float",
      SingleJavaValue("0.0f")
    )
  , ArrayOfJavaValues("Float",
      SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  , ArrayOfJavaValues("Float",
      SingleJavaValue("0.0f")
    , SingleJavaValue("-1.2345E-10f")
    , SingleJavaValue("1.2345E20f")
    , SingleJavaValue("-1E-5f")
    , SingleJavaValue("Float.NaN")
    , SingleJavaValue("Float.NEGATIVE_INFINITY")
    , SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  , ArrayOfJavaValues("Float",
      SingleJavaValue("null")
    , SingleJavaValue("0.0f")
    , SingleJavaValue("-1.2345E-10f")
    , SingleJavaValue("1.2345E20f")
    , SingleJavaValue("-1E-5f")
    , SingleJavaValue("Float.NaN")
    , SingleJavaValue("Float.NEGATIVE_INFINITY")
    , SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  )

  val hasGenerics = false
}

case object `java.List<Float>`
    extends JavaFloat with `box.OneListOfOne` {

  val javaClass = "java.util.List<Float>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("Float"))
  val javaDescription = "OneListOfOneFloats"

  def defaultValue = SingleJavaValue("new java.util.ArrayList<Float>(0)")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("Float",
      SingleJavaValue("0.0f")
    )
  , ListOfJavaValues("Float",
      SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  , ListOfJavaValues("Float",
      SingleJavaValue("0.0f")
    , SingleJavaValue("-1.2345E-10f")
    , SingleJavaValue("1.2345E20f")
    , SingleJavaValue("-1E-5f")
    , SingleJavaValue("Float.NaN")
    , SingleJavaValue("Float.NEGATIVE_INFINITY")
    , SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  )

  val hasGenerics = true
}

case object `java.List<Float>?`
    extends JavaFloat with `box.NullableListOfOne` {

  val javaClass = "java.util.List<Float>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("Float"))
  val javaDescription = "NullableListOfOneFloats"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("Float",
      SingleJavaValue("0.0f")
    )
  , ListOfJavaValues("Float",
      SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  , ListOfJavaValues("Float",
      SingleJavaValue("0.0f")
    , SingleJavaValue("-1.2345E-10f")
    , SingleJavaValue("1.2345E20f")
    , SingleJavaValue("-1E-5f")
    , SingleJavaValue("Float.NaN")
    , SingleJavaValue("Float.NEGATIVE_INFINITY")
    , SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  )

  val hasGenerics = true
}

case object `java.List<Float?>`
    extends JavaFloat with `box.OneListOfNullable` {

  val javaClass = "java.util.List<Float>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("Float"))
  val javaDescription = "OneListOfNullableFloats"

  def defaultValue = SingleJavaValue("new java.util.ArrayList<Float>(0)")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("Float",
      SingleJavaValue("null")
    )
  , ListOfJavaValues("Float",
      SingleJavaValue("0.0f")
    )
  , ListOfJavaValues("Float",
      SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  , ListOfJavaValues("Float",
      SingleJavaValue("0.0f")
    , SingleJavaValue("-1.2345E-10f")
    , SingleJavaValue("1.2345E20f")
    , SingleJavaValue("-1E-5f")
    , SingleJavaValue("Float.NaN")
    , SingleJavaValue("Float.NEGATIVE_INFINITY")
    , SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  , ListOfJavaValues("Float",
      SingleJavaValue("null")
    , SingleJavaValue("0.0f")
    , SingleJavaValue("-1.2345E-10f")
    , SingleJavaValue("1.2345E20f")
    , SingleJavaValue("-1E-5f")
    , SingleJavaValue("Float.NaN")
    , SingleJavaValue("Float.NEGATIVE_INFINITY")
    , SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  )

  val hasGenerics = true
}

case object `java.List<Float?>?`
    extends JavaFloat with `box.NullableListOfNullable` {

  val javaClass = "java.util.List<Float>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("Float"))
  val javaDescription = "NullableListOfNullableFloats"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("Float",
      SingleJavaValue("null")
    )
  , ListOfJavaValues("Float",
      SingleJavaValue("0.0f")
    )
  , ListOfJavaValues("Float",
      SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  , ListOfJavaValues("Float",
      SingleJavaValue("0.0f")
    , SingleJavaValue("-1.2345E-10f")
    , SingleJavaValue("1.2345E20f")
    , SingleJavaValue("-1E-5f")
    , SingleJavaValue("Float.NaN")
    , SingleJavaValue("Float.NEGATIVE_INFINITY")
    , SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  , ListOfJavaValues("Float",
      SingleJavaValue("null")
    , SingleJavaValue("0.0f")
    , SingleJavaValue("-1.2345E-10f")
    , SingleJavaValue("1.2345E20f")
    , SingleJavaValue("-1E-5f")
    , SingleJavaValue("Float.NaN")
    , SingleJavaValue("Float.NEGATIVE_INFINITY")
    , SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  )

  val hasGenerics = true
}

case object `java.Set<Float>`
    extends JavaFloat with `box.OneSetOfOne` {

  val javaClass = "java.util.Set<Float>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("Float"))
  val javaDescription = "OneSetOfOneFloats"

  def defaultValue = SingleJavaValue("new java.util.HashSet<Float>(0)")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("Float",
      SingleJavaValue("0.0f")
    )
  , SetOfJavaValues("Float",
      SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  , SetOfJavaValues("Float",
      SingleJavaValue("0.0f")
    , SingleJavaValue("-1.2345E-10f")
    , SingleJavaValue("1.2345E20f")
    , SingleJavaValue("-1E-5f")
    , SingleJavaValue("Float.NaN")
    , SingleJavaValue("Float.NEGATIVE_INFINITY")
    , SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  )

  val hasGenerics = true
}

case object `java.Set<Float>?`
    extends JavaFloat with `box.NullableSetOfOne` {

  val javaClass = "java.util.Set<Float>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("Float"))
  val javaDescription = "NullableSetOfOneFloats"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("Float",
      SingleJavaValue("0.0f")
    )
  , SetOfJavaValues("Float",
      SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  , SetOfJavaValues("Float",
      SingleJavaValue("0.0f")
    , SingleJavaValue("-1.2345E-10f")
    , SingleJavaValue("1.2345E20f")
    , SingleJavaValue("-1E-5f")
    , SingleJavaValue("Float.NaN")
    , SingleJavaValue("Float.NEGATIVE_INFINITY")
    , SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  )

  val hasGenerics = true
}

case object `java.Set<Float?>`
    extends JavaFloat with `box.OneSetOfNullable` {

  val javaClass = "java.util.Set<Float>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("Float"))
  val javaDescription = "OneSetOfNullableFloats"

  def defaultValue = SingleJavaValue("new java.util.HashSet<Float>(0)")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("Float",
      SingleJavaValue("null")
    )
  , SetOfJavaValues("Float",
      SingleJavaValue("0.0f")
    )
  , SetOfJavaValues("Float",
      SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  , SetOfJavaValues("Float",
      SingleJavaValue("0.0f")
    , SingleJavaValue("-1.2345E-10f")
    , SingleJavaValue("1.2345E20f")
    , SingleJavaValue("-1E-5f")
    , SingleJavaValue("Float.NaN")
    , SingleJavaValue("Float.NEGATIVE_INFINITY")
    , SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  , SetOfJavaValues("Float",
      SingleJavaValue("null")
    , SingleJavaValue("0.0f")
    , SingleJavaValue("-1.2345E-10f")
    , SingleJavaValue("1.2345E20f")
    , SingleJavaValue("-1E-5f")
    , SingleJavaValue("Float.NaN")
    , SingleJavaValue("Float.NEGATIVE_INFINITY")
    , SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  )

  val hasGenerics = true
}

case object `java.Set<Float?>?`
    extends JavaFloat with `box.NullableSetOfNullable` {

  val javaClass = "java.util.Set<Float>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("Float"))
  val javaDescription = "NullableSetOfNullableFloats"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("Float",
      SingleJavaValue("null")
    )
  , SetOfJavaValues("Float",
      SingleJavaValue("0.0f")
    )
  , SetOfJavaValues("Float",
      SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  , SetOfJavaValues("Float",
      SingleJavaValue("0.0f")
    , SingleJavaValue("-1.2345E-10f")
    , SingleJavaValue("1.2345E20f")
    , SingleJavaValue("-1E-5f")
    , SingleJavaValue("Float.NaN")
    , SingleJavaValue("Float.NEGATIVE_INFINITY")
    , SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  , SetOfJavaValues("Float",
      SingleJavaValue("null")
    , SingleJavaValue("0.0f")
    , SingleJavaValue("-1.2345E-10f")
    , SingleJavaValue("1.2345E20f")
    , SingleJavaValue("-1E-5f")
    , SingleJavaValue("Float.NaN")
    , SingleJavaValue("Float.NEGATIVE_INFINITY")
    , SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  )

  val hasGenerics = true
}
