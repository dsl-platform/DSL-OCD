package com.dslplatform.ocd
package javas

import types._
import boxes._

sealed trait JavaTimestamp
    extends OcdJavaBoxType
    with `type.Timestamp` {

  val isPrecise = false
  val isPrimitive = false
  val isEqualable = true
}

case object `java.Timestamp`
    extends JavaTimestamp with `box.One` {

  val javaClass = "org.joda.time.DateTime"
  val javaType = JavaSimpleType("org.joda.time.DateTime")
  val javaDescription = "OneTimestamp"

  def defaultValue = SingleJavaValue("org.joda.time.DateTime.now()", Unstable)

  def nonDefaultValues = IndexedSeq(
    SingleJavaValue("new org.joda.time.DateTime(0)")
  , SingleJavaValue("new org.joda.time.DateTime(1, 1, 1, 0, 0, org.joda.time.DateTimeZone.UTC)")
  , SingleJavaValue("new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L)")
  )

  val hasGenerics = false
}

case object `java.Timestamp?`
    extends JavaTimestamp with `box.Nullable` {

  val javaClass = "org.joda.time.DateTime"
  val javaType = JavaSimpleType("org.joda.time.DateTime")
  val javaDescription = "NullableTimestamp"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
  , SingleJavaValue("new org.joda.time.DateTime(0)")
  , SingleJavaValue("new org.joda.time.DateTime(1, 1, 1, 0, 0, org.joda.time.DateTimeZone.UTC)")
  , SingleJavaValue("new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L)")
  )

  val hasGenerics = false
}

case object `java.Timestamp[]`
    extends JavaTimestamp with `box.OneArrayOfOne` {

  val javaClass = "org.joda.time.DateTime[]"
  val javaType = JavaSimpleType("org.joda.time.DateTime[]")
  val javaDescription = "OneArrayOfOneTimestamps"

  def defaultValue = SingleJavaValue("new org.joda.time.DateTime[0]")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    )
  , ArrayOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L)")
    )
  , ArrayOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    , SingleJavaValue("new org.joda.time.DateTime(0)")
    , SingleJavaValue("new org.joda.time.DateTime(1, 1, 1, 0, 0, org.joda.time.DateTimeZone.UTC)")
    , SingleJavaValue("new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L)")
    )
  )

  val hasGenerics = false
}

case object `java.Timestamp[]?`
    extends JavaTimestamp with `box.NullableArrayOfOne` {

  val javaClass = "org.joda.time.DateTime[]"
  val javaType = JavaSimpleType("org.joda.time.DateTime[]")
  val javaDescription = "NullableArrayOfOneTimestamps"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    )
  , ArrayOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L)")
    )
  , ArrayOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    , SingleJavaValue("new org.joda.time.DateTime(0)")
    , SingleJavaValue("new org.joda.time.DateTime(1, 1, 1, 0, 0, org.joda.time.DateTimeZone.UTC)")
    , SingleJavaValue("new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L)")
    )
  )

  val hasGenerics = false
}

case object `java.Timestamp?[]`
    extends JavaTimestamp with `box.OneArrayOfNullable` {

  val javaClass = "org.joda.time.DateTime[]"
  val javaType = JavaSimpleType("org.joda.time.DateTime[]")
  val javaDescription = "OneArrayOfNullableTimestamps"

  def defaultValue = SingleJavaValue("new org.joda.time.DateTime[0]")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("null")
    )
  , ArrayOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    )
  , ArrayOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L)")
    )
  , ArrayOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    , SingleJavaValue("new org.joda.time.DateTime(0)")
    , SingleJavaValue("new org.joda.time.DateTime(1, 1, 1, 0, 0, org.joda.time.DateTimeZone.UTC)")
    , SingleJavaValue("new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L)")
    )
  , ArrayOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("null")
    , SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    , SingleJavaValue("new org.joda.time.DateTime(0)")
    , SingleJavaValue("new org.joda.time.DateTime(1, 1, 1, 0, 0, org.joda.time.DateTimeZone.UTC)")
    , SingleJavaValue("new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L)")
    )
  )

  val hasGenerics = false
}

case object `java.Timestamp?[]?`
    extends JavaTimestamp with `box.NullableArrayOfNullable` {

  val javaClass = "org.joda.time.DateTime[]"
  val javaType = JavaSimpleType("org.joda.time.DateTime[]")
  val javaDescription = "NullableArrayOfNullableTimestamps"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("null")
    )
  , ArrayOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    )
  , ArrayOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L)")
    )
  , ArrayOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    , SingleJavaValue("new org.joda.time.DateTime(0)")
    , SingleJavaValue("new org.joda.time.DateTime(1, 1, 1, 0, 0, org.joda.time.DateTimeZone.UTC)")
    , SingleJavaValue("new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L)")
    )
  , ArrayOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("null")
    , SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    , SingleJavaValue("new org.joda.time.DateTime(0)")
    , SingleJavaValue("new org.joda.time.DateTime(1, 1, 1, 0, 0, org.joda.time.DateTimeZone.UTC)")
    , SingleJavaValue("new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L)")
    )
  )

  val hasGenerics = false
}

case object `java.List<Timestamp>`
    extends JavaTimestamp with `box.OneListOfOne` {

  val javaClass = "java.util.List<org.joda.time.DateTime>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("org.joda.time.DateTime"))
  val javaDescription = "OneListOfOneTimestamps"

  def defaultValue = SingleJavaValue("new java.util.ArrayList<org.joda.time.DateTime>(0)")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    )
  , ListOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L)")
    )
  , ListOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    , SingleJavaValue("new org.joda.time.DateTime(0)")
    , SingleJavaValue("new org.joda.time.DateTime(1, 1, 1, 0, 0, org.joda.time.DateTimeZone.UTC)")
    , SingleJavaValue("new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L)")
    )
  )

  val hasGenerics = true
}

case object `java.List<Timestamp>?`
    extends JavaTimestamp with `box.NullableListOfOne` {

  val javaClass = "java.util.List<org.joda.time.DateTime>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("org.joda.time.DateTime"))
  val javaDescription = "NullableListOfOneTimestamps"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    )
  , ListOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L)")
    )
  , ListOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    , SingleJavaValue("new org.joda.time.DateTime(0)")
    , SingleJavaValue("new org.joda.time.DateTime(1, 1, 1, 0, 0, org.joda.time.DateTimeZone.UTC)")
    , SingleJavaValue("new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L)")
    )
  )

  val hasGenerics = true
}

case object `java.List<Timestamp?>`
    extends JavaTimestamp with `box.OneListOfNullable` {

  val javaClass = "java.util.List<org.joda.time.DateTime>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("org.joda.time.DateTime"))
  val javaDescription = "OneListOfNullableTimestamps"

  def defaultValue = SingleJavaValue("new java.util.ArrayList<org.joda.time.DateTime>(0)")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("null")
    )
  , ListOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    )
  , ListOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L)")
    )
  , ListOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    , SingleJavaValue("new org.joda.time.DateTime(0)")
    , SingleJavaValue("new org.joda.time.DateTime(1, 1, 1, 0, 0, org.joda.time.DateTimeZone.UTC)")
    , SingleJavaValue("new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L)")
    )
  , ListOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("null")
    , SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    , SingleJavaValue("new org.joda.time.DateTime(0)")
    , SingleJavaValue("new org.joda.time.DateTime(1, 1, 1, 0, 0, org.joda.time.DateTimeZone.UTC)")
    , SingleJavaValue("new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L)")
    )
  )

  val hasGenerics = true
}

case object `java.List<Timestamp?>?`
    extends JavaTimestamp with `box.NullableListOfNullable` {

  val javaClass = "java.util.List<org.joda.time.DateTime>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("org.joda.time.DateTime"))
  val javaDescription = "NullableListOfNullableTimestamps"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("null")
    )
  , ListOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    )
  , ListOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L)")
    )
  , ListOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    , SingleJavaValue("new org.joda.time.DateTime(0)")
    , SingleJavaValue("new org.joda.time.DateTime(1, 1, 1, 0, 0, org.joda.time.DateTimeZone.UTC)")
    , SingleJavaValue("new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L)")
    )
  , ListOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("null")
    , SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    , SingleJavaValue("new org.joda.time.DateTime(0)")
    , SingleJavaValue("new org.joda.time.DateTime(1, 1, 1, 0, 0, org.joda.time.DateTimeZone.UTC)")
    , SingleJavaValue("new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L)")
    )
  )

  val hasGenerics = true
}

case object `java.Queue<Timestamp>`
    extends JavaTimestamp with `box.OneQueueOfOne` {

  val javaClass = "java.util.Queue<org.joda.time.DateTime>"
  val javaType = JavaCollectionType("java.util.Queue", JavaClass("org.joda.time.DateTime"))
  val javaDescription = "OneQueueOfOneTimestamps"

  def defaultValue = SingleJavaValue("new java.util.ArrayDeque<org.joda.time.DateTime>(0)")

  def nonDefaultValues = IndexedSeq(
    QueueOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    )
  , QueueOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L)")
    )
  , QueueOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    , SingleJavaValue("new org.joda.time.DateTime(0)")
    , SingleJavaValue("new org.joda.time.DateTime(1, 1, 1, 0, 0, org.joda.time.DateTimeZone.UTC)")
    , SingleJavaValue("new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L)")
    )
  )

  val hasGenerics = true
}

case object `java.Queue<Timestamp>?`
    extends JavaTimestamp with `box.NullableQueueOfOne` {

  val javaClass = "java.util.Queue<org.joda.time.DateTime>"
  val javaType = JavaCollectionType("java.util.Queue", JavaClass("org.joda.time.DateTime"))
  val javaDescription = "NullableQueueOfOneTimestamps"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    QueueOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    )
  , QueueOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L)")
    )
  , QueueOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    , SingleJavaValue("new org.joda.time.DateTime(0)")
    , SingleJavaValue("new org.joda.time.DateTime(1, 1, 1, 0, 0, org.joda.time.DateTimeZone.UTC)")
    , SingleJavaValue("new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L)")
    )
  )

  val hasGenerics = true
}

case object `java.Queue<Timestamp?>`
    extends JavaTimestamp with `box.OneQueueOfNullable` {

  val javaClass = "java.util.Queue<org.joda.time.DateTime>"
  val javaType = JavaCollectionType("java.util.Queue", JavaClass("org.joda.time.DateTime"))
  val javaDescription = "OneQueueOfNullableTimestamps"

  def defaultValue = SingleJavaValue("new java.util.ArrayDeque<org.joda.time.DateTime>(0)")

  def nonDefaultValues = IndexedSeq(
    QueueOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("null")
    )
  , QueueOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    )
  , QueueOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L)")
    )
  , QueueOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    , SingleJavaValue("new org.joda.time.DateTime(0)")
    , SingleJavaValue("new org.joda.time.DateTime(1, 1, 1, 0, 0, org.joda.time.DateTimeZone.UTC)")
    , SingleJavaValue("new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L)")
    )
  , QueueOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("null")
    , SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    , SingleJavaValue("new org.joda.time.DateTime(0)")
    , SingleJavaValue("new org.joda.time.DateTime(1, 1, 1, 0, 0, org.joda.time.DateTimeZone.UTC)")
    , SingleJavaValue("new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L)")
    )
  )

  val hasGenerics = true
}

case object `java.Queue<Timestamp?>?`
    extends JavaTimestamp with `box.NullableQueueOfNullable` {

  val javaClass = "java.util.Queue<org.joda.time.DateTime>"
  val javaType = JavaCollectionType("java.util.Queue", JavaClass("org.joda.time.DateTime"))
  val javaDescription = "NullableQueueOfNullableTimestamps"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    QueueOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("null")
    )
  , QueueOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    )
  , QueueOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L)")
    )
  , QueueOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    , SingleJavaValue("new org.joda.time.DateTime(0)")
    , SingleJavaValue("new org.joda.time.DateTime(1, 1, 1, 0, 0, org.joda.time.DateTimeZone.UTC)")
    , SingleJavaValue("new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L)")
    )
  , QueueOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("null")
    , SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    , SingleJavaValue("new org.joda.time.DateTime(0)")
    , SingleJavaValue("new org.joda.time.DateTime(1, 1, 1, 0, 0, org.joda.time.DateTimeZone.UTC)")
    , SingleJavaValue("new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L)")
    )
  )

  val hasGenerics = true
}

case object `java.Set<Timestamp>`
    extends JavaTimestamp with `box.OneSetOfOne` {

  val javaClass = "java.util.Set<org.joda.time.DateTime>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("org.joda.time.DateTime"))
  val javaDescription = "OneSetOfOneTimestamps"

  def defaultValue = SingleJavaValue("new java.util.HashSet<org.joda.time.DateTime>(0)")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    )
  , SetOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L)")
    )
  , SetOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    , SingleJavaValue("new org.joda.time.DateTime(0)")
    , SingleJavaValue("new org.joda.time.DateTime(1, 1, 1, 0, 0, org.joda.time.DateTimeZone.UTC)")
    , SingleJavaValue("new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L)")
    )
  )

  val hasGenerics = true
}

case object `java.Set<Timestamp>?`
    extends JavaTimestamp with `box.NullableSetOfOne` {

  val javaClass = "java.util.Set<org.joda.time.DateTime>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("org.joda.time.DateTime"))
  val javaDescription = "NullableSetOfOneTimestamps"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    )
  , SetOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L)")
    )
  , SetOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    , SingleJavaValue("new org.joda.time.DateTime(0)")
    , SingleJavaValue("new org.joda.time.DateTime(1, 1, 1, 0, 0, org.joda.time.DateTimeZone.UTC)")
    , SingleJavaValue("new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L)")
    )
  )

  val hasGenerics = true
}

case object `java.Set<Timestamp?>`
    extends JavaTimestamp with `box.OneSetOfNullable` {

  val javaClass = "java.util.Set<org.joda.time.DateTime>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("org.joda.time.DateTime"))
  val javaDescription = "OneSetOfNullableTimestamps"

  def defaultValue = SingleJavaValue("new java.util.HashSet<org.joda.time.DateTime>(0)")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("null")
    )
  , SetOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    )
  , SetOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L)")
    )
  , SetOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    , SingleJavaValue("new org.joda.time.DateTime(0)")
    , SingleJavaValue("new org.joda.time.DateTime(1, 1, 1, 0, 0, org.joda.time.DateTimeZone.UTC)")
    , SingleJavaValue("new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L)")
    )
  , SetOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("null")
    , SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    , SingleJavaValue("new org.joda.time.DateTime(0)")
    , SingleJavaValue("new org.joda.time.DateTime(1, 1, 1, 0, 0, org.joda.time.DateTimeZone.UTC)")
    , SingleJavaValue("new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L)")
    )
  )

  val hasGenerics = true
}

case object `java.Set<Timestamp?>?`
    extends JavaTimestamp with `box.NullableSetOfNullable` {

  val javaClass = "java.util.Set<org.joda.time.DateTime>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("org.joda.time.DateTime"))
  val javaDescription = "NullableSetOfNullableTimestamps"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("null")
    )
  , SetOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    )
  , SetOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L)")
    )
  , SetOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    , SingleJavaValue("new org.joda.time.DateTime(0)")
    , SingleJavaValue("new org.joda.time.DateTime(1, 1, 1, 0, 0, org.joda.time.DateTimeZone.UTC)")
    , SingleJavaValue("new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L)")
    )
  , SetOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("null")
    , SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    , SingleJavaValue("new org.joda.time.DateTime(0)")
    , SingleJavaValue("new org.joda.time.DateTime(1, 1, 1, 0, 0, org.joda.time.DateTimeZone.UTC)")
    , SingleJavaValue("new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L)")
    )
  )

  val hasGenerics = true
}
