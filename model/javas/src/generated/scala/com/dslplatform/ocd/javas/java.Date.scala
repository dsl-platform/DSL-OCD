package com.dslplatform.ocd
package javas

import types._
import boxes._

sealed abstract class JavaDate
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

case object `java.Queue<Date>`
    extends JavaDate with `box.OneQueueOfOne` {

  val javaClass = "java.util.Queue<org.joda.time.LocalDate>"
  val javaType = JavaCollectionType("java.util.Queue", JavaClass("org.joda.time.LocalDate"))
  val javaDescription = "OneQueueOfOneDates"

  def defaultValue = SingleJavaValue("new java.util.ArrayDeque<org.joda.time.LocalDate>(0)")

  def nonDefaultValues = IndexedSeq(
    QueueOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("org.joda.time.LocalDate.now()", Unstable)
    )
  , QueueOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("new org.joda.time.LocalDate(9999, 12, 31)")
    )
  , QueueOfJavaValues("org.joda.time.LocalDate",
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

case object `java.Queue<Date>?`
    extends JavaDate with `box.NullableQueueOfOne` {

  val javaClass = "java.util.Queue<org.joda.time.LocalDate>"
  val javaType = JavaCollectionType("java.util.Queue", JavaClass("org.joda.time.LocalDate"))
  val javaDescription = "NullableQueueOfOneDates"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    QueueOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("org.joda.time.LocalDate.now()", Unstable)
    )
  , QueueOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("new org.joda.time.LocalDate(9999, 12, 31)")
    )
  , QueueOfJavaValues("org.joda.time.LocalDate",
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

case object `java.Queue<Date?>`
    extends JavaDate with `box.OneQueueOfNullable` {

  val javaClass = "java.util.Queue<org.joda.time.LocalDate>"
  val javaType = JavaCollectionType("java.util.Queue", JavaClass("org.joda.time.LocalDate"))
  val javaDescription = "OneQueueOfNullableDates"

  def defaultValue = SingleJavaValue("new java.util.ArrayDeque<org.joda.time.LocalDate>(0)")

  def nonDefaultValues = IndexedSeq(
    QueueOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("null")
    )
  , QueueOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("org.joda.time.LocalDate.now()", Unstable)
    )
  , QueueOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("new org.joda.time.LocalDate(9999, 12, 31)")
    )
  , QueueOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("org.joda.time.LocalDate.now()", Unstable)
    , SingleJavaValue("new org.joda.time.LocalDate(1, 2, 3)")
    , SingleJavaValue("new org.joda.time.LocalDate(1, 1, 1)")
    , SingleJavaValue("new org.joda.time.LocalDate(0)")
    , SingleJavaValue("new org.joda.time.LocalDate(Integer.MAX_VALUE * 1001L)")
    , SingleJavaValue("new org.joda.time.LocalDate(9999, 12, 31)")
    )
  , QueueOfJavaValues("org.joda.time.LocalDate",
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

case object `java.Queue<Date?>?`
    extends JavaDate with `box.NullableQueueOfNullable` {

  val javaClass = "java.util.Queue<org.joda.time.LocalDate>"
  val javaType = JavaCollectionType("java.util.Queue", JavaClass("org.joda.time.LocalDate"))
  val javaDescription = "NullableQueueOfNullableDates"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    QueueOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("null")
    )
  , QueueOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("org.joda.time.LocalDate.now()", Unstable)
    )
  , QueueOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("new org.joda.time.LocalDate(9999, 12, 31)")
    )
  , QueueOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("org.joda.time.LocalDate.now()", Unstable)
    , SingleJavaValue("new org.joda.time.LocalDate(1, 2, 3)")
    , SingleJavaValue("new org.joda.time.LocalDate(1, 1, 1)")
    , SingleJavaValue("new org.joda.time.LocalDate(0)")
    , SingleJavaValue("new org.joda.time.LocalDate(Integer.MAX_VALUE * 1001L)")
    , SingleJavaValue("new org.joda.time.LocalDate(9999, 12, 31)")
    )
  , QueueOfJavaValues("org.joda.time.LocalDate",
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

case object `java.LinkedList<Date>`
    extends JavaDate with `box.OneLinkedListOfOne` {

  val javaClass = "java.util.LinkedList<org.joda.time.LocalDate>"
  val javaType = JavaCollectionType("java.util.LinkedList", JavaClass("org.joda.time.LocalDate"))
  val javaDescription = "OneLinkedListOfOneDates"

  def defaultValue = SingleJavaValue("new java.util.LinkedList<org.joda.time.LocalDate>()")

  def nonDefaultValues = IndexedSeq(
    LinkedListOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("org.joda.time.LocalDate.now()", Unstable)
    )
  , LinkedListOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("new org.joda.time.LocalDate(9999, 12, 31)")
    )
  , LinkedListOfJavaValues("org.joda.time.LocalDate",
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

case object `java.LinkedList<Date>?`
    extends JavaDate with `box.NullableLinkedListOfOne` {

  val javaClass = "java.util.LinkedList<org.joda.time.LocalDate>"
  val javaType = JavaCollectionType("java.util.LinkedList", JavaClass("org.joda.time.LocalDate"))
  val javaDescription = "NullableLinkedListOfOneDates"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    LinkedListOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("org.joda.time.LocalDate.now()", Unstable)
    )
  , LinkedListOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("new org.joda.time.LocalDate(9999, 12, 31)")
    )
  , LinkedListOfJavaValues("org.joda.time.LocalDate",
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

case object `java.LinkedList<Date?>`
    extends JavaDate with `box.OneLinkedListOfNullable` {

  val javaClass = "java.util.LinkedList<org.joda.time.LocalDate>"
  val javaType = JavaCollectionType("java.util.LinkedList", JavaClass("org.joda.time.LocalDate"))
  val javaDescription = "OneLinkedListOfNullableDates"

  def defaultValue = SingleJavaValue("new java.util.LinkedList<org.joda.time.LocalDate>()")

  def nonDefaultValues = IndexedSeq(
    LinkedListOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("null")
    )
  , LinkedListOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("org.joda.time.LocalDate.now()", Unstable)
    )
  , LinkedListOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("new org.joda.time.LocalDate(9999, 12, 31)")
    )
  , LinkedListOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("org.joda.time.LocalDate.now()", Unstable)
    , SingleJavaValue("new org.joda.time.LocalDate(1, 2, 3)")
    , SingleJavaValue("new org.joda.time.LocalDate(1, 1, 1)")
    , SingleJavaValue("new org.joda.time.LocalDate(0)")
    , SingleJavaValue("new org.joda.time.LocalDate(Integer.MAX_VALUE * 1001L)")
    , SingleJavaValue("new org.joda.time.LocalDate(9999, 12, 31)")
    )
  , LinkedListOfJavaValues("org.joda.time.LocalDate",
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

case object `java.LinkedList<Date?>?`
    extends JavaDate with `box.NullableLinkedListOfNullable` {

  val javaClass = "java.util.LinkedList<org.joda.time.LocalDate>"
  val javaType = JavaCollectionType("java.util.LinkedList", JavaClass("org.joda.time.LocalDate"))
  val javaDescription = "NullableLinkedListOfNullableDates"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    LinkedListOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("null")
    )
  , LinkedListOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("org.joda.time.LocalDate.now()", Unstable)
    )
  , LinkedListOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("new org.joda.time.LocalDate(9999, 12, 31)")
    )
  , LinkedListOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("org.joda.time.LocalDate.now()", Unstable)
    , SingleJavaValue("new org.joda.time.LocalDate(1, 2, 3)")
    , SingleJavaValue("new org.joda.time.LocalDate(1, 1, 1)")
    , SingleJavaValue("new org.joda.time.LocalDate(0)")
    , SingleJavaValue("new org.joda.time.LocalDate(Integer.MAX_VALUE * 1001L)")
    , SingleJavaValue("new org.joda.time.LocalDate(9999, 12, 31)")
    )
  , LinkedListOfJavaValues("org.joda.time.LocalDate",
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

case object `java.Stack<Date>`
    extends JavaDate with `box.OneStackOfOne` {

  val javaClass = "java.util.Stack<org.joda.time.LocalDate>"
  val javaType = JavaCollectionType("java.util.Stack", JavaClass("org.joda.time.LocalDate"))
  val javaDescription = "OneStackOfOneDates"

  def defaultValue = SingleJavaValue("new java.util.Stack<org.joda.time.LocalDate>()")

  def nonDefaultValues = IndexedSeq(
    StackOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("org.joda.time.LocalDate.now()", Unstable)
    )
  , StackOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("new org.joda.time.LocalDate(9999, 12, 31)")
    )
  , StackOfJavaValues("org.joda.time.LocalDate",
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

case object `java.Stack<Date>?`
    extends JavaDate with `box.NullableStackOfOne` {

  val javaClass = "java.util.Stack<org.joda.time.LocalDate>"
  val javaType = JavaCollectionType("java.util.Stack", JavaClass("org.joda.time.LocalDate"))
  val javaDescription = "NullableStackOfOneDates"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    StackOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("org.joda.time.LocalDate.now()", Unstable)
    )
  , StackOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("new org.joda.time.LocalDate(9999, 12, 31)")
    )
  , StackOfJavaValues("org.joda.time.LocalDate",
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

case object `java.Stack<Date?>`
    extends JavaDate with `box.OneStackOfNullable` {

  val javaClass = "java.util.Stack<org.joda.time.LocalDate>"
  val javaType = JavaCollectionType("java.util.Stack", JavaClass("org.joda.time.LocalDate"))
  val javaDescription = "OneStackOfNullableDates"

  def defaultValue = SingleJavaValue("new java.util.Stack<org.joda.time.LocalDate>()")

  def nonDefaultValues = IndexedSeq(
    StackOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("null")
    )
  , StackOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("org.joda.time.LocalDate.now()", Unstable)
    )
  , StackOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("new org.joda.time.LocalDate(9999, 12, 31)")
    )
  , StackOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("org.joda.time.LocalDate.now()", Unstable)
    , SingleJavaValue("new org.joda.time.LocalDate(1, 2, 3)")
    , SingleJavaValue("new org.joda.time.LocalDate(1, 1, 1)")
    , SingleJavaValue("new org.joda.time.LocalDate(0)")
    , SingleJavaValue("new org.joda.time.LocalDate(Integer.MAX_VALUE * 1001L)")
    , SingleJavaValue("new org.joda.time.LocalDate(9999, 12, 31)")
    )
  , StackOfJavaValues("org.joda.time.LocalDate",
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

case object `java.Stack<Date?>?`
    extends JavaDate with `box.NullableStackOfNullable` {

  val javaClass = "java.util.Stack<org.joda.time.LocalDate>"
  val javaType = JavaCollectionType("java.util.Stack", JavaClass("org.joda.time.LocalDate"))
  val javaDescription = "NullableStackOfNullableDates"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    StackOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("null")
    )
  , StackOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("org.joda.time.LocalDate.now()", Unstable)
    )
  , StackOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("new org.joda.time.LocalDate(9999, 12, 31)")
    )
  , StackOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("org.joda.time.LocalDate.now()", Unstable)
    , SingleJavaValue("new org.joda.time.LocalDate(1, 2, 3)")
    , SingleJavaValue("new org.joda.time.LocalDate(1, 1, 1)")
    , SingleJavaValue("new org.joda.time.LocalDate(0)")
    , SingleJavaValue("new org.joda.time.LocalDate(Integer.MAX_VALUE * 1001L)")
    , SingleJavaValue("new org.joda.time.LocalDate(9999, 12, 31)")
    )
  , StackOfJavaValues("org.joda.time.LocalDate",
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

case object `java.Vector<Date>`
    extends JavaDate with `box.OneVectorOfOne` {

  val javaClass = "java.util.Vector<org.joda.time.LocalDate>"
  val javaType = JavaCollectionType("java.util.Vector", JavaClass("org.joda.time.LocalDate"))
  val javaDescription = "OneVectorOfOneDates"

  def defaultValue = SingleJavaValue("new java.util.Vector<org.joda.time.LocalDate>(0)")

  def nonDefaultValues = IndexedSeq(
    VectorOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("org.joda.time.LocalDate.now()", Unstable)
    )
  , VectorOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("new org.joda.time.LocalDate(9999, 12, 31)")
    )
  , VectorOfJavaValues("org.joda.time.LocalDate",
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

case object `java.Vector<Date>?`
    extends JavaDate with `box.NullableVectorOfOne` {

  val javaClass = "java.util.Vector<org.joda.time.LocalDate>"
  val javaType = JavaCollectionType("java.util.Vector", JavaClass("org.joda.time.LocalDate"))
  val javaDescription = "NullableVectorOfOneDates"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    VectorOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("org.joda.time.LocalDate.now()", Unstable)
    )
  , VectorOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("new org.joda.time.LocalDate(9999, 12, 31)")
    )
  , VectorOfJavaValues("org.joda.time.LocalDate",
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

case object `java.Vector<Date?>`
    extends JavaDate with `box.OneVectorOfNullable` {

  val javaClass = "java.util.Vector<org.joda.time.LocalDate>"
  val javaType = JavaCollectionType("java.util.Vector", JavaClass("org.joda.time.LocalDate"))
  val javaDescription = "OneVectorOfNullableDates"

  def defaultValue = SingleJavaValue("new java.util.Vector<org.joda.time.LocalDate>(0)")

  def nonDefaultValues = IndexedSeq(
    VectorOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("null")
    )
  , VectorOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("org.joda.time.LocalDate.now()", Unstable)
    )
  , VectorOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("new org.joda.time.LocalDate(9999, 12, 31)")
    )
  , VectorOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("org.joda.time.LocalDate.now()", Unstable)
    , SingleJavaValue("new org.joda.time.LocalDate(1, 2, 3)")
    , SingleJavaValue("new org.joda.time.LocalDate(1, 1, 1)")
    , SingleJavaValue("new org.joda.time.LocalDate(0)")
    , SingleJavaValue("new org.joda.time.LocalDate(Integer.MAX_VALUE * 1001L)")
    , SingleJavaValue("new org.joda.time.LocalDate(9999, 12, 31)")
    )
  , VectorOfJavaValues("org.joda.time.LocalDate",
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

case object `java.Vector<Date?>?`
    extends JavaDate with `box.NullableVectorOfNullable` {

  val javaClass = "java.util.Vector<org.joda.time.LocalDate>"
  val javaType = JavaCollectionType("java.util.Vector", JavaClass("org.joda.time.LocalDate"))
  val javaDescription = "NullableVectorOfNullableDates"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    VectorOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("null")
    )
  , VectorOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("org.joda.time.LocalDate.now()", Unstable)
    )
  , VectorOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("new org.joda.time.LocalDate(9999, 12, 31)")
    )
  , VectorOfJavaValues("org.joda.time.LocalDate",
      SingleJavaValue("org.joda.time.LocalDate.now()", Unstable)
    , SingleJavaValue("new org.joda.time.LocalDate(1, 2, 3)")
    , SingleJavaValue("new org.joda.time.LocalDate(1, 1, 1)")
    , SingleJavaValue("new org.joda.time.LocalDate(0)")
    , SingleJavaValue("new org.joda.time.LocalDate(Integer.MAX_VALUE * 1001L)")
    , SingleJavaValue("new org.joda.time.LocalDate(9999, 12, 31)")
    )
  , VectorOfJavaValues("org.joda.time.LocalDate",
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
