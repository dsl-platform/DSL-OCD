package com.dslplatform.ocd
package javas

import types._
import boxes._

sealed trait JavaDate
    extends OcdJavaBoxType
    with `type.Date` {

  val isPrecise = false
  val isPrimitive = false
  val isEqualable = true
}

case object `java.Date`
    extends JavaDate with `box.One` {

  val javaClass = "org.joda.time.LocalDate"
  val javaType = JavaSimpleType("org.joda.time.LocalDate")
  val javaDescription = "OneDate"

  def defaultValue = SingleJavaValue("org.joda.time.LocalDate.now()", Unstable)

  def nonDefaultValues = IndexedSeq(
    SingleJavaValue("new org.joda.time.LocalDate(1, 2, 3)")
  , SingleJavaValue("new org.joda.time.LocalDate(1, 1, 1)")
  , SingleJavaValue("new org.joda.time.LocalDate(0)")
  , SingleJavaValue("new org.joda.time.LocalDate(Integer.MAX_VALUE * 1001L)")
  , SingleJavaValue("new org.joda.time.LocalDate(9999, 12, 31)")
  )

  val hasGenerics = false
}

case object `java.Date?`
    extends JavaDate with `box.Nullable` {

  val javaClass = "org.joda.time.LocalDate"
  val javaType = JavaSimpleType("org.joda.time.LocalDate")
  val javaDescription = "NullableDate"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    SingleJavaValue("org.joda.time.LocalDate.now()", Unstable)
  , SingleJavaValue("new org.joda.time.LocalDate(1, 2, 3)")
  , SingleJavaValue("new org.joda.time.LocalDate(1, 1, 1)")
  , SingleJavaValue("new org.joda.time.LocalDate(0)")
  , SingleJavaValue("new org.joda.time.LocalDate(Integer.MAX_VALUE * 1001L)")
  , SingleJavaValue("new org.joda.time.LocalDate(9999, 12, 31)")
  )

  val hasGenerics = false
}

case object `java.Date[]`
    extends JavaDate with `box.OneArrayOfOne` {

  val javaClass = "org.joda.time.LocalDate[]"
  val javaType = JavaSimpleType("org.joda.time.LocalDate[]")
  val javaDescription = "OneArrayOfOneDates"

  def defaultValue = SingleJavaValue("new org.joda.time.LocalDate[0]")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("org.joda.time.LocalDate.now()", Unstable)
    )
  , ArrayOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("new org.joda.time.LocalDate(9999, 12, 31)")
    )
  , ArrayOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("org.joda.time.LocalDate.now()", Unstable)
    , SingleJavaValue("new org.joda.time.LocalDate(1, 2, 3)")
    , SingleJavaValue("new org.joda.time.LocalDate(1, 1, 1)")
    , SingleJavaValue("new org.joda.time.LocalDate(0)")
    , SingleJavaValue("new org.joda.time.LocalDate(Integer.MAX_VALUE * 1001L)")
    , SingleJavaValue("new org.joda.time.LocalDate(9999, 12, 31)")
    )
  )

  val hasGenerics = false
}

case object `java.Date[]?`
    extends JavaDate with `box.NullableArrayOfOne` {

  val javaClass = "org.joda.time.LocalDate[]"
  val javaType = JavaSimpleType("org.joda.time.LocalDate[]")
  val javaDescription = "NullableArrayOfOneDates"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("org.joda.time.LocalDate.now()", Unstable)
    )
  , ArrayOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("new org.joda.time.LocalDate(9999, 12, 31)")
    )
  , ArrayOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("org.joda.time.LocalDate.now()", Unstable)
    , SingleJavaValue("new org.joda.time.LocalDate(1, 2, 3)")
    , SingleJavaValue("new org.joda.time.LocalDate(1, 1, 1)")
    , SingleJavaValue("new org.joda.time.LocalDate(0)")
    , SingleJavaValue("new org.joda.time.LocalDate(Integer.MAX_VALUE * 1001L)")
    , SingleJavaValue("new org.joda.time.LocalDate(9999, 12, 31)")
    )
  )

  val hasGenerics = false
}

case object `java.Date?[]`
    extends JavaDate with `box.OneArrayOfNullable` {

  val javaClass = "org.joda.time.LocalDate[]"
  val javaType = JavaSimpleType("org.joda.time.LocalDate[]")
  val javaDescription = "OneArrayOfNullableDates"

  def defaultValue = SingleJavaValue("new org.joda.time.LocalDate[0]")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("null")
    )
  , ArrayOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("org.joda.time.LocalDate.now()", Unstable)
    )
  , ArrayOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("new org.joda.time.LocalDate(9999, 12, 31)")
    )
  , ArrayOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("org.joda.time.LocalDate.now()", Unstable)
    , SingleJavaValue("new org.joda.time.LocalDate(1, 2, 3)")
    , SingleJavaValue("new org.joda.time.LocalDate(1, 1, 1)")
    , SingleJavaValue("new org.joda.time.LocalDate(0)")
    , SingleJavaValue("new org.joda.time.LocalDate(Integer.MAX_VALUE * 1001L)")
    , SingleJavaValue("new org.joda.time.LocalDate(9999, 12, 31)")
    )
  , ArrayOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("null")
    , SingleJavaValue("org.joda.time.LocalDate.now()", Unstable)
    , SingleJavaValue("new org.joda.time.LocalDate(1, 2, 3)")
    , SingleJavaValue("new org.joda.time.LocalDate(1, 1, 1)")
    , SingleJavaValue("new org.joda.time.LocalDate(0)")
    , SingleJavaValue("new org.joda.time.LocalDate(Integer.MAX_VALUE * 1001L)")
    , SingleJavaValue("new org.joda.time.LocalDate(9999, 12, 31)")
    )
  )

  val hasGenerics = false
}

case object `java.Date?[]?`
    extends JavaDate with `box.NullableArrayOfNullable` {

  val javaClass = "org.joda.time.LocalDate[]"
  val javaType = JavaSimpleType("org.joda.time.LocalDate[]")
  val javaDescription = "NullableArrayOfNullableDates"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("null")
    )
  , ArrayOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("org.joda.time.LocalDate.now()", Unstable)
    )
  , ArrayOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("new org.joda.time.LocalDate(9999, 12, 31)")
    )
  , ArrayOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("org.joda.time.LocalDate.now()", Unstable)
    , SingleJavaValue("new org.joda.time.LocalDate(1, 2, 3)")
    , SingleJavaValue("new org.joda.time.LocalDate(1, 1, 1)")
    , SingleJavaValue("new org.joda.time.LocalDate(0)")
    , SingleJavaValue("new org.joda.time.LocalDate(Integer.MAX_VALUE * 1001L)")
    , SingleJavaValue("new org.joda.time.LocalDate(9999, 12, 31)")
    )
  , ArrayOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("null")
    , SingleJavaValue("org.joda.time.LocalDate.now()", Unstable)
    , SingleJavaValue("new org.joda.time.LocalDate(1, 2, 3)")
    , SingleJavaValue("new org.joda.time.LocalDate(1, 1, 1)")
    , SingleJavaValue("new org.joda.time.LocalDate(0)")
    , SingleJavaValue("new org.joda.time.LocalDate(Integer.MAX_VALUE * 1001L)")
    , SingleJavaValue("new org.joda.time.LocalDate(9999, 12, 31)")
    )
  )

  val hasGenerics = false
}

case object `java.List<Date>`
    extends JavaDate with `box.OneListOfOne` {

  val javaClass = "java.util.List<org.joda.time.LocalDate>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("org.joda.time.LocalDate"))
  val javaDescription = "OneListOfOneDates"

  def defaultValue = SingleJavaValue("new java.util.ArrayList<org.joda.time.LocalDate>(0)")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("org.joda.time.LocalDate.now()", Unstable)
    )
  , ListOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("new org.joda.time.LocalDate(9999, 12, 31)")
    )
  , ListOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("org.joda.time.LocalDate.now()", Unstable)
    , SingleJavaValue("new org.joda.time.LocalDate(1, 2, 3)")
    , SingleJavaValue("new org.joda.time.LocalDate(1, 1, 1)")
    , SingleJavaValue("new org.joda.time.LocalDate(0)")
    , SingleJavaValue("new org.joda.time.LocalDate(Integer.MAX_VALUE * 1001L)")
    , SingleJavaValue("new org.joda.time.LocalDate(9999, 12, 31)")
    )
  )

  val hasGenerics = true
}

case object `java.List<Date>?`
    extends JavaDate with `box.NullableListOfOne` {

  val javaClass = "java.util.List<org.joda.time.LocalDate>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("org.joda.time.LocalDate"))
  val javaDescription = "NullableListOfOneDates"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("org.joda.time.LocalDate.now()", Unstable)
    )
  , ListOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("new org.joda.time.LocalDate(9999, 12, 31)")
    )
  , ListOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("org.joda.time.LocalDate.now()", Unstable)
    , SingleJavaValue("new org.joda.time.LocalDate(1, 2, 3)")
    , SingleJavaValue("new org.joda.time.LocalDate(1, 1, 1)")
    , SingleJavaValue("new org.joda.time.LocalDate(0)")
    , SingleJavaValue("new org.joda.time.LocalDate(Integer.MAX_VALUE * 1001L)")
    , SingleJavaValue("new org.joda.time.LocalDate(9999, 12, 31)")
    )
  )

  val hasGenerics = true
}

case object `java.List<Date?>`
    extends JavaDate with `box.OneListOfNullable` {

  val javaClass = "java.util.List<org.joda.time.LocalDate>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("org.joda.time.LocalDate"))
  val javaDescription = "OneListOfNullableDates"

  def defaultValue = SingleJavaValue("new java.util.ArrayList<org.joda.time.LocalDate>(0)")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("null")
    )
  , ListOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("org.joda.time.LocalDate.now()", Unstable)
    )
  , ListOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("new org.joda.time.LocalDate(9999, 12, 31)")
    )
  , ListOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("org.joda.time.LocalDate.now()", Unstable)
    , SingleJavaValue("new org.joda.time.LocalDate(1, 2, 3)")
    , SingleJavaValue("new org.joda.time.LocalDate(1, 1, 1)")
    , SingleJavaValue("new org.joda.time.LocalDate(0)")
    , SingleJavaValue("new org.joda.time.LocalDate(Integer.MAX_VALUE * 1001L)")
    , SingleJavaValue("new org.joda.time.LocalDate(9999, 12, 31)")
    )
  , ListOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("null")
    , SingleJavaValue("org.joda.time.LocalDate.now()", Unstable)
    , SingleJavaValue("new org.joda.time.LocalDate(1, 2, 3)")
    , SingleJavaValue("new org.joda.time.LocalDate(1, 1, 1)")
    , SingleJavaValue("new org.joda.time.LocalDate(0)")
    , SingleJavaValue("new org.joda.time.LocalDate(Integer.MAX_VALUE * 1001L)")
    , SingleJavaValue("new org.joda.time.LocalDate(9999, 12, 31)")
    )
  )

  val hasGenerics = true
}

case object `java.List<Date?>?`
    extends JavaDate with `box.NullableListOfNullable` {

  val javaClass = "java.util.List<org.joda.time.LocalDate>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("org.joda.time.LocalDate"))
  val javaDescription = "NullableListOfNullableDates"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("null")
    )
  , ListOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("org.joda.time.LocalDate.now()", Unstable)
    )
  , ListOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("new org.joda.time.LocalDate(9999, 12, 31)")
    )
  , ListOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("org.joda.time.LocalDate.now()", Unstable)
    , SingleJavaValue("new org.joda.time.LocalDate(1, 2, 3)")
    , SingleJavaValue("new org.joda.time.LocalDate(1, 1, 1)")
    , SingleJavaValue("new org.joda.time.LocalDate(0)")
    , SingleJavaValue("new org.joda.time.LocalDate(Integer.MAX_VALUE * 1001L)")
    , SingleJavaValue("new org.joda.time.LocalDate(9999, 12, 31)")
    )
  , ListOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("null")
    , SingleJavaValue("org.joda.time.LocalDate.now()", Unstable)
    , SingleJavaValue("new org.joda.time.LocalDate(1, 2, 3)")
    , SingleJavaValue("new org.joda.time.LocalDate(1, 1, 1)")
    , SingleJavaValue("new org.joda.time.LocalDate(0)")
    , SingleJavaValue("new org.joda.time.LocalDate(Integer.MAX_VALUE * 1001L)")
    , SingleJavaValue("new org.joda.time.LocalDate(9999, 12, 31)")
    )
  )

  val hasGenerics = true
}

case object `java.Set<Date>`
    extends JavaDate with `box.OneSetOfOne` {

  val javaClass = "java.util.Set<org.joda.time.LocalDate>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("org.joda.time.LocalDate"))
  val javaDescription = "OneSetOfOneDates"

  def defaultValue = SingleJavaValue("new java.util.HashSet<org.joda.time.LocalDate>(0)")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("org.joda.time.LocalDate.now()", Unstable)
    )
  , SetOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("new org.joda.time.LocalDate(9999, 12, 31)")
    )
  , SetOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("org.joda.time.LocalDate.now()", Unstable)
    , SingleJavaValue("new org.joda.time.LocalDate(1, 2, 3)")
    , SingleJavaValue("new org.joda.time.LocalDate(1, 1, 1)")
    , SingleJavaValue("new org.joda.time.LocalDate(0)")
    , SingleJavaValue("new org.joda.time.LocalDate(Integer.MAX_VALUE * 1001L)")
    , SingleJavaValue("new org.joda.time.LocalDate(9999, 12, 31)")
    )
  )

  val hasGenerics = true
}

case object `java.Set<Date>?`
    extends JavaDate with `box.NullableSetOfOne` {

  val javaClass = "java.util.Set<org.joda.time.LocalDate>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("org.joda.time.LocalDate"))
  val javaDescription = "NullableSetOfOneDates"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("org.joda.time.LocalDate.now()", Unstable)
    )
  , SetOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("new org.joda.time.LocalDate(9999, 12, 31)")
    )
  , SetOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("org.joda.time.LocalDate.now()", Unstable)
    , SingleJavaValue("new org.joda.time.LocalDate(1, 2, 3)")
    , SingleJavaValue("new org.joda.time.LocalDate(1, 1, 1)")
    , SingleJavaValue("new org.joda.time.LocalDate(0)")
    , SingleJavaValue("new org.joda.time.LocalDate(Integer.MAX_VALUE * 1001L)")
    , SingleJavaValue("new org.joda.time.LocalDate(9999, 12, 31)")
    )
  )

  val hasGenerics = true
}

case object `java.Set<Date?>`
    extends JavaDate with `box.OneSetOfNullable` {

  val javaClass = "java.util.Set<org.joda.time.LocalDate>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("org.joda.time.LocalDate"))
  val javaDescription = "OneSetOfNullableDates"

  def defaultValue = SingleJavaValue("new java.util.HashSet<org.joda.time.LocalDate>(0)")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("null")
    )
  , SetOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("org.joda.time.LocalDate.now()", Unstable)
    )
  , SetOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("new org.joda.time.LocalDate(9999, 12, 31)")
    )
  , SetOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("org.joda.time.LocalDate.now()", Unstable)
    , SingleJavaValue("new org.joda.time.LocalDate(1, 2, 3)")
    , SingleJavaValue("new org.joda.time.LocalDate(1, 1, 1)")
    , SingleJavaValue("new org.joda.time.LocalDate(0)")
    , SingleJavaValue("new org.joda.time.LocalDate(Integer.MAX_VALUE * 1001L)")
    , SingleJavaValue("new org.joda.time.LocalDate(9999, 12, 31)")
    )
  , SetOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("null")
    , SingleJavaValue("org.joda.time.LocalDate.now()", Unstable)
    , SingleJavaValue("new org.joda.time.LocalDate(1, 2, 3)")
    , SingleJavaValue("new org.joda.time.LocalDate(1, 1, 1)")
    , SingleJavaValue("new org.joda.time.LocalDate(0)")
    , SingleJavaValue("new org.joda.time.LocalDate(Integer.MAX_VALUE * 1001L)")
    , SingleJavaValue("new org.joda.time.LocalDate(9999, 12, 31)")
    )
  )

  val hasGenerics = true
}

case object `java.Set<Date?>?`
    extends JavaDate with `box.NullableSetOfNullable` {

  val javaClass = "java.util.Set<org.joda.time.LocalDate>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("org.joda.time.LocalDate"))
  val javaDescription = "NullableSetOfNullableDates"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("null")
    )
  , SetOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("org.joda.time.LocalDate.now()", Unstable)
    )
  , SetOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("new org.joda.time.LocalDate(9999, 12, 31)")
    )
  , SetOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("org.joda.time.LocalDate.now()", Unstable)
    , SingleJavaValue("new org.joda.time.LocalDate(1, 2, 3)")
    , SingleJavaValue("new org.joda.time.LocalDate(1, 1, 1)")
    , SingleJavaValue("new org.joda.time.LocalDate(0)")
    , SingleJavaValue("new org.joda.time.LocalDate(Integer.MAX_VALUE * 1001L)")
    , SingleJavaValue("new org.joda.time.LocalDate(9999, 12, 31)")
    )
  , SetOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("null")
    , SingleJavaValue("org.joda.time.LocalDate.now()", Unstable)
    , SingleJavaValue("new org.joda.time.LocalDate(1, 2, 3)")
    , SingleJavaValue("new org.joda.time.LocalDate(1, 1, 1)")
    , SingleJavaValue("new org.joda.time.LocalDate(0)")
    , SingleJavaValue("new org.joda.time.LocalDate(Integer.MAX_VALUE * 1001L)")
    , SingleJavaValue("new org.joda.time.LocalDate(9999, 12, 31)")
    )
  )

  val hasGenerics = true
}
