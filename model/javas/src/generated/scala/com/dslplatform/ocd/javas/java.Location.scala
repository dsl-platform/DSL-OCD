package com.dslplatform.ocd
package javas

import types._
import boxes._

sealed trait JavaLocation
    extends OcdJavaBoxType
    with `type.Location` {

  val isPrecise = true
  val isPrimitive = false
}

case object `java.Location`
    extends JavaLocation with `box.One` {

  val javaClass = "java.awt.geom.Point2D"
  val javaType = JavaSimpleType("java.awt.geom.Point2D")
  val javaDescription = "OneLocation"

  def defaultValue = SingleJavaValue("new java.awt.geom.Point2D.Float()")

  def nonDefaultValues = IndexedSeq(
    SingleJavaValue("new java.awt.Point(Integer.MIN_VALUE, Integer.MAX_VALUE)")
  , SingleJavaValue("new java.awt.Point(-1000000000, 1000000000)")
  , SingleJavaValue("new java.awt.geom.Point2D.Float(Float.MIN_VALUE, Float.MAX_VALUE)")
  , SingleJavaValue("new java.awt.geom.Point2D.Float(-1.0000001f, 1.0000001f)")
  , SingleJavaValue("new java.awt.geom.Point2D.Double(Double.MIN_VALUE, Double.MAX_VALUE)")
  , SingleJavaValue("new java.awt.geom.Point2D.Double(-1.000000000000001, 1.000000000000001)")
  )

  val hasGenerics = false
}

case object `java.Location?`
    extends JavaLocation with `box.Nullable` {

  val javaClass = "java.awt.geom.Point2D"
  val javaType = JavaSimpleType("java.awt.geom.Point2D")
  val javaDescription = "NullableLocation"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    SingleJavaValue("new java.awt.geom.Point2D.Float()")
  , SingleJavaValue("new java.awt.Point(Integer.MIN_VALUE, Integer.MAX_VALUE)")
  , SingleJavaValue("new java.awt.Point(-1000000000, 1000000000)")
  , SingleJavaValue("new java.awt.geom.Point2D.Float(Float.MIN_VALUE, Float.MAX_VALUE)")
  , SingleJavaValue("new java.awt.geom.Point2D.Float(-1.0000001f, 1.0000001f)")
  , SingleJavaValue("new java.awt.geom.Point2D.Double(Double.MIN_VALUE, Double.MAX_VALUE)")
  , SingleJavaValue("new java.awt.geom.Point2D.Double(-1.000000000000001, 1.000000000000001)")
  )

  val hasGenerics = false
}

case object `java.Location[]`
    extends JavaLocation with `box.OneArrayOfOne` {

  val javaClass = "java.awt.geom.Point2D[]"
  val javaType = JavaSimpleType("java.awt.geom.Point2D[]")
  val javaDescription = "OneArrayOfOneLocations"

  def defaultValue = SingleJavaValue("new java.awt.geom.Point2D[0]")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Float()")
    )
  , ArrayOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Double(-1.000000000000001, 1.000000000000001)")
    )
  , ArrayOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Float()")
    , SingleJavaValue("new java.awt.Point(Integer.MIN_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Point(-1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(Float.MIN_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(-1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Point2D.Double(Double.MIN_VALUE, Double.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Point2D.Double(-1.000000000000001, 1.000000000000001)")
    )
  )

  val hasGenerics = false
}

case object `java.Location[]?`
    extends JavaLocation with `box.NullableArrayOfOne` {

  val javaClass = "java.awt.geom.Point2D[]"
  val javaType = JavaSimpleType("java.awt.geom.Point2D[]")
  val javaDescription = "NullableArrayOfOneLocations"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Float()")
    )
  , ArrayOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Double(-1.000000000000001, 1.000000000000001)")
    )
  , ArrayOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Float()")
    , SingleJavaValue("new java.awt.Point(Integer.MIN_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Point(-1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(Float.MIN_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(-1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Point2D.Double(Double.MIN_VALUE, Double.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Point2D.Double(-1.000000000000001, 1.000000000000001)")
    )
  )

  val hasGenerics = false
}

case object `java.Location?[]`
    extends JavaLocation with `box.OneArrayOfNullable` {

  val javaClass = "java.awt.geom.Point2D[]"
  val javaType = JavaSimpleType("java.awt.geom.Point2D[]")
  val javaDescription = "OneArrayOfNullableLocations"

  def defaultValue = SingleJavaValue("new java.awt.geom.Point2D[0]")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("null")
    )
  , ArrayOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Float()")
    )
  , ArrayOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Double(-1.000000000000001, 1.000000000000001)")
    )
  , ArrayOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Float()")
    , SingleJavaValue("new java.awt.Point(Integer.MIN_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Point(-1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(Float.MIN_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(-1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Point2D.Double(Double.MIN_VALUE, Double.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Point2D.Double(-1.000000000000001, 1.000000000000001)")
    )
  , ArrayOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("null")
    , SingleJavaValue("new java.awt.geom.Point2D.Float()")
    , SingleJavaValue("new java.awt.Point(Integer.MIN_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Point(-1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(Float.MIN_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(-1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Point2D.Double(Double.MIN_VALUE, Double.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Point2D.Double(-1.000000000000001, 1.000000000000001)")
    )
  )

  val hasGenerics = false
}

case object `java.Location?[]?`
    extends JavaLocation with `box.NullableArrayOfNullable` {

  val javaClass = "java.awt.geom.Point2D[]"
  val javaType = JavaSimpleType("java.awt.geom.Point2D[]")
  val javaDescription = "NullableArrayOfNullableLocations"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("null")
    )
  , ArrayOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Float()")
    )
  , ArrayOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Double(-1.000000000000001, 1.000000000000001)")
    )
  , ArrayOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Float()")
    , SingleJavaValue("new java.awt.Point(Integer.MIN_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Point(-1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(Float.MIN_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(-1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Point2D.Double(Double.MIN_VALUE, Double.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Point2D.Double(-1.000000000000001, 1.000000000000001)")
    )
  , ArrayOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("null")
    , SingleJavaValue("new java.awt.geom.Point2D.Float()")
    , SingleJavaValue("new java.awt.Point(Integer.MIN_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Point(-1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(Float.MIN_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(-1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Point2D.Double(Double.MIN_VALUE, Double.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Point2D.Double(-1.000000000000001, 1.000000000000001)")
    )
  )

  val hasGenerics = false
}

case object `java.List<Location>`
    extends JavaLocation with `box.OneListOfOne` {

  val javaClass = "java.util.List<java.awt.geom.Point2D>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("java.awt.geom.Point2D"))
  val javaDescription = "OneListOfOneLocations"

  def defaultValue = SingleJavaValue("new java.util.ArrayList<java.awt.geom.Point2D>(0)")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Float()")
    )
  , ListOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Double(-1.000000000000001, 1.000000000000001)")
    )
  , ListOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Float()")
    , SingleJavaValue("new java.awt.Point(Integer.MIN_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Point(-1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(Float.MIN_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(-1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Point2D.Double(Double.MIN_VALUE, Double.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Point2D.Double(-1.000000000000001, 1.000000000000001)")
    )
  )

  val hasGenerics = true
}

case object `java.List<Location>?`
    extends JavaLocation with `box.NullableListOfOne` {

  val javaClass = "java.util.List<java.awt.geom.Point2D>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("java.awt.geom.Point2D"))
  val javaDescription = "NullableListOfOneLocations"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Float()")
    )
  , ListOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Double(-1.000000000000001, 1.000000000000001)")
    )
  , ListOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Float()")
    , SingleJavaValue("new java.awt.Point(Integer.MIN_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Point(-1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(Float.MIN_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(-1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Point2D.Double(Double.MIN_VALUE, Double.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Point2D.Double(-1.000000000000001, 1.000000000000001)")
    )
  )

  val hasGenerics = true
}

case object `java.List<Location?>`
    extends JavaLocation with `box.OneListOfNullable` {

  val javaClass = "java.util.List<java.awt.geom.Point2D>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("java.awt.geom.Point2D"))
  val javaDescription = "OneListOfNullableLocations"

  def defaultValue = SingleJavaValue("new java.util.ArrayList<java.awt.geom.Point2D>(0)")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("null")
    )
  , ListOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Float()")
    )
  , ListOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Double(-1.000000000000001, 1.000000000000001)")
    )
  , ListOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Float()")
    , SingleJavaValue("new java.awt.Point(Integer.MIN_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Point(-1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(Float.MIN_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(-1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Point2D.Double(Double.MIN_VALUE, Double.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Point2D.Double(-1.000000000000001, 1.000000000000001)")
    )
  , ListOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("null")
    , SingleJavaValue("new java.awt.geom.Point2D.Float()")
    , SingleJavaValue("new java.awt.Point(Integer.MIN_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Point(-1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(Float.MIN_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(-1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Point2D.Double(Double.MIN_VALUE, Double.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Point2D.Double(-1.000000000000001, 1.000000000000001)")
    )
  )

  val hasGenerics = true
}

case object `java.List<Location?>?`
    extends JavaLocation with `box.NullableListOfNullable` {

  val javaClass = "java.util.List<java.awt.geom.Point2D>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("java.awt.geom.Point2D"))
  val javaDescription = "NullableListOfNullableLocations"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("null")
    )
  , ListOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Float()")
    )
  , ListOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Double(-1.000000000000001, 1.000000000000001)")
    )
  , ListOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Float()")
    , SingleJavaValue("new java.awt.Point(Integer.MIN_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Point(-1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(Float.MIN_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(-1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Point2D.Double(Double.MIN_VALUE, Double.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Point2D.Double(-1.000000000000001, 1.000000000000001)")
    )
  , ListOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("null")
    , SingleJavaValue("new java.awt.geom.Point2D.Float()")
    , SingleJavaValue("new java.awt.Point(Integer.MIN_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Point(-1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(Float.MIN_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(-1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Point2D.Double(Double.MIN_VALUE, Double.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Point2D.Double(-1.000000000000001, 1.000000000000001)")
    )
  )

  val hasGenerics = true
}

case object `java.Set<Location>`
    extends JavaLocation with `box.OneSetOfOne` {

  val javaClass = "java.util.Set<java.awt.geom.Point2D>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("java.awt.geom.Point2D"))
  val javaDescription = "OneSetOfOneLocations"

  def defaultValue = SingleJavaValue("new java.util.HashSet<java.awt.geom.Point2D>(0)")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Float()")
    )
  , SetOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Double(-1.000000000000001, 1.000000000000001)")
    )
  , SetOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Float()")
    , SingleJavaValue("new java.awt.Point(Integer.MIN_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Point(-1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(Float.MIN_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(-1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Point2D.Double(Double.MIN_VALUE, Double.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Point2D.Double(-1.000000000000001, 1.000000000000001)")
    )
  )

  val hasGenerics = true
}

case object `java.Set<Location>?`
    extends JavaLocation with `box.NullableSetOfOne` {

  val javaClass = "java.util.Set<java.awt.geom.Point2D>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("java.awt.geom.Point2D"))
  val javaDescription = "NullableSetOfOneLocations"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Float()")
    )
  , SetOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Double(-1.000000000000001, 1.000000000000001)")
    )
  , SetOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Float()")
    , SingleJavaValue("new java.awt.Point(Integer.MIN_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Point(-1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(Float.MIN_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(-1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Point2D.Double(Double.MIN_VALUE, Double.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Point2D.Double(-1.000000000000001, 1.000000000000001)")
    )
  )

  val hasGenerics = true
}

case object `java.Set<Location?>`
    extends JavaLocation with `box.OneSetOfNullable` {

  val javaClass = "java.util.Set<java.awt.geom.Point2D>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("java.awt.geom.Point2D"))
  val javaDescription = "OneSetOfNullableLocations"

  def defaultValue = SingleJavaValue("new java.util.HashSet<java.awt.geom.Point2D>(0)")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("null")
    )
  , SetOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Float()")
    )
  , SetOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Double(-1.000000000000001, 1.000000000000001)")
    )
  , SetOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Float()")
    , SingleJavaValue("new java.awt.Point(Integer.MIN_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Point(-1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(Float.MIN_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(-1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Point2D.Double(Double.MIN_VALUE, Double.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Point2D.Double(-1.000000000000001, 1.000000000000001)")
    )
  , SetOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("null")
    , SingleJavaValue("new java.awt.geom.Point2D.Float()")
    , SingleJavaValue("new java.awt.Point(Integer.MIN_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Point(-1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(Float.MIN_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(-1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Point2D.Double(Double.MIN_VALUE, Double.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Point2D.Double(-1.000000000000001, 1.000000000000001)")
    )
  )

  val hasGenerics = true
}

case object `java.Set<Location?>?`
    extends JavaLocation with `box.NullableSetOfNullable` {

  val javaClass = "java.util.Set<java.awt.geom.Point2D>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("java.awt.geom.Point2D"))
  val javaDescription = "NullableSetOfNullableLocations"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("null")
    )
  , SetOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Float()")
    )
  , SetOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Double(-1.000000000000001, 1.000000000000001)")
    )
  , SetOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Float()")
    , SingleJavaValue("new java.awt.Point(Integer.MIN_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Point(-1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(Float.MIN_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(-1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Point2D.Double(Double.MIN_VALUE, Double.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Point2D.Double(-1.000000000000001, 1.000000000000001)")
    )
  , SetOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("null")
    , SingleJavaValue("new java.awt.geom.Point2D.Float()")
    , SingleJavaValue("new java.awt.Point(Integer.MIN_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Point(-1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(Float.MIN_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(-1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Point2D.Double(Double.MIN_VALUE, Double.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Point2D.Double(-1.000000000000001, 1.000000000000001)")
    )
  )

  val hasGenerics = true
}
