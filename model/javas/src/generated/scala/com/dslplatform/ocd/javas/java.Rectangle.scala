package com.dslplatform.ocd
package javas

import types._
import boxes._

sealed abstract class JavaRectangle
    extends OcdJavaBoxType
    with `type.Rectangle` {

  val isPrecise = true
  val isPrimitive = false
  val isEqualable = true
}

case object `java.Rectangle`
    extends JavaRectangle with `box.One` {

  val javaClass = "java.awt.geom.Rectangle2D"
  val javaType = JavaSimpleType("java.awt.geom.Rectangle2D")
  val javaDescription = "OneRectangle"

  def defaultValue = SingleJavaValue("new java.awt.geom.Rectangle2D.Float()")

  def nonDefaultValues = IndexedSeq(
    SingleJavaValue("new java.awt.Rectangle(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE)")
  , SingleJavaValue("new java.awt.Rectangle(-1000000000, -1000000000, 1000000000, 1000000000)")
  , SingleJavaValue("new java.awt.geom.Rectangle2D.Float(Float.MIN_VALUE, Float.MIN_VALUE, Float.MAX_VALUE, Float.MAX_VALUE)")
  , SingleJavaValue("new java.awt.geom.Rectangle2D.Float(-1.0000001f, -1.0000001f, 1.0000001f, 1.0000001f)")
  , SingleJavaValue("new java.awt.geom.Rectangle2D.Double(-2.000000000000123, -2.000000000000234, 1.000000000000345, 1.000000000000456)")
  )

  val hasGenerics = false
}

case object `java.Rectangle?`
    extends JavaRectangle with `box.Nullable` {

  val javaClass = "java.awt.geom.Rectangle2D"
  val javaType = JavaSimpleType("java.awt.geom.Rectangle2D")
  val javaDescription = "NullableRectangle"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    SingleJavaValue("new java.awt.geom.Rectangle2D.Float()")
  , SingleJavaValue("new java.awt.Rectangle(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE)")
  , SingleJavaValue("new java.awt.Rectangle(-1000000000, -1000000000, 1000000000, 1000000000)")
  , SingleJavaValue("new java.awt.geom.Rectangle2D.Float(Float.MIN_VALUE, Float.MIN_VALUE, Float.MAX_VALUE, Float.MAX_VALUE)")
  , SingleJavaValue("new java.awt.geom.Rectangle2D.Float(-1.0000001f, -1.0000001f, 1.0000001f, 1.0000001f)")
  , SingleJavaValue("new java.awt.geom.Rectangle2D.Double(-2.000000000000123, -2.000000000000234, 1.000000000000345, 1.000000000000456)")
  )

  val hasGenerics = false
}

case object `java.Rectangle[]`
    extends JavaRectangle with `box.OneArrayOfOne` {

  val javaClass = "java.awt.geom.Rectangle2D[]"
  val javaType = JavaSimpleType("java.awt.geom.Rectangle2D[]")
  val javaDescription = "OneArrayOfOneRectangles"

  def defaultValue = SingleJavaValue("new java.awt.geom.Rectangle2D[0]")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("new java.awt.geom.Rectangle2D.Float()")
    )
  , ArrayOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("new java.awt.geom.Rectangle2D.Double(-2.000000000000123, -2.000000000000234, 1.000000000000345, 1.000000000000456)")
    )
  , ArrayOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("new java.awt.geom.Rectangle2D.Float()")
    , SingleJavaValue("new java.awt.Rectangle(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Rectangle(-1000000000, -1000000000, 1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float(Float.MIN_VALUE, Float.MIN_VALUE, Float.MAX_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float(-1.0000001f, -1.0000001f, 1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Double(-2.000000000000123, -2.000000000000234, 1.000000000000345, 1.000000000000456)")
    )
  )

  val hasGenerics = false
}

case object `java.Rectangle[]?`
    extends JavaRectangle with `box.NullableArrayOfOne` {

  val javaClass = "java.awt.geom.Rectangle2D[]"
  val javaType = JavaSimpleType("java.awt.geom.Rectangle2D[]")
  val javaDescription = "NullableArrayOfOneRectangles"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("new java.awt.geom.Rectangle2D.Float()")
    )
  , ArrayOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("new java.awt.geom.Rectangle2D.Double(-2.000000000000123, -2.000000000000234, 1.000000000000345, 1.000000000000456)")
    )
  , ArrayOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("new java.awt.geom.Rectangle2D.Float()")
    , SingleJavaValue("new java.awt.Rectangle(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Rectangle(-1000000000, -1000000000, 1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float(Float.MIN_VALUE, Float.MIN_VALUE, Float.MAX_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float(-1.0000001f, -1.0000001f, 1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Double(-2.000000000000123, -2.000000000000234, 1.000000000000345, 1.000000000000456)")
    )
  )

  val hasGenerics = false
}

case object `java.Rectangle?[]`
    extends JavaRectangle with `box.OneArrayOfNullable` {

  val javaClass = "java.awt.geom.Rectangle2D[]"
  val javaType = JavaSimpleType("java.awt.geom.Rectangle2D[]")
  val javaDescription = "OneArrayOfNullableRectangles"

  def defaultValue = SingleJavaValue("new java.awt.geom.Rectangle2D[0]")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("null")
    )
  , ArrayOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("new java.awt.geom.Rectangle2D.Float()")
    )
  , ArrayOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("new java.awt.geom.Rectangle2D.Double(-2.000000000000123, -2.000000000000234, 1.000000000000345, 1.000000000000456)")
    )
  , ArrayOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("new java.awt.geom.Rectangle2D.Float()")
    , SingleJavaValue("new java.awt.Rectangle(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Rectangle(-1000000000, -1000000000, 1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float(Float.MIN_VALUE, Float.MIN_VALUE, Float.MAX_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float(-1.0000001f, -1.0000001f, 1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Double(-2.000000000000123, -2.000000000000234, 1.000000000000345, 1.000000000000456)")
    )
  , ArrayOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("null")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float()")
    , SingleJavaValue("new java.awt.Rectangle(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Rectangle(-1000000000, -1000000000, 1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float(Float.MIN_VALUE, Float.MIN_VALUE, Float.MAX_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float(-1.0000001f, -1.0000001f, 1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Double(-2.000000000000123, -2.000000000000234, 1.000000000000345, 1.000000000000456)")
    )
  )

  val hasGenerics = false
}

case object `java.Rectangle?[]?`
    extends JavaRectangle with `box.NullableArrayOfNullable` {

  val javaClass = "java.awt.geom.Rectangle2D[]"
  val javaType = JavaSimpleType("java.awt.geom.Rectangle2D[]")
  val javaDescription = "NullableArrayOfNullableRectangles"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("null")
    )
  , ArrayOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("new java.awt.geom.Rectangle2D.Float()")
    )
  , ArrayOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("new java.awt.geom.Rectangle2D.Double(-2.000000000000123, -2.000000000000234, 1.000000000000345, 1.000000000000456)")
    )
  , ArrayOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("new java.awt.geom.Rectangle2D.Float()")
    , SingleJavaValue("new java.awt.Rectangle(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Rectangle(-1000000000, -1000000000, 1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float(Float.MIN_VALUE, Float.MIN_VALUE, Float.MAX_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float(-1.0000001f, -1.0000001f, 1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Double(-2.000000000000123, -2.000000000000234, 1.000000000000345, 1.000000000000456)")
    )
  , ArrayOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("null")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float()")
    , SingleJavaValue("new java.awt.Rectangle(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Rectangle(-1000000000, -1000000000, 1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float(Float.MIN_VALUE, Float.MIN_VALUE, Float.MAX_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float(-1.0000001f, -1.0000001f, 1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Double(-2.000000000000123, -2.000000000000234, 1.000000000000345, 1.000000000000456)")
    )
  )

  val hasGenerics = false
}

case object `java.List<Rectangle>`
    extends JavaRectangle with `box.OneListOfOne` {

  val javaClass = "java.util.List<java.awt.geom.Rectangle2D>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("java.awt.geom.Rectangle2D"))
  val javaDescription = "OneListOfOneRectangles"

  def defaultValue = SingleJavaValue("new java.util.ArrayList<java.awt.geom.Rectangle2D>(0)")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("new java.awt.geom.Rectangle2D.Float()")
    )
  , ListOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("new java.awt.geom.Rectangle2D.Double(-2.000000000000123, -2.000000000000234, 1.000000000000345, 1.000000000000456)")
    )
  , ListOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("new java.awt.geom.Rectangle2D.Float()")
    , SingleJavaValue("new java.awt.Rectangle(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Rectangle(-1000000000, -1000000000, 1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float(Float.MIN_VALUE, Float.MIN_VALUE, Float.MAX_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float(-1.0000001f, -1.0000001f, 1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Double(-2.000000000000123, -2.000000000000234, 1.000000000000345, 1.000000000000456)")
    )
  )

  val hasGenerics = true
}

case object `java.List<Rectangle>?`
    extends JavaRectangle with `box.NullableListOfOne` {

  val javaClass = "java.util.List<java.awt.geom.Rectangle2D>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("java.awt.geom.Rectangle2D"))
  val javaDescription = "NullableListOfOneRectangles"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("new java.awt.geom.Rectangle2D.Float()")
    )
  , ListOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("new java.awt.geom.Rectangle2D.Double(-2.000000000000123, -2.000000000000234, 1.000000000000345, 1.000000000000456)")
    )
  , ListOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("new java.awt.geom.Rectangle2D.Float()")
    , SingleJavaValue("new java.awt.Rectangle(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Rectangle(-1000000000, -1000000000, 1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float(Float.MIN_VALUE, Float.MIN_VALUE, Float.MAX_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float(-1.0000001f, -1.0000001f, 1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Double(-2.000000000000123, -2.000000000000234, 1.000000000000345, 1.000000000000456)")
    )
  )

  val hasGenerics = true
}

case object `java.List<Rectangle?>`
    extends JavaRectangle with `box.OneListOfNullable` {

  val javaClass = "java.util.List<java.awt.geom.Rectangle2D>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("java.awt.geom.Rectangle2D"))
  val javaDescription = "OneListOfNullableRectangles"

  def defaultValue = SingleJavaValue("new java.util.ArrayList<java.awt.geom.Rectangle2D>(0)")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("null")
    )
  , ListOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("new java.awt.geom.Rectangle2D.Float()")
    )
  , ListOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("new java.awt.geom.Rectangle2D.Double(-2.000000000000123, -2.000000000000234, 1.000000000000345, 1.000000000000456)")
    )
  , ListOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("new java.awt.geom.Rectangle2D.Float()")
    , SingleJavaValue("new java.awt.Rectangle(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Rectangle(-1000000000, -1000000000, 1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float(Float.MIN_VALUE, Float.MIN_VALUE, Float.MAX_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float(-1.0000001f, -1.0000001f, 1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Double(-2.000000000000123, -2.000000000000234, 1.000000000000345, 1.000000000000456)")
    )
  , ListOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("null")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float()")
    , SingleJavaValue("new java.awt.Rectangle(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Rectangle(-1000000000, -1000000000, 1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float(Float.MIN_VALUE, Float.MIN_VALUE, Float.MAX_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float(-1.0000001f, -1.0000001f, 1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Double(-2.000000000000123, -2.000000000000234, 1.000000000000345, 1.000000000000456)")
    )
  )

  val hasGenerics = true
}

case object `java.List<Rectangle?>?`
    extends JavaRectangle with `box.NullableListOfNullable` {

  val javaClass = "java.util.List<java.awt.geom.Rectangle2D>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("java.awt.geom.Rectangle2D"))
  val javaDescription = "NullableListOfNullableRectangles"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("null")
    )
  , ListOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("new java.awt.geom.Rectangle2D.Float()")
    )
  , ListOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("new java.awt.geom.Rectangle2D.Double(-2.000000000000123, -2.000000000000234, 1.000000000000345, 1.000000000000456)")
    )
  , ListOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("new java.awt.geom.Rectangle2D.Float()")
    , SingleJavaValue("new java.awt.Rectangle(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Rectangle(-1000000000, -1000000000, 1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float(Float.MIN_VALUE, Float.MIN_VALUE, Float.MAX_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float(-1.0000001f, -1.0000001f, 1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Double(-2.000000000000123, -2.000000000000234, 1.000000000000345, 1.000000000000456)")
    )
  , ListOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("null")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float()")
    , SingleJavaValue("new java.awt.Rectangle(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Rectangle(-1000000000, -1000000000, 1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float(Float.MIN_VALUE, Float.MIN_VALUE, Float.MAX_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float(-1.0000001f, -1.0000001f, 1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Double(-2.000000000000123, -2.000000000000234, 1.000000000000345, 1.000000000000456)")
    )
  )

  val hasGenerics = true
}

case object `java.Set<Rectangle>`
    extends JavaRectangle with `box.OneSetOfOne` {

  val javaClass = "java.util.Set<java.awt.geom.Rectangle2D>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("java.awt.geom.Rectangle2D"))
  val javaDescription = "OneSetOfOneRectangles"

  def defaultValue = SingleJavaValue("new java.util.HashSet<java.awt.geom.Rectangle2D>(0)")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("new java.awt.geom.Rectangle2D.Float()")
    )
  , SetOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("new java.awt.geom.Rectangle2D.Double(-2.000000000000123, -2.000000000000234, 1.000000000000345, 1.000000000000456)")
    )
  , SetOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("new java.awt.geom.Rectangle2D.Float()")
    , SingleJavaValue("new java.awt.Rectangle(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Rectangle(-1000000000, -1000000000, 1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float(Float.MIN_VALUE, Float.MIN_VALUE, Float.MAX_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float(-1.0000001f, -1.0000001f, 1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Double(-2.000000000000123, -2.000000000000234, 1.000000000000345, 1.000000000000456)")
    )
  )

  val hasGenerics = true
}

case object `java.Set<Rectangle>?`
    extends JavaRectangle with `box.NullableSetOfOne` {

  val javaClass = "java.util.Set<java.awt.geom.Rectangle2D>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("java.awt.geom.Rectangle2D"))
  val javaDescription = "NullableSetOfOneRectangles"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("new java.awt.geom.Rectangle2D.Float()")
    )
  , SetOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("new java.awt.geom.Rectangle2D.Double(-2.000000000000123, -2.000000000000234, 1.000000000000345, 1.000000000000456)")
    )
  , SetOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("new java.awt.geom.Rectangle2D.Float()")
    , SingleJavaValue("new java.awt.Rectangle(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Rectangle(-1000000000, -1000000000, 1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float(Float.MIN_VALUE, Float.MIN_VALUE, Float.MAX_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float(-1.0000001f, -1.0000001f, 1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Double(-2.000000000000123, -2.000000000000234, 1.000000000000345, 1.000000000000456)")
    )
  )

  val hasGenerics = true
}

case object `java.Set<Rectangle?>`
    extends JavaRectangle with `box.OneSetOfNullable` {

  val javaClass = "java.util.Set<java.awt.geom.Rectangle2D>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("java.awt.geom.Rectangle2D"))
  val javaDescription = "OneSetOfNullableRectangles"

  def defaultValue = SingleJavaValue("new java.util.HashSet<java.awt.geom.Rectangle2D>(0)")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("null")
    )
  , SetOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("new java.awt.geom.Rectangle2D.Float()")
    )
  , SetOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("new java.awt.geom.Rectangle2D.Double(-2.000000000000123, -2.000000000000234, 1.000000000000345, 1.000000000000456)")
    )
  , SetOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("new java.awt.geom.Rectangle2D.Float()")
    , SingleJavaValue("new java.awt.Rectangle(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Rectangle(-1000000000, -1000000000, 1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float(Float.MIN_VALUE, Float.MIN_VALUE, Float.MAX_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float(-1.0000001f, -1.0000001f, 1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Double(-2.000000000000123, -2.000000000000234, 1.000000000000345, 1.000000000000456)")
    )
  , SetOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("null")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float()")
    , SingleJavaValue("new java.awt.Rectangle(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Rectangle(-1000000000, -1000000000, 1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float(Float.MIN_VALUE, Float.MIN_VALUE, Float.MAX_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float(-1.0000001f, -1.0000001f, 1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Double(-2.000000000000123, -2.000000000000234, 1.000000000000345, 1.000000000000456)")
    )
  )

  val hasGenerics = true
}

case object `java.Set<Rectangle?>?`
    extends JavaRectangle with `box.NullableSetOfNullable` {

  val javaClass = "java.util.Set<java.awt.geom.Rectangle2D>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("java.awt.geom.Rectangle2D"))
  val javaDescription = "NullableSetOfNullableRectangles"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("null")
    )
  , SetOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("new java.awt.geom.Rectangle2D.Float()")
    )
  , SetOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("new java.awt.geom.Rectangle2D.Double(-2.000000000000123, -2.000000000000234, 1.000000000000345, 1.000000000000456)")
    )
  , SetOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("new java.awt.geom.Rectangle2D.Float()")
    , SingleJavaValue("new java.awt.Rectangle(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Rectangle(-1000000000, -1000000000, 1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float(Float.MIN_VALUE, Float.MIN_VALUE, Float.MAX_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float(-1.0000001f, -1.0000001f, 1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Double(-2.000000000000123, -2.000000000000234, 1.000000000000345, 1.000000000000456)")
    )
  , SetOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("null")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float()")
    , SingleJavaValue("new java.awt.Rectangle(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Rectangle(-1000000000, -1000000000, 1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float(Float.MIN_VALUE, Float.MIN_VALUE, Float.MAX_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float(-1.0000001f, -1.0000001f, 1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Double(-2.000000000000123, -2.000000000000234, 1.000000000000345, 1.000000000000456)")
    )
  )

  val hasGenerics = true
}

case object `java.Queue<Rectangle>`
    extends JavaRectangle with `box.OneQueueOfOne` {

  val javaClass = "java.util.Queue<java.awt.geom.Rectangle2D>"
  val javaType = JavaCollectionType("java.util.Queue", JavaClass("java.awt.geom.Rectangle2D"))
  val javaDescription = "OneQueueOfOneRectangles"

  def defaultValue = SingleJavaValue("new java.util.ArrayDeque<java.awt.geom.Rectangle2D>(0)")

  def nonDefaultValues = IndexedSeq(
    QueueOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("new java.awt.geom.Rectangle2D.Float()")
    )
  , QueueOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("new java.awt.geom.Rectangle2D.Double(-2.000000000000123, -2.000000000000234, 1.000000000000345, 1.000000000000456)")
    )
  , QueueOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("new java.awt.geom.Rectangle2D.Float()")
    , SingleJavaValue("new java.awt.Rectangle(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Rectangle(-1000000000, -1000000000, 1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float(Float.MIN_VALUE, Float.MIN_VALUE, Float.MAX_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float(-1.0000001f, -1.0000001f, 1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Double(-2.000000000000123, -2.000000000000234, 1.000000000000345, 1.000000000000456)")
    )
  )

  val hasGenerics = true
}

case object `java.Queue<Rectangle>?`
    extends JavaRectangle with `box.NullableQueueOfOne` {

  val javaClass = "java.util.Queue<java.awt.geom.Rectangle2D>"
  val javaType = JavaCollectionType("java.util.Queue", JavaClass("java.awt.geom.Rectangle2D"))
  val javaDescription = "NullableQueueOfOneRectangles"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    QueueOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("new java.awt.geom.Rectangle2D.Float()")
    )
  , QueueOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("new java.awt.geom.Rectangle2D.Double(-2.000000000000123, -2.000000000000234, 1.000000000000345, 1.000000000000456)")
    )
  , QueueOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("new java.awt.geom.Rectangle2D.Float()")
    , SingleJavaValue("new java.awt.Rectangle(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Rectangle(-1000000000, -1000000000, 1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float(Float.MIN_VALUE, Float.MIN_VALUE, Float.MAX_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float(-1.0000001f, -1.0000001f, 1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Double(-2.000000000000123, -2.000000000000234, 1.000000000000345, 1.000000000000456)")
    )
  )

  val hasGenerics = true
}

case object `java.Queue<Rectangle?>`
    extends JavaRectangle with `box.OneQueueOfNullable` {

  val javaClass = "java.util.Queue<java.awt.geom.Rectangle2D>"
  val javaType = JavaCollectionType("java.util.Queue", JavaClass("java.awt.geom.Rectangle2D"))
  val javaDescription = "OneQueueOfNullableRectangles"

  def defaultValue = SingleJavaValue("new java.util.ArrayDeque<java.awt.geom.Rectangle2D>(0)")

  def nonDefaultValues = IndexedSeq(
    QueueOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("null")
    )
  , QueueOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("new java.awt.geom.Rectangle2D.Float()")
    )
  , QueueOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("new java.awt.geom.Rectangle2D.Double(-2.000000000000123, -2.000000000000234, 1.000000000000345, 1.000000000000456)")
    )
  , QueueOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("new java.awt.geom.Rectangle2D.Float()")
    , SingleJavaValue("new java.awt.Rectangle(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Rectangle(-1000000000, -1000000000, 1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float(Float.MIN_VALUE, Float.MIN_VALUE, Float.MAX_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float(-1.0000001f, -1.0000001f, 1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Double(-2.000000000000123, -2.000000000000234, 1.000000000000345, 1.000000000000456)")
    )
  , QueueOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("null")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float()")
    , SingleJavaValue("new java.awt.Rectangle(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Rectangle(-1000000000, -1000000000, 1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float(Float.MIN_VALUE, Float.MIN_VALUE, Float.MAX_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float(-1.0000001f, -1.0000001f, 1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Double(-2.000000000000123, -2.000000000000234, 1.000000000000345, 1.000000000000456)")
    )
  )

  val hasGenerics = true
}

case object `java.Queue<Rectangle?>?`
    extends JavaRectangle with `box.NullableQueueOfNullable` {

  val javaClass = "java.util.Queue<java.awt.geom.Rectangle2D>"
  val javaType = JavaCollectionType("java.util.Queue", JavaClass("java.awt.geom.Rectangle2D"))
  val javaDescription = "NullableQueueOfNullableRectangles"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    QueueOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("null")
    )
  , QueueOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("new java.awt.geom.Rectangle2D.Float()")
    )
  , QueueOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("new java.awt.geom.Rectangle2D.Double(-2.000000000000123, -2.000000000000234, 1.000000000000345, 1.000000000000456)")
    )
  , QueueOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("new java.awt.geom.Rectangle2D.Float()")
    , SingleJavaValue("new java.awt.Rectangle(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Rectangle(-1000000000, -1000000000, 1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float(Float.MIN_VALUE, Float.MIN_VALUE, Float.MAX_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float(-1.0000001f, -1.0000001f, 1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Double(-2.000000000000123, -2.000000000000234, 1.000000000000345, 1.000000000000456)")
    )
  , QueueOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("null")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float()")
    , SingleJavaValue("new java.awt.Rectangle(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Rectangle(-1000000000, -1000000000, 1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float(Float.MIN_VALUE, Float.MIN_VALUE, Float.MAX_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float(-1.0000001f, -1.0000001f, 1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Double(-2.000000000000123, -2.000000000000234, 1.000000000000345, 1.000000000000456)")
    )
  )

  val hasGenerics = true
}

case object `java.LinkedList<Rectangle>`
    extends JavaRectangle with `box.OneLinkedListOfOne` {

  val javaClass = "java.util.LinkedList<java.awt.geom.Rectangle2D>"
  val javaType = JavaCollectionType("java.util.LinkedList", JavaClass("java.awt.geom.Rectangle2D"))
  val javaDescription = "OneLinkedListOfOneRectangles"

  def defaultValue = SingleJavaValue("new java.util.LinkedList<java.awt.geom.Rectangle2D>()")

  def nonDefaultValues = IndexedSeq(
    LinkedListOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("new java.awt.geom.Rectangle2D.Float()")
    )
  , LinkedListOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("new java.awt.geom.Rectangle2D.Double(-2.000000000000123, -2.000000000000234, 1.000000000000345, 1.000000000000456)")
    )
  , LinkedListOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("new java.awt.geom.Rectangle2D.Float()")
    , SingleJavaValue("new java.awt.Rectangle(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Rectangle(-1000000000, -1000000000, 1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float(Float.MIN_VALUE, Float.MIN_VALUE, Float.MAX_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float(-1.0000001f, -1.0000001f, 1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Double(-2.000000000000123, -2.000000000000234, 1.000000000000345, 1.000000000000456)")
    )
  )

  val hasGenerics = true
}

case object `java.LinkedList<Rectangle>?`
    extends JavaRectangle with `box.NullableLinkedListOfOne` {

  val javaClass = "java.util.LinkedList<java.awt.geom.Rectangle2D>"
  val javaType = JavaCollectionType("java.util.LinkedList", JavaClass("java.awt.geom.Rectangle2D"))
  val javaDescription = "NullableLinkedListOfOneRectangles"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    LinkedListOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("new java.awt.geom.Rectangle2D.Float()")
    )
  , LinkedListOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("new java.awt.geom.Rectangle2D.Double(-2.000000000000123, -2.000000000000234, 1.000000000000345, 1.000000000000456)")
    )
  , LinkedListOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("new java.awt.geom.Rectangle2D.Float()")
    , SingleJavaValue("new java.awt.Rectangle(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Rectangle(-1000000000, -1000000000, 1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float(Float.MIN_VALUE, Float.MIN_VALUE, Float.MAX_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float(-1.0000001f, -1.0000001f, 1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Double(-2.000000000000123, -2.000000000000234, 1.000000000000345, 1.000000000000456)")
    )
  )

  val hasGenerics = true
}

case object `java.LinkedList<Rectangle?>`
    extends JavaRectangle with `box.OneLinkedListOfNullable` {

  val javaClass = "java.util.LinkedList<java.awt.geom.Rectangle2D>"
  val javaType = JavaCollectionType("java.util.LinkedList", JavaClass("java.awt.geom.Rectangle2D"))
  val javaDescription = "OneLinkedListOfNullableRectangles"

  def defaultValue = SingleJavaValue("new java.util.LinkedList<java.awt.geom.Rectangle2D>()")

  def nonDefaultValues = IndexedSeq(
    LinkedListOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("null")
    )
  , LinkedListOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("new java.awt.geom.Rectangle2D.Float()")
    )
  , LinkedListOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("new java.awt.geom.Rectangle2D.Double(-2.000000000000123, -2.000000000000234, 1.000000000000345, 1.000000000000456)")
    )
  , LinkedListOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("new java.awt.geom.Rectangle2D.Float()")
    , SingleJavaValue("new java.awt.Rectangle(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Rectangle(-1000000000, -1000000000, 1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float(Float.MIN_VALUE, Float.MIN_VALUE, Float.MAX_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float(-1.0000001f, -1.0000001f, 1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Double(-2.000000000000123, -2.000000000000234, 1.000000000000345, 1.000000000000456)")
    )
  , LinkedListOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("null")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float()")
    , SingleJavaValue("new java.awt.Rectangle(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Rectangle(-1000000000, -1000000000, 1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float(Float.MIN_VALUE, Float.MIN_VALUE, Float.MAX_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float(-1.0000001f, -1.0000001f, 1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Double(-2.000000000000123, -2.000000000000234, 1.000000000000345, 1.000000000000456)")
    )
  )

  val hasGenerics = true
}

case object `java.LinkedList<Rectangle?>?`
    extends JavaRectangle with `box.NullableLinkedListOfNullable` {

  val javaClass = "java.util.LinkedList<java.awt.geom.Rectangle2D>"
  val javaType = JavaCollectionType("java.util.LinkedList", JavaClass("java.awt.geom.Rectangle2D"))
  val javaDescription = "NullableLinkedListOfNullableRectangles"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    LinkedListOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("null")
    )
  , LinkedListOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("new java.awt.geom.Rectangle2D.Float()")
    )
  , LinkedListOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("new java.awt.geom.Rectangle2D.Double(-2.000000000000123, -2.000000000000234, 1.000000000000345, 1.000000000000456)")
    )
  , LinkedListOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("new java.awt.geom.Rectangle2D.Float()")
    , SingleJavaValue("new java.awt.Rectangle(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Rectangle(-1000000000, -1000000000, 1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float(Float.MIN_VALUE, Float.MIN_VALUE, Float.MAX_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float(-1.0000001f, -1.0000001f, 1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Double(-2.000000000000123, -2.000000000000234, 1.000000000000345, 1.000000000000456)")
    )
  , LinkedListOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("null")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float()")
    , SingleJavaValue("new java.awt.Rectangle(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Rectangle(-1000000000, -1000000000, 1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float(Float.MIN_VALUE, Float.MIN_VALUE, Float.MAX_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float(-1.0000001f, -1.0000001f, 1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Double(-2.000000000000123, -2.000000000000234, 1.000000000000345, 1.000000000000456)")
    )
  )

  val hasGenerics = true
}

case object `java.Stack<Rectangle>`
    extends JavaRectangle with `box.OneStackOfOne` {

  val javaClass = "java.util.Stack<java.awt.geom.Rectangle2D>"
  val javaType = JavaCollectionType("java.util.Stack", JavaClass("java.awt.geom.Rectangle2D"))
  val javaDescription = "OneStackOfOneRectangles"

  def defaultValue = SingleJavaValue("new java.util.Stack<java.awt.geom.Rectangle2D>()")

  def nonDefaultValues = IndexedSeq(
    StackOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("new java.awt.geom.Rectangle2D.Float()")
    )
  , StackOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("new java.awt.geom.Rectangle2D.Double(-2.000000000000123, -2.000000000000234, 1.000000000000345, 1.000000000000456)")
    )
  , StackOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("new java.awt.geom.Rectangle2D.Float()")
    , SingleJavaValue("new java.awt.Rectangle(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Rectangle(-1000000000, -1000000000, 1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float(Float.MIN_VALUE, Float.MIN_VALUE, Float.MAX_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float(-1.0000001f, -1.0000001f, 1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Double(-2.000000000000123, -2.000000000000234, 1.000000000000345, 1.000000000000456)")
    )
  )

  val hasGenerics = true
}

case object `java.Stack<Rectangle>?`
    extends JavaRectangle with `box.NullableStackOfOne` {

  val javaClass = "java.util.Stack<java.awt.geom.Rectangle2D>"
  val javaType = JavaCollectionType("java.util.Stack", JavaClass("java.awt.geom.Rectangle2D"))
  val javaDescription = "NullableStackOfOneRectangles"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    StackOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("new java.awt.geom.Rectangle2D.Float()")
    )
  , StackOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("new java.awt.geom.Rectangle2D.Double(-2.000000000000123, -2.000000000000234, 1.000000000000345, 1.000000000000456)")
    )
  , StackOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("new java.awt.geom.Rectangle2D.Float()")
    , SingleJavaValue("new java.awt.Rectangle(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Rectangle(-1000000000, -1000000000, 1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float(Float.MIN_VALUE, Float.MIN_VALUE, Float.MAX_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float(-1.0000001f, -1.0000001f, 1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Double(-2.000000000000123, -2.000000000000234, 1.000000000000345, 1.000000000000456)")
    )
  )

  val hasGenerics = true
}

case object `java.Stack<Rectangle?>`
    extends JavaRectangle with `box.OneStackOfNullable` {

  val javaClass = "java.util.Stack<java.awt.geom.Rectangle2D>"
  val javaType = JavaCollectionType("java.util.Stack", JavaClass("java.awt.geom.Rectangle2D"))
  val javaDescription = "OneStackOfNullableRectangles"

  def defaultValue = SingleJavaValue("new java.util.Stack<java.awt.geom.Rectangle2D>()")

  def nonDefaultValues = IndexedSeq(
    StackOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("null")
    )
  , StackOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("new java.awt.geom.Rectangle2D.Float()")
    )
  , StackOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("new java.awt.geom.Rectangle2D.Double(-2.000000000000123, -2.000000000000234, 1.000000000000345, 1.000000000000456)")
    )
  , StackOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("new java.awt.geom.Rectangle2D.Float()")
    , SingleJavaValue("new java.awt.Rectangle(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Rectangle(-1000000000, -1000000000, 1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float(Float.MIN_VALUE, Float.MIN_VALUE, Float.MAX_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float(-1.0000001f, -1.0000001f, 1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Double(-2.000000000000123, -2.000000000000234, 1.000000000000345, 1.000000000000456)")
    )
  , StackOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("null")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float()")
    , SingleJavaValue("new java.awt.Rectangle(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Rectangle(-1000000000, -1000000000, 1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float(Float.MIN_VALUE, Float.MIN_VALUE, Float.MAX_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float(-1.0000001f, -1.0000001f, 1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Double(-2.000000000000123, -2.000000000000234, 1.000000000000345, 1.000000000000456)")
    )
  )

  val hasGenerics = true
}

case object `java.Stack<Rectangle?>?`
    extends JavaRectangle with `box.NullableStackOfNullable` {

  val javaClass = "java.util.Stack<java.awt.geom.Rectangle2D>"
  val javaType = JavaCollectionType("java.util.Stack", JavaClass("java.awt.geom.Rectangle2D"))
  val javaDescription = "NullableStackOfNullableRectangles"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    StackOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("null")
    )
  , StackOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("new java.awt.geom.Rectangle2D.Float()")
    )
  , StackOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("new java.awt.geom.Rectangle2D.Double(-2.000000000000123, -2.000000000000234, 1.000000000000345, 1.000000000000456)")
    )
  , StackOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("new java.awt.geom.Rectangle2D.Float()")
    , SingleJavaValue("new java.awt.Rectangle(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Rectangle(-1000000000, -1000000000, 1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float(Float.MIN_VALUE, Float.MIN_VALUE, Float.MAX_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float(-1.0000001f, -1.0000001f, 1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Double(-2.000000000000123, -2.000000000000234, 1.000000000000345, 1.000000000000456)")
    )
  , StackOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("null")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float()")
    , SingleJavaValue("new java.awt.Rectangle(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Rectangle(-1000000000, -1000000000, 1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float(Float.MIN_VALUE, Float.MIN_VALUE, Float.MAX_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float(-1.0000001f, -1.0000001f, 1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Double(-2.000000000000123, -2.000000000000234, 1.000000000000345, 1.000000000000456)")
    )
  )

  val hasGenerics = true
}

case object `java.Vector<Rectangle>`
    extends JavaRectangle with `box.OneVectorOfOne` {

  val javaClass = "java.util.Vector<java.awt.geom.Rectangle2D>"
  val javaType = JavaCollectionType("java.util.Vector", JavaClass("java.awt.geom.Rectangle2D"))
  val javaDescription = "OneVectorOfOneRectangles"

  def defaultValue = SingleJavaValue("new java.util.Vector<java.awt.geom.Rectangle2D>(0)")

  def nonDefaultValues = IndexedSeq(
    VectorOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("new java.awt.geom.Rectangle2D.Float()")
    )
  , VectorOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("new java.awt.geom.Rectangle2D.Double(-2.000000000000123, -2.000000000000234, 1.000000000000345, 1.000000000000456)")
    )
  , VectorOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("new java.awt.geom.Rectangle2D.Float()")
    , SingleJavaValue("new java.awt.Rectangle(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Rectangle(-1000000000, -1000000000, 1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float(Float.MIN_VALUE, Float.MIN_VALUE, Float.MAX_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float(-1.0000001f, -1.0000001f, 1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Double(-2.000000000000123, -2.000000000000234, 1.000000000000345, 1.000000000000456)")
    )
  )

  val hasGenerics = true
}

case object `java.Vector<Rectangle>?`
    extends JavaRectangle with `box.NullableVectorOfOne` {

  val javaClass = "java.util.Vector<java.awt.geom.Rectangle2D>"
  val javaType = JavaCollectionType("java.util.Vector", JavaClass("java.awt.geom.Rectangle2D"))
  val javaDescription = "NullableVectorOfOneRectangles"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    VectorOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("new java.awt.geom.Rectangle2D.Float()")
    )
  , VectorOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("new java.awt.geom.Rectangle2D.Double(-2.000000000000123, -2.000000000000234, 1.000000000000345, 1.000000000000456)")
    )
  , VectorOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("new java.awt.geom.Rectangle2D.Float()")
    , SingleJavaValue("new java.awt.Rectangle(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Rectangle(-1000000000, -1000000000, 1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float(Float.MIN_VALUE, Float.MIN_VALUE, Float.MAX_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float(-1.0000001f, -1.0000001f, 1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Double(-2.000000000000123, -2.000000000000234, 1.000000000000345, 1.000000000000456)")
    )
  )

  val hasGenerics = true
}

case object `java.Vector<Rectangle?>`
    extends JavaRectangle with `box.OneVectorOfNullable` {

  val javaClass = "java.util.Vector<java.awt.geom.Rectangle2D>"
  val javaType = JavaCollectionType("java.util.Vector", JavaClass("java.awt.geom.Rectangle2D"))
  val javaDescription = "OneVectorOfNullableRectangles"

  def defaultValue = SingleJavaValue("new java.util.Vector<java.awt.geom.Rectangle2D>(0)")

  def nonDefaultValues = IndexedSeq(
    VectorOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("null")
    )
  , VectorOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("new java.awt.geom.Rectangle2D.Float()")
    )
  , VectorOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("new java.awt.geom.Rectangle2D.Double(-2.000000000000123, -2.000000000000234, 1.000000000000345, 1.000000000000456)")
    )
  , VectorOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("new java.awt.geom.Rectangle2D.Float()")
    , SingleJavaValue("new java.awt.Rectangle(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Rectangle(-1000000000, -1000000000, 1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float(Float.MIN_VALUE, Float.MIN_VALUE, Float.MAX_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float(-1.0000001f, -1.0000001f, 1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Double(-2.000000000000123, -2.000000000000234, 1.000000000000345, 1.000000000000456)")
    )
  , VectorOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("null")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float()")
    , SingleJavaValue("new java.awt.Rectangle(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Rectangle(-1000000000, -1000000000, 1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float(Float.MIN_VALUE, Float.MIN_VALUE, Float.MAX_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float(-1.0000001f, -1.0000001f, 1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Double(-2.000000000000123, -2.000000000000234, 1.000000000000345, 1.000000000000456)")
    )
  )

  val hasGenerics = true
}

case object `java.Vector<Rectangle?>?`
    extends JavaRectangle with `box.NullableVectorOfNullable` {

  val javaClass = "java.util.Vector<java.awt.geom.Rectangle2D>"
  val javaType = JavaCollectionType("java.util.Vector", JavaClass("java.awt.geom.Rectangle2D"))
  val javaDescription = "NullableVectorOfNullableRectangles"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    VectorOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("null")
    )
  , VectorOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("new java.awt.geom.Rectangle2D.Float()")
    )
  , VectorOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("new java.awt.geom.Rectangle2D.Double(-2.000000000000123, -2.000000000000234, 1.000000000000345, 1.000000000000456)")
    )
  , VectorOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("new java.awt.geom.Rectangle2D.Float()")
    , SingleJavaValue("new java.awt.Rectangle(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Rectangle(-1000000000, -1000000000, 1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float(Float.MIN_VALUE, Float.MIN_VALUE, Float.MAX_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float(-1.0000001f, -1.0000001f, 1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Double(-2.000000000000123, -2.000000000000234, 1.000000000000345, 1.000000000000456)")
    )
  , VectorOfJavaValues("java.awt.geom.Rectangle2D",
      SingleJavaValue("null")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float()")
    , SingleJavaValue("new java.awt.Rectangle(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE)")
    , SingleJavaValue("new java.awt.Rectangle(-1000000000, -1000000000, 1000000000, 1000000000)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float(Float.MIN_VALUE, Float.MIN_VALUE, Float.MAX_VALUE, Float.MAX_VALUE)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Float(-1.0000001f, -1.0000001f, 1.0000001f, 1.0000001f)")
    , SingleJavaValue("new java.awt.geom.Rectangle2D.Double(-2.000000000000123, -2.000000000000234, 1.000000000000345, 1.000000000000456)")
    )
  )

  val hasGenerics = true
}
