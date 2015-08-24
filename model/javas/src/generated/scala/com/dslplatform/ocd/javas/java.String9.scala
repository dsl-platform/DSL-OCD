package com.dslplatform.ocd
package javas

import types._
import boxes._

sealed abstract class JavaStringWithMaxLengthOf9
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

case object `java.Queue<String(9)>`
    extends JavaStringWithMaxLengthOf9 with `box.OneQueueOfOne` {

  val javaClass = "java.util.Queue<String>"
  val javaType = JavaCollectionType("java.util.Queue", JavaClass("String"))
  val javaDescription = "OneQueueOfOneStringsWithMaxLengthOf9"

  def defaultValue = SingleJavaValue("new java.util.ArrayDeque<String>(0)")

  def nonDefaultValues = IndexedSeq(
    QueueOfJavaValues("String",
      SingleJavaValue("\"\"")
    )
  , QueueOfJavaValues("String",
      SingleJavaValue("\"xxxxxxxxx\"")
    )
  , QueueOfJavaValues("String",
      SingleJavaValue("\"\"")
    , SingleJavaValue("\"\\\"\"")
    , SingleJavaValue("\"'/\\\\[](){}\"")
    , SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\"")
    , SingleJavaValue("\"xxxxxxxxx\"")
    )
  )

  val hasGenerics = true
}

case object `java.Queue<String(9)>?`
    extends JavaStringWithMaxLengthOf9 with `box.NullableQueueOfOne` {

  val javaClass = "java.util.Queue<String>"
  val javaType = JavaCollectionType("java.util.Queue", JavaClass("String"))
  val javaDescription = "NullableQueueOfOneStringsWithMaxLengthOf9"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    QueueOfJavaValues("String",
      SingleJavaValue("\"\"")
    )
  , QueueOfJavaValues("String",
      SingleJavaValue("\"xxxxxxxxx\"")
    )
  , QueueOfJavaValues("String",
      SingleJavaValue("\"\"")
    , SingleJavaValue("\"\\\"\"")
    , SingleJavaValue("\"'/\\\\[](){}\"")
    , SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\"")
    , SingleJavaValue("\"xxxxxxxxx\"")
    )
  )

  val hasGenerics = true
}

case object `java.Queue<String(9)?>`
    extends JavaStringWithMaxLengthOf9 with `box.OneQueueOfNullable` {

  val javaClass = "java.util.Queue<String>"
  val javaType = JavaCollectionType("java.util.Queue", JavaClass("String"))
  val javaDescription = "OneQueueOfNullableStringsWithMaxLengthOf9"

  def defaultValue = SingleJavaValue("new java.util.ArrayDeque<String>(0)")

  def nonDefaultValues = IndexedSeq(
    QueueOfJavaValues("String",
      SingleJavaValue("null")
    )
  , QueueOfJavaValues("String",
      SingleJavaValue("\"\"")
    )
  , QueueOfJavaValues("String",
      SingleJavaValue("\"xxxxxxxxx\"")
    )
  , QueueOfJavaValues("String",
      SingleJavaValue("\"\"")
    , SingleJavaValue("\"\\\"\"")
    , SingleJavaValue("\"'/\\\\[](){}\"")
    , SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\"")
    , SingleJavaValue("\"xxxxxxxxx\"")
    )
  , QueueOfJavaValues("String",
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

case object `java.Queue<String(9)?>?`
    extends JavaStringWithMaxLengthOf9 with `box.NullableQueueOfNullable` {

  val javaClass = "java.util.Queue<String>"
  val javaType = JavaCollectionType("java.util.Queue", JavaClass("String"))
  val javaDescription = "NullableQueueOfNullableStringsWithMaxLengthOf9"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    QueueOfJavaValues("String",
      SingleJavaValue("null")
    )
  , QueueOfJavaValues("String",
      SingleJavaValue("\"\"")
    )
  , QueueOfJavaValues("String",
      SingleJavaValue("\"xxxxxxxxx\"")
    )
  , QueueOfJavaValues("String",
      SingleJavaValue("\"\"")
    , SingleJavaValue("\"\\\"\"")
    , SingleJavaValue("\"'/\\\\[](){}\"")
    , SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\"")
    , SingleJavaValue("\"xxxxxxxxx\"")
    )
  , QueueOfJavaValues("String",
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

case object `java.LinkedList<String(9)>`
    extends JavaStringWithMaxLengthOf9 with `box.OneLinkedListOfOne` {

  val javaClass = "java.util.LinkedList<String>"
  val javaType = JavaCollectionType("java.util.LinkedList", JavaClass("String"))
  val javaDescription = "OneLinkedListOfOneStringsWithMaxLengthOf9"

  def defaultValue = SingleJavaValue("new java.util.LinkedList<String>()")

  def nonDefaultValues = IndexedSeq(
    LinkedListOfJavaValues("String",
      SingleJavaValue("\"\"")
    )
  , LinkedListOfJavaValues("String",
      SingleJavaValue("\"xxxxxxxxx\"")
    )
  , LinkedListOfJavaValues("String",
      SingleJavaValue("\"\"")
    , SingleJavaValue("\"\\\"\"")
    , SingleJavaValue("\"'/\\\\[](){}\"")
    , SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\"")
    , SingleJavaValue("\"xxxxxxxxx\"")
    )
  )

  val hasGenerics = true
}

case object `java.LinkedList<String(9)>?`
    extends JavaStringWithMaxLengthOf9 with `box.NullableLinkedListOfOne` {

  val javaClass = "java.util.LinkedList<String>"
  val javaType = JavaCollectionType("java.util.LinkedList", JavaClass("String"))
  val javaDescription = "NullableLinkedListOfOneStringsWithMaxLengthOf9"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    LinkedListOfJavaValues("String",
      SingleJavaValue("\"\"")
    )
  , LinkedListOfJavaValues("String",
      SingleJavaValue("\"xxxxxxxxx\"")
    )
  , LinkedListOfJavaValues("String",
      SingleJavaValue("\"\"")
    , SingleJavaValue("\"\\\"\"")
    , SingleJavaValue("\"'/\\\\[](){}\"")
    , SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\"")
    , SingleJavaValue("\"xxxxxxxxx\"")
    )
  )

  val hasGenerics = true
}

case object `java.LinkedList<String(9)?>`
    extends JavaStringWithMaxLengthOf9 with `box.OneLinkedListOfNullable` {

  val javaClass = "java.util.LinkedList<String>"
  val javaType = JavaCollectionType("java.util.LinkedList", JavaClass("String"))
  val javaDescription = "OneLinkedListOfNullableStringsWithMaxLengthOf9"

  def defaultValue = SingleJavaValue("new java.util.LinkedList<String>()")

  def nonDefaultValues = IndexedSeq(
    LinkedListOfJavaValues("String",
      SingleJavaValue("null")
    )
  , LinkedListOfJavaValues("String",
      SingleJavaValue("\"\"")
    )
  , LinkedListOfJavaValues("String",
      SingleJavaValue("\"xxxxxxxxx\"")
    )
  , LinkedListOfJavaValues("String",
      SingleJavaValue("\"\"")
    , SingleJavaValue("\"\\\"\"")
    , SingleJavaValue("\"'/\\\\[](){}\"")
    , SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\"")
    , SingleJavaValue("\"xxxxxxxxx\"")
    )
  , LinkedListOfJavaValues("String",
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

case object `java.LinkedList<String(9)?>?`
    extends JavaStringWithMaxLengthOf9 with `box.NullableLinkedListOfNullable` {

  val javaClass = "java.util.LinkedList<String>"
  val javaType = JavaCollectionType("java.util.LinkedList", JavaClass("String"))
  val javaDescription = "NullableLinkedListOfNullableStringsWithMaxLengthOf9"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    LinkedListOfJavaValues("String",
      SingleJavaValue("null")
    )
  , LinkedListOfJavaValues("String",
      SingleJavaValue("\"\"")
    )
  , LinkedListOfJavaValues("String",
      SingleJavaValue("\"xxxxxxxxx\"")
    )
  , LinkedListOfJavaValues("String",
      SingleJavaValue("\"\"")
    , SingleJavaValue("\"\\\"\"")
    , SingleJavaValue("\"'/\\\\[](){}\"")
    , SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\"")
    , SingleJavaValue("\"xxxxxxxxx\"")
    )
  , LinkedListOfJavaValues("String",
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

case object `java.Stack<String(9)>`
    extends JavaStringWithMaxLengthOf9 with `box.OneStackOfOne` {

  val javaClass = "java.util.Stack<String>"
  val javaType = JavaCollectionType("java.util.Stack", JavaClass("String"))
  val javaDescription = "OneStackOfOneStringsWithMaxLengthOf9"

  def defaultValue = SingleJavaValue("new java.util.Stack<String>()")

  def nonDefaultValues = IndexedSeq(
    StackOfJavaValues("String",
      SingleJavaValue("\"\"")
    )
  , StackOfJavaValues("String",
      SingleJavaValue("\"xxxxxxxxx\"")
    )
  , StackOfJavaValues("String",
      SingleJavaValue("\"\"")
    , SingleJavaValue("\"\\\"\"")
    , SingleJavaValue("\"'/\\\\[](){}\"")
    , SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\"")
    , SingleJavaValue("\"xxxxxxxxx\"")
    )
  )

  val hasGenerics = true
}

case object `java.Stack<String(9)>?`
    extends JavaStringWithMaxLengthOf9 with `box.NullableStackOfOne` {

  val javaClass = "java.util.Stack<String>"
  val javaType = JavaCollectionType("java.util.Stack", JavaClass("String"))
  val javaDescription = "NullableStackOfOneStringsWithMaxLengthOf9"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    StackOfJavaValues("String",
      SingleJavaValue("\"\"")
    )
  , StackOfJavaValues("String",
      SingleJavaValue("\"xxxxxxxxx\"")
    )
  , StackOfJavaValues("String",
      SingleJavaValue("\"\"")
    , SingleJavaValue("\"\\\"\"")
    , SingleJavaValue("\"'/\\\\[](){}\"")
    , SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\"")
    , SingleJavaValue("\"xxxxxxxxx\"")
    )
  )

  val hasGenerics = true
}

case object `java.Stack<String(9)?>`
    extends JavaStringWithMaxLengthOf9 with `box.OneStackOfNullable` {

  val javaClass = "java.util.Stack<String>"
  val javaType = JavaCollectionType("java.util.Stack", JavaClass("String"))
  val javaDescription = "OneStackOfNullableStringsWithMaxLengthOf9"

  def defaultValue = SingleJavaValue("new java.util.Stack<String>()")

  def nonDefaultValues = IndexedSeq(
    StackOfJavaValues("String",
      SingleJavaValue("null")
    )
  , StackOfJavaValues("String",
      SingleJavaValue("\"\"")
    )
  , StackOfJavaValues("String",
      SingleJavaValue("\"xxxxxxxxx\"")
    )
  , StackOfJavaValues("String",
      SingleJavaValue("\"\"")
    , SingleJavaValue("\"\\\"\"")
    , SingleJavaValue("\"'/\\\\[](){}\"")
    , SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\"")
    , SingleJavaValue("\"xxxxxxxxx\"")
    )
  , StackOfJavaValues("String",
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

case object `java.Stack<String(9)?>?`
    extends JavaStringWithMaxLengthOf9 with `box.NullableStackOfNullable` {

  val javaClass = "java.util.Stack<String>"
  val javaType = JavaCollectionType("java.util.Stack", JavaClass("String"))
  val javaDescription = "NullableStackOfNullableStringsWithMaxLengthOf9"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    StackOfJavaValues("String",
      SingleJavaValue("null")
    )
  , StackOfJavaValues("String",
      SingleJavaValue("\"\"")
    )
  , StackOfJavaValues("String",
      SingleJavaValue("\"xxxxxxxxx\"")
    )
  , StackOfJavaValues("String",
      SingleJavaValue("\"\"")
    , SingleJavaValue("\"\\\"\"")
    , SingleJavaValue("\"'/\\\\[](){}\"")
    , SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\"")
    , SingleJavaValue("\"xxxxxxxxx\"")
    )
  , StackOfJavaValues("String",
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

case object `java.Vector<String(9)>`
    extends JavaStringWithMaxLengthOf9 with `box.OneVectorOfOne` {

  val javaClass = "java.util.Vector<String>"
  val javaType = JavaCollectionType("java.util.Vector", JavaClass("String"))
  val javaDescription = "OneVectorOfOneStringsWithMaxLengthOf9"

  def defaultValue = SingleJavaValue("new java.util.Vector<String>(0)")

  def nonDefaultValues = IndexedSeq(
    VectorOfJavaValues("String",
      SingleJavaValue("\"\"")
    )
  , VectorOfJavaValues("String",
      SingleJavaValue("\"xxxxxxxxx\"")
    )
  , VectorOfJavaValues("String",
      SingleJavaValue("\"\"")
    , SingleJavaValue("\"\\\"\"")
    , SingleJavaValue("\"'/\\\\[](){}\"")
    , SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\"")
    , SingleJavaValue("\"xxxxxxxxx\"")
    )
  )

  val hasGenerics = true
}

case object `java.Vector<String(9)>?`
    extends JavaStringWithMaxLengthOf9 with `box.NullableVectorOfOne` {

  val javaClass = "java.util.Vector<String>"
  val javaType = JavaCollectionType("java.util.Vector", JavaClass("String"))
  val javaDescription = "NullableVectorOfOneStringsWithMaxLengthOf9"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    VectorOfJavaValues("String",
      SingleJavaValue("\"\"")
    )
  , VectorOfJavaValues("String",
      SingleJavaValue("\"xxxxxxxxx\"")
    )
  , VectorOfJavaValues("String",
      SingleJavaValue("\"\"")
    , SingleJavaValue("\"\\\"\"")
    , SingleJavaValue("\"'/\\\\[](){}\"")
    , SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\"")
    , SingleJavaValue("\"xxxxxxxxx\"")
    )
  )

  val hasGenerics = true
}

case object `java.Vector<String(9)?>`
    extends JavaStringWithMaxLengthOf9 with `box.OneVectorOfNullable` {

  val javaClass = "java.util.Vector<String>"
  val javaType = JavaCollectionType("java.util.Vector", JavaClass("String"))
  val javaDescription = "OneVectorOfNullableStringsWithMaxLengthOf9"

  def defaultValue = SingleJavaValue("new java.util.Vector<String>(0)")

  def nonDefaultValues = IndexedSeq(
    VectorOfJavaValues("String",
      SingleJavaValue("null")
    )
  , VectorOfJavaValues("String",
      SingleJavaValue("\"\"")
    )
  , VectorOfJavaValues("String",
      SingleJavaValue("\"xxxxxxxxx\"")
    )
  , VectorOfJavaValues("String",
      SingleJavaValue("\"\"")
    , SingleJavaValue("\"\\\"\"")
    , SingleJavaValue("\"'/\\\\[](){}\"")
    , SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\"")
    , SingleJavaValue("\"xxxxxxxxx\"")
    )
  , VectorOfJavaValues("String",
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

case object `java.Vector<String(9)?>?`
    extends JavaStringWithMaxLengthOf9 with `box.NullableVectorOfNullable` {

  val javaClass = "java.util.Vector<String>"
  val javaType = JavaCollectionType("java.util.Vector", JavaClass("String"))
  val javaDescription = "NullableVectorOfNullableStringsWithMaxLengthOf9"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    VectorOfJavaValues("String",
      SingleJavaValue("null")
    )
  , VectorOfJavaValues("String",
      SingleJavaValue("\"\"")
    )
  , VectorOfJavaValues("String",
      SingleJavaValue("\"xxxxxxxxx\"")
    )
  , VectorOfJavaValues("String",
      SingleJavaValue("\"\"")
    , SingleJavaValue("\"\\\"\"")
    , SingleJavaValue("\"'/\\\\[](){}\"")
    , SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\"")
    , SingleJavaValue("\"xxxxxxxxx\"")
    )
  , VectorOfJavaValues("String",
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
