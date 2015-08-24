package com.dslplatform.ocd
package javas

import types._
import boxes._

sealed abstract class JavaLocation
    extends OcdJavaBoxType
    with `type.Location` {

  val isPrecise = true
  val isPrimitive = false
  val isEqualable = true
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
  , SingleJavaValue("new java.awt.geom.Point2D.Double(-2.000000000000345, 1.000000000000234)")
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
  , SingleJavaValue("new java.awt.geom.Point2D.Double(-2.000000000000345, 1.000000000000234)")
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
      SingleJavaValue("new java.awt.geom.Point2D.Double(-2.000000000000345, 1.000000000000234)")
    )
  , ArrayOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Float()")
    , SingleJavaValue("new java.awt.Point(Integer.MIN_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Point(-1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(Float.MIN_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(-1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Point2D.Double(-2.000000000000345, 1.000000000000234)")
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
      SingleJavaValue("new java.awt.geom.Point2D.Double(-2.000000000000345, 1.000000000000234)")
    )
  , ArrayOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Float()")
    , SingleJavaValue("new java.awt.Point(Integer.MIN_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Point(-1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(Float.MIN_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(-1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Point2D.Double(-2.000000000000345, 1.000000000000234)")
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
      SingleJavaValue("new java.awt.geom.Point2D.Double(-2.000000000000345, 1.000000000000234)")
    )
  , ArrayOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Float()")
    , SingleJavaValue("new java.awt.Point(Integer.MIN_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Point(-1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(Float.MIN_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(-1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Point2D.Double(-2.000000000000345, 1.000000000000234)")
    )
  , ArrayOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("null")
    , SingleJavaValue("new java.awt.geom.Point2D.Float()")
    , SingleJavaValue("new java.awt.Point(Integer.MIN_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Point(-1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(Float.MIN_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(-1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Point2D.Double(-2.000000000000345, 1.000000000000234)")
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
      SingleJavaValue("new java.awt.geom.Point2D.Double(-2.000000000000345, 1.000000000000234)")
    )
  , ArrayOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Float()")
    , SingleJavaValue("new java.awt.Point(Integer.MIN_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Point(-1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(Float.MIN_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(-1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Point2D.Double(-2.000000000000345, 1.000000000000234)")
    )
  , ArrayOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("null")
    , SingleJavaValue("new java.awt.geom.Point2D.Float()")
    , SingleJavaValue("new java.awt.Point(Integer.MIN_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Point(-1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(Float.MIN_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(-1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Point2D.Double(-2.000000000000345, 1.000000000000234)")
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
      SingleJavaValue("new java.awt.geom.Point2D.Double(-2.000000000000345, 1.000000000000234)")
    )
  , ListOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Float()")
    , SingleJavaValue("new java.awt.Point(Integer.MIN_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Point(-1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(Float.MIN_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(-1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Point2D.Double(-2.000000000000345, 1.000000000000234)")
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
      SingleJavaValue("new java.awt.geom.Point2D.Double(-2.000000000000345, 1.000000000000234)")
    )
  , ListOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Float()")
    , SingleJavaValue("new java.awt.Point(Integer.MIN_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Point(-1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(Float.MIN_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(-1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Point2D.Double(-2.000000000000345, 1.000000000000234)")
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
      SingleJavaValue("new java.awt.geom.Point2D.Double(-2.000000000000345, 1.000000000000234)")
    )
  , ListOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Float()")
    , SingleJavaValue("new java.awt.Point(Integer.MIN_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Point(-1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(Float.MIN_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(-1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Point2D.Double(-2.000000000000345, 1.000000000000234)")
    )
  , ListOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("null")
    , SingleJavaValue("new java.awt.geom.Point2D.Float()")
    , SingleJavaValue("new java.awt.Point(Integer.MIN_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Point(-1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(Float.MIN_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(-1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Point2D.Double(-2.000000000000345, 1.000000000000234)")
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
      SingleJavaValue("new java.awt.geom.Point2D.Double(-2.000000000000345, 1.000000000000234)")
    )
  , ListOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Float()")
    , SingleJavaValue("new java.awt.Point(Integer.MIN_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Point(-1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(Float.MIN_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(-1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Point2D.Double(-2.000000000000345, 1.000000000000234)")
    )
  , ListOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("null")
    , SingleJavaValue("new java.awt.geom.Point2D.Float()")
    , SingleJavaValue("new java.awt.Point(Integer.MIN_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Point(-1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(Float.MIN_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(-1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Point2D.Double(-2.000000000000345, 1.000000000000234)")
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
      SingleJavaValue("new java.awt.geom.Point2D.Double(-2.000000000000345, 1.000000000000234)")
    )
  , SetOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Float()")
    , SingleJavaValue("new java.awt.Point(Integer.MIN_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Point(-1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(Float.MIN_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(-1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Point2D.Double(-2.000000000000345, 1.000000000000234)")
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
      SingleJavaValue("new java.awt.geom.Point2D.Double(-2.000000000000345, 1.000000000000234)")
    )
  , SetOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Float()")
    , SingleJavaValue("new java.awt.Point(Integer.MIN_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Point(-1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(Float.MIN_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(-1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Point2D.Double(-2.000000000000345, 1.000000000000234)")
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
      SingleJavaValue("new java.awt.geom.Point2D.Double(-2.000000000000345, 1.000000000000234)")
    )
  , SetOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Float()")
    , SingleJavaValue("new java.awt.Point(Integer.MIN_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Point(-1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(Float.MIN_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(-1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Point2D.Double(-2.000000000000345, 1.000000000000234)")
    )
  , SetOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("null")
    , SingleJavaValue("new java.awt.geom.Point2D.Float()")
    , SingleJavaValue("new java.awt.Point(Integer.MIN_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Point(-1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(Float.MIN_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(-1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Point2D.Double(-2.000000000000345, 1.000000000000234)")
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
      SingleJavaValue("new java.awt.geom.Point2D.Double(-2.000000000000345, 1.000000000000234)")
    )
  , SetOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Float()")
    , SingleJavaValue("new java.awt.Point(Integer.MIN_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Point(-1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(Float.MIN_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(-1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Point2D.Double(-2.000000000000345, 1.000000000000234)")
    )
  , SetOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("null")
    , SingleJavaValue("new java.awt.geom.Point2D.Float()")
    , SingleJavaValue("new java.awt.Point(Integer.MIN_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Point(-1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(Float.MIN_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(-1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Point2D.Double(-2.000000000000345, 1.000000000000234)")
    )
  )

  val hasGenerics = true
}

case object `java.Queue<Location>`
    extends JavaLocation with `box.OneQueueOfOne` {

  val javaClass = "java.util.Queue<java.awt.geom.Point2D>"
  val javaType = JavaCollectionType("java.util.Queue", JavaClass("java.awt.geom.Point2D"))
  val javaDescription = "OneQueueOfOneLocations"

  def defaultValue = SingleJavaValue("new java.util.ArrayDeque<java.awt.geom.Point2D>(0)")

  def nonDefaultValues = IndexedSeq(
    QueueOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Float()")
    )
  , QueueOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Double(-2.000000000000345, 1.000000000000234)")
    )
  , QueueOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Float()")
    , SingleJavaValue("new java.awt.Point(Integer.MIN_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Point(-1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(Float.MIN_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(-1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Point2D.Double(-2.000000000000345, 1.000000000000234)")
    )
  )

  val hasGenerics = true
}

case object `java.Queue<Location>?`
    extends JavaLocation with `box.NullableQueueOfOne` {

  val javaClass = "java.util.Queue<java.awt.geom.Point2D>"
  val javaType = JavaCollectionType("java.util.Queue", JavaClass("java.awt.geom.Point2D"))
  val javaDescription = "NullableQueueOfOneLocations"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    QueueOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Float()")
    )
  , QueueOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Double(-2.000000000000345, 1.000000000000234)")
    )
  , QueueOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Float()")
    , SingleJavaValue("new java.awt.Point(Integer.MIN_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Point(-1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(Float.MIN_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(-1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Point2D.Double(-2.000000000000345, 1.000000000000234)")
    )
  )

  val hasGenerics = true
}

case object `java.Queue<Location?>`
    extends JavaLocation with `box.OneQueueOfNullable` {

  val javaClass = "java.util.Queue<java.awt.geom.Point2D>"
  val javaType = JavaCollectionType("java.util.Queue", JavaClass("java.awt.geom.Point2D"))
  val javaDescription = "OneQueueOfNullableLocations"

  def defaultValue = SingleJavaValue("new java.util.ArrayDeque<java.awt.geom.Point2D>(0)")

  def nonDefaultValues = IndexedSeq(
    QueueOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("null")
    )
  , QueueOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Float()")
    )
  , QueueOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Double(-2.000000000000345, 1.000000000000234)")
    )
  , QueueOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Float()")
    , SingleJavaValue("new java.awt.Point(Integer.MIN_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Point(-1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(Float.MIN_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(-1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Point2D.Double(-2.000000000000345, 1.000000000000234)")
    )
  , QueueOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("null")
    , SingleJavaValue("new java.awt.geom.Point2D.Float()")
    , SingleJavaValue("new java.awt.Point(Integer.MIN_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Point(-1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(Float.MIN_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(-1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Point2D.Double(-2.000000000000345, 1.000000000000234)")
    )
  )

  val hasGenerics = true
}

case object `java.Queue<Location?>?`
    extends JavaLocation with `box.NullableQueueOfNullable` {

  val javaClass = "java.util.Queue<java.awt.geom.Point2D>"
  val javaType = JavaCollectionType("java.util.Queue", JavaClass("java.awt.geom.Point2D"))
  val javaDescription = "NullableQueueOfNullableLocations"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    QueueOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("null")
    )
  , QueueOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Float()")
    )
  , QueueOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Double(-2.000000000000345, 1.000000000000234)")
    )
  , QueueOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Float()")
    , SingleJavaValue("new java.awt.Point(Integer.MIN_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Point(-1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(Float.MIN_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(-1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Point2D.Double(-2.000000000000345, 1.000000000000234)")
    )
  , QueueOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("null")
    , SingleJavaValue("new java.awt.geom.Point2D.Float()")
    , SingleJavaValue("new java.awt.Point(Integer.MIN_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Point(-1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(Float.MIN_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(-1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Point2D.Double(-2.000000000000345, 1.000000000000234)")
    )
  )

  val hasGenerics = true
}

case object `java.LinkedList<Location>`
    extends JavaLocation with `box.OneLinkedListOfOne` {

  val javaClass = "java.util.LinkedList<java.awt.geom.Point2D>"
  val javaType = JavaCollectionType("java.util.LinkedList", JavaClass("java.awt.geom.Point2D"))
  val javaDescription = "OneLinkedListOfOneLocations"

  def defaultValue = SingleJavaValue("new java.util.LinkedList<java.awt.geom.Point2D>()")

  def nonDefaultValues = IndexedSeq(
    LinkedListOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Float()")
    )
  , LinkedListOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Double(-2.000000000000345, 1.000000000000234)")
    )
  , LinkedListOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Float()")
    , SingleJavaValue("new java.awt.Point(Integer.MIN_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Point(-1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(Float.MIN_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(-1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Point2D.Double(-2.000000000000345, 1.000000000000234)")
    )
  )

  val hasGenerics = true
}

case object `java.LinkedList<Location>?`
    extends JavaLocation with `box.NullableLinkedListOfOne` {

  val javaClass = "java.util.LinkedList<java.awt.geom.Point2D>"
  val javaType = JavaCollectionType("java.util.LinkedList", JavaClass("java.awt.geom.Point2D"))
  val javaDescription = "NullableLinkedListOfOneLocations"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    LinkedListOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Float()")
    )
  , LinkedListOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Double(-2.000000000000345, 1.000000000000234)")
    )
  , LinkedListOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Float()")
    , SingleJavaValue("new java.awt.Point(Integer.MIN_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Point(-1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(Float.MIN_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(-1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Point2D.Double(-2.000000000000345, 1.000000000000234)")
    )
  )

  val hasGenerics = true
}

case object `java.LinkedList<Location?>`
    extends JavaLocation with `box.OneLinkedListOfNullable` {

  val javaClass = "java.util.LinkedList<java.awt.geom.Point2D>"
  val javaType = JavaCollectionType("java.util.LinkedList", JavaClass("java.awt.geom.Point2D"))
  val javaDescription = "OneLinkedListOfNullableLocations"

  def defaultValue = SingleJavaValue("new java.util.LinkedList<java.awt.geom.Point2D>()")

  def nonDefaultValues = IndexedSeq(
    LinkedListOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("null")
    )
  , LinkedListOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Float()")
    )
  , LinkedListOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Double(-2.000000000000345, 1.000000000000234)")
    )
  , LinkedListOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Float()")
    , SingleJavaValue("new java.awt.Point(Integer.MIN_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Point(-1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(Float.MIN_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(-1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Point2D.Double(-2.000000000000345, 1.000000000000234)")
    )
  , LinkedListOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("null")
    , SingleJavaValue("new java.awt.geom.Point2D.Float()")
    , SingleJavaValue("new java.awt.Point(Integer.MIN_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Point(-1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(Float.MIN_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(-1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Point2D.Double(-2.000000000000345, 1.000000000000234)")
    )
  )

  val hasGenerics = true
}

case object `java.LinkedList<Location?>?`
    extends JavaLocation with `box.NullableLinkedListOfNullable` {

  val javaClass = "java.util.LinkedList<java.awt.geom.Point2D>"
  val javaType = JavaCollectionType("java.util.LinkedList", JavaClass("java.awt.geom.Point2D"))
  val javaDescription = "NullableLinkedListOfNullableLocations"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    LinkedListOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("null")
    )
  , LinkedListOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Float()")
    )
  , LinkedListOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Double(-2.000000000000345, 1.000000000000234)")
    )
  , LinkedListOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Float()")
    , SingleJavaValue("new java.awt.Point(Integer.MIN_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Point(-1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(Float.MIN_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(-1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Point2D.Double(-2.000000000000345, 1.000000000000234)")
    )
  , LinkedListOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("null")
    , SingleJavaValue("new java.awt.geom.Point2D.Float()")
    , SingleJavaValue("new java.awt.Point(Integer.MIN_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Point(-1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(Float.MIN_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(-1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Point2D.Double(-2.000000000000345, 1.000000000000234)")
    )
  )

  val hasGenerics = true
}

case object `java.Stack<Location>`
    extends JavaLocation with `box.OneStackOfOne` {

  val javaClass = "java.util.Stack<java.awt.geom.Point2D>"
  val javaType = JavaCollectionType("java.util.Stack", JavaClass("java.awt.geom.Point2D"))
  val javaDescription = "OneStackOfOneLocations"

  def defaultValue = SingleJavaValue("new java.util.Stack<java.awt.geom.Point2D>()")

  def nonDefaultValues = IndexedSeq(
    StackOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Float()")
    )
  , StackOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Double(-2.000000000000345, 1.000000000000234)")
    )
  , StackOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Float()")
    , SingleJavaValue("new java.awt.Point(Integer.MIN_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Point(-1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(Float.MIN_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(-1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Point2D.Double(-2.000000000000345, 1.000000000000234)")
    )
  )

  val hasGenerics = true
}

case object `java.Stack<Location>?`
    extends JavaLocation with `box.NullableStackOfOne` {

  val javaClass = "java.util.Stack<java.awt.geom.Point2D>"
  val javaType = JavaCollectionType("java.util.Stack", JavaClass("java.awt.geom.Point2D"))
  val javaDescription = "NullableStackOfOneLocations"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    StackOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Float()")
    )
  , StackOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Double(-2.000000000000345, 1.000000000000234)")
    )
  , StackOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Float()")
    , SingleJavaValue("new java.awt.Point(Integer.MIN_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Point(-1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(Float.MIN_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(-1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Point2D.Double(-2.000000000000345, 1.000000000000234)")
    )
  )

  val hasGenerics = true
}

case object `java.Stack<Location?>`
    extends JavaLocation with `box.OneStackOfNullable` {

  val javaClass = "java.util.Stack<java.awt.geom.Point2D>"
  val javaType = JavaCollectionType("java.util.Stack", JavaClass("java.awt.geom.Point2D"))
  val javaDescription = "OneStackOfNullableLocations"

  def defaultValue = SingleJavaValue("new java.util.Stack<java.awt.geom.Point2D>()")

  def nonDefaultValues = IndexedSeq(
    StackOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("null")
    )
  , StackOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Float()")
    )
  , StackOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Double(-2.000000000000345, 1.000000000000234)")
    )
  , StackOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Float()")
    , SingleJavaValue("new java.awt.Point(Integer.MIN_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Point(-1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(Float.MIN_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(-1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Point2D.Double(-2.000000000000345, 1.000000000000234)")
    )
  , StackOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("null")
    , SingleJavaValue("new java.awt.geom.Point2D.Float()")
    , SingleJavaValue("new java.awt.Point(Integer.MIN_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Point(-1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(Float.MIN_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(-1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Point2D.Double(-2.000000000000345, 1.000000000000234)")
    )
  )

  val hasGenerics = true
}

case object `java.Stack<Location?>?`
    extends JavaLocation with `box.NullableStackOfNullable` {

  val javaClass = "java.util.Stack<java.awt.geom.Point2D>"
  val javaType = JavaCollectionType("java.util.Stack", JavaClass("java.awt.geom.Point2D"))
  val javaDescription = "NullableStackOfNullableLocations"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    StackOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("null")
    )
  , StackOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Float()")
    )
  , StackOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Double(-2.000000000000345, 1.000000000000234)")
    )
  , StackOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Float()")
    , SingleJavaValue("new java.awt.Point(Integer.MIN_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Point(-1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(Float.MIN_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(-1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Point2D.Double(-2.000000000000345, 1.000000000000234)")
    )
  , StackOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("null")
    , SingleJavaValue("new java.awt.geom.Point2D.Float()")
    , SingleJavaValue("new java.awt.Point(Integer.MIN_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Point(-1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(Float.MIN_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(-1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Point2D.Double(-2.000000000000345, 1.000000000000234)")
    )
  )

  val hasGenerics = true
}

case object `java.Vector<Location>`
    extends JavaLocation with `box.OneVectorOfOne` {

  val javaClass = "java.util.Vector<java.awt.geom.Point2D>"
  val javaType = JavaCollectionType("java.util.Vector", JavaClass("java.awt.geom.Point2D"))
  val javaDescription = "OneVectorOfOneLocations"

  def defaultValue = SingleJavaValue("new java.util.Vector<java.awt.geom.Point2D>(0)")

  def nonDefaultValues = IndexedSeq(
    VectorOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Float()")
    )
  , VectorOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Double(-2.000000000000345, 1.000000000000234)")
    )
  , VectorOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Float()")
    , SingleJavaValue("new java.awt.Point(Integer.MIN_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Point(-1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(Float.MIN_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(-1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Point2D.Double(-2.000000000000345, 1.000000000000234)")
    )
  )

  val hasGenerics = true
}

case object `java.Vector<Location>?`
    extends JavaLocation with `box.NullableVectorOfOne` {

  val javaClass = "java.util.Vector<java.awt.geom.Point2D>"
  val javaType = JavaCollectionType("java.util.Vector", JavaClass("java.awt.geom.Point2D"))
  val javaDescription = "NullableVectorOfOneLocations"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    VectorOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Float()")
    )
  , VectorOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Double(-2.000000000000345, 1.000000000000234)")
    )
  , VectorOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Float()")
    , SingleJavaValue("new java.awt.Point(Integer.MIN_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Point(-1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(Float.MIN_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(-1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Point2D.Double(-2.000000000000345, 1.000000000000234)")
    )
  )

  val hasGenerics = true
}

case object `java.Vector<Location?>`
    extends JavaLocation with `box.OneVectorOfNullable` {

  val javaClass = "java.util.Vector<java.awt.geom.Point2D>"
  val javaType = JavaCollectionType("java.util.Vector", JavaClass("java.awt.geom.Point2D"))
  val javaDescription = "OneVectorOfNullableLocations"

  def defaultValue = SingleJavaValue("new java.util.Vector<java.awt.geom.Point2D>(0)")

  def nonDefaultValues = IndexedSeq(
    VectorOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("null")
    )
  , VectorOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Float()")
    )
  , VectorOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Double(-2.000000000000345, 1.000000000000234)")
    )
  , VectorOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Float()")
    , SingleJavaValue("new java.awt.Point(Integer.MIN_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Point(-1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(Float.MIN_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(-1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Point2D.Double(-2.000000000000345, 1.000000000000234)")
    )
  , VectorOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("null")
    , SingleJavaValue("new java.awt.geom.Point2D.Float()")
    , SingleJavaValue("new java.awt.Point(Integer.MIN_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Point(-1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(Float.MIN_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(-1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Point2D.Double(-2.000000000000345, 1.000000000000234)")
    )
  )

  val hasGenerics = true
}

case object `java.Vector<Location?>?`
    extends JavaLocation with `box.NullableVectorOfNullable` {

  val javaClass = "java.util.Vector<java.awt.geom.Point2D>"
  val javaType = JavaCollectionType("java.util.Vector", JavaClass("java.awt.geom.Point2D"))
  val javaDescription = "NullableVectorOfNullableLocations"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    VectorOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("null")
    )
  , VectorOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Float()")
    )
  , VectorOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Double(-2.000000000000345, 1.000000000000234)")
    )
  , VectorOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("new java.awt.geom.Point2D.Float()")
    , SingleJavaValue("new java.awt.Point(Integer.MIN_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Point(-1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(Float.MIN_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(-1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Point2D.Double(-2.000000000000345, 1.000000000000234)")
    )
  , VectorOfJavaValues("java.awt.geom.Point2D",
      SingleJavaValue("null")
    , SingleJavaValue("new java.awt.geom.Point2D.Float()")
    , SingleJavaValue("new java.awt.Point(Integer.MIN_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Point(-1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(Float.MIN_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Point2D.Float(-1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Point2D.Double(-2.000000000000345, 1.000000000000234)")
    )
  )

  val hasGenerics = true
}
