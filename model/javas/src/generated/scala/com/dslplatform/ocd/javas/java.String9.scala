package com.dslplatform.ocd
package javas

import types._
import boxes._

sealed trait JavaStringWithMaxLengthOf9
    extends OcdJavaBoxType
    with `type.String(9)` {

  val isPrecise = false
  val isPrimitive = false
  val isEqualable = true
}

case object `java.String(9)`
    extends JavaStringWithMaxLengthOf9 with `box.One` {

  val javaClass = "String"
  val javaType = JavaSimpleType("String")
  val javaDescription = "OneStringWithMaxLengthOf9"

  def defaultValue = SingleJavaValue("\"\"")

  def nonDefaultValues = IndexedSeq(
    SingleJavaValue("\"\\\"\"")
  , SingleJavaValue("\"'/\\\\[](){}\"")
  , SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\"")
  , SingleJavaValue("\"xxxxxxxxx\"")
  )

  val hasGenerics = false
}

case object `java.String(9)?`
    extends JavaStringWithMaxLengthOf9 with `box.Nullable` {

  val javaClass = "String"
  val javaType = JavaSimpleType("String")
  val javaDescription = "NullableStringWithMaxLengthOf9"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    SingleJavaValue("\"\"")
  , SingleJavaValue("\"\\\"\"")
  , SingleJavaValue("\"'/\\\\[](){}\"")
  , SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\"")
  , SingleJavaValue("\"xxxxxxxxx\"")
  )

  val hasGenerics = false
}

case object `java.String(9)[]`
    extends JavaStringWithMaxLengthOf9 with `box.OneArrayOfOne` {

  val javaClass = "String[]"
  val javaType = JavaSimpleType("String[]")
  val javaDescription = "OneArrayOfOneStringsWithMaxLengthOf9"

  def defaultValue = SingleJavaValue("new String[0]")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("String",
      SingleJavaValue("\"\"")
    )
  , ArrayOfJavaValues("String",
      SingleJavaValue("\"xxxxxxxxx\"")
    )
  , ArrayOfJavaValues("String",
      SingleJavaValue("\"\"")
    , SingleJavaValue("\"\\\"\"")
    , SingleJavaValue("\"'/\\\\[](){}\"")
    , SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\"")
    , SingleJavaValue("\"xxxxxxxxx\"")
    )
  )

  val hasGenerics = false
}

case object `java.String(9)[]?`
    extends JavaStringWithMaxLengthOf9 with `box.NullableArrayOfOne` {

  val javaClass = "String[]"
  val javaType = JavaSimpleType("String[]")
  val javaDescription = "NullableArrayOfOneStringsWithMaxLengthOf9"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("String",
      SingleJavaValue("\"\"")
    )
  , ArrayOfJavaValues("String",
      SingleJavaValue("\"xxxxxxxxx\"")
    )
  , ArrayOfJavaValues("String",
      SingleJavaValue("\"\"")
    , SingleJavaValue("\"\\\"\"")
    , SingleJavaValue("\"'/\\\\[](){}\"")
    , SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\"")
    , SingleJavaValue("\"xxxxxxxxx\"")
    )
  )

  val hasGenerics = false
}

case object `java.String(9)?[]`
    extends JavaStringWithMaxLengthOf9 with `box.OneArrayOfNullable` {

  val javaClass = "String[]"
  val javaType = JavaSimpleType("String[]")
  val javaDescription = "OneArrayOfNullableStringsWithMaxLengthOf9"

  def defaultValue = SingleJavaValue("new String[0]")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("String",
      SingleJavaValue("null")
    )
  , ArrayOfJavaValues("String",
      SingleJavaValue("\"\"")
    )
  , ArrayOfJavaValues("String",
      SingleJavaValue("\"xxxxxxxxx\"")
    )
  , ArrayOfJavaValues("String",
      SingleJavaValue("\"\"")
    , SingleJavaValue("\"\\\"\"")
    , SingleJavaValue("\"'/\\\\[](){}\"")
    , SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\"")
    , SingleJavaValue("\"xxxxxxxxx\"")
    )
  , ArrayOfJavaValues("String",
      SingleJavaValue("null")
    , SingleJavaValue("\"\"")
    , SingleJavaValue("\"\\\"\"")
    , SingleJavaValue("\"'/\\\\[](){}\"")
    , SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\"")
    , SingleJavaValue("\"xxxxxxxxx\"")
    )
  )

  val hasGenerics = false
}

case object `java.String(9)?[]?`
    extends JavaStringWithMaxLengthOf9 with `box.NullableArrayOfNullable` {

  val javaClass = "String[]"
  val javaType = JavaSimpleType("String[]")
  val javaDescription = "NullableArrayOfNullableStringsWithMaxLengthOf9"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("String",
      SingleJavaValue("null")
    )
  , ArrayOfJavaValues("String",
      SingleJavaValue("\"\"")
    )
  , ArrayOfJavaValues("String",
      SingleJavaValue("\"xxxxxxxxx\"")
    )
  , ArrayOfJavaValues("String",
      SingleJavaValue("\"\"")
    , SingleJavaValue("\"\\\"\"")
    , SingleJavaValue("\"'/\\\\[](){}\"")
    , SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\"")
    , SingleJavaValue("\"xxxxxxxxx\"")
    )
  , ArrayOfJavaValues("String",
      SingleJavaValue("null")
    , SingleJavaValue("\"\"")
    , SingleJavaValue("\"\\\"\"")
    , SingleJavaValue("\"'/\\\\[](){}\"")
    , SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\"")
    , SingleJavaValue("\"xxxxxxxxx\"")
    )
  )

  val hasGenerics = false
}

case object `java.List<String(9)>`
    extends JavaStringWithMaxLengthOf9 with `box.OneListOfOne` {

  val javaClass = "java.util.List<String>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("String"))
  val javaDescription = "OneListOfOneStringsWithMaxLengthOf9"

  def defaultValue = SingleJavaValue("new java.util.ArrayList<String>(0)")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("String",
      SingleJavaValue("\"\"")
    )
  , ListOfJavaValues("String",
      SingleJavaValue("\"xxxxxxxxx\"")
    )
  , ListOfJavaValues("String",
      SingleJavaValue("\"\"")
    , SingleJavaValue("\"\\\"\"")
    , SingleJavaValue("\"'/\\\\[](){}\"")
    , SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\"")
    , SingleJavaValue("\"xxxxxxxxx\"")
    )
  )

  val hasGenerics = true
}

case object `java.List<String(9)>?`
    extends JavaStringWithMaxLengthOf9 with `box.NullableListOfOne` {

  val javaClass = "java.util.List<String>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("String"))
  val javaDescription = "NullableListOfOneStringsWithMaxLengthOf9"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("String",
      SingleJavaValue("\"\"")
    )
  , ListOfJavaValues("String",
      SingleJavaValue("\"xxxxxxxxx\"")
    )
  , ListOfJavaValues("String",
      SingleJavaValue("\"\"")
    , SingleJavaValue("\"\\\"\"")
    , SingleJavaValue("\"'/\\\\[](){}\"")
    , SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\"")
    , SingleJavaValue("\"xxxxxxxxx\"")
    )
  )

  val hasGenerics = true
}

case object `java.List<String(9)?>`
    extends JavaStringWithMaxLengthOf9 with `box.OneListOfNullable` {

  val javaClass = "java.util.List<String>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("String"))
  val javaDescription = "OneListOfNullableStringsWithMaxLengthOf9"

  def defaultValue = SingleJavaValue("new java.util.ArrayList<String>(0)")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("String",
      SingleJavaValue("null")
    )
  , ListOfJavaValues("String",
      SingleJavaValue("\"\"")
    )
  , ListOfJavaValues("String",
      SingleJavaValue("\"xxxxxxxxx\"")
    )
  , ListOfJavaValues("String",
      SingleJavaValue("\"\"")
    , SingleJavaValue("\"\\\"\"")
    , SingleJavaValue("\"'/\\\\[](){}\"")
    , SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\"")
    , SingleJavaValue("\"xxxxxxxxx\"")
    )
  , ListOfJavaValues("String",
      SingleJavaValue("null")
    , SingleJavaValue("\"\"")
    , SingleJavaValue("\"\\\"\"")
    , SingleJavaValue("\"'/\\\\[](){}\"")
    , SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\"")
    , SingleJavaValue("\"xxxxxxxxx\"")
    )
  )

  val hasGenerics = true
}

case object `java.List<String(9)?>?`
    extends JavaStringWithMaxLengthOf9 with `box.NullableListOfNullable` {

  val javaClass = "java.util.List<String>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("String"))
  val javaDescription = "NullableListOfNullableStringsWithMaxLengthOf9"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("String",
      SingleJavaValue("null")
    )
  , ListOfJavaValues("String",
      SingleJavaValue("\"\"")
    )
  , ListOfJavaValues("String",
      SingleJavaValue("\"xxxxxxxxx\"")
    )
  , ListOfJavaValues("String",
      SingleJavaValue("\"\"")
    , SingleJavaValue("\"\\\"\"")
    , SingleJavaValue("\"'/\\\\[](){}\"")
    , SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\"")
    , SingleJavaValue("\"xxxxxxxxx\"")
    )
  , ListOfJavaValues("String",
      SingleJavaValue("null")
    , SingleJavaValue("\"\"")
    , SingleJavaValue("\"\\\"\"")
    , SingleJavaValue("\"'/\\\\[](){}\"")
    , SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\"")
    , SingleJavaValue("\"xxxxxxxxx\"")
    )
  )

  val hasGenerics = true
}

case object `java.Set<String(9)>`
    extends JavaStringWithMaxLengthOf9 with `box.OneSetOfOne` {

  val javaClass = "java.util.Set<String>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("String"))
  val javaDescription = "OneSetOfOneStringsWithMaxLengthOf9"

  def defaultValue = SingleJavaValue("new java.util.HashSet<String>(0)")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("String",
      SingleJavaValue("\"\"")
    )
  , SetOfJavaValues("String",
      SingleJavaValue("\"xxxxxxxxx\"")
    )
  , SetOfJavaValues("String",
      SingleJavaValue("\"\"")
    , SingleJavaValue("\"\\\"\"")
    , SingleJavaValue("\"'/\\\\[](){}\"")
    , SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\"")
    , SingleJavaValue("\"xxxxxxxxx\"")
    )
  )

  val hasGenerics = true
}

case object `java.Set<String(9)>?`
    extends JavaStringWithMaxLengthOf9 with `box.NullableSetOfOne` {

  val javaClass = "java.util.Set<String>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("String"))
  val javaDescription = "NullableSetOfOneStringsWithMaxLengthOf9"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("String",
      SingleJavaValue("\"\"")
    )
  , SetOfJavaValues("String",
      SingleJavaValue("\"xxxxxxxxx\"")
    )
  , SetOfJavaValues("String",
      SingleJavaValue("\"\"")
    , SingleJavaValue("\"\\\"\"")
    , SingleJavaValue("\"'/\\\\[](){}\"")
    , SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\"")
    , SingleJavaValue("\"xxxxxxxxx\"")
    )
  )

  val hasGenerics = true
}

case object `java.Set<String(9)?>`
    extends JavaStringWithMaxLengthOf9 with `box.OneSetOfNullable` {

  val javaClass = "java.util.Set<String>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("String"))
  val javaDescription = "OneSetOfNullableStringsWithMaxLengthOf9"

  def defaultValue = SingleJavaValue("new java.util.HashSet<String>(0)")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("String",
      SingleJavaValue("null")
    )
  , SetOfJavaValues("String",
      SingleJavaValue("\"\"")
    )
  , SetOfJavaValues("String",
      SingleJavaValue("\"xxxxxxxxx\"")
    )
  , SetOfJavaValues("String",
      SingleJavaValue("\"\"")
    , SingleJavaValue("\"\\\"\"")
    , SingleJavaValue("\"'/\\\\[](){}\"")
    , SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\"")
    , SingleJavaValue("\"xxxxxxxxx\"")
    )
  , SetOfJavaValues("String",
      SingleJavaValue("null")
    , SingleJavaValue("\"\"")
    , SingleJavaValue("\"\\\"\"")
    , SingleJavaValue("\"'/\\\\[](){}\"")
    , SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\"")
    , SingleJavaValue("\"xxxxxxxxx\"")
    )
  )

  val hasGenerics = true
}

case object `java.Set<String(9)?>?`
    extends JavaStringWithMaxLengthOf9 with `box.NullableSetOfNullable` {

  val javaClass = "java.util.Set<String>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("String"))
  val javaDescription = "NullableSetOfNullableStringsWithMaxLengthOf9"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("String",
      SingleJavaValue("null")
    )
  , SetOfJavaValues("String",
      SingleJavaValue("\"\"")
    )
  , SetOfJavaValues("String",
      SingleJavaValue("\"xxxxxxxxx\"")
    )
  , SetOfJavaValues("String",
      SingleJavaValue("\"\"")
    , SingleJavaValue("\"\\\"\"")
    , SingleJavaValue("\"'/\\\\[](){}\"")
    , SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\"")
    , SingleJavaValue("\"xxxxxxxxx\"")
    )
  , SetOfJavaValues("String",
      SingleJavaValue("null")
    , SingleJavaValue("\"\"")
    , SingleJavaValue("\"\\\"\"")
    , SingleJavaValue("\"'/\\\\[](){}\"")
    , SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\"")
    , SingleJavaValue("\"xxxxxxxxx\"")
    )
  )

  val hasGenerics = true
}
