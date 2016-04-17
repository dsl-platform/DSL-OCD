package com.dslplatform.ocd
package javas

import types._
import boxes._

sealed abstract class JavaTimestamp
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
    SingleJavaValue("new org.joda.time.DateTime(0, org.joda.time.DateTimeZone.forID(\"GMT\"))")
  , SingleJavaValue("new org.joda.time.DateTime(1, 1, 1, 0, 0, org.joda.time.DateTimeZone.UTC)")
  , SingleJavaValue("new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L, org.joda.time.DateTimeZone.forID(\"EST\"))")
  , SingleJavaValue("new org.joda.time.DateTime(2000, 3, 26, 1, 59, 59, org.joda.time.DateTimeZone.forID(\"CET\"))")
  , SingleJavaValue("new org.joda.time.DateTime(2000, 3, 26, 3, 0, 0, org.joda.time.DateTimeZone.forID(\"CET\"))")
  , SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 0, 59, 59, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
  , SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 1, 0, 0, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
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
  , SingleJavaValue("new org.joda.time.DateTime(0, org.joda.time.DateTimeZone.forID(\"GMT\"))")
  , SingleJavaValue("new org.joda.time.DateTime(1, 1, 1, 0, 0, org.joda.time.DateTimeZone.UTC)")
  , SingleJavaValue("new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L, org.joda.time.DateTimeZone.forID(\"EST\"))")
  , SingleJavaValue("new org.joda.time.DateTime(2000, 3, 26, 1, 59, 59, org.joda.time.DateTimeZone.forID(\"CET\"))")
  , SingleJavaValue("new org.joda.time.DateTime(2000, 3, 26, 3, 0, 0, org.joda.time.DateTimeZone.forID(\"CET\"))")
  , SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 0, 59, 59, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
  , SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 1, 0, 0, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
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
      SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 1, 0, 0, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    )
  , ArrayOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    , SingleJavaValue("new org.joda.time.DateTime(0, org.joda.time.DateTimeZone.forID(\"GMT\"))")
    , SingleJavaValue("new org.joda.time.DateTime(1, 1, 1, 0, 0, org.joda.time.DateTimeZone.UTC)")
    , SingleJavaValue("new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L, org.joda.time.DateTimeZone.forID(\"EST\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 3, 26, 1, 59, 59, org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 3, 26, 3, 0, 0, org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 0, 59, 59, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 1, 0, 0, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
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
      SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 1, 0, 0, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    )
  , ArrayOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    , SingleJavaValue("new org.joda.time.DateTime(0, org.joda.time.DateTimeZone.forID(\"GMT\"))")
    , SingleJavaValue("new org.joda.time.DateTime(1, 1, 1, 0, 0, org.joda.time.DateTimeZone.UTC)")
    , SingleJavaValue("new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L, org.joda.time.DateTimeZone.forID(\"EST\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 3, 26, 1, 59, 59, org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 3, 26, 3, 0, 0, org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 0, 59, 59, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 1, 0, 0, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
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
      SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 1, 0, 0, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    )
  , ArrayOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    , SingleJavaValue("new org.joda.time.DateTime(0, org.joda.time.DateTimeZone.forID(\"GMT\"))")
    , SingleJavaValue("new org.joda.time.DateTime(1, 1, 1, 0, 0, org.joda.time.DateTimeZone.UTC)")
    , SingleJavaValue("new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L, org.joda.time.DateTimeZone.forID(\"EST\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 3, 26, 1, 59, 59, org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 3, 26, 3, 0, 0, org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 0, 59, 59, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 1, 0, 0, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    )
  , ArrayOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("null")
    , SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    , SingleJavaValue("new org.joda.time.DateTime(0, org.joda.time.DateTimeZone.forID(\"GMT\"))")
    , SingleJavaValue("new org.joda.time.DateTime(1, 1, 1, 0, 0, org.joda.time.DateTimeZone.UTC)")
    , SingleJavaValue("new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L, org.joda.time.DateTimeZone.forID(\"EST\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 3, 26, 1, 59, 59, org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 3, 26, 3, 0, 0, org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 0, 59, 59, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 1, 0, 0, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
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
      SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 1, 0, 0, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    )
  , ArrayOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    , SingleJavaValue("new org.joda.time.DateTime(0, org.joda.time.DateTimeZone.forID(\"GMT\"))")
    , SingleJavaValue("new org.joda.time.DateTime(1, 1, 1, 0, 0, org.joda.time.DateTimeZone.UTC)")
    , SingleJavaValue("new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L, org.joda.time.DateTimeZone.forID(\"EST\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 3, 26, 1, 59, 59, org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 3, 26, 3, 0, 0, org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 0, 59, 59, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 1, 0, 0, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    )
  , ArrayOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("null")
    , SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    , SingleJavaValue("new org.joda.time.DateTime(0, org.joda.time.DateTimeZone.forID(\"GMT\"))")
    , SingleJavaValue("new org.joda.time.DateTime(1, 1, 1, 0, 0, org.joda.time.DateTimeZone.UTC)")
    , SingleJavaValue("new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L, org.joda.time.DateTimeZone.forID(\"EST\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 3, 26, 1, 59, 59, org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 3, 26, 3, 0, 0, org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 0, 59, 59, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 1, 0, 0, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
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
      SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 1, 0, 0, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    )
  , ListOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    , SingleJavaValue("new org.joda.time.DateTime(0, org.joda.time.DateTimeZone.forID(\"GMT\"))")
    , SingleJavaValue("new org.joda.time.DateTime(1, 1, 1, 0, 0, org.joda.time.DateTimeZone.UTC)")
    , SingleJavaValue("new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L, org.joda.time.DateTimeZone.forID(\"EST\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 3, 26, 1, 59, 59, org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 3, 26, 3, 0, 0, org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 0, 59, 59, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 1, 0, 0, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
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
      SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 1, 0, 0, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    )
  , ListOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    , SingleJavaValue("new org.joda.time.DateTime(0, org.joda.time.DateTimeZone.forID(\"GMT\"))")
    , SingleJavaValue("new org.joda.time.DateTime(1, 1, 1, 0, 0, org.joda.time.DateTimeZone.UTC)")
    , SingleJavaValue("new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L, org.joda.time.DateTimeZone.forID(\"EST\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 3, 26, 1, 59, 59, org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 3, 26, 3, 0, 0, org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 0, 59, 59, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 1, 0, 0, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
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
      SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 1, 0, 0, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    )
  , ListOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    , SingleJavaValue("new org.joda.time.DateTime(0, org.joda.time.DateTimeZone.forID(\"GMT\"))")
    , SingleJavaValue("new org.joda.time.DateTime(1, 1, 1, 0, 0, org.joda.time.DateTimeZone.UTC)")
    , SingleJavaValue("new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L, org.joda.time.DateTimeZone.forID(\"EST\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 3, 26, 1, 59, 59, org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 3, 26, 3, 0, 0, org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 0, 59, 59, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 1, 0, 0, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    )
  , ListOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("null")
    , SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    , SingleJavaValue("new org.joda.time.DateTime(0, org.joda.time.DateTimeZone.forID(\"GMT\"))")
    , SingleJavaValue("new org.joda.time.DateTime(1, 1, 1, 0, 0, org.joda.time.DateTimeZone.UTC)")
    , SingleJavaValue("new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L, org.joda.time.DateTimeZone.forID(\"EST\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 3, 26, 1, 59, 59, org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 3, 26, 3, 0, 0, org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 0, 59, 59, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 1, 0, 0, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
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
      SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 1, 0, 0, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    )
  , ListOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    , SingleJavaValue("new org.joda.time.DateTime(0, org.joda.time.DateTimeZone.forID(\"GMT\"))")
    , SingleJavaValue("new org.joda.time.DateTime(1, 1, 1, 0, 0, org.joda.time.DateTimeZone.UTC)")
    , SingleJavaValue("new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L, org.joda.time.DateTimeZone.forID(\"EST\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 3, 26, 1, 59, 59, org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 3, 26, 3, 0, 0, org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 0, 59, 59, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 1, 0, 0, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    )
  , ListOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("null")
    , SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    , SingleJavaValue("new org.joda.time.DateTime(0, org.joda.time.DateTimeZone.forID(\"GMT\"))")
    , SingleJavaValue("new org.joda.time.DateTime(1, 1, 1, 0, 0, org.joda.time.DateTimeZone.UTC)")
    , SingleJavaValue("new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L, org.joda.time.DateTimeZone.forID(\"EST\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 3, 26, 1, 59, 59, org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 3, 26, 3, 0, 0, org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 0, 59, 59, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 1, 0, 0, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
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
      SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 1, 0, 0, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    )
  , SetOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    , SingleJavaValue("new org.joda.time.DateTime(0, org.joda.time.DateTimeZone.forID(\"GMT\"))")
    , SingleJavaValue("new org.joda.time.DateTime(1, 1, 1, 0, 0, org.joda.time.DateTimeZone.UTC)")
    , SingleJavaValue("new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L, org.joda.time.DateTimeZone.forID(\"EST\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 3, 26, 1, 59, 59, org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 3, 26, 3, 0, 0, org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 0, 59, 59, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 1, 0, 0, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
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
      SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 1, 0, 0, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    )
  , SetOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    , SingleJavaValue("new org.joda.time.DateTime(0, org.joda.time.DateTimeZone.forID(\"GMT\"))")
    , SingleJavaValue("new org.joda.time.DateTime(1, 1, 1, 0, 0, org.joda.time.DateTimeZone.UTC)")
    , SingleJavaValue("new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L, org.joda.time.DateTimeZone.forID(\"EST\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 3, 26, 1, 59, 59, org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 3, 26, 3, 0, 0, org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 0, 59, 59, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 1, 0, 0, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
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
      SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 1, 0, 0, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    )
  , SetOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    , SingleJavaValue("new org.joda.time.DateTime(0, org.joda.time.DateTimeZone.forID(\"GMT\"))")
    , SingleJavaValue("new org.joda.time.DateTime(1, 1, 1, 0, 0, org.joda.time.DateTimeZone.UTC)")
    , SingleJavaValue("new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L, org.joda.time.DateTimeZone.forID(\"EST\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 3, 26, 1, 59, 59, org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 3, 26, 3, 0, 0, org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 0, 59, 59, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 1, 0, 0, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    )
  , SetOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("null")
    , SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    , SingleJavaValue("new org.joda.time.DateTime(0, org.joda.time.DateTimeZone.forID(\"GMT\"))")
    , SingleJavaValue("new org.joda.time.DateTime(1, 1, 1, 0, 0, org.joda.time.DateTimeZone.UTC)")
    , SingleJavaValue("new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L, org.joda.time.DateTimeZone.forID(\"EST\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 3, 26, 1, 59, 59, org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 3, 26, 3, 0, 0, org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 0, 59, 59, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 1, 0, 0, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
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
      SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 1, 0, 0, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    )
  , SetOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    , SingleJavaValue("new org.joda.time.DateTime(0, org.joda.time.DateTimeZone.forID(\"GMT\"))")
    , SingleJavaValue("new org.joda.time.DateTime(1, 1, 1, 0, 0, org.joda.time.DateTimeZone.UTC)")
    , SingleJavaValue("new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L, org.joda.time.DateTimeZone.forID(\"EST\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 3, 26, 1, 59, 59, org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 3, 26, 3, 0, 0, org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 0, 59, 59, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 1, 0, 0, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    )
  , SetOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("null")
    , SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    , SingleJavaValue("new org.joda.time.DateTime(0, org.joda.time.DateTimeZone.forID(\"GMT\"))")
    , SingleJavaValue("new org.joda.time.DateTime(1, 1, 1, 0, 0, org.joda.time.DateTimeZone.UTC)")
    , SingleJavaValue("new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L, org.joda.time.DateTimeZone.forID(\"EST\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 3, 26, 1, 59, 59, org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 3, 26, 3, 0, 0, org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 0, 59, 59, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 1, 0, 0, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
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
      SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 1, 0, 0, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    )
  , QueueOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    , SingleJavaValue("new org.joda.time.DateTime(0, org.joda.time.DateTimeZone.forID(\"GMT\"))")
    , SingleJavaValue("new org.joda.time.DateTime(1, 1, 1, 0, 0, org.joda.time.DateTimeZone.UTC)")
    , SingleJavaValue("new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L, org.joda.time.DateTimeZone.forID(\"EST\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 3, 26, 1, 59, 59, org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 3, 26, 3, 0, 0, org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 0, 59, 59, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 1, 0, 0, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
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
      SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 1, 0, 0, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    )
  , QueueOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    , SingleJavaValue("new org.joda.time.DateTime(0, org.joda.time.DateTimeZone.forID(\"GMT\"))")
    , SingleJavaValue("new org.joda.time.DateTime(1, 1, 1, 0, 0, org.joda.time.DateTimeZone.UTC)")
    , SingleJavaValue("new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L, org.joda.time.DateTimeZone.forID(\"EST\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 3, 26, 1, 59, 59, org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 3, 26, 3, 0, 0, org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 0, 59, 59, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 1, 0, 0, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
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
      SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 1, 0, 0, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    )
  , QueueOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    , SingleJavaValue("new org.joda.time.DateTime(0, org.joda.time.DateTimeZone.forID(\"GMT\"))")
    , SingleJavaValue("new org.joda.time.DateTime(1, 1, 1, 0, 0, org.joda.time.DateTimeZone.UTC)")
    , SingleJavaValue("new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L, org.joda.time.DateTimeZone.forID(\"EST\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 3, 26, 1, 59, 59, org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 3, 26, 3, 0, 0, org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 0, 59, 59, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 1, 0, 0, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    )
  , QueueOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("null")
    , SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    , SingleJavaValue("new org.joda.time.DateTime(0, org.joda.time.DateTimeZone.forID(\"GMT\"))")
    , SingleJavaValue("new org.joda.time.DateTime(1, 1, 1, 0, 0, org.joda.time.DateTimeZone.UTC)")
    , SingleJavaValue("new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L, org.joda.time.DateTimeZone.forID(\"EST\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 3, 26, 1, 59, 59, org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 3, 26, 3, 0, 0, org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 0, 59, 59, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 1, 0, 0, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
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
      SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 1, 0, 0, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    )
  , QueueOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    , SingleJavaValue("new org.joda.time.DateTime(0, org.joda.time.DateTimeZone.forID(\"GMT\"))")
    , SingleJavaValue("new org.joda.time.DateTime(1, 1, 1, 0, 0, org.joda.time.DateTimeZone.UTC)")
    , SingleJavaValue("new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L, org.joda.time.DateTimeZone.forID(\"EST\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 3, 26, 1, 59, 59, org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 3, 26, 3, 0, 0, org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 0, 59, 59, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 1, 0, 0, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    )
  , QueueOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("null")
    , SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    , SingleJavaValue("new org.joda.time.DateTime(0, org.joda.time.DateTimeZone.forID(\"GMT\"))")
    , SingleJavaValue("new org.joda.time.DateTime(1, 1, 1, 0, 0, org.joda.time.DateTimeZone.UTC)")
    , SingleJavaValue("new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L, org.joda.time.DateTimeZone.forID(\"EST\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 3, 26, 1, 59, 59, org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 3, 26, 3, 0, 0, org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 0, 59, 59, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 1, 0, 0, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    )
  )

  val hasGenerics = true
}

case object `java.LinkedList<Timestamp>`
    extends JavaTimestamp with `box.OneLinkedListOfOne` {

  val javaClass = "java.util.LinkedList<org.joda.time.DateTime>"
  val javaType = JavaCollectionType("java.util.LinkedList", JavaClass("org.joda.time.DateTime"))
  val javaDescription = "OneLinkedListOfOneTimestamps"

  def defaultValue = SingleJavaValue("new java.util.LinkedList<org.joda.time.DateTime>()")

  def nonDefaultValues = IndexedSeq(
    LinkedListOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    )
  , LinkedListOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 1, 0, 0, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    )
  , LinkedListOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    , SingleJavaValue("new org.joda.time.DateTime(0, org.joda.time.DateTimeZone.forID(\"GMT\"))")
    , SingleJavaValue("new org.joda.time.DateTime(1, 1, 1, 0, 0, org.joda.time.DateTimeZone.UTC)")
    , SingleJavaValue("new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L, org.joda.time.DateTimeZone.forID(\"EST\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 3, 26, 1, 59, 59, org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 3, 26, 3, 0, 0, org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 0, 59, 59, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 1, 0, 0, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    )
  )

  val hasGenerics = true
}

case object `java.LinkedList<Timestamp>?`
    extends JavaTimestamp with `box.NullableLinkedListOfOne` {

  val javaClass = "java.util.LinkedList<org.joda.time.DateTime>"
  val javaType = JavaCollectionType("java.util.LinkedList", JavaClass("org.joda.time.DateTime"))
  val javaDescription = "NullableLinkedListOfOneTimestamps"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    LinkedListOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    )
  , LinkedListOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 1, 0, 0, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    )
  , LinkedListOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    , SingleJavaValue("new org.joda.time.DateTime(0, org.joda.time.DateTimeZone.forID(\"GMT\"))")
    , SingleJavaValue("new org.joda.time.DateTime(1, 1, 1, 0, 0, org.joda.time.DateTimeZone.UTC)")
    , SingleJavaValue("new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L, org.joda.time.DateTimeZone.forID(\"EST\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 3, 26, 1, 59, 59, org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 3, 26, 3, 0, 0, org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 0, 59, 59, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 1, 0, 0, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    )
  )

  val hasGenerics = true
}

case object `java.LinkedList<Timestamp?>`
    extends JavaTimestamp with `box.OneLinkedListOfNullable` {

  val javaClass = "java.util.LinkedList<org.joda.time.DateTime>"
  val javaType = JavaCollectionType("java.util.LinkedList", JavaClass("org.joda.time.DateTime"))
  val javaDescription = "OneLinkedListOfNullableTimestamps"

  def defaultValue = SingleJavaValue("new java.util.LinkedList<org.joda.time.DateTime>()")

  def nonDefaultValues = IndexedSeq(
    LinkedListOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("null")
    )
  , LinkedListOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    )
  , LinkedListOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 1, 0, 0, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    )
  , LinkedListOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    , SingleJavaValue("new org.joda.time.DateTime(0, org.joda.time.DateTimeZone.forID(\"GMT\"))")
    , SingleJavaValue("new org.joda.time.DateTime(1, 1, 1, 0, 0, org.joda.time.DateTimeZone.UTC)")
    , SingleJavaValue("new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L, org.joda.time.DateTimeZone.forID(\"EST\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 3, 26, 1, 59, 59, org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 3, 26, 3, 0, 0, org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 0, 59, 59, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 1, 0, 0, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    )
  , LinkedListOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("null")
    , SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    , SingleJavaValue("new org.joda.time.DateTime(0, org.joda.time.DateTimeZone.forID(\"GMT\"))")
    , SingleJavaValue("new org.joda.time.DateTime(1, 1, 1, 0, 0, org.joda.time.DateTimeZone.UTC)")
    , SingleJavaValue("new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L, org.joda.time.DateTimeZone.forID(\"EST\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 3, 26, 1, 59, 59, org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 3, 26, 3, 0, 0, org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 0, 59, 59, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 1, 0, 0, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    )
  )

  val hasGenerics = true
}

case object `java.LinkedList<Timestamp?>?`
    extends JavaTimestamp with `box.NullableLinkedListOfNullable` {

  val javaClass = "java.util.LinkedList<org.joda.time.DateTime>"
  val javaType = JavaCollectionType("java.util.LinkedList", JavaClass("org.joda.time.DateTime"))
  val javaDescription = "NullableLinkedListOfNullableTimestamps"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    LinkedListOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("null")
    )
  , LinkedListOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    )
  , LinkedListOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 1, 0, 0, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    )
  , LinkedListOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    , SingleJavaValue("new org.joda.time.DateTime(0, org.joda.time.DateTimeZone.forID(\"GMT\"))")
    , SingleJavaValue("new org.joda.time.DateTime(1, 1, 1, 0, 0, org.joda.time.DateTimeZone.UTC)")
    , SingleJavaValue("new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L, org.joda.time.DateTimeZone.forID(\"EST\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 3, 26, 1, 59, 59, org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 3, 26, 3, 0, 0, org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 0, 59, 59, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 1, 0, 0, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    )
  , LinkedListOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("null")
    , SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    , SingleJavaValue("new org.joda.time.DateTime(0, org.joda.time.DateTimeZone.forID(\"GMT\"))")
    , SingleJavaValue("new org.joda.time.DateTime(1, 1, 1, 0, 0, org.joda.time.DateTimeZone.UTC)")
    , SingleJavaValue("new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L, org.joda.time.DateTimeZone.forID(\"EST\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 3, 26, 1, 59, 59, org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 3, 26, 3, 0, 0, org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 0, 59, 59, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 1, 0, 0, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    )
  )

  val hasGenerics = true
}

case object `java.Stack<Timestamp>`
    extends JavaTimestamp with `box.OneStackOfOne` {

  val javaClass = "java.util.Stack<org.joda.time.DateTime>"
  val javaType = JavaCollectionType("java.util.Stack", JavaClass("org.joda.time.DateTime"))
  val javaDescription = "OneStackOfOneTimestamps"

  def defaultValue = SingleJavaValue("new java.util.Stack<org.joda.time.DateTime>()")

  def nonDefaultValues = IndexedSeq(
    StackOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    )
  , StackOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 1, 0, 0, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    )
  , StackOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    , SingleJavaValue("new org.joda.time.DateTime(0, org.joda.time.DateTimeZone.forID(\"GMT\"))")
    , SingleJavaValue("new org.joda.time.DateTime(1, 1, 1, 0, 0, org.joda.time.DateTimeZone.UTC)")
    , SingleJavaValue("new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L, org.joda.time.DateTimeZone.forID(\"EST\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 3, 26, 1, 59, 59, org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 3, 26, 3, 0, 0, org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 0, 59, 59, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 1, 0, 0, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    )
  )

  val hasGenerics = true
}

case object `java.Stack<Timestamp>?`
    extends JavaTimestamp with `box.NullableStackOfOne` {

  val javaClass = "java.util.Stack<org.joda.time.DateTime>"
  val javaType = JavaCollectionType("java.util.Stack", JavaClass("org.joda.time.DateTime"))
  val javaDescription = "NullableStackOfOneTimestamps"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    StackOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    )
  , StackOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 1, 0, 0, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    )
  , StackOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    , SingleJavaValue("new org.joda.time.DateTime(0, org.joda.time.DateTimeZone.forID(\"GMT\"))")
    , SingleJavaValue("new org.joda.time.DateTime(1, 1, 1, 0, 0, org.joda.time.DateTimeZone.UTC)")
    , SingleJavaValue("new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L, org.joda.time.DateTimeZone.forID(\"EST\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 3, 26, 1, 59, 59, org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 3, 26, 3, 0, 0, org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 0, 59, 59, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 1, 0, 0, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    )
  )

  val hasGenerics = true
}

case object `java.Stack<Timestamp?>`
    extends JavaTimestamp with `box.OneStackOfNullable` {

  val javaClass = "java.util.Stack<org.joda.time.DateTime>"
  val javaType = JavaCollectionType("java.util.Stack", JavaClass("org.joda.time.DateTime"))
  val javaDescription = "OneStackOfNullableTimestamps"

  def defaultValue = SingleJavaValue("new java.util.Stack<org.joda.time.DateTime>()")

  def nonDefaultValues = IndexedSeq(
    StackOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("null")
    )
  , StackOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    )
  , StackOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 1, 0, 0, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    )
  , StackOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    , SingleJavaValue("new org.joda.time.DateTime(0, org.joda.time.DateTimeZone.forID(\"GMT\"))")
    , SingleJavaValue("new org.joda.time.DateTime(1, 1, 1, 0, 0, org.joda.time.DateTimeZone.UTC)")
    , SingleJavaValue("new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L, org.joda.time.DateTimeZone.forID(\"EST\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 3, 26, 1, 59, 59, org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 3, 26, 3, 0, 0, org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 0, 59, 59, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 1, 0, 0, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    )
  , StackOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("null")
    , SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    , SingleJavaValue("new org.joda.time.DateTime(0, org.joda.time.DateTimeZone.forID(\"GMT\"))")
    , SingleJavaValue("new org.joda.time.DateTime(1, 1, 1, 0, 0, org.joda.time.DateTimeZone.UTC)")
    , SingleJavaValue("new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L, org.joda.time.DateTimeZone.forID(\"EST\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 3, 26, 1, 59, 59, org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 3, 26, 3, 0, 0, org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 0, 59, 59, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 1, 0, 0, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    )
  )

  val hasGenerics = true
}

case object `java.Stack<Timestamp?>?`
    extends JavaTimestamp with `box.NullableStackOfNullable` {

  val javaClass = "java.util.Stack<org.joda.time.DateTime>"
  val javaType = JavaCollectionType("java.util.Stack", JavaClass("org.joda.time.DateTime"))
  val javaDescription = "NullableStackOfNullableTimestamps"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    StackOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("null")
    )
  , StackOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    )
  , StackOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 1, 0, 0, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    )
  , StackOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    , SingleJavaValue("new org.joda.time.DateTime(0, org.joda.time.DateTimeZone.forID(\"GMT\"))")
    , SingleJavaValue("new org.joda.time.DateTime(1, 1, 1, 0, 0, org.joda.time.DateTimeZone.UTC)")
    , SingleJavaValue("new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L, org.joda.time.DateTimeZone.forID(\"EST\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 3, 26, 1, 59, 59, org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 3, 26, 3, 0, 0, org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 0, 59, 59, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 1, 0, 0, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    )
  , StackOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("null")
    , SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    , SingleJavaValue("new org.joda.time.DateTime(0, org.joda.time.DateTimeZone.forID(\"GMT\"))")
    , SingleJavaValue("new org.joda.time.DateTime(1, 1, 1, 0, 0, org.joda.time.DateTimeZone.UTC)")
    , SingleJavaValue("new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L, org.joda.time.DateTimeZone.forID(\"EST\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 3, 26, 1, 59, 59, org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 3, 26, 3, 0, 0, org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 0, 59, 59, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 1, 0, 0, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    )
  )

  val hasGenerics = true
}

case object `java.Vector<Timestamp>`
    extends JavaTimestamp with `box.OneVectorOfOne` {

  val javaClass = "java.util.Vector<org.joda.time.DateTime>"
  val javaType = JavaCollectionType("java.util.Vector", JavaClass("org.joda.time.DateTime"))
  val javaDescription = "OneVectorOfOneTimestamps"

  def defaultValue = SingleJavaValue("new java.util.Vector<org.joda.time.DateTime>(0)")

  def nonDefaultValues = IndexedSeq(
    VectorOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    )
  , VectorOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 1, 0, 0, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    )
  , VectorOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    , SingleJavaValue("new org.joda.time.DateTime(0, org.joda.time.DateTimeZone.forID(\"GMT\"))")
    , SingleJavaValue("new org.joda.time.DateTime(1, 1, 1, 0, 0, org.joda.time.DateTimeZone.UTC)")
    , SingleJavaValue("new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L, org.joda.time.DateTimeZone.forID(\"EST\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 3, 26, 1, 59, 59, org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 3, 26, 3, 0, 0, org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 0, 59, 59, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 1, 0, 0, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    )
  )

  val hasGenerics = true
}

case object `java.Vector<Timestamp>?`
    extends JavaTimestamp with `box.NullableVectorOfOne` {

  val javaClass = "java.util.Vector<org.joda.time.DateTime>"
  val javaType = JavaCollectionType("java.util.Vector", JavaClass("org.joda.time.DateTime"))
  val javaDescription = "NullableVectorOfOneTimestamps"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    VectorOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    )
  , VectorOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 1, 0, 0, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    )
  , VectorOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    , SingleJavaValue("new org.joda.time.DateTime(0, org.joda.time.DateTimeZone.forID(\"GMT\"))")
    , SingleJavaValue("new org.joda.time.DateTime(1, 1, 1, 0, 0, org.joda.time.DateTimeZone.UTC)")
    , SingleJavaValue("new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L, org.joda.time.DateTimeZone.forID(\"EST\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 3, 26, 1, 59, 59, org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 3, 26, 3, 0, 0, org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 0, 59, 59, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 1, 0, 0, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    )
  )

  val hasGenerics = true
}

case object `java.Vector<Timestamp?>`
    extends JavaTimestamp with `box.OneVectorOfNullable` {

  val javaClass = "java.util.Vector<org.joda.time.DateTime>"
  val javaType = JavaCollectionType("java.util.Vector", JavaClass("org.joda.time.DateTime"))
  val javaDescription = "OneVectorOfNullableTimestamps"

  def defaultValue = SingleJavaValue("new java.util.Vector<org.joda.time.DateTime>(0)")

  def nonDefaultValues = IndexedSeq(
    VectorOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("null")
    )
  , VectorOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    )
  , VectorOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 1, 0, 0, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    )
  , VectorOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    , SingleJavaValue("new org.joda.time.DateTime(0, org.joda.time.DateTimeZone.forID(\"GMT\"))")
    , SingleJavaValue("new org.joda.time.DateTime(1, 1, 1, 0, 0, org.joda.time.DateTimeZone.UTC)")
    , SingleJavaValue("new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L, org.joda.time.DateTimeZone.forID(\"EST\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 3, 26, 1, 59, 59, org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 3, 26, 3, 0, 0, org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 0, 59, 59, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 1, 0, 0, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    )
  , VectorOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("null")
    , SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    , SingleJavaValue("new org.joda.time.DateTime(0, org.joda.time.DateTimeZone.forID(\"GMT\"))")
    , SingleJavaValue("new org.joda.time.DateTime(1, 1, 1, 0, 0, org.joda.time.DateTimeZone.UTC)")
    , SingleJavaValue("new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L, org.joda.time.DateTimeZone.forID(\"EST\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 3, 26, 1, 59, 59, org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 3, 26, 3, 0, 0, org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 0, 59, 59, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 1, 0, 0, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    )
  )

  val hasGenerics = true
}

case object `java.Vector<Timestamp?>?`
    extends JavaTimestamp with `box.NullableVectorOfNullable` {

  val javaClass = "java.util.Vector<org.joda.time.DateTime>"
  val javaType = JavaCollectionType("java.util.Vector", JavaClass("org.joda.time.DateTime"))
  val javaDescription = "NullableVectorOfNullableTimestamps"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    VectorOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("null")
    )
  , VectorOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    )
  , VectorOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 1, 0, 0, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    )
  , VectorOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    , SingleJavaValue("new org.joda.time.DateTime(0, org.joda.time.DateTimeZone.forID(\"GMT\"))")
    , SingleJavaValue("new org.joda.time.DateTime(1, 1, 1, 0, 0, org.joda.time.DateTimeZone.UTC)")
    , SingleJavaValue("new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L, org.joda.time.DateTimeZone.forID(\"EST\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 3, 26, 1, 59, 59, org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 3, 26, 3, 0, 0, org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 0, 59, 59, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 1, 0, 0, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    )
  , VectorOfJavaValues("org.joda.time.DateTime",
      SingleJavaValue("null")
    , SingleJavaValue("org.joda.time.DateTime.now()", Unstable)
    , SingleJavaValue("new org.joda.time.DateTime(0, org.joda.time.DateTimeZone.forID(\"GMT\"))")
    , SingleJavaValue("new org.joda.time.DateTime(1, 1, 1, 0, 0, org.joda.time.DateTimeZone.UTC)")
    , SingleJavaValue("new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L, org.joda.time.DateTimeZone.forID(\"EST\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 3, 26, 1, 59, 59, org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 3, 26, 3, 0, 0, org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 0, 59, 59, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    , SingleJavaValue("new org.joda.time.DateTime(2000, 10, 29, 1, 0, 0, org.joda.time.DateTimeZone.UTC).withZone(org.joda.time.DateTimeZone.forID(\"CET\"))")
    )
  )

  val hasGenerics = true
}
